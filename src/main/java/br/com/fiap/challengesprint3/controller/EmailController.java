package br.com.fiap.challengesprint3.controller;

import br.com.fiap.challengesprint3.model.Email;
import br.com.fiap.challengesprint3.repository.EmailRepository;
import br.com.fiap.challengesprint3.usecase.ListaDeComandos;
import br.com.fiap.challengesprint3.usecase.email.AddEmailUseCase;
import br.com.fiap.challengesprint3.usecase.email.DeleteEmailUseCase;
import br.com.fiap.challengesprint3.usecase.produto.AddProdutoUseCase;
import br.com.fiap.challengesprint3.usecase.produto.DeleteProdutoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("email")
public class EmailController {

    @Autowired
    private EmailRepository emailRepository;

    @GetMapping
    private List<Email> getEmails() {
        return emailRepository.findAll();
    }

    @PostMapping
    private String sendEmail(@RequestBody Email email) {
        ListaDeComandos list = new ListaDeComandos();
        list.add(new AddEmailUseCase(emailRepository, email));
        list.executar();
        return emailRepository.findById(email.getId()).toString();
    }

    @PutMapping
    private String updateEmail(@RequestBody Email email) {
        ListaDeComandos list = new ListaDeComandos();
        list.add(new AddEmailUseCase(emailRepository, email));
        list.executar();
        return emailRepository.findById(email.getId()).toString();
    }

    @DeleteMapping("/{id}")
    private String deleteEmail(@PathVariable Long id) {
        ListaDeComandos list = new ListaDeComandos();
        list.add(new DeleteEmailUseCase(emailRepository, id));
        list.executar();
        return "Email Deletado";
    }

}

package br.com.fiap.challengesprint3.controller;

import br.com.fiap.challengesprint3.model.Produto;
import br.com.fiap.challengesprint3.repository.ProdutoRepository;
import br.com.fiap.challengesprint3.usecase.produto.AddProdutoUseCase;
import br.com.fiap.challengesprint3.usecase.produto.DeleteProdutoUseCase;
import br.com.fiap.challengesprint3.usecase.ListaDeComandos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    private List<Produto> getProdutos() {
        return produtoRepository.findAll();
    }

    @PostMapping
    private String insertProduto(@RequestBody Produto produto) {
        ListaDeComandos list = new ListaDeComandos();
        list.add(new AddProdutoUseCase(produto, produtoRepository));
        list.executar();
        return produtoRepository.findById(produto.getId()).toString();
    }

    @PutMapping
    private String updateProduto(@RequestBody Produto produto) {
        ListaDeComandos list = new ListaDeComandos();
        list.add(new AddProdutoUseCase(produto, produtoRepository));
        list.executar();
        return produtoRepository.findById(produto.getId()).toString();
    }

    @DeleteMapping("/{id}")
    private String deleteProduto(@PathVariable Long id) {
        ListaDeComandos list = new ListaDeComandos();
        list.add(new DeleteProdutoUseCase(id, produtoRepository));
        list.executar();
        return "Produto Deletado";
    }
}

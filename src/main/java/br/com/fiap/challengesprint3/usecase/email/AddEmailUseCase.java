package br.com.fiap.challengesprint3.usecase.email;

import br.com.fiap.challengesprint3.model.Email;
import br.com.fiap.challengesprint3.repository.EmailRepository;
import br.com.fiap.challengesprint3.usecase.UseCase;

public class AddEmailUseCase implements UseCase {
    private EmailRepository emailRepository;
    private Email email;

    public AddEmailUseCase(EmailRepository emailRepository, Email email) {
        this.emailRepository = emailRepository;
        this.email = email;
    }

    @Override
    public void execute() {
        emailRepository.save(email);
    }
}

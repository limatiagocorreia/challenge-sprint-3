package br.com.fiap.challengesprint3.usecase.email;

import br.com.fiap.challengesprint3.repository.EmailRepository;
import br.com.fiap.challengesprint3.usecase.UseCase;

public class DeleteEmailUseCase implements UseCase {
    private EmailRepository emailRepository;
    private Long id;

    public DeleteEmailUseCase(EmailRepository emailRepository, Long id) {
        this.emailRepository = emailRepository;
        this.id = id;
    }

    @Override
    public void execute() {
        emailRepository.deleteById(id);
    }
}

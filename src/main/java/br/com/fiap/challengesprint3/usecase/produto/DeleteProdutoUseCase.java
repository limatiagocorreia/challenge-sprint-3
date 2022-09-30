package br.com.fiap.challengesprint3.usecase.produto;

import br.com.fiap.challengesprint3.repository.ProdutoRepository;
import br.com.fiap.challengesprint3.usecase.UseCase;

public class DeleteProdutoUseCase implements UseCase {
    private ProdutoRepository produtoRepository;
    private Long id;

    public DeleteProdutoUseCase(Long id, ProdutoRepository produtoRepository) {
        this.id = id;
        this.produtoRepository = produtoRepository;
    }

    @Override
    public void execute() {
        produtoRepository.deleteById(id);
    }
}

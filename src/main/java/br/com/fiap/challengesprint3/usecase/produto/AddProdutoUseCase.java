package br.com.fiap.challengesprint3.usecase.produto;

import br.com.fiap.challengesprint3.model.Produto;
import br.com.fiap.challengesprint3.repository.ProdutoRepository;
import br.com.fiap.challengesprint3.usecase.UseCase;

public class AddProdutoUseCase implements UseCase {

    private ProdutoRepository produtoRepository;

    private Produto produto;

    public AddProdutoUseCase(Produto produto, ProdutoRepository pedidoRepository) {
        this.produto = produto;
        this.produtoRepository = pedidoRepository;
    }

    @Override
    public void execute() {
        produtoRepository.save(produto);
    }
}

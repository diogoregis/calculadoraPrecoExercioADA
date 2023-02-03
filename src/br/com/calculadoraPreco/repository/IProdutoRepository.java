package br.com.calculadoraPreco.repository;

import br.com.calculadoraPreco.models.Produto;

public interface IProdutoRepository {

    public Produto criarProduto(String nome, double valor);
    public void salvarProdutoBanco(Produto produto);

}

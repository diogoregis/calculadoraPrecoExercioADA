package br.com.calculadoraPreco.controllers;

import br.com.calculadoraPreco.models.Produto;
import br.com.calculadoraPreco.repository.IProdutoRepository;

public class ProdutoController implements IProdutoRepository {

    private static final ProdutoController PRODUTO_CONTROLLER = new ProdutoController();
    private ProdutoController(){}
    private static ProdutoController getInstance(){
        return PRODUTO_CONTROLLER;
    }


    @Override
    public Produto criarProduto(String nome, double valor) {
        return null;
    }

    @Override
    public void salvarProdutoBanco(Produto produto) {

    }
}

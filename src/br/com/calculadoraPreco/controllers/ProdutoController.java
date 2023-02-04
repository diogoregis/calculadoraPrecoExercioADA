package br.com.calculadoraPreco.controllers;

import br.com.calculadoraPreco.models.Produto;


import java.util.List;

public class ProdutoController{

    private static final ProdutoController PRODUTO_CONTROLLER = new ProdutoController();
    private ProdutoController(){}
    private static ProdutoController getInstance(){
        return PRODUTO_CONTROLLER;
    }


    public Produto criarProduto(String nome, double valor) {
        return null;
    }

    public void salvarProdutoBanco(Produto produto) {

    }

    public List<Produto> retornaListaProdutos() {
        return null;
    }

    public Produto retornaProdutoIndex(int index) {
        return null;
    }
}

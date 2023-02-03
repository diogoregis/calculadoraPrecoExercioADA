package br.com.calculadoraPreco.controllers;

public class ProdutoController {

    private static final ProdutoController PRODUTO_CONTROLLER = new ProdutoController();
    private ProdutoController(){}
    private static ProdutoController getInstance(){
        return PRODUTO_CONTROLLER;
    }




}

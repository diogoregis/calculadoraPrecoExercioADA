package br.com.calculadoraPreco.controllers;

import br.com.calculadoraPreco.models.Cupom;

public class CupomController {

    public Cupom gerarCupom() {
        return new Cupom();
    }

    public void salvarCupom(Cupom cupom) {
       cupom = gerarCupom();
    }

    @Override
    public boolean validaCupom() {
        return false;
    }

    @Override
    public void usaCupom() {

    }
}

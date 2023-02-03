package br.com.calculadoraPreco.controllers;

import br.com.calculadoraPreco.models.Cupom;
import br.com.calculadoraPreco.repository.ICupomRepository;

public class CupomController implements ICupomRepository {
    @Override
    public Cupom gerarCupom() {
        return null;
    }

    @Override
    public boolean validaCupom() {
        return false;
    }

    @Override
    public void usaCupom() {

    }
}

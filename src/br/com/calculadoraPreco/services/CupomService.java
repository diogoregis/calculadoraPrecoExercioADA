package br.com.calculadoraPreco.services;

import br.com.calculadoraPreco.models.Cupom;
import br.com.calculadoraPreco.repository.ICupomRepository;

public class CupomService implements ICupomRepository {
    @Override
    public Cupom gerarCupom() {
        return null;
    }

    @Override
    public void salvarCupom(Cupom cupom) {

    }

    @Override
    public boolean validaCupom() {
        return false;
    }

    @Override
    public void usaCupom() {

    }
}

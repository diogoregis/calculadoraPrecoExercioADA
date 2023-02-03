package br.com.calculadoraPreco.repository;

import br.com.calculadoraPreco.models.Cupom;

public interface ICupomRepository {

    public Cupom gerarCupom();
    public boolean validaCupom();
    public void usaCupom();


}

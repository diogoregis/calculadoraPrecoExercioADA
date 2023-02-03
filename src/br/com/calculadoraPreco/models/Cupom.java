package br.com.calculadoraPreco.models;

public class Cupom {

    private static int numId;

    private int codigoCupom;

    private int proxNumero(){
        return ++numId;
    }

    public Cupom() {
        this.codigoCupom = proxNumero();
    }

    public int getCodigoCupom() {
        return codigoCupom;
    }
}

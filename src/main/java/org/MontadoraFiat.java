package org;

public class MontadoraFiat implements Montadora {
    @Override
    public Carro createCarro() {
        return new CarroPopular();
    }
}
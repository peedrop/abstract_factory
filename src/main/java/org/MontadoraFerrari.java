package org;

public class MontadoraFerrari implements Montadora {
    @Override
    public Carro createCarro() {
        return new CarroLuxo();
    }
}
package org;

public class FabricaCarroLuxo implements FabricaAbstrata {
    @Override
    public Carro createCarro() {
        return new CarroLuxo();
    }

    @Override
    public Montadora createMontadora() {
        return new MontadoraFerrari();
    }
}
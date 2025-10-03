package org;

public class FabricaCarroPopular implements FabricaAbstrata {
    @Override
    public Carro createCarro() {
        return new CarroPopular();
    }

    @Override
    public Montadora createMontadora() {
        return new MontadoraFiat();
    }
}
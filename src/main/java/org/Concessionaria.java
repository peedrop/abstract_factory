package org;

public class Concessionaria {
    private final Carro carro;
    private final Montadora montadora;

    public Concessionaria(FabricaAbstrata fabrica) {
        this.carro = fabrica.createCarro();
        this.montadora = fabrica.createMontadora();
    }

    public String emitirCarro() {
        return this.carro.descricao();
    }

    public String emitirCarroDaMontadora() {
        Carro carroDaMontadora = this.montadora.createCarro();
        return carroDaMontadora.descricao();
    }
}
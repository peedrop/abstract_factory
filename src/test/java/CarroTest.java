import org.FabricaAbstrata;
import org.FabricaCarroLuxo;
import org.FabricaCarroPopular;

import org.Carro;
import org.Montadora;
import org.Concessionaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    void deveCriarCarroLuxo() {
        FabricaAbstrata fabrica = new FabricaCarroLuxo();
        Carro carro = fabrica.createCarro();
        assertEquals("Carro de Luxo", carro.descricao());
    }

    @Test
    void deveCriarCarroPopular() {
        FabricaAbstrata fabrica = new FabricaCarroPopular();
        Carro carro = fabrica.createCarro();
        assertEquals("Carro Popular", carro.descricao());
    }

    @Test
    void deveCriarMontadoraFerrari() {
        FabricaAbstrata fabrica = new FabricaCarroLuxo();
        Montadora montadora = fabrica.createMontadora();
        Carro carro = montadora.createCarro();
        assertEquals("Carro de Luxo", carro.descricao());
    }

    @Test
    void deveCriarMontadoraFiat() {
        FabricaAbstrata fabrica = new FabricaCarroPopular();
        Montadora montadora = fabrica.createMontadora();
        Carro carro = montadora.createCarro();
        assertEquals("Carro Popular", carro.descricao());
    }

    @Test
    void deveEmitirCarroLuxoNaConcessionaria() {
        FabricaAbstrata fabrica = new FabricaCarroLuxo();
        Concessionaria concessionaria = new Concessionaria(fabrica);
        assertEquals("Carro de Luxo", concessionaria.emitirCarro());
    }

    @Test
    void deveEmitirCarroPopularNaConcessionaria() {
        FabricaAbstrata fabrica = new FabricaCarroPopular();
        Concessionaria concessionaria = new Concessionaria(fabrica);
        assertEquals("Carro Popular", concessionaria.emitirCarro());
    }

    @Test
    void deveEmitirCarroDaMontadoraFerrariNaConcessionaria() {
        FabricaAbstrata fabrica = new FabricaCarroLuxo();
        Concessionaria concessionaria = new Concessionaria(fabrica);
        assertEquals("Carro de Luxo", concessionaria.emitirCarroDaMontadora());
    }

    @Test
    void deveEmitirCarroDaMontadoraFiatNaConcessionaria() {
        FabricaAbstrata fabrica = new FabricaCarroPopular();
        Concessionaria concessionaria = new Concessionaria(fabrica);
        assertEquals("Carro Popular", concessionaria.emitirCarroDaMontadora());
    }
}

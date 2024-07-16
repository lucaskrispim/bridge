package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCalcularCustoAbastecimentoCarroComGasolina() {
        Combustivel gasolina = new Gasolina();
        Carro carro = new Carro(50.0f);
        carro.setCombustivel(gasolina);
        assertEquals(229.50f, carro.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoAbastecimentoCarroComDiesel() {
        Combustivel diesel = new Diesel();
        Carro carro = new Carro(50.0f);
        carro.setCombustivel(diesel);
        assertEquals(189.50f, carro.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoAbastecimentoCarroComEletrico() {
        Combustivel eletrico = new Eletrico();
        Carro carro = new Carro(50.0f);
        carro.setCombustivel(eletrico);
        assertEquals(79.50f, carro.calcularCustoAbastecimento(), 0.01f);
    }
}
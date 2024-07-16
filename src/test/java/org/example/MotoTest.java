package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveCalcularCustoAbastecimentoMotoComGasolina() {
        Combustivel gasolina = new Gasolina();
        Moto moto = new Moto(15.0f);
        moto.setCombustivel(gasolina);
        assertEquals(68.85f, moto.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoAbastecimentoMotoComDiesel() {
        Combustivel diesel = new Diesel();
        Moto moto = new Moto(15.0f);
        moto.setCombustivel(diesel);
        assertEquals(56.85f, moto.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoAbastecimentoMotoComEletrico() {
        Combustivel eletrico = new Eletrico();
        Moto moto = new Moto(15.0f);
        moto.setCombustivel(eletrico);
        assertEquals(23.85f, moto.calcularCustoAbastecimento(), 0.01f);
    }
}
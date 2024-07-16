package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaminhaoTest {

    @Test
    void deveCalcularCustoAbastecimentoCaminhaoComGasolina() {
        Combustivel gasolina = new Gasolina();
        Caminhao caminhao = new Caminhao(150.0f);
        caminhao.setCombustivel(gasolina);
        assertEquals(688.50f, caminhao.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoAbastecimentoCaminhaoComDiesel() {
        Combustivel diesel = new Diesel();
        Caminhao caminhao = new Caminhao(150.0f);
        caminhao.setCombustivel(diesel);
        assertEquals(568.50f, caminhao.calcularCustoAbastecimento(), 0.01f);
    }

    @Test
    void deveCalcularCustoAbastecimentoCaminhaoComEletrico() {
        Combustivel eletrico = new Eletrico();
        Caminhao caminhao = new Caminhao(150.0f);
        caminhao.setCombustivel(eletrico);
        assertEquals(238.50f, caminhao.calcularCustoAbastecimento(), 0.01f);
    }
}
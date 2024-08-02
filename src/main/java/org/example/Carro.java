package org.example;

public class Carro extends Veiculo {
    public Carro(float capacidadeTanque) {
        super(capacidadeTanque);
    }

    public float calcularCustoAbastecimento() {
        return this.capacidadeTanque * this.combustivel.precoPorUnidadeCombustivel();
    }
}

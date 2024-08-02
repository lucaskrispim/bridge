package org.example;

public class Caminhao extends Veiculo {
    public Caminhao(float capacidadeTanque) {
        super(capacidadeTanque);
    }

    public float calcularCustoAbastecimento() {
        return this.capacidadeTanque * this.combustivel.precoPorUnidadeCombustivel();
    }
}

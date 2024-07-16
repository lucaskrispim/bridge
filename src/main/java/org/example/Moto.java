package org.example;

public class Moto extends Veiculo {
    public Moto(float capacidadeTanque) {
        super(capacidadeTanque);
    }

    public float calcularCustoAbastecimento() {
        return this.capacidadeTanque * this.combustivel.precoPorLitro();
    }
}

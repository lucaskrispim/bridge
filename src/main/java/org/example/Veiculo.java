package org.example;

public abstract class Veiculo {
    protected Combustivel combustivel;
    protected float capacidadeTanque;

    public Veiculo(float capacidadeTanque) {
        this.setCapacidadeTanque(capacidadeTanque);
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public abstract float calcularCustoAbastecimento();
}

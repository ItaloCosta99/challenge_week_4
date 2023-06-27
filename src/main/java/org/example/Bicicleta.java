package org.example;

public class Bicicleta extends Veiculo {
    private boolean motorEletrico;
    private boolean temBagageiro;

    public Bicicleta(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean carga, double capacidadeCarga, Combustivel combustivel, boolean motorEletrico, boolean temBagageiro) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, carga, capacidadeCarga, combustivel);
        this.motorEletrico = motorEletrico;
        this.temBagageiro = temBagageiro;
    }

    public boolean isMotorEletrico() {
        return motorEletrico;
    }

    public void setMotorEletrico(boolean motorEletrico) {
        this.motorEletrico = motorEletrico;
    }

    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "motorEletrico=" + motorEletrico +
                ", temBagageiro=" + temBagageiro +
                "} " + super.toString();
    }
}

package org.example;

public class Bicicleta extends Veiculo {
    private boolean motorEletrico;
    private boolean temBagageiro;

    public Bicicleta() {
        super();
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

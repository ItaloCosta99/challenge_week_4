package org.example;

public class Veiculo {
    private boolean motor;
    private boolean volante;
    private int qtdPassageiros;
    private int qtdPortas;
    private int qtdRodas;
    private boolean carga;
    private double capacidadeCarga;

    private Combustivel combustivel;

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "\n" + "Veiculo{" +
                "motor=" + motor +
                ", volante=" + volante +
                ", qtdPassageiros=" + qtdPassageiros +
                ", qtdPortas=" + qtdPortas +
                ", qtdRodas=" + qtdRodas +
                ", carga=" + carga +
                ", capacidadeCarga=" + capacidadeCarga +
                ", combustivel=" + combustivel +
                '}';
    }
}

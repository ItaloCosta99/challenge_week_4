package org.example;

public class Veiculo {
    private boolean motor;
    private boolean volante;
    private int qtdPassageiros;
    private int qtdPortas;
    private int qtdRodas;
    private boolean carga;
    private double capacidadeCarga;

    public Veiculo(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean carga, double capacidadeCarga, Combustivel combustivel) {
        this.motor = motor;
        this.volante = volante;
        this.qtdPassageiros = qtdPassageiros;
        this.qtdPortas = qtdPortas;
        this.qtdRodas = qtdRodas;
        this.carga = carga;
        this.capacidadeCarga = capacidadeCarga;
        this.combustivel = combustivel;
    }

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

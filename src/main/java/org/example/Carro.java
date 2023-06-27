package org.example;

public class Carro extends Veiculo {
    private boolean arCondicionado;
    private boolean radio;

    public Carro(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean carga, double capacidadeCarga, Combustivel combustivel, boolean arCondicionado, boolean radio) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, carga, capacidadeCarga, combustivel);
        this.arCondicionado = arCondicionado;
        this.radio = radio;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "arCondicionado=" + arCondicionado +
                ", radio=" + radio +
                '}' + super.toString();
    }
}

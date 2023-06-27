package org.example;

public class Carro extends Veiculo {
    private boolean arCondicionado;
    private boolean radio;

    public Carro() {
        super();
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

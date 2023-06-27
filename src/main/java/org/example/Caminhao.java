package org.example;

public class Caminhao extends Veiculo {
    private int qtdEixos;

    public Caminhao() {
        super();
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "qtdEixos=" + qtdEixos +
                "} " + super.toString();
    }
}

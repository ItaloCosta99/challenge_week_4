package org.example;

public class Caminhao extends Veiculo {
    private int qtdEixos;

    public Caminhao(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean carga, double capacidadeCarga, Combustivel combustivel, int qtdEixos) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, carga, capacidadeCarga, combustivel);
        this.qtdEixos = qtdEixos;
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

package org.example;

public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean carga, double capacidadeCarga, Combustivel combustivel, boolean partidaEletrica) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, carga, capacidadeCarga, combustivel);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica(boolean partidaEletrica) {
        return this.partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "partidaEletrica=" + partidaEletrica +
                "} " + super.toString();
    }
}

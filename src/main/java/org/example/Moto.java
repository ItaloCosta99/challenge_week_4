package org.example;

public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto() {
        super();
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

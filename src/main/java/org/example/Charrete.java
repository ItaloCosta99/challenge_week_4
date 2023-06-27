package org.example;

public class Charrete extends Veiculo {
    public Charrete(boolean motor, boolean volante, int qtdPassageiros, int qtdPortas, int qtdRodas, boolean carga, double capacidadeCarga, Combustivel combustivel) {
        super(motor, volante, qtdPassageiros, qtdPortas, qtdRodas, carga, capacidadeCarga, combustivel);
    }

    @Override
    public String toString() {
        return "Charrete{} " + super.toString();
    }
}

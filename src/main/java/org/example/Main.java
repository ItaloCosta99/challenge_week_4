package org.example;

public class Main {
    public static void main(String[] args) {
        // Moto
        Combustivel combustivelMoto = new Combustivel(true, false, false, false, false, false);
        Moto moto = new Moto(true, false, 2, 0, 2, false, 0.0, combustivelMoto, true);

        System.out.println(moto + "\n");

        // Carro
        Combustivel combustivelCarro = new Combustivel(true, false, false, false, false, false);
        Carro carro = new Carro(true, true, 4, 4, 4, false, 300.0, combustivelCarro, true, true);

        System.out.println(carro + "\n");

        // Bicicleta
        Combustivel combustivelBicicleta = new Combustivel(false, false, false, false, true, false);
        Bicicleta bicicleta = new Bicicleta(false, false, 1, 0, 2, false, 0.0, combustivelBicicleta, false, true);

        System.out.println(bicicleta + "\n");

        // Charrete
        Combustivel combustivelCharrete = new Combustivel(false, false, false, false, false, true);
        Charrete charrete = new Charrete(false, false, 3, 0, 2, true, 200.0, combustivelCharrete);

        System.out.println(charrete + "\n");

        // Caminhão
        Combustivel combustivelCaminhao = new Combustivel(false, false, true, false, false, false);
        Caminhao caminhao = new Caminhao(true, true, 2, 2, 12, true, 1200.0, combustivelCaminhao, 3);

        System.out.println(caminhao + "\n");
    }
}
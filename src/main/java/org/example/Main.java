package org.example;

public class Main {
    public static void main(String[] args) {
        // Moto
        Moto moto = new Moto();

        moto.setMotor(true);
        moto.setVolante(false);
        moto.setQtdPassageiros(2);
        moto.setQtdPortas(0);
        moto.setCarga(false);
        moto.setCapacidadeCarga(0.0);
        moto.setPartidaEletrica(true);

        Combustivel combustivelMoto = new Combustivel();

        combustivelMoto.setEletricidade(false);
        combustivelMoto.setDiesel(false);
        combustivelMoto.setAnimal(false);
        combustivelMoto.setAlcool(false);
        combustivelMoto.setGasolina(true);
        combustivelMoto.setHumano(false);

        moto.setCombustivel(combustivelMoto);

        System.out.println(moto + "\n");

        // Carro
        Carro carro = new Carro();

        carro.setArCondicionado(true);
        carro.setRadio(false);
        carro.setMotor(true);
        carro.setVolante(false);
        carro.setQtdPassageiros(2);
        carro.setQtdPortas(0);
        carro.setCarga(false);
        carro.setCapacidadeCarga(300.0);

        Combustivel combustivelCarro = new Combustivel();

        combustivelCarro.setEletricidade(false);
        combustivelCarro.setDiesel(false);
        combustivelCarro.setAnimal(false);
        combustivelCarro.setAlcool(false);
        combustivelCarro.setGasolina(true);
        combustivelCarro.setHumano(false);

        carro.setCombustivel(combustivelCarro);

        System.out.println(carro + "\n");

        // Bicicleta
        Bicicleta bicicleta = new Bicicleta();

        bicicleta.setMotor(false);
        bicicleta.setVolante(false);
        bicicleta.setQtdPassageiros(1);
        bicicleta.setQtdPortas(0);
        bicicleta.setCarga(false);
        bicicleta.setCapacidadeCarga(0.0);
        bicicleta.setMotorEletrico(false);
        bicicleta.setTemBagageiro(false);

        Combustivel combustivelBicicleta = new Combustivel();

        combustivelBicicleta.setEletricidade(false);
        combustivelBicicleta.setDiesel(false);
        combustivelBicicleta.setAnimal(false);
        combustivelBicicleta.setAlcool(false);
        combustivelBicicleta.setGasolina(false);
        combustivelBicicleta.setHumano(true);

        bicicleta.setCombustivel(combustivelBicicleta);

        System.out.println(bicicleta + "\n");

        // Charrete
        Charrete charrete = new Charrete();

        charrete.setMotor(false);
        charrete.setVolante(false);
        charrete.setQtdPassageiros(2);
        charrete.setQtdPortas(0);
        charrete.setCarga(true);
        charrete.setCapacidadeCarga(150.0);

        Combustivel combustivelCharrete = new Combustivel();

        combustivelCharrete.setEletricidade(false);
        combustivelCharrete.setDiesel(false);
        combustivelCharrete.setAnimal(true);
        combustivelCharrete.setAlcool(false);
        combustivelCharrete.setGasolina(false);
        combustivelCharrete.setHumano(false);

        charrete.setCombustivel(combustivelCharrete);

        System.out.println(charrete + "\n");

        // Caminhão
        Caminhao caminhao = new Caminhao();

        caminhao.setMotor(true);
        caminhao.setVolante(true);
        caminhao.setQtdPassageiros(2);
        caminhao.setQtdPortas(2);
        caminhao.setCarga(true);
        caminhao.setCapacidadeCarga(1000.0);
        caminhao.setQtdEixos(3);

        Combustivel combustivelCaminhao = new Combustivel();

        combustivelCaminhao.setEletricidade(false);
        combustivelCaminhao.setDiesel(true);
        combustivelCaminhao.setAnimal(false);
        combustivelCaminhao.setAlcool(false);
        combustivelCaminhao.setGasolina(false);
        combustivelCaminhao.setHumano(false);

        caminhao.setCombustivel(combustivelCaminhao);

        System.out.println(caminhao + "\n");
    }
}
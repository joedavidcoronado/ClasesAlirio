package com.example.CLASES.Clase5.ejemplo2;

public class Main {
    public static void main(String[] args) {

        Transporte carroLujo = new Transporte(
                4,
                2,
                250,
                "xs23",
                "Lotus",
                true,
                false,
                false);

        Transporte bicicleta = new Transporte(
                2,
                0,
                30,
                "fibra carbono",
                "Kinda",
                true,
                false,
                false);

        Transporte barcoNormal = new Transporte(
                0,
                1,
                70,
                "kkk",
                "Mercedes",
                false,
                true,
                false);

        Transporte avion = new Transporte(
                2,
                1,
                750,
                "boing",
                "BOA",
                false,
                false,
                true);

        Transporte avionAcuatico = new Transporte(
                2,
                1,
                750,
                "boing",
                "BOA",
                false,
                true,
                true);

        String masVeloz;
        if(carroLujo.getVelocidadMaxima() > bicicleta.getVelocidadMaxima()){
            masVeloz = carroLujo.getMarca() + " " + carroLujo.getModelo();
            if(carroLujo.getVelocidadMaxima() > avionAcuatico.getVelocidadMaxima()){
                masVeloz = carroLujo.getMarca() + " " + carroLujo.getModelo();
            }else{
                masVeloz = avionAcuatico.getMarca() + " " + avionAcuatico.getModelo();
            }
        }else{
            masVeloz = bicicleta.getMarca() + " " + bicicleta.getModelo();
        }

        System.out.println("El mas veloz es " + masVeloz);
    }
}

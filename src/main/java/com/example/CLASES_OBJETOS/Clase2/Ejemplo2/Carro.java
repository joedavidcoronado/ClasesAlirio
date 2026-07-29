package com.example.CLASES_OBJETOS.Clase2.Ejemplo2;

public class Carro {

    //ATRIBUTOS
    private String marca;
    private int año;
    private int velocidadMaxima;

    //METODOS
    public Carro(String marca, int año, int velocidadMaxima) {
        this.marca = marca;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}

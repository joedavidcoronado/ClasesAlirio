package com.example.CLASES.Clase5.ejemplo2;

public class Transporte {

    //ATRIBUTOS
    private int ruedas;
    private int puertas;
    private int velocidadMaxima;
    private String modelo;
    private String marca;
    private boolean terrestre;
    private boolean acuatico;
    private boolean aereo;

    //METODOS
    public Transporte(int ruedas,
                      int puertas,
                      int velocidadMaxima,
                      String modelo,
                      String marca,
                      boolean terrestre,
                      boolean acuatico,
                      boolean aereo
                     ){
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.modelo = modelo;
        this.marca = marca;
        this.terrestre = terrestre;
        this.acuatico = acuatico;
        this.aereo = aereo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTerrestre() {
        return terrestre;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }

    public boolean isAereo() {
        return aereo;
    }

    public void setAereo(boolean aereo) {
        this.aereo = aereo;
    }
}

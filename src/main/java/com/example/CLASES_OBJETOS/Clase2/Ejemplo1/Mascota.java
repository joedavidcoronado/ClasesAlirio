package com.example.CLASES_OBJETOS.Clase2.Ejemplo1;

public class Mascota {

    //ATRIBUTOS
    private String tipo;
    private String raza;
    private String nombre;
    private int edad;

    //METODOS
    public Mascota(String tipo, String raza, String nombre, int edad) {
        this.tipo = tipo;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    //METODO GET Y SET

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

package com.example.CLASES.Clase5.ejemplo1;

public class Main {
    public static void main(String[] args) {

        Persona personaUno = new Persona("Alirio", 16, true, false, 18, "alirio@gmail.com");

        personaUno.caminar();

        System.out.println(personaUno.getNombre());

        personaUno.setNombre("Carlitos");


    }
}

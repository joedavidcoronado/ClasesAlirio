package com.example.CLASES_OBJETOS.Clase1;

public class Main {
    public static void main(String[] args) {

        Persona samuel = new Persona(
                "Samuel",
                32,
                "samuel@gmail.com",
                3000.00,
                1,
                2
        );

        Persona alirio = new Persona(
                "alirio",
                16,
                "alirio@gmail.com",
                4.00,
                2,
                1
        );

        samuel.cantar();
    }
}

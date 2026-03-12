package com.example.CLASES.Clase1;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Hacer la tabla de multiplicar del 1 al 10 de un numero X

        int numeroX = 5;

        for(int contador = 1; contador < 11; contador ++){
            System.out.println("- " + numeroX + " x " + contador + " = " + (contador*numeroX));
        }
    }
}

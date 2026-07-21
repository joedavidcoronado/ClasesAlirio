package com.example.CLASES.Clase3;

public class PracticaFor1 {
    public static void main(String[] args) {

        //For es un bucle que sirve para recorrer cosas un numero determinado de veces
        int numeroSumado = 0;

        for (int i = 0; i < 20; i++) {
            // DESDE     HASTA      AUMENTAS
            numeroSumado = numeroSumado + i;
        }
        System.out.println(numeroSumado);
    }
}

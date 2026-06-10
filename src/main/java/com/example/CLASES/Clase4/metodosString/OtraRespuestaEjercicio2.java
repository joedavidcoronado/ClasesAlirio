package com.example.CLASES.Clase4.metodosString;

public class OtraRespuestaEjercicio2 {
    public static void main(String[] args) {

        //Contar la cantidad de letras 'a', 'e', 'i', 'o' y 'u' que hay en el texto,
        //si la cantidad de letras 'i' es mayor a 6 imprimir "Hay muchas i"
        //Al finalizar imprimir la cantidad de letras separadas. Ejemplo:
        //      "Total i: 7"
        //      "Total a: 81"
        // etc.

        String nuevoTexto = "La apertura grande siempre señala al elemento más grande, y la terminación más pequeña, la punta, al más pequeño. De esta manera es más fácil recordarlo. Como estos símbolos se parecen mucho y, aunque los niños desde la etapa de infantil pueden interpretarlos, es fácil que los confundan. ¡Vamos a ver una historia sobre los símbolos mayor y menor para ayudar!";

        int cantidadDeA = 0;
        int cantidadDeE = 0;
        int cantidadDeI = 0;
        int cantidadDeO = 0;
        int cantidadDeU = 0;
        int cantidadNormal = 0;

        for (int i = 0; i < nuevoTexto.length(); i++) {
            switch (nuevoTexto.charAt(i)){
                case 'a':
                    cantidadDeA++;
                    break;
                case 'e':
                    cantidadDeE++;
                    break;
                case 'i':
                    cantidadDeI++;
                    break;
                case 'o':
                    cantidadDeO++;
                    break;
                case 'u':
                    cantidadDeA++;
                    break;
                default:
                    cantidadNormal++;
                    break;
            }
        }
        System.out.println("Total de a: " + cantidadDeA);
        System.out.println("Total de e: " + cantidadDeE);
        System.out.println("Total de i: " + cantidadDeI);
        System.out.println("Total de o: " + cantidadDeO);
        System.out.println("Total de u: " + cantidadDeU);
        System.out.println("Total de letras normales: " + cantidadNormal);
    }
}

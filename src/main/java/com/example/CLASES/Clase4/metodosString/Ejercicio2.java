package com.example.CLASES.Clase4.metodosString;

public class Ejercicio2 {

    //Contar la cantidad de letras 'a', 'e', 'i', 'o' y 'u' que hay en el texto,
    //si la cantidad de letras 'i' es mayor a 6 imprimir "Hay muchas i"
    //Al finalizar imprimir la cantidad de letras separadas. Ejemplo:
    //      "Total i: 7"
    //      "Total a: 81"
    // etc.

   // String nuevoTexto = "La apertura grande siempre señala al elemento más grande, y la terminación más pequeña, la punta, al más pequeño. De esta manera es más fácil recordarlo. Como estos símbolos se parecen mucho y, aunque los niños desde la etapa de infantil pueden interpretarlos, es fácil que los confundan. ¡Vamos a ver una historia sobre los símbolos mayor y menor para ayudar!";


    public static void main(String[] args) {

        String nuevoTexto = "La apertura grande siempre señala al elemento más grande, y la terminación más pequeña, la punta, al más pequeño. De esta manera es más fácil recordarlo. Como estos símbolos se parecen mucho y, aunque los niños desde la etapa de infantil pueden interpretarlos, es fácil que los confundan. ¡Vamos a ver una historia sobre los símbolos mayor y menor para ayudar!";



        int cantidadDeA = 0;
        int cantidadDeE = 0;
        int cantidadDeI = 0;
        int cantidadDeO = 0;
        int cantidadDeU = 0;



        for (int contador = 0; contador < nuevoTexto.length() ; contador++) {
            if(nuevoTexto.charAt(contador) == 'a'){
             cantidadDeA ++;
            }
        }
            System.out.println("total de a: " + cantidadDeA);

        for (int contadore = 0; contadore <nuevoTexto.length() ; contadore++) {
            if(nuevoTexto.charAt(contadore) =='e'){
                cantidadDeE ++;
            }
        }
        System.out.println("total de e: " + cantidadDeE);

        for (int cotadori = 0; cotadori < nuevoTexto.length(); cotadori++) {
            if (nuevoTexto.charAt(cotadori) == 'i') {
              cantidadDeI ++;
            }
        }
        System.out.println("total de i: " + cantidadDeI);

        if (cantidadDeI > 6) {
            System.out.println("Hay muchas i");
        }

        for (int contadoro = 0; contadoro < nuevoTexto.length(); contadoro++) {
            if (nuevoTexto.charAt(contadoro) == 'o') {
           cantidadDeO ++;
           }
        }
        System.out.println("total de o: " + cantidadDeO);

        for (int contadoru = 0; contadoru <nuevoTexto.length(); contadoru++) {
            if (nuevoTexto.charAt(contadoru) == 'u') {
                cantidadDeU ++;
            }
        }
        System.out.println("total de u: " + cantidadDeU);

      }


    }

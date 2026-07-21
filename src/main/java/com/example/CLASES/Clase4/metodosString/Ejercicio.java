package com.example.CLASES.Clase4.metodosString;

public class Ejercicio {
    public static void main(String[] args) {

        //Contar la cantidad de letras "a" (minusculas) del texto
        String texto = "24 nov 2018 — Los símbolos “>” y “<” son elementos que se utilizan en matemáticas para indicar que un número es mayor o menor que otro.";


        int cantidadDeA = 0;
        for (int contador = 0; contador < texto.length(); contador++) {
            if(texto.charAt(contador) == 'a'){
                cantidadDeA++;
            }
        }
        System.out.println(cantidadDeA);
    }
}

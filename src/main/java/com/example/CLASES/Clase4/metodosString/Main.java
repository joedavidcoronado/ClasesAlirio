package com.example.CLASES.Clase4.metodosString;

public class Main {
    public static void main(String[] args) {

        //Los String tienen métodos (son acciones que un objeto puede realizar)
        String texto = "Los pollitos diocen pio pio pio";

        //Cosas que puedo hacer:
        //1. Medirla automaticamente
        int cantidadLetras = texto.length();

        //2. Tomar un solo caracter
        char caracter = texto.charAt(8);

        //3. Separar la cadena / cortar un pedazo
        String pedazo1 = texto.substring(4,11);

        //4. Comparar String con otro
        if( texto.equals(pedazo1) ){
            return;
        }

        //5. Mayusculas y minusculas
        String textoMayusculas = texto.toUpperCase();
        String textoMinusculas = texto.toLowerCase();

    }
}

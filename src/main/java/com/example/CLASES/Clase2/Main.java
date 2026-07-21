package com.example.CLASES.Clase2;

public class Main {
    public static void main(String[] args) {



        //Variables
        //VARIABLE: Un espacio en memoria para guardar cosas
        //Ejem: Cofre, Nevera, Horno, Caja, etc...

        int numeroA = 1;
        double numeroB = 10.00;
        String cadena = "texto";
        char caracter = '$';

        //Ejemplo...
        //Persona alirio = "Nada";
        //Persona joe = "Menos que nada";

        //Galpon galpon1 = 1000m2;
        //Galpon galpon2 = 300m2;



        //EJERCICIO1: Crea una varible "total" que valga 100, luego otra "aumento" que valga 20,
        //            suma al total el aumento

        int total = 100;
        int aumento = 20;

        total = total + aumento;

        System.out.println("total");

        //EJERCICIO2: Ejemplo matematico   a=Raiz(a al cuadrado + b al cuadrado)

        int a = 5;
        int b = 8;

        double pitagoras = Math.sqrt((a*a) + (b*b));
        System.out.println("pitagoras: " + pitagoras);
    }
}

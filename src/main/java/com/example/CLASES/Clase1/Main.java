package com.example.CLASES.Clase1;

public class Main {
    public static void main(String[] args) {

        //Ejercicio#1: mi mama le regala a Andrea 2000 Bs
        //Dice que de lo que le dió le de a Joe la mitad

        //Luego Deibis le regala 1400 Bs aparte
        //Mi mama dice que si tiene mas de 2000 le de un tercio de todo lo que
        //tiene a Alirio, sino, botada de la casa

        double totalAlirio;


        double andreRegalado = 2000.00;
        double darAJoe = 0.5;
        double dadoAJoe = andreRegalado * darAJoe;
        andreRegalado = andreRegalado - dadoAJoe;

        int regaloDelViejo = 1400;

        andreRegalado = andreRegalado + regaloDelViejo;

        if(andreRegalado > 2000){
            //Bloque de si
            totalAlirio = andreRegalado * 0.33333333333333333;
            System.out.println("le de um tercio de todo a Alirio, que es " + totalAlirio);
        }else{
            //Bloque de no
            System.out.println("botada de la casa");
        }
    }
}



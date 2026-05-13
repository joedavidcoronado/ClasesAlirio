package com.example.CLASES.Clase3;

import java.util.Scanner;

public class ScannerPractica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //int numero = leer.nextInt();
        //System.out.println(numero);
        System.out.println("--------------------------------------------------------");
        System.out.println("DAME TU EDAD MI REY");
        System.out.println("--------------------------------------------------------");
        int edad = leer.nextInt();
        System.out.println("--------------------------------------------------------");
        if(edad > 40){
            System.out.println("Eres un viejardo mi loco .-.");
        }else{
            System.out.println("Niñoooooooooooon");
        }
    }
}

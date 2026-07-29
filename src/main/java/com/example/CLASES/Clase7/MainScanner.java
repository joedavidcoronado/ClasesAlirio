package com.example.CLASES.Clase7;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {


        Scanner leer = new Scanner(System.in);

        int a;
        int b;
        int c;

        for (int i = 0; i < 10; i ++){
            System.out.println("____________________________________________");
            System.out.println("INGRESA EL PRIMER NUMERO");
            a = leer.nextInt();

            System.out.println("____________________________________________");
            System.out.println("INGRESA EL SEGUNDO NUMERO");
            b = leer.nextInt();
            System.out.println("____________________________________________");
            System.out.println("RESULTADO: " + (a+b));
        }
    }
}

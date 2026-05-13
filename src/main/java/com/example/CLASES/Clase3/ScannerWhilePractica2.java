package com.example.CLASES.Clase3;

import java.util.Scanner;

public class ScannerWhilePractica2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // > <
        int numero = 0;
        int contador = 0;

        while(numero < 20){
            System.out.println("Vuelta numero: " + (contador++));
            numero = leer.nextInt();
        }
        System.out.println("Salió");
    }
}

package com.example.CLASES.Clase7;

import java.util.Scanner;

public class MainScannerString {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contrasena = 1000;
        int intento = 900;

        while(contrasena != intento){
            intento = leer.nextInt();
        }
        System.out.println("SE ACABÓ");
    }
}

package com.example.CLASES.Clase6.Repaso2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        boolean prendido = true;

        while (prendido){

            //MENUUU
            System.out.println("-------------------------------------------------------");
            System.out.println("Hola, este es tu programa");
            System.out.println("1. Hola");
            System.out.println("2. Cara");
            System.out.println("3. Palo");
            System.out.println("4. Zeta");
            System.out.println("5. Salir");
            System.out.println("-------------------------------------------------------");

            opcion = leer.nextInt();

            if (opcion < 1 || opcion > 5){
                System.out.println("Error, coloca un numero correcto");
                return;
            }

            switch (opcion){
                case 1:
                    System.out.println("HOLAAAAAAAA");
                    break;
                case 2:
                    System.out.println("CARAAAAAAAAAAA");
                    break;
                case 3:
                    System.out.println("PALOOOOOOOOOOO");
                    break;
                case 4:
                    System.out.println("ZETAAAAAAAAAAA");
                    break;
                case 5:
                    System.out.println("CHAO");
                    prendido = false;
                    break;
            }
        }
    }
}

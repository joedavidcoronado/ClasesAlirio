package com.example.TAREAS.tarea3;

import java.util.Scanner;

public class codigocesar2 {
    public static void main(String[] args) {

        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        while (opcion != 3) {

            System.out.println("----------Encriptador----------");
            System.out.println("1:encriptar");
            System.out.println("2:desencriptar");
            System.out.println("3:salir");
            System.out.println("Que quieres hacer: ");
            opcion = leer.nextInt();
            leer.nextLine();

            if (opcion < 1 || opcion > 3) {
                System.out.println("----------error----------");
                System.out.println("\n");
            }else{
                if (opcion != 3) {
                    System.out.println("\n");

                    switch (opcion) {

                        case 1: //codificar

                            System.out.println("Mensaje:");
                            String mensaje = leer.nextLine();

                            String cifrado = " ";

                             int i = 0;
                             while (i < mensaje.length()) {
                                 char letra = mensaje.charAt(i);

                                 if (letra == ' ') {

                                     cifrado += " ";

                                 } else {

                                     int posicion = 0;

                                     while (alfabeto.charAt(posicion) != letra) {
                                         posicion++;
                                     }

                                     posicion = posicion + 5;

                                     if (posicion >= 27){
                                        posicion = posicion - 27;
                                     }
                                     cifrado += alfabeto.charAt(posicion);
                                 }
                                 i++;
                             }
                            System.out.println("mensaje cifrado:" + cifrado);
                             break;
                        case 2: //descodificar

                            System.out.println("Mensaje:");
                            String mensaje2 = leer.nextLine();

                            String descifrado = " ";

                            int i2 = 0;
                            while (i2 < mensaje2.length()) {
                                char letra = mensaje2.charAt(i2);

                                if (letra == ' ') {

                                    descifrado += " ";

                                } else {

                                    int posicion = 0;

                                    while (alfabeto.charAt(posicion) != letra) {
                                        posicion++;
                                    }

                                    posicion = posicion - 5;

                                    if (posicion < 0){
                                        posicion = posicion + 27;
                                    }
                                    descifrado = descifrado + alfabeto.charAt(posicion);
                                }
                                i2++;
                            }
                            System.out.println("mensaje cifrado:" + descifrado);
                            break;
                        default:
                            System.out.println("Opcion no entendida");
                            break;
                    }
                }
            }
        }
    }
}

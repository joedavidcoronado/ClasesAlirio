package com.example.TAREAS.tarea2;

import java.util.Scanner;

public class ActualizacionCalculadora {
    public static void main(String[] args) {


        int opcion = 0;
        Scanner leer =  new Scanner(System.in);

        while (opcion != 5){


            System.out.println("----------Calculadora----------");
            System.out.println("1:Sumar");
            System.out.println("2:Restar");
            System.out.println("3:Multiplicar");
            System.out.println("4:Dividir");
            System.out.println("5:salir");
            System.out.println("que quieres hacer:");

            opcion = leer.nextInt();

            if(opcion<0 || opcion>5){
                System.out.println("----------error----------");
            } else {
                if (opcion != 5){
                    System.out.println("\n");

                    double operando1;
                    double operando2;

                    System.out.println("Ingrese el valor del primer digito:");
                    operando1 = leer.nextDouble();

                    System.out.println("Ingrese el valor del segundo digito:");
                    operando2 =  leer.nextDouble();

                    System.out.println("\n");

                    switch (opcion) {
                        case 1: //suma
                            double nuevoValor = operando1 + operando2;
                            System.out.println("sumado es:" + nuevoValor);
                            break;
                            //////////////////////////////////////////////////////
                        case 2: //resta
                            System.out.println("restaddo es:" + (operando1 - operando2));
                            break;
                            //////////////////////////////////////////////////////
                        case 3: //multiplicacion
                            System.out.println("multiplicado es:" + (operando1 * operando2));
                            break;
                            /////////////////////////////////////////////////////
                        case 4:  // division
                            System.out.println("dividido es:" + (operando1 / operando2));
                            break;
                        default:
                            System.out.println("opcion incorrecto");
                            break;
                    }
                }
            }
        }
    }
}

package com.example.TAREAS.tarea2;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        //MENU                                                     >” y “<”
        int opcion = 0;
        Scanner sc;
        sc = new Scanner(System.in);

        //ESCOGER

        do {
            System.out.println("\n");
            System.out.println("----------Calculadora----------");
            System.out.println("1:Sumar");
            System.out.println("2:Restar");
            System.out.println("3:Multiplicar");
            System.out.println("4:Dividir");
            System.out.println("0:salir");
            System.out.println("que quieres hacer:");

            opcion = Integer.parseInt(sc.nextLine());

            if(opcion<0 || opcion>5){
                System.out.println("----------error----------");
            } else if (opcion != 0){
                System.out.println("\n");
                float operando1, operando2;

                ///////////////////////////////////////////

                System.out.println("Ingrese el valor del primer digito:");
                operando1 = Float.parseFloat(sc.nextLine());

                System.out.println("Ingrese el valor del segundo digito:");
                operando2 = Float.parseFloat(sc.nextLine());

                System.out.println("\n");
                switch (opcion) {
                    case 1: //suma
                    System.out.println("sumado es:"+(operando1 + operando2));
                    break;
                //////////////////////////////////////////////////////
                case 2: //resta
                    System.out.println("restaddo es:"+(operando1 - operando2));
                    break;
                //////////////////////////////////////////////////////
                case 3: //multiplicacion
                    System.out.println("multiplicado es:"+(operando1 * operando2));
                    break;
                /////////////////////////////////////////////////////
                case 4:  // division
                    System.out.println("dividido es:"+(operando1 / operando2));
                    break;
                /////////////////////////////////////////////////////
                case 5:  //salir
                    System.out.println("el resultado es:"+(operando1 % operando2));

                    /////////////////////////////////////////////////////////////////////////////
                   /////////////////////////////////////////////////////////////////////////////




                }
           }
        }while(opcion != 0);
        sc.close();
        System.out.println("---------Finalizado mi rey--------");
    }
    }

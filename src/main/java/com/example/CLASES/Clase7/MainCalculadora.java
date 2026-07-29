package com.example.CLASES.Clase7;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE UN NUMERO");
        int numero1 = leer.nextInt();
        System.out.println("=====================");
        System.out.println("INGRESE UN NUMERO");
        int numero2 = leer.nextInt();
        System.out.println("=====================");
        System.out.println("INGRESE UNA OPERACION");
        char operacion = leer.next().charAt(0);
        System.out.println("=====================");
        switch (operacion){
            case '+':
                System.out.println("Resultado: " + (numero1+numero2));
                break;
            case '-':
                System.out.println("Resultado: " + (numero1-numero2));
                break;
            case '*':
                System.out.println("Resultado: " + (numero1*numero2));
                break;
            case '/':
                System.out.println("Resultado: " + (numero1/numero2));
                break;
            case 'p':
                int resultado = numero1;
                for (int i = 0; i < numero2; i ++){
                    resultado = numero1 * resultado;
                }
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("no entiendo nada");
                break;
        }
    }
}

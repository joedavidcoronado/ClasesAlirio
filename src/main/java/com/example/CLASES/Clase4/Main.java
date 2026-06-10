package com.example.CLASES.Clase4;

public class Main {
    public static void main(String[] args) {

        // ><

        int papelitosVacios = 107;
        int papelitosTriangulos = 57;

        //Quiero que se pare cuando a papelitosTriangulos le queden 30
        int contador = 1;
        while(papelitosTriangulos > 30){
            System.out.println("Pareja # " + contador);
            papelitosTriangulos--;
            contador = contador + 1; //contador++;
        }
    }
}

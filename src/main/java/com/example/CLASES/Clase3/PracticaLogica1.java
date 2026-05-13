package com.example.CLASES.Clase3;

public class PracticaLogica1 {
    public static void main(String[] args) {

        //Personaje #1
        String personaje1 = "Alirio";
        double vida1 = 100;
        int poder1 = 27;

        //Personaje #2
        String personaje2 = "Andrea";
        double vida2 = 80;
        int poder2 = 14;

        for (int i = 1; i < 51; i++) {
            System.out.println("Numero del ataque: #" + i);
            //ATACA EL PERSONAJE #1
            vida2 = vida2 - poder1;
            System.out.println("El personaje " + personaje1 + ", atacó a " + personaje2);
            System.out.println("Tiene ahora de vida: " + vida2);

            //ATACA EL PERSONAJE #2
            vida1 = vida1 - poder2;
            System.out.println("El personaje " + personaje2 + ", atacó a " + personaje1);
            System.out.println("Tiene ahora de vida: " + vida1);
        }
    }
}

package com.example.Clase1;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Joe llega a casa con flores.
        //Si no son amarillas Kamila se enoja
        //Si son amarillas Kamila verifica los petalos
        //Si los petalos son muy grandes Kamila se enoja
        //Si son pequeños esta feliz y ahora verifica mi cara
        //Si parezco joe se enoja
        //Si soy cualquier otra persona está feliz
        //Por ultimo si hubera llegado sin flores se enoja

        boolean llegaConFlore = true;
        boolean sonAmarillas = false;
        boolean petalosGrandes = true;
        boolean caritaDeJoe = true;

        if (llegaConFlore == true){
            System.out.println("No se enoja pero verifica si son amarillas...");
            if(sonAmarillas == true){
                System.out.println("ok... son amarillas pero veamos los petalos");
                if(petalosGrandes == true){
                    System.out.println("Se enoja porque los petalos son grandes");
                }else{
                    System.out.println("Esta feliz pero... veamos tu cara");
                    if(caritaDeJoe == true){
                        System.out.println("Se enoja porque es tu cara");
                    }else{
                        System.out.println("Es cualquier otra persona, tonces felí");
                    }
                }
            }else{
                System.out.println("Se enoja por que no son amarillas");
            }
        }else{
            System.out.println("ta nojau porque no trajiste flores");
        }
    }
}

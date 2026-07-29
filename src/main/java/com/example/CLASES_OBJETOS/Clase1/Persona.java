package com.example.CLASES_OBJETOS.Clase1;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String correo;
    private double cantidadDinero;
    private int brazos;
    private int piernas;


    //METODOS

    //1. Metodo Constructor: Sirve para crear objetos de este tipo
    public Persona(String nombre, int edad, String correo, double cantidadDinero, int brazos, int piernas){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.cantidadDinero = cantidadDinero;
        this.brazos = brazos;
        this.piernas = piernas;
    }

    public String cantar() {
        return "Baila como Juana la Cubana";
    }

    public int sumar(int a, int b){
        return a + b;
    }

    public void pensar(){
        System.out.println("Estoy pensando");
    }
}

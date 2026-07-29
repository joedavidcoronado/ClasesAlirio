package com.example.CLASES_OBJETOS.Clase2.Ejemplo1;

public class Main {
    public static void main(String[] args) {
        //=======================================================


        //PARA CONSTRUIR UN OBJETO
        Mascota mascota1 = new Mascota("Perro", "Pincher", "Chay", 3);

        //PARA OBTENER INFORMACION DEL OBJETO
        System.out.println(mascota1.getTipo());

        //PARA CAMBIAR UN ATRIBUTO DEL OBJETO
        mascota1.setTipo("Gato");

        System.out.println(mascota1.getTipo());


        //=======================================================
    }
}

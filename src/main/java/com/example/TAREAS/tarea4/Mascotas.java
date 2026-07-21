package com.example.TAREAS.tarea4;

public class Mascotas {

   private int edad;
   private int patas;
   private String nombre;
   private int cola;
   private boolean pulgas;
   private boolean estalimpio;

   public Mascotas (int edad,
                    int patas,
                    String nombre,
                    int cola,
                    boolean pulgas,
                    boolean estalimpio
                    ){

       this.edad = edad;
       this.patas = patas;
       this.nombre = nombre;
       this.cola = this.cola;
       this.pulgas = pulgas;
       this.estalimpio = estalimpio;

   }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public boolean isEstalimpio() {
        return estalimpio;}
    public void setEstalimpio(boolean estalimpio) {
        this.estalimpio = estalimpio;
    }
}
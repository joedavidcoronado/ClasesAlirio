package com.example.CLASES.Clase5.ejemplo1;

public class Persona {

    //ATRIBUTOS: Cosas que posee el objeto
    private String nombre;
    private int edad;
    private boolean maleante;
    private boolean juicio;
    private int dedos;
    private String correo;

    //METODOS: Cosas que hace el objeto

    //1. Metodo Constructor
    public Persona(String nombre, int edad, boolean maleante, boolean juicio, int dedos, String correo){
        this.nombre = nombre;
        this.edad = edad;
        this.maleante = maleante;
        this.juicio = juicio;
        this.dedos = dedos;
        this.correo = correo;
    }

    //2. Metodo ejemplo (void: vacio)
    public void caminar(){
        System.out.println("Caminando");
    }

    //3. Getters and Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMaleante() {
        return maleante;
    }

    public void setMaleante(boolean maleante) {
        this.maleante = maleante;
    }

    public boolean isJuicio() {
        return juicio;
    }

    public void setJuicio(boolean juicio) {
        this.juicio = juicio;
    }

    public int getDedos() {
        return dedos;
    }

    public void setDedos(int dedos) {
        this.dedos = dedos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

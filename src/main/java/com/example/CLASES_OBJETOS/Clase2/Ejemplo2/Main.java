package com.example.CLASES_OBJETOS.Clase2.Ejemplo2;

public class Main {
    public static void main(String[] args) {

        Carro ganador;

        Carro carroDeJuanito = new Carro("Porsche", 2025, 100);
        Carro carroDeSandra  = new Carro("Toyota", 2018, 90);

        if( carroDeSandra.getVelocidadMaxima() < carroDeJuanito.getVelocidadMaxima() ){
            System.out.println("JUANITO CORRE MAS");
            ganador = carroDeJuanito;
        }else{
            System.out.println("SANDRA CORRE MAS");
            ganador = carroDeSandra;
        }
        System.out.println(ganador.getVelocidadMaxima());

        //IMAGINA QUE ALGUIEN CHOCO EL CARRO DEL GANADOR Y AHORA CORRE 10% menos
        ganador.setVelocidadMaxima(ganador.getVelocidadMaxima() - 10);

        System.out.println(ganador.getVelocidadMaxima());

    }
}

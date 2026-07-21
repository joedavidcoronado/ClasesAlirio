package com.example.TAREAS.tarea4;

public class Main {
    public static void main(String[] args) {


       Mascotas perro = new Mascotas(
               3,
               4,
               "aurelio",
               1,
               false,
               true);
       Mascotas gato = new Mascotas(6,
                4,
                "Cotton",
                9,
                true,
                true);

        if (perro.getNombre().length() > gato.getNombre().length()) {
            System.out.println("El perro tiene el nombre mas largo");

            int contador = 0;
            int vocales = 0;

            while ( vocales < perro.getNombre().length()){
                char letra = perro.getNombre().charAt(vocales);
                if (letra == 'a'|| letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
                  contador++;
                }
                vocales++;
            }
            System.out.println("Y el nombre tiene " + contador + " vocales");
        }
        if(perro.getNombre().length() < gato.getNombre().length()){
            System.out.println("El gato tiene el nombre mas largo");

            int contador2 = 0;
            int vocales2 = 0;

            while ( vocales2 < gato.getNombre().length()){
                char letra = gato.getNombre().charAt(vocales2);
                if (letra == 'a'|| letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
                  contador2++;
                }
                vocales2++;
                }
            System.out.println("Y el nombre tiene" + contador2 + "vocales");
            }




        }
    }


//Escribe una aplicación donde:
package POLIMORFISMO;

import HERENCIA.*;

public class E5_MAIN {

    public static void main(String[] args) {
        //a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10. 
        //* ListaMultimedia del Ejercicio 10.
        LISTAMULTIMEDIA ListaMultimedia = new LISTAMULTIMEDIA(10);
      
        // b) Se creen tres discos y se añadan a la lista. Disco del Ejercicio 12.
        try {
            DISCO Rihanna = new DISCO("Diamonds", "Rihanna", format.mp3, "4", "Pop");
            DISCO MagodeOz = new DISCO("Fiesta Pagana", "Mago de Oz", format.mp3, "5", "Rock");
            DISCO DavidGuetta = new DISCO("The World is mine", "Davig Guetta", format.mp3, "4", "Dance");

            //Añado a la lista    
            ListaMultimedia.add(Rihanna);
            ListaMultimedia.add(MagodeOz);
            ListaMultimedia.add(DavidGuetta);

        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
        }

        //c) Se creen tres películas y se añadan a la lista. Película del Ejercicio 9
        try {
            PELICULA Batman = new PELICULA("Batman Begins", "Bruce Wayne", format.mp3, "124", "Gerard Butler", "Jennifer Lawrence");
            PELICULA Superman = new PELICULA("Superman Returns", "Steven Spielberg", format.wav, "132", "Richard Gere", "Jennifer Anniston");
            PELICULA Torrente = new PELICULA("Torrente", "Santiago Segura", format.dvd, "96", "Santiago Segura", "Neus Asensi");

            //Añado a la lista    
            ListaMultimedia.add(Batman);
            ListaMultimedia.add(Superman);
            ListaMultimedia.add(Torrente);

        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
        }

        //   d) Trabajando con la lista y suponiendo que no se sabe en qué 
        //posiciones están los discos y las películas:
        //  1. Se muestre la lista por pantalla.
        System.out.println(ListaMultimedia);
        //2. Se calcule la duración total de los objetos de la ListaMultimedia.
        int duracion_total = 0;

        //Método que convierte string en int -- Integer.parseINT
        for (int i = 0; i < ListaMultimedia.size(); i++) {
            duracion_total += Integer.parseInt(ListaMultimedia.get(i).getDuracion());
        }
        System.out.println("Duracion total: " + duracion_total + " minutos. ");

        //3. Se muestre cuántos discos hay de rock.
        int discos_rock = 0;
        for (int i = 0; i < ListaMultimedia.size(); i++) {
            if (ListaMultimedia.get(i) instanceof DISCO) {
                //Hacer un downcasting para poder utilizar el metodo del hijo
                if (((DISCO) ListaMultimedia.get(i)).getGenero().equalsIgnoreCase("Rock")) {
                    discos_rock++;
                }
            }
        }
        System.out.println("Discos de rock: " + discos_rock);

        //4. Se obtenga cuántas películas no tienen actriz principal.
        int act_princi = 0;
        for (int i = 0; i < ListaMultimedia.size(); i++) {
            if (ListaMultimedia.get(i) instanceof PELICULA) {
                //Hacer un downcasting para poder utilizar el metodo del hijo
                if (((PELICULA) ListaMultimedia.get(i)).getActrizPrincipal().isEmpty()) {
                    act_princi++;
                }
            }
        }
        System.out.println("Peliculas sin actriz principal: " + act_princi);
    }
}

/*
 3.d.- Escribe una aplicación donde: 
 */
package HERENCIA;

public class E3D_MAIN {

    public static void main(String[] args) {
        //  a) Se crea un objeto de tipo ListaMultimedia de tamaño máximo 10.
        LISTAMULTIMEDIA ListaMultimedia = new LISTAMULTIMEDIA(10);

//b) Se pidan tres películas y se añadan a la lista. 

        //Creo 3 peliculas
        try {
            PELICULA Batman = new PELICULA("Batman Begins", "Bruce Wayne", 
                    format.mp3, "124", "Gerard Butler", "Jennifer Lawrence");
            PELICULA Superman = new PELICULA("Superman Returns", "Steven Spielberg", 
                    format.wav, "132", "Richard Gere", "Jennifer Anniston");
            PELICULA Torrente = new PELICULA("Torrente", "Santiago Segura", 
                    format.dvd, "96", "Santiago Segura", "Neus Asensi");

            //Añado a la lista    
            ListaMultimedia.add(Batman);
            ListaMultimedia.add(Superman);
            ListaMultimedia.add(Torrente);

            // f) Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.
            int pos=ListaMultimedia.indexOf(Torrente);
            System.out.println("Posicion: " + pos );
            System.out.println(ListaMultimedia.get(pos ));

        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
        }
//c) Se muestre la lista por pantalla.
        System.out.println(ListaMultimedia);

//d) Se cree un objeto de tipo Película introduciendo el título y el autor de una de las películas de la lista.
        //* Para el resto de los argumentos se utilizan valores no significativos.
        try {
            PELICULA prueba = new PELICULA("Batman Begins", "Bruce Wayne", 
                    null, null, null, null);
            ListaMultimedia.add(prueba);

            //e) Busca la posición de este objeto en la lista.
            System.out.println(ListaMultimedia.indexOf(prueba));

        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
        }
        //Al ejecutar no deja crear si metemos los valores a null ya que en el constructor de la clase multimedia
        // he hecho las comprobaciones pertinentes.
    }
}

/*
 3.g.- Escribe una aplicación donde>
 */
package HERENCIA;
  public class E3G_MAIN {

    public static void main(String[] args) {
        //a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10. 
        LISTAMULTIMEDIA ListaMultimedia = new LISTAMULTIMEDIA(10);
        // b) Se creen tres discos y se añadan a la lista.

        //Creo 3 Discos
        try {
            DISCO Rihanna = new DISCO("Diamonds", "Rihanna", format.mp3, "4", "Pop");
            DISCO MagodeOz = new DISCO("Fiesta Pagana", "Mago de Oz", format.mp3, "5", "Rock");
            DISCO DavidGuetta = new DISCO("The World is mine", "Davig Guetta", format.mp3, "4", "Dance");

            //Añado a la lista    
            ListaMultimedia.add(Rihanna);
            ListaMultimedia.add(MagodeOz);
            ListaMultimedia.add(DavidGuetta);

            // f) Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.
            // System.out.println("Posicion: " + ListaMultimedia.indexOf(Torrente));
            // System.out.println(ListaMultimedia.get(ListaMultimedia.indexOf(Torrente)));

        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
        }

        //   * c) Se muestre la lista por pantalla. 
        System.out.println(ListaMultimedia);


        //d) Se cree un objeto de tipo Disco introduciendo el título y el autor de uno de los discos 
//* de la lista, para el resto de los argumentos se utilizan valores no significativos. 

        try {
            DISCO prueba = new DISCO("Mendoza", "Prueba", null, null, null);
            ListaMultimedia.add(prueba);

            //Se crea con éxito ya que las restricciones de nulls estaban en la clase PELICULA

            //e) Busca la posición de este objeto en la lista.
            System.out.println("Posición: " + ListaMultimedia.indexOf(prueba));

            // f) Obtenga el objeto que está en esa posición y lo muestre por pantalla 
            //junto con la posición en la que se encuentra.

            System.out.println(ListaMultimedia.get(ListaMultimedia.indexOf(prueba)));

        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
        }


    }
}

/*
 3.c.- Escribe una clase ListaMultimedia para almacenar objetos de tipo multimedia. 
 * La clase debe tener un atributo que sea un array de objetos Multimedia y un entero para contar cuántos 
 * objetos hay almacenados. Además, tiene un constructor y los siguientes métodos: 
 */
//Version con ArrayList. Esta versión no se solicitaba 
package HERENCIA;

import java.util.*;

public class LISTAMULTIMEDIA1 {

    private ArrayList<MULTIMEDIA> lista;
    // private int total = 0;

    //Constructor
    //a) el constructor recibe por parámetro un entero indicando el número máximo de objetos que va a almacenar. 
    public LISTAMULTIMEDIA1(int x) {
        lista = new ArrayList(x);
    }

    //b) int size(): devuelve el número de objetos que hay en la lista.
    public int size() {
        return lista.size();
    }

    /* c) boolean add(Multimedia m): añade el objeto al final de la lista y devuelve true, en caso de que la lista 
     esté llena devolverá false.*/
    public void add(MULTIMEDIA x) {
        lista.add(x);
    }

    //d) Multimedia get(int posición): devuelve el objeto situado en la posición especificada. 
    public MULTIMEDIA get(int posicion) {
        return lista.get(posicion);
    }

    /*e) int indexOf(Multimedia m): devuelve la posición del objeto que se introduce por parámetro, 
     si no se encuentra, devolverá -1. */
    public int indexOf(MULTIMEDIA m) {
        //El método indexOf de los ArrayList si lo encuentra devuelve la posición sino -1
        return lista.indexOf(m);
    }

    /* * f) String toString() devuelve la información de los objetos que están en la lista.*/
    public String toString() {
        String resultado = "";

        for (int i = 0; i < lista.size(); i++) {
            resultado = resultado + "\nMULTIMEDIA [" + i + "]: \n" + lista.get(i).toString() + "\n";
        }
        return resultado;
    }
}

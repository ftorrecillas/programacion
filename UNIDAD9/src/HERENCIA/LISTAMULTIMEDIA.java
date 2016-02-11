/*
 3.c.- Escribe una clase ListaMultimedia para almacenar objetos de tipo multimedia. 
 * La clase debe tener un atributo que sea un array de objetos Multimedia y un entero para contar cuántos 
 * objetos hay almacenados. Además, tiene un constructor y los siguientes métodos: 
 */
package HERENCIA;

import java.util.*;

public class LISTAMULTIMEDIA {

    private MULTIMEDIA[] lista;
    private int total = 0;

    //Constructor
    //a) el constructor recibe por parámetro un entero indicando el número máximo de objetos que va a almacenar. 
    public LISTAMULTIMEDIA(int x) {
        lista = new MULTIMEDIA[x];
    }

    //b) int size(): devuelve el número de objetos que hay en la lista.
    public int size() {
        return total;
    }

    /* c) boolean add(Multimedia m): añade el objeto al final de la lista y devuelve true, en caso de que la lista 
     esté llena devolverá false.*/
    public boolean add(MULTIMEDIA x) {
        if (total < lista.length) {
            lista[total] = x;
            total++;
            return true;
        } else {
            return false;
        }
    }

    //d) Multimedia get(int posición): devuelve el objeto situado en la posición especificada. 
    public MULTIMEDIA get(int posicion) {
        return lista[posicion];
    }

    /*e) int indexOf(Multimedia m): devuelve la posición del objeto que se introduce por parámetro, 
     si no se encuentra, devolverá -1. */
    public int indexOf(MULTIMEDIA m) {
        for (int i = 0; i < total; i++) {
            if (lista[i].equals(m)) {
                return i;
            }
        }
        return -1;
    }

    /* * f) String toString() devuelve la información de los objetos que están en la lista.*/
    public String toString() {
        String resultado = "";

        for (int i = 0; i < this.size(); i++) {
            resultado = resultado + "\nMULTIMEDIA [" + i + "]: \n" + 
                    this.get(i)+ "\n";
        }
        return resultado;
    }
}

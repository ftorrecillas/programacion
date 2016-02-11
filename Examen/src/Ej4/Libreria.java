/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author mati
 */
public class Libreria {
    public static void main(String[] args) {
        Libro nuevo=new Libro();
        Libro viejo=new Libro("Luna","Velez",2,1);
        nuevo.escribir();
        viejo.escribir();
        
        nuevo.prestamo();
        viejo.prestamo();
        nuevo.getprestamo();
        viejo.getprestamo();
        nuevo.devolucion();
        nuevo.getdevolucion();
        
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ej12 {
    public static void main (String args[]) {
        final double pi = Math.PI;
        final float radio = 15.5F/2;
        final float altura = 42.2F;
        double areacir, arearectan, areacil, volumen;

        areacir=2*(pi*radio);
        areacil= areacir*(altura+radio);

        volumen= pi*radio*radio*altura;
        System.out.println("El area del cilindro es "+ areacil +"cm²");
        System.out.println("El volumen del cilindro es "+ volumen +"cm³");
    }
}

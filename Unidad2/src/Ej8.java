/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ej8 {
     public static void main (String args[]) {
         final float ingreso = 2000.0F;
         float porcentaje, intere, interefinal;
         porcentaje = (0.0275F/2);
         System.out.println("El plaza fijo en seis meses es "+  porcentaje*100+"%");
         intere = ingreso*porcentaje;
         System.out.println("El interes sin retención es "+  intere);
         interefinal= intere*0.82F;
         System.out.println("El interes final es "+  interefinal);
     }
}

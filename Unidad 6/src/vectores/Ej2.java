/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author mati
 */
public class Ej2 {
     public static void main (String args[]) {
         int [] vector= new int [10];
          for (int i=0; vector.length>i; i++ ){
              vector[i]=(int)(Math.random()*10);
           
          }
           for (int i = 0; i < vector.length; i++) { 
            if ((i+1) % 2 == 0) {
                System.out.println("Posicion par:  " + (i+1) + " tiene el valor: " + vector[i]);
            }
        }

        

        for (int i = 0; i < vector.length; i++) { 
            if ((i+1) % 2 != 0) {
                System.out.println("Posicion impar:  " + (i+1) + " tiene el valor: " + vector[i]);
            }
        }
     }
}

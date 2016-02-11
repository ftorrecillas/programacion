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
public class Ej4 {
    public static void main(String[] args) {
        int [] vector= new int [10];
          
        for (int i=0; vector.length>i; i++ ){
              vector[i]=(int)(Math.random()*10);
        
            if ((vector[i]) % 2 == 0) {
                System.out.println("Posicion:  " + (i+1) + " tiene el valor par: " + vector[i]);
            }
      
            if ((vector [i]) % 2 != 0) {
                System.out.println("Posicion:  " + (i+1) + " tiene el valor impar: " + vector[i]);
            }
        }
    }
}

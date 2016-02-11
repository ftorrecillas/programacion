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
public class Ej3 {
    public static void main(String[] args) {
         int [] vector= new int [20];
          for (int i=0; vector.length>i; i++ ){
              vector[i]=(int)(Math.random()*10);
          }
          
           for (int i = 0; i < vector.length; i++) {
            System.out.printf(" %4d " , vector[i]);
            if ((i+1)%4==0)
                System.out.println();    

        }
    }
}

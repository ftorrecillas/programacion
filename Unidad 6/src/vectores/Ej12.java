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
public class Ej12 {
    public static void main(String[] args) {
          int [] vector= new int [10];
           int [] pector= new int [10];
          
        for (int i=0; vector.length>i; i++ ){
              vector[i]=(int)(Math.random()*10);
                 System.out.println("Poscicion "+(i+1)+ " valor:" + vector[i]);
             
                
                
        }
        for (int i = vector.length - 1, j = 0; i >= 0; i--, j++) { 
            pector[j] = vector[i];
              System.out.println("Poscicion "+(i+1)+ " valor:" + pector[j]);
            
        }
    }
}

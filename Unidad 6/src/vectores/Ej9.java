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
public class Ej9 {
    public static void main(String[] args) {
          int [] vector= new int [20];
          
        for (int i=0; vector.length>i; i++ ){
              vector[i]=(int)(Math.random()*10);
                System.out.println("Poscicion "+(i+1)+ " valor:" + vector[i]);
        }
          int max=0;
          int indMayor=0;
           for (int i=0; vector.length>i; i++ ){
             if( vector[i]>max){
                 max=vector[i];
                 indMayor=i;
             }      
        }
    
         System.out.println("Poscicion " + (indMayor+1) +  " valor mayor:" + max);
    }
          
      
}

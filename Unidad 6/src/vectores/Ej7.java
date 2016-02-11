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
public class Ej7 {
    public static void main(String[] args) {
        int [] vector= new int [10];
          
        for (int i=0; vector.length>i; i++ ){
              vector[i]=(int)(Math.random()*10);
              
                
        }
        
        if (getCero(vector)!=0)
            System.out.println("Posicion del primer 0:  " +  getCero(vector));
        else 
            System.out.println("No hay ceros en el vector");
    } 
        
          public static int getCero(int[] vector1){
           for (int i=0; vector1.length>i; i++ ){
            if( vector1[i]==0)
                    return i+1;
                   
        }
           return 0;
        }
     
}

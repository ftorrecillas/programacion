/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 *
 * @author mati
 */
public class Ej1LanzarCapturar {
    
    public static void lanzaExcepcion (int num) throws Exception {

            if (num==2)
            throw new Exception ("LOL");
            else 
                    System.out.println("Todo bien");
       
    }  
    
    public static void main(String[] args) {
        int division;
              
        
        try{
             division=6/2; 
             lanzaExcepcion(division);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

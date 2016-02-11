/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author mati
 */
public class Ej3 {
    private String cadena, cadenaMitad="";
    public  Ej3(String j){
            cadena=j;
           // cadenaMayu=cadena;
    }
    public String getmitad(){
        for (int i=0;cadena.length()/2>i; i++ )
                    cadenaMitad=cadenaMitad+cadena.charAt(i);
               
            
        
        return cadenaMitad;
        //return cadena.substring(0, cadena.length()/2);
    
    } 
}

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
public class Ej4 {
    private String cadena, cadenaMitad="";
    public  Ej4(String j){
            cadena=j;
           // cadenaMayu=cadena;
    }
    public String getespor(){
        return cadena.replaceAll("es", "no por");
        //return cadena.substring(0, cadena.length()/2);
    
    } 
    public String getasterisco(){
        return cadena.replaceAll("\\d", "*");
        //return cadena.substring(0, cadena.length()/2);
    
    } 
}

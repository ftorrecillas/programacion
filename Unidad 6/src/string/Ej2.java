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
public class Ej2 {
   private String cadena, cadenaMayu;
    public  Ej2(String j){
            cadena=j;
            cadenaMayu=cadena;
    }
    public String getvocales(){
            
        for (int i=0;cadena.length()>i; i++ ){
               // if(cadena.charAt(i)== 'a')
                    //cadenaMayu=cadena.replace(cadena.charAt(i),Character.toUpperCase(cadena.charAt(i)));
                 if(cadena.charAt(i)== 'o'|cadena.charAt(i)== 'i'|cadena.charAt(i)== 'e'|cadena.charAt(i)== 'u')
                    cadenaMayu=cadenaMayu.replace(cadena.charAt(i),'a');
                //else if(cadena.charAt(i)== 'a')
                   // cadenaMayu=cadena.replace(cadena.charAt(i),Character.toUpperCase(cadena.charAt(i)));
                //else if(cadena.charAt(i)== 'o')
                    //cadenaMayu=cadena.replace(cadena.charAt(i),Character.toUpperCase(cadena.charAt(i)));
                //else if(cadena.charAt(i)== 'u')
                    //cadenaMayu=cadena.replace(cadena.charAt(i),Character.toUpperCase(cadena.charAt(i)));
            }
        
        return cadenaMayu;
    } 
}

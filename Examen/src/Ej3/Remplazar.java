/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author mati
 */
public class Remplazar {
    
    private String cadena, cadenaresul="", esterella="*";
    public  Remplazar(String j){
            cadena=j;
           // cadenaMayu=cadena;
    }
       public String getindexof(char busca){
           for(int i=0; i<cadena.length();i++){
               if( cadena.charAt(i)== busca)
               cadenaresul= cadenaresul+esterella;
               else
                 cadenaresul= cadenaresul+cadena.charAt(i);
           }
           return cadenaresul;
       }
    
    /*public int getindexof(String busca){
         for(int i=0; i<cadena.length();i++){
             if(cadena1.equalsIngnoreCase(busca))
         }
       int i = 0, veces = 0;
        while (i != -1) {
            i = cadena.indexOf(busca, i);
            if (i != -1) {
                cadenaresul= cadenaresul+esterella;
                i += busca.length();
            }
            else
                 cadenaresul= cadenaresul+busca;
                 
                  
        }
        return veces;*/
    
    } 
    


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
public class Ej5 {
    private String cadena;
    public  Ej5(String j){
            cadena=j;
           // cadenaMayu=cadena;
    }
     public int getindexof(String busca){
       int i = 0, veces = 0;
        while (i != -1) {
            i = cadena.indexOf(busca, i);
            if (i != -1) {
                veces++;
                i += busca.length();
            }
        }
        return veces;
    
    } 
}

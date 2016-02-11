/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, apellido1, apellido2,longi;
        char primer, primerMayu;
        int cont=0;
        Scanner intro= new Scanner (System.in);
        
        System.out.print("Escriba el Nombre: "); 
        nombre= intro.next();
        System.out.print("Escriba el primer apellido: "); 
        apellido1= intro.next();
        System.out.print("Escriba el segundo apellido: "); 
        apellido2= intro.next();
        longi = nombre+apellido1+apellido2;
         System.out.println("El nombre completo es: "+nombre+" "+apellido1+" "+apellido2); 
         
         System.out.println("Longitud del nombre: "+longi.length()); 
        System.out.println("El nombre completo Mayusculas: "+nombre.toUpperCase()+" "+apellido1.toUpperCase()+" "+apellido2.toUpperCase()); 
         System.out.println("El nombre completo minisculas: "+nombre.toLowerCase()+" "+apellido1.toLowerCase()+" "+apellido2.toLowerCase());
         
         if(longi.length()>1){
             System.out.println("Primer caracter del nombre: "+longi.charAt(0));
             System.out.println("Segundo caracter del nombre: "+longi.charAt(1));
         }
         if(longi.length()>1){
                //for(int i=0;longi.length(); i++ )
             System.out.println("Último caracter del nombre: "+longi.charAt(longi.length()-1));
             System.out.println("Penuntilo caracter del nombre: "+longi.charAt(longi.length()-2));
         }
          
         for (int i=0;longi.length()>i; i++ ){
             
             
                if( longi.charAt(i)== longi.charAt(longi.length()-1))
                    cont++;
         
         }        
         
         System.out.println("Repeticion del último caracter: "+cont);
         
            primer=longi.charAt(0);
            primerMayu=Character.toUpperCase(primer);
         System.out.println("Cambio de un carater a Mayusculas: "+ longi.replace(primer, primerMayu));
      
     StringBuilder cadena = new StringBuilder(longi);
     //cadena.reverse();
      System.out.println("Cadena inversa: "+ cadena.reverse());
}
}

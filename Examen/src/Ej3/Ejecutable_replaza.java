/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej3;
import java.util.Scanner;
/**
 *
 * @author mati
 */
public class Ejecutable_replaza {
    public static void main(String[] args) {
        char carac_usuario;
        String cad;
      
        Scanner intro=new Scanner(System.in);
        System.out.println("Introduce cadena de caracteres sin espacios: ");
        cad=intro.next();
        Remplazar caracter= new Remplazar(cad);
        intro.nextLine();
       System.out.println("Introduce caracter: ");
       carac_usuario=intro.next().charAt(0);
       intro.nextLine();
       System.out.println("La cadena remplazada es: "+caracter.getindexof(carac_usuario));
        
    }
}

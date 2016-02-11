/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author mati
 */
public class ValorApp {
    public static void main (String args[]) {
        int a=3; 
        System.out.println("antes de la llamada: a=" + a);
        funcion(a);
        System.out.println("despues de la llamada: a=" + a);
        
    }
        public static void funcion(int x){
            x=5;
            System.out.println("dentro del método: x=" + x);
        }
        
}

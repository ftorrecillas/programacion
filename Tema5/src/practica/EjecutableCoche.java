/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author mati
 */
public class EjecutableCoche {
     public static void main (String args[]) {
         Coche coche1=new Coche();
         Coche coche2=new Coche();
         
         coche1.setano(1999);
         coche1.setcolor("verde");
         coche1.setmatricula("v-1345-66");
         coche1.setmodelo("furia");
         coche1.setmodalidadseguro("todo riesgo");
         coche1.settipocoche("depotivo");
         coche1.setesmetalizado(true);
         
         coche2.setcoche("furia", "rojo", "v-5653-66", "todoterreno ", "terceros", true, 2000);
         
          System.out.println("El color "+ coche1.getcolor()+coche1.getmodalidadseguro()+coche2.getano());
     }
}

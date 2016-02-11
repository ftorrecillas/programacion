/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ej10 {
     public static void main (String args[]) {
          final int a = 2, b=4;
          float suma, suma2, suma3;
          suma = -a+5%b-a*a;
          System.out.println("a) Suma es "+  suma);
          suma2= 5+3%7*b*a-b%a;
          System.out.println("b) Suma es "+  suma2);
          suma3=(a+1)*(b+1)-b/a;
          System.out.println("d) Suma es "+  suma3);
     }
}

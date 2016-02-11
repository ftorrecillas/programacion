/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ej11 {
    public static void main (String args[]) {
          final int a = 15, b=25;
          int perimetro, area;
          perimetro = a+a+b+b;
          area= a*b;
          System.out.println("La altura del rectángulo es "+  a+"cm");
             System.out.println("La base del rectángulo es "+  b+"cm");
          System.out.println("El perimetro es "+  perimetro+"cm");
          System.out.println("El area es "+  area+"cm²");
    }
}

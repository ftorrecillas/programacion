/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_1;

/**
 *
 * @author mati
 */
public class Ejecutable {
    public static void main (String args[]) {
        //Objeto clase punto
        Punto pu=new Punto(3,5);
        Punto pu1=new Punto(6,1);
        Punto pu2=new Punto();
        //Objeto clase Circulo
        Circulo cir1= new Circulo(pu,8);
        Circulo cir2= new Circulo(2,8,7);
        //Objeto clase Trinagulo
        Triangulo tri1= new Triangulo();
        Triangulo tri2= new Triangulo (pu, pu1, pu2);
      
        //LLamamos al método Calcular distancia entre puntos
         System.out.println("Distancia entre los dos puntos "+  pu.calcularDistanciaDesde(pu1));
          //LLamamos a los métodos de la clase circulos
         System.out.println("Distancia entre centro y un punto "+  cir1.calcularDistanciaDesde(pu1));
         System.out.println("Distancia entre los dos centros "+  cir1.calcularDistanciaDesde(cir2.getcentro()));         
         System.out.println("Area ciurculo "+  cir1.calcularArea());
         System.out.println("Perimetro ciurculo "+  cir1.calcularPeímetro());
       //LLamamos a los métodos de la clase Triangulo
         System.out.println("Distancia entre dos punto del triangulo "+  tri1.calcularDistanciaDesde(pu2));         
         System.out.println("Area Triangulo "+  tri1.calcularArea());
         System.out.println("Perimetro Triangulo "+  tri1.calcularPeímetro());
    }
}

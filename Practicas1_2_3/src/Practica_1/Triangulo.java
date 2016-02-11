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
public class Triangulo {
     private Punto base1, base2, cima;
     //private  double d,a,c;
     public Triangulo(Punto p, Punto p1, Punto p2){
       base1 = p;
       base2 = p1;
       cima = p2;
    } 
      public Triangulo(){
        base1 = new Punto(4,2);
        base2 = new Punto(8,1);
        cima= new Punto(6,7);
      
    } 
    public Triangulo (double a, double b, double c, double d, double e, double j){
      base1 = new Punto(a,b);
      base2 = new Punto(c,d);
      cima= new Punto(e,j);
    }
     public Punto getpunto1 (){
        return base1;
    }
     public Punto getpunto2 (){
        return base2;
    }
     public Punto getpunto3 (){
        return cima;
    }
     public double calcularDistanciaDesde (Punto param){
        return base1.calcularDistanciaDesde(param);      
        
     }
      public double calcularArea (){
        double  d=cima.calcularDistanciaDesde(base1);
       double   a=cima.calcularDistanciaDesde(base2);
      double    c=base2.calcularDistanciaDesde(base1);
          
          
         double seperimetro= (a+d+c)/2;
        return  Math.sqrt(seperimetro*(seperimetro-a)*(seperimetro-d)*(seperimetro-c));
     }
      public double calcularPeímetro (){
         double d=cima.calcularDistanciaDesde(base1);
         double a=cima.calcularDistanciaDesde(base2);
         double c=base2.calcularDistanciaDesde(base1);
        return     a+d+c;
     }
}

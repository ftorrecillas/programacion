/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
import java.util.Scanner;
public class Ej18 {
    
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        double perimetro,area;
        int lado;
        System.out.println("Escribe el tamaño del lado del triangulo.");
        lado=tcl.nextInt();
        area=((Math.sqrt(3)/4F)*(lado*lado));
        perimetro=3F*lado;
        System.out.println ("El perimetro del triangulo es "+perimetro +"cm");
        System.out.println ("El area del triangulo es "+area +"cm²");
        }
    }
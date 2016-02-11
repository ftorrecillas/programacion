package Practica_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ejecutable {
    public static void main (String args[]) {
        //Objeto clase Asignatura
        Asignatura mate=new Asignatura(5);
        Asignatura fisica=new Asignatura(1);
        Asignatura dibujo=new Asignatura(3);
        //Objeto clase Alumno
        Alumno Jose= new Alumno(mate,fisica,dibujo);
        Alumno Paco= new Alumno(2,8,7);
        //Objeto clase Alumno
        Profesor Raul= new Profesor(); //No hace falta crear el objeto profesor
        
       //LLamamos al método ponerNota directamente sin crear un objeto porque el metodo es static
        
        Raul.ponerNota(Jose);
        
        //LLamamos al método Calcular distancia entre puntos
         System.out.println("Media de las notas "+  Raul.calcularMedia(Jose));
          
    }
}

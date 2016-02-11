/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author mati
 */
public class Libro {
    private String titulo, autor;
    private int ejempla_li=0,ejempla_pres=0;   
    
    public Libro(){
        titulo= "Lolita";
        autor= "UnRuso";
        ejempla_li= 5;
        ejempla_pres= 3;
        
    }
     
    public Libro(String titulo, String autor, int ejempla_li, int ejempla_pres ){
        this.titulo=titulo;
        this.autor=autor;
        this.ejempla_li=ejempla_li;
        this.ejempla_pres=ejempla_pres;
    }
   
    
     public void setnuevolibro(String titulo, String autor, int numero_libro){
         this.titulo=titulo;
         this.autor=autor;
         ejempla_li= numero_libro;
          ejempla_pres= 0;
          
        
    }
      public void getprestamo(){
         System.out.println("Los libros prestados son: "+ejempla_pres);
       
    }
     public void getdevolucion(){
         
         System.out.println("Hay "+ejempla_pres+" para devolver");
    }
     
      public boolean prestamo(){
        if(ejempla_li>ejempla_pres){
            ejempla_pres=ejempla_pres+1;
            System.out.println("Prestamos realizado, disfrute de su libro");
            return true;
        }
        else{
            System.out.println("No quedan ejemplares para prestar");
        return false;
        }
    }
      public boolean devolucion(){
        if(ejempla_pres>0){
            this.ejempla_li=this.ejempla_li-1;
            System.out.println("Libro devuelto, gracias");
        return true;
      }
        else{
              System.out.println("No hay libros para devolver");
        return false;
      }
    }
     
     public void escribir(){
           System.out.println("Los datos del libro son:");
           System.out.println("Titulo: "+ titulo);
           System.out.println("Autor: "+ autor);
           System.out.println("Libros en almacen: "+ ejempla_li);
           System.out.println("Libros en prestamo: "+ ejempla_pres);

        
    }
}

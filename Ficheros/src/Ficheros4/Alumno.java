/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros4;
import java.util.*;
import java.io.*;
/**
 *
 * @author mati
 */
public class Alumno {


    private String carnet, nombre, apellidos;
    private int nota1, nota2, nota3;
    Scanner lector = new Scanner(System.in);
    ArrayList<Alumno> listadato=new ArrayList<Alumno>();
    File f = new File("alumno.dat");
    FileOutputStream fos = null;
    BufferedOutputStream bis = null;
    ObjectOutputStream ois = null;
    public Alumno(){
    
    
    }

    public Alumno(String carnet, String nombre, String apellidos, int nota1, int nota2, int nota3) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public void ponerDato(){
          String carnetmetodo, nombremetodo, apellidosmetodo, cadena;
          int nota1metodo, nota2metodo, nota3metodo;
     do{     
        System.out.println("Introduzca el numero carnet del nuevo alumno: ");
        carnetmetodo = lector.nextLine();
        System.out.println("Introduzca el nombre del alumno: ");
        nombremetodo = lector.nextLine();
        System.out.println("Introduzca los apellidos del alumno: ");
        apellidosmetodo = lector.nextLine();
        System.out.println("Introduzca la primera nota: ");
        nota1metodo = lector.nextInt();
        System.out.println("Introduzca la segunda nota: ");
        nota2metodo = lector.nextInt();
        System.out.println("Introduzca la tercera nota: ");
        nota3metodo = lector.nextInt();
        Alumno alumno01=new Alumno(carnetmetodo,nombremetodo,apellidosmetodo,nota1metodo,nota2metodo,nota3metodo);
        listadato.add(alumno01);
        System.out.println("Quieres añadir mas alunmos? ");
                         cadena=lector.nextLine();
                         
     }while(cadena.equalsIgnoreCase("si"));
    }
    public void llenarArchivo(){
      try{
           fos = new FileOutputStream(f);      
           bis= new BufferedOutputStream(fos);     
           ois=new ObjectOutputStream(bis);
           ois.writeObject(listadato);                  
      }catch (FileNotFoundException e){
                     System.out.println("Error. Fichero no encontrado.");
                     System.out.println(e.getMessage());
	                 
	        } catch (EOFException e)	
                {
                    System.out.println("Fin de fichero");
                    
                }catch (IOException e)	
                {
                    System.out.println("Error al abrir el fichero");
                    System.out.println(e.getMessage());
                } catch (Exception e)
                {
                    System.out.println("Error general.");
                    System.out.println(e.getMessage());
                } finally 
                {
                    try 
                    {
                        if (ois!=null) 
                        {
                            ois.close();
                        }
                        
                    } catch (IOException e) 
                    {
                        System.out.println("Error al cerrar eñ fichero.");
                        System.out.println(e.getMessage());
                    }
                }
      
    }
    
}

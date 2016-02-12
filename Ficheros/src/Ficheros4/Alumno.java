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
    private double nota1, nota2, nota3;
    Scanner lector = new Scanner(System.in);
    ArrayList<Alumno> listadato=new ArrayList<Alumno>();
    File f = new File("alumno.dat");
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;
    ObjectOutputStream oos = null;
    FileInputStream fis = null;
    BufferedInputStream bis = null;
    ObjectInputStream ois = null;
    DataOutputStream dos=null;
    DataInputStream dis=null;
    public Alumno(){
    
    
    }

    public Alumno(String carnet, String nombre, String apellidos, double nota1, double nota2, double nota3) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public Scanner getLector() {
        return lector;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    
    public void ponerDato(){
          String carnetmetodo, nombremetodo, apellidosmetodo, cadena;
          double nota1metodo, nota2metodo, nota3metodo;
     do{     
        System.out.println("Introduzca el numero carnet del nuevo alumno: ");
        carnetmetodo = lector.nextLine();
        System.out.println("Introduzca el nombre del alumno: ");
        nombremetodo = lector.nextLine();
        System.out.println("Introduzca los apellidos del alumno: ");
        apellidosmetodo = lector.nextLine();
        System.out.println("Introduzca la primera nota: ");
        nota1metodo = lector.nextDouble();
        System.out.println("Introduzca la segunda nota: ");
        nota2metodo = lector.nextDouble();
        System.out.println("Introduzca la tercera nota: ");
        nota3metodo = lector.nextDouble();
        Alumno alumno01=new Alumno(carnetmetodo,nombremetodo,apellidosmetodo,nota1metodo,nota2metodo,nota3metodo);
        listadato.add(alumno01);
        System.out.println("Quieres añadir mas alunmos? ");
                         cadena=lector.nextLine();
                         
     }while(cadena.equalsIgnoreCase("si"));
    }
    public void llenarArchivo(){
      try{
           fos = new FileOutputStream(f);      
           bos= new BufferedOutputStream(fos);     
           oos=new ObjectOutputStream(bos);
           oos.writeObject(listadato);                  
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
                        if (oos!=null) 
                        {
                            oos.close();
                        }
                        
                    } catch (IOException e) 
                    {
                        System.out.println("Error al cerrar eñ fichero.");
                        System.out.println(e.getMessage());
                    }
                }
      
    }
    
    public void pasarALista(){
        try{
            
           fis = new FileInputStream(f);      
           bis= new BufferedInputStream(fis);     
           ois=new ObjectInputStream(bis);
           
           listadato=(ArrayList<Alumno>) ois.readObject();
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
    
    public void pasarFichero5(){
        double media;
         File f5 = new File("alumno5.dat");
        try{
             fos = new FileOutputStream(f5);      
           bos= new BufferedOutputStream(fos);  
           dos=new DataOutputStream(bos); 
           
           for(int i=0; i<listadato.size();i++){
               //se necesitan los getters y setter
               media=((listadato.get(i).getNota1()+listadato.get(i).getNota2()+listadato.get(i).getNota3())/3);
                    if(media>=5){
                         dos.writeUTF(listadato.get(i).getCarnet());
                         dos.writeDouble(media);
                    
                    }  
           }
               
           
        }catch(FileNotFoundException e)
                 {
                     System.out.println("Error. Fichero no encontrado.");
                     System.out.println(e.getMessage());
	                 
	        } catch (IOException e)	
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
                        if (dos!=null) 
                        {
                            dos.close();
                        }
                        
                    } catch (IOException e) 
                    {
                        System.out.println("Error al cerrar eñ fichero.");
                        System.out.println(e.getMessage());
                    }
                }
    }
    
    public void visualizarFichero5(){
         File f5 = new File("alumno5.dat");
         String canet;
         double nota;
         try{
            
           fis = new FileInputStream(f5);      
           bis= new BufferedInputStream(fis);     
           dis=new DataInputStream(bis);
           
            do{ 
            canet=dis.readUTF();
                
            nota=dis.readDouble();
              
        
          
                
            System.out.println(canet);
              System.out.println(nota);
              
        }while(dos!=null);      
         }catch(FileNotFoundException e){
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
                        if (dis!=null) 
                        {
                            dis.close();
                        }
                        
                    } catch (IOException e) 
                    {
                        System.out.println("Error al cerrar eñ fichero.");
                        System.out.println(e.getMessage());
                    }
                }
    }
    
}
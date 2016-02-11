/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros3;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.util.*;
import java.io.*;

/**
 *
 * @author mati
 */
public class AgendaObjeto implements Serializable {

    private String nombre;
    private String direc;
    ArrayList<String> fono;
    private String email;

    public AgendaObjeto(String nombre, String direc, ArrayList<String> fono, String email) {
        this.nombre = nombre;
        this.direc = direc;
        this.fono = fono;
        this.email = email;
    }
    public AgendaObjeto() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirec() {
        return direc;
    }

    public ArrayList<String> getFono() {
        return fono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public void setFono(ArrayList<String> fono) {
        this.fono = fono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void outputAgenda(String nombre, String direc, ArrayList<String> fono, String email) {
        try {
            FileOutputStream f = new FileOutputStream("agendaObjeto.dat", true);
            ObjectOutputStream oos = new ObjectOutputStream(f);
            AgendaObjeto registro = new AgendaObjeto(nombre, direc, fono, email);
            oos.writeObject(registro);
            //ois.flush();//vacia el buffer
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void inputAenda() {
        try {

            FileInputStream f = new FileInputStream("agendaObjeto.dat");
            BufferedInputStream bis= new BufferedInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(bis);
            AgendaObjeto lectura= new AgendaObjeto();
             
            lectura= (AgendaObjeto) ois.readObject();
            
            System.out.println(lectura.getNombre());
            System.out.println(lectura.getDirec());
            for(int i=0; i<lectura.getFono().size();i++ )
                System.out.println(lectura.getFono().get(i));
            System.out.println(lectura.getEmail());

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

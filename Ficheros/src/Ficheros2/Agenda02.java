/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros2;

import java.io.*;

/**
 *
 * @author mati
 */
public class Agenda02 {
    public static void main(String[] args) {
         File f=new File("agenda.dat"); 
         FileInputStream fos=null;
         BufferedInputStream bos=null;
         DataInputStream dos=null;
         String nombrecampo, direccampo, emailcampo;
         long tele;
    try {
        
        fos=new FileInputStream(f);
        bos=new BufferedInputStream(fos);
        dos=new DataInputStream(bos);
        
      do{ //los datos tienen que estar en el mismo orden de entrada
            nombrecampo=dos.readUTF();
                //dos.readChar();
            direccampo=dos.readUTF();
               // dos.readChar();
            tele=dos.readLong();
                //dos.readChar();
            emailcampo=dos.readUTF();
                //dos.readChar();
        
          
                
            System.out.println(nombrecampo);
              System.out.println(direccampo);
                System.out.println(tele);
                  System.out.println(emailcampo);
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
    
    
}

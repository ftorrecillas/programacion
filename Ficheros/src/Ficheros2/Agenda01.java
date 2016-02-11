package Ficheros2;
import java.io.*;
import java.util.Scanner;
public class Agenda01 {
	public static void main(String [] args) {
            // f es el objeto de la clase File. En pocas palabras Crea el fichero con el nombre que tu le digas
                File f=new File("agenda.dat");       
		String nombrecampo, direccampo, emailcampo, cadena;
                FileOutputStream fos=null;
                 BufferedOutputStream bos=null;
                 DataOutputStream dos=null;
		long tele;
		 Scanner lector = new Scanner(System.in);
               
		try {
	         // Hemos creado los objetos de la clase FileOutputStream, este sirve para introducir datos en el fichero   // constructor las variables String, con la diferencia que tele es long y se ha tenido que 
                 //utilizaremos el Buffered... para almacenar los datos(accede al fichero cuando el quiere)
                 //La clase Data... trata los datos para que se puedan itroducir en el file
			
			 
                        fos=new FileOutputStream(f,true);
                        bos=new BufferedOutputStream(fos);
                        dos=new DataOutputStream(bos);
                 
		    do{
                        System.out.println("Introduzca el nombre del nuevo registro: ");
                        nombrecampo = lector.nextLine();
                        System.out.println("Introduzca la dirreción del nuevo registro:");
                        direccampo = lector.nextLine();
                         System.out.println("Introduzca el teléfono del nuevo registro:");
                         tele = lector.nextLong();
                         lector.nextLine();
                         System.out.println("Introduzca el email del nuevo registro:");
			 emailcampo = lector.nextLine();
                         dos.writeUTF(nombrecampo);
                         dos.writeUTF(direccampo);
                         dos.writeLong(tele);
                         dos.writeUTF(emailcampo);
                         System.out.println("Quieres añadir mas registros? ");
                         cadena=lector.nextLine();
                         
                    }while(cadena.equalsIgnoreCase("si"));
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

}

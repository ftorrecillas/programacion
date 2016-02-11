package Fichero;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DniLetra {
	 public static void main(String[] args) {
		 Scanner lector = new Scanner(System.in);
		 String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		 char letraNif;
		 String stringDni, stringNif;
	     BufferedWriter dni = null, nif = null;
	     int nInicial = 0, nFinal = 0;
		 
		 
		 try {
			 System.out.println("Introduzca un número inicial ");
			 nInicial = lector.nextInt();
			 System.out.println("Introduzca un número final ");
			 nFinal=lector.nextInt();
	            dni = new BufferedWriter(new FileWriter("dni.txt"));
	            nif = new BufferedWriter(new FileWriter("nif.txt"));

	            for (int i = nInicial; i <= nFinal; i++) {
	                stringDni = String.valueOf(i);
	                while (stringDni.length() < 8) {
	                    stringDni = "0" + stringDni;
	                }
	                letraNif = letras.charAt(i % 23);
	                stringNif = stringDni + letraNif;
	                dni.write(stringDni);
	                dni.newLine();
	                nif.write(stringNif);
	                nif.newLine();
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: Fichero no encontrado");
	            System.out.println(e.getMessage());
	        } catch (IOException e) {
	            System.out.println("Error de lectura de fichero");
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Error general de fichero");
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (nif != null) {
	                    nif.close();
	                }
	                if (dni != null) {
	                    dni.close();
	                }
	            } catch (Exception e) {
	                System.out.println("Error al cerrar el fichero");
	                System.out.println(e.getMessage());
	            }
	        }
	    }
	 }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej2;
import java.util.Scanner;
/**
 *
 * @author mati
 */
public class Cambio_Matrix {
    
    public static void main(String[] args) {
          int[][] matx=new int[5][7];
          int fila, memoria;

            Scanner teclado=new Scanner(System.in);
             for(int f=0;f<5;f++) {
                    for(int c=0;c<7;c++) {
                    System.out.print("Ingrese componente:");
                     matx[f][c]=teclado.nextInt();
                      }
             }
            for(int f=0;f<matx.length;f++) {
                for(int c=0;c<matx[f].length;c++) {
                        System.out.print(matx[f][c]+" ");
                }
            System.out.println();
            }

        System.out.println("Las columnas cuarta y sexta se han intercambiado:");
        for (fila=0; fila < matx.length; fila++) {
            memoria=matx[fila][0];
            matx[fila][0]=matx[fila][3];
            matx[fila][3]=memoria;
            System.out.print(matx[fila][0]+"\t"+matx[fila][3]);
            System.out.println();
        }      
        
    }
}

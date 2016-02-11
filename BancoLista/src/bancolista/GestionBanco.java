/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancolista;
import java.util.*;
/**
 *
 * @author mati
 */
public class GestionBanco {
    public static void main(String[] args) {
        String cuentaNombre=null, numeroCuenta=null;
        double saldoCuenta=0, interesCuenta=0;
        Cuenta crear=new Cuenta(cuentaNombre,numeroCuenta, saldoCuenta, interesCuenta );
      
        Scanner intro=new Scanner(System.in);
        
        try{
            System.out.println("Introduce el nombre de la cuenta: ");
            cuentaNombre=intro.nextLine();
            if(cuentaNombre==null)
                 throw new ExcepNull("El valor no puede ser nulo");
        
        }
        catch(InputMismatchException e2) {
                System.out.println("Dato mal introducido, vuelva a introducirlo");  
                intro.nextLine();}
        catch (ExcepNull o) {
                System.out.println(o.getMessage());  
                intro.nextLine();}
        
      
        
        try{
            System.out.println("Introduce el numero de la cuenta: ");
            numeroCuenta=intro.nextLine();
            if(numeroCuenta==null)
                throw new ExcepNull("El valor no puede ser nulo");
        
        }
        catch(InputMismatchException e2) {
                System.out.println("Dato mal introducido, vuelva a introducirlo");  
                intro.nextLine();}
        catch (ExcepNull o) {
                System.out.println(o.getMessage());  
                intro.nextLine();}
        
       
        try{
             System.out.println("Introduce el saldo de la cuenta: ");
            saldoCuenta=intro.nextDouble();
            if(saldoCuenta>=0)
                throw new ExcepNull("El valor no puede ser negativo");
        
        }
        catch(InputMismatchException e2) {
                System.out.println("Dato mal introducido, vuelva a introducirlo");  
                intro.nextLine();}
        catch (ExcepNull o) {
                System.out.println(o.getMessage());  
                intro.nextLine();}
        
      
        try{
             System.out.println("Introduce el interes de la cuenta: ");
            interesCuenta=intro.nextDouble();
            if(interesCuenta>=0)
                throw new ExcepNull("El valor no puede ser menor que cero");
        
        }
        catch(InputMismatchException e2) {
                System.out.println("Dato mal introducido, vuelva a introducirlo");  
                intro.nextLine();}
        catch (ExcepNull o) {
                System.out.println(o.getMessage());  
                intro.nextLine();}
    }
}

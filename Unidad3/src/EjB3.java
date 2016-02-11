/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class EjB3 {
     public static void main (String args[]) {
        
         int num,num1,num2, suma=0, suma1=0, suma2=0;
         for (num=1;  num<=99; num++){
             if(num%2!=0){
                suma=suma+num;
                System.out.println(num);
             }
         }
         System.out.println(suma);
         
        for (num1=1; num1<=99;num1++){
             if(num1%2==0){
                suma1=suma1+num1;
                System.out.println(num1);
             }
         }
         System.out.println(suma1);
         
         for (num2=1;num2<=99; num2++){
             
             if(num2%5==0){
                
             suma2=suma2+num2;
             System.out.println(num2);
             }
         }
         System.out.println(suma2);
    }
}

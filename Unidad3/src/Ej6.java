
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ej6 {
     public static void main (String args[]) {
         float mo;
         int a, modos, resto,resto1,resto2 ,resto3 ,resto4 ,resto5,resto6, mouno, mocincuenta, moveinte, modiez, mocinco,modoss, mounos;
     Scanner intro = new Scanner(System.in);
         System.out.println("Introduzca dinero:");
         mo = intro.nextFloat ();
         a= (int)(mo*100);
        modos= 0;
        resto=0; resto1=0; resto2=0; resto3=0; resto4=0; resto5=0; resto6=0;
        mouno=0; 
        mocincuenta=0;
        moveinte=0;
        modiez=0;
        mocinco=0;
        modoss=0;
        mounos=0;
         
         if (a>=200){
             modos= a/200;
              resto= a%200;
         }
         else System.out.println("La cantidad no es correcta:");
         
         if (resto>=100){
         
             mouno= resto/100;
             
             resto1= resto%100;  
         }
          if (resto1>=50){
         
             mocincuenta= resto1/50;
             
             resto2= resto1%50;  
         }
           
           if (resto2>=20){
         
             moveinte= resto2/20;
            
             resto3= resto2%20;  
         }
           
            if (resto3>=10){
         
             modiez= resto3/10;
             resto=0;
             resto4= resto3%10;  
         }
            if (resto4>=5){
         
             mocinco= resto4/5;
             resto=0;
             resto5= resto4%5;  
         }
            if (resto5>=2){
         
             modoss= resto5/2;
             resto=0;
             resto6= resto5%2;  
         }
            if (resto6>=1){
         
             mounos= resto6/1;
            
             
         }      
            System.out.println("Modenas de dos " +modos);
            System.out.println("Modenas de uno " +mouno);
            System.out.println("Modenas de cincuenta " +mocincuenta);
            System.out.println("Modenas de veinte " +moveinte);
            System.out.println("Modenas de diez " +modiez);
            System.out.println("Modenas de cinco " +mocinco);
            System.out.println("Modenas de dos centimos " +modoss);
            System.out.println("Modenas de un centimo " +mounos);
     }
}

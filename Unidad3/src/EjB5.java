import java.util.Scanner;


public class EjB5 {
	public static void main (String args[]) {
		 int num,suma=0, suma1=0, suma2=0;
		
		 for (num=1;  num<=100; num++){
             
			 if(num%2!=0){
                suma=suma+num;
               
             }
			 
			 if(num%2==0){
	                suma1=suma1+num;
	               
	             }
			 if(num%4==0 && num%7==0){
	                
	             suma2=suma2+num;
	            
	             }
		 }
		 
		 	System.out.println(suma);
            System.out.println(suma1);
            System.out.println(suma2);
    }
}

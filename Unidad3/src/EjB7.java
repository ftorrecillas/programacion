import java.util.Scanner;


public class EjB7 {
	public static void main (String args[]) {
	
		int  num ;
		float num1,nega,resultad,resultado;
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduzca un numero:");
		num1 = intro.nextFloat ();
		System.out.println("Introduzca la potencia:");
		num = intro.nextInt ();
		if(num1>0){
			if(num<0){
				
				resultado=(float)Math.pow(num1, num);
				
			}
			else	
					resultado =  (float)Math.pow(num1, num);
					System.out.println("Potencia "+resultado);
		}
		else System.out.println("Mal");
}
}

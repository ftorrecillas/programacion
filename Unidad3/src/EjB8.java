import java.util.Scanner;


public class EjB8 {
	public static void main (String args[]) {
		
		int  num, i ;
	
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduzca un numero:");
		num = intro.nextInt ();
	
			for (i=2;  i<num; i++){
		    	
				switch (num){
				case 1 : if (num%i==0){
					System.out.println(num+" no es numero primo");
				}
					break; 
				
				}
			
				
					
				
		}
			System.out.println(num+" si es numero primo");
	}
}	


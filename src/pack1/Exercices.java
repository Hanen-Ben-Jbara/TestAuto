package pack1;

import java.util.Scanner;

public class Exercices {
	public static void main(String[] args) {
//test git 2		
int a, b, c, delta, X1, X2, X3 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("a = ");
		 	a = input.nextInt();
		System.out.println("b = ");
			b = input.nextInt();
		System.out.println("c = ");
			c = input.nextInt();
		
		System.out.println(a+ "x^2 +"+ b + "x +"+ c);
		
		delta = (b*b) - 4*a*c;
	
		if (delta > 0)
		{
		   X1 = (-b-sqrt(delta))/(2*a);
		   X2 = (-b+sqrt(delta))/(2*a);
		   System.out.println("\nLes solutions sont x1 = " + X1 + " et x2 = " +X2);
		}
		else if  (delta < 0)
		{
	      System.out.println("\nIl n'y a pas de solution.");
	    }
		  
		else
			X3 =(-b/(2*a)); 
			System.out.println("La solution est "+ X3);   
}

	private static int sqrt(int delta) {
		// TODO Auto-generated method stub
		return 0;
	}
}

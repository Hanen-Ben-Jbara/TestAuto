package pack1;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("choisir un exercice : \n1: Ex 1 \n2: Ex 2  \n3: Ex 3 \n4: Ex 4 \n5: Ex 5 \n6: Ex 6 \n7: Ex 7");
		int Ex = input.nextInt();
		
		if (Ex==1) 
		for (int i = 1; i<= 100; i++)
			{
		System.out.println("Je dois être sage en cours de maths et écouter le prof");
			}
	
		else if(Ex==2)
			{
		for (int i = 1; i<= 32; i++)
			{
		System.out.println("Bonjour");
			}
			{
				System.out.println("Au revoir");
			}
			}
			
		else if (Ex==3)
			{
			for(int i=1; i<13;i++)
			{
			System.out.print("\n9*8=72");
			}
			}
		
		else if (Ex==4)
			{
			for(int i=0; i<101; i++)
			{
			System.out.print(i);
			;
			}
			{
			System.out.println("\nOuf ! Fini, mais c'etait long");
			}
			}
		
		else if (Ex==5)
			{
			int i = 100;
			while (i>0)
			{
			System.out.print(i);
			i--;
			}
			}
		
		else if (Ex==6)
			{
			int i = input.nextInt();
			while (i>0)
			{
			System.out.print(i);
			i--;
			}
			}
			
		else if (Ex==7)
			{
			float[] tab = { (float) 2.85 , 9 , 100 , 65};
			for (float i: tab) {
		    System.out.println(i);
			}
			}
			else
			{
			System.out.println("Erreur: Veuillez saisir un numéro entre 1 et 3 ");
			}
}
	}


		

package pack1;

import java.util.Scanner;

public class initialClass {
	
	
	public static void main(String[] args) 
		
	{
		Scanner input = new Scanner(System.in);
		System.out.println("choisir un exercice : \n1: Ex 1 \n2: Ex 2  \n3: Ex 3 ");
			int Ex= input.nextInt();
			
		//Exercice 1
		if (Ex==1) 
			{
			System.out.println("Saisir le numéro 1: ");
			int a= input.nextInt();
			
			System.out.println("Saisir le numéro 2: ");
			int b= input.nextInt(); 
			
			System.out.println("Saisir le numéro 3 : ");
			int c= input.nextInt(); 
			
			input.close();
			
				int max = 0;
			
				if (a<b)
					{
						if (b<c) 
					{
						max =c;
					} 
					else max = b;
					
					}
				
				else {
						if (a<c) {
							max = c;
						}
						else max = a;
				}
				
				System.out.println("Le maximum est "+ max);
				}		 
				
		//Exercice 2
		else if (Ex==2) 
			{
			System.out.println("Saisir le numéro : ");
			int Nb= input.nextInt();
			
				if  (Nb % 3 == 0 && Nb % 13 == 0)
						{
							System.out.println(Nb + " est divisible par 3 et 13");
						}
				else
					System.out.println(Nb + " n'est pas divisible par 3 et 13");
				
			
		}
		//Exercice 3
		else if (Ex==3) 
		{
			System.out.println("Saisir le numéro de mois : ");
			int M = input.nextInt();
					
			
			if  (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12)
				
			{
				System.out.println(" 31 jours");
			}
			else if (M == 4 || M == 6 || M == 9 || M == 11)
				{
				System.out.println(" 30 jours");
				}
			else if (M==2)
				{
				System.out.println(" 28 jours");
				}
			else {
				System.out.println(" Erreur: Veuillez saisir un numéro entre 1 et 12.");
				}
		}
		
		
		else {
			System.out.println("Erreur: Veuillez saisir un numéro entre 1 et 3 ");
		}
		}
	
	}
	


	

	
package src;
import java.util.Scanner;

public class Puissance {
	
		public static void CalculerPuissance() {
			double x =0;
			int Ps =0;
			Scanner sc = null;
			
			
			System.out.println("veuillez saisir un ENTIER X");
			sc = new Scanner(System.in);
			 x = sc.nextDouble();
			
				
			
			System.out.println("veuillez saisir votre PUISANCE");
			Scanner sc2 = new Scanner(System.in);
			 Ps = sc.nextInt();
			
				if( Ps>=0) {

			double result =  Math.pow(x, Ps);
			System.out.println(result);
			}
			else {
				System.out.println(" ERREUR veuillez saisir un entier positif");
				
			
			}
			
			sc.close();
		}

}

package src;

import java.util.Scanner;

public class Connexion {
	public static void connexion() {


		int HDebut=0;
		int HFin=0;
		int MaxCon=0;
		int FinCon=0;
		int NHeur=0;
		int temps=0;
		int Prix=0;
		



		Scanner sc = new Scanner(System.in);

		System.out.println("Début de la connexion : ");
		HDebut = sc.nextInt();

		System.out.println("Fin de la connexion: ");
		HFin = sc.nextInt(); 

		for(int i=0;i<=23;i++) {
			
			if(HDebut<HFin) {
				temps =HFin -HDebut;
				
				
				
			 if(HDebut>0 && HFin<=7){
				
				Prix = temps* (5); 
				
				}else if(HDebut>0 && HFin<=17){
					
					Prix =((7-HDebut)*5)+((HFin-7)*10);
				}else if(HDebut>0 && HFin<24){
					Prix=((7-HDebut)*5)+((17-7)*10)+((HFin-17)*5);
				
				}




			}
		}
	}	

}

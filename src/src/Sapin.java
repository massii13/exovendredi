package src;

public class Sapin {
	
	public static void dessinerHautSapin() {
		String lesEspaces="                                         ";
		String lesMotifes= "*";
		for(int i = 0;i<10;i++) {
			String ligne = lesEspaces + lesMotifes;
			System.out.println(ligne);
			if(i!=10) {
				lesMotifes +="**";
				lesEspaces = lesEspaces.substring(0,lesEspaces.length()-1);
			}
		}
	}

	public static void dessinerPiedSapin(int longeur,int largeur ,String motif) {


		//Creation de la ligne 

		String ligne ="                                        "; 

		for(int i=0 ; i<longeur;i++) {

			ligne +=motif; 

		}

		//affiche les lignes

		for(int i=0 ; i<largeur;i++) {

			System.out.println(ligne);

		}


	}
}




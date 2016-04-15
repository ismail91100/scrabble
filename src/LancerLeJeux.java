

public class LancerLeJeux {

	/**
	 * Launch the application.
	 */
	
	
	
	
	
	public static void main(String[] args) {
		
	
				/*	Pioche p= new Pioche();
					TableDeJeux window = new TableDeJeux();
				
					window.poserUnJetons(new Caractere('c',1,1));
			
					window.poserUnJetons(new Caractere('b',1,4));
					
				
					
				
			
			
					Joueur j1= new Joueur();
					Joueur j2= new Joueur();
					Joueur j3= new Joueur();
					Joueur j4= new Joueur();
					j1.pioche(p);
					j2.pioche(p);
					j3.pioche(p);
					j4.pioche(p);
				

					
					window.getFrame().setVisible(true);*/
					
					
		Caractere c= new Caractere('c', 1,2);
		Caractere a= new Caractere('a', 3,2);
		Caractere l= new Caractere('l', 4,2);
		Caractere e= new Caractere('e', 2,2);
					
					
			Mot m= new Mot();
			m.ajouterLettreANotreMot(c);
			m.ajouterLettreANotreMot(e);
			m.ajouterLettreANotreMot(a);
			m.ajouterLettreANotreMot(l);
			System.out.println(m.toString());
			
			c.swap(a);
			
			System.out.println(m.toString());
	}


}

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class LancerLeJeux {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
				
					Pioche p= new Pioche();
					TableDeJeux window = new TableDeJeux();
					
					window.positionnerNosJetons();
					window.faireLeplateau();
					Joueur j1= new Joueur();
					Joueur j2= new Joueur();
					Joueur j3= new Joueur();
					Joueur j4= new Joueur();
					j1.pioche(p);
					j2.pioche(p);
					j3.pioche(p);
					j4.pioche(p);
					window.lesJoueurs(j1,j2,j3,j4);
					
					window.getFrame().setVisible(true);
				


			
		
	}


}

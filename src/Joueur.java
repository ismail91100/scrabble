import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Joueur {
	
	private String pseudo;
	private int score;
	private Chevalet chevalet;
	
	
	public Joueur(){

		this.score=0;
		this.setChevalet(new Chevalet());
	}
	
	
	public Joueur(String pseudo){
		this.pseudo=pseudo;
		this.score=0;
		this.setChevalet(new Chevalet());
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score += score;
	}

	public Chevalet getChevalet() {
		return chevalet;
	}

	public void setChevalet(Chevalet chevalet) {
		this.chevalet = chevalet;
	}
	
	public void ajoutDePoints(int j){
		this.score+=j;
	}
	public void pioche(Pioche p){
		chevalet.remplirChevalet(p);
	}
	public void voirChevaletDu(JPanel panelj){
		
		ArrayList<Caractere> tmp= new ArrayList<Caractere>();
		

		JLabel image= new JLabel();

		for(int i=0; i<this.getChevalet().getChevalet().size();i++){
		tmp.add(this.getChevalet().getChevalet().get(i));

		String lien= this.getChevalet().getChevalet().get(i).getCaractere()+".png";
		image= new JLabel(new ImageIcon(lien));

		
		image.setPreferredSize(new Dimension(25,25));
		
		panelj.add(image);
	
		char tmpchar= this.getChevalet().getChevalet().get(i).getCaractere();

		panelj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			System.out.println(tmpchar);
		
			}

		});
		
		}
		
		public void mettreUneLettre
	
	}
	
}

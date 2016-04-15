import java.awt.Dimension;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
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

	public void retirerLettre(Caractere c){
		chevalet.retirerLettre(c);
	}
	
	
	
	
	
	
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getScoreString() {
		String tmp=score+"";
		return tmp;
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
	public void voirChevaletDu(JPanel panelj, TableDeJeux tb){
		
		

		
	

		for(int i=0; i<chevalet.getChevalet().size();i++){
		
			JLabel image= new JLabel();
		String lien= this.chevalet.getChevalet().get(i).getCaractere()+".png";
		image= new JLabel(new ImageIcon(lien));

		
		image.setPreferredSize(new Dimension(25,25));
		
		
		
		JPanel tj=new JPanel();
		tj.setBorder(BorderFactory.createEmptyBorder(-5,-5,-5,-5));
		tj.add(image);
		
		panelj.add(tj);
		
		char tmpchar= this.getChevalet().getChevalet().get(i).getCaractere();
		Caractere car=new Caractere(tmpchar);
	
		tj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (tb.getLettreEnMain()==null){
				tb.lacherLettreEnMain();
				tb.setLettreEnMain(car);
				tj.setVisible(false);
				retirerLettre(car);
				
				ajoutDePoints(car.getValeurDeCaractere());
				
				}
				else if ((tb.getLettreEnMain()==null)) System.out.println("erreur");
				
			}
				
			
		});
		
		}
		
	}
	public void enleverLesLettre(JPanel panelj, TableDeJeux tb){
		panelj=null;
	}
	
	
	
	
	
	
	
	
	public void tmpcarnull(Caractere c){
		c=null;
	}
	
	public String toString(){
		return chevalet.toString();
	}
	

	
	
	
	
	
	}
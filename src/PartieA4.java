import java.util.ArrayList;



public class PartieA4 {
	private ArrayList <Joueur> joueurs= new ArrayList<Joueur>();
	private Pioche pioche;
	private Plateau plateau;
	private TableDeJeux table;
	
	public PartieA4(){
		joueurs.add(new Joueur());
		joueurs.add(new Joueur());
		joueurs.add(new Joueur());
		joueurs.add(new Joueur());
		this.setPioche(new Pioche());
		this.setPlateau(new Plateau());
		
		table.positionnerNosJetons();
		table.faireLeplateau();
		table.getFrame().setVisible(true);
	}



	public Pioche getPioche() {
		return pioche;
	}



	public void setPioche(Pioche pioche) {
		this.pioche = pioche;
	}



	public Plateau getPlateau() {
		return plateau;
	}

	//methode de calcul de notre appli
	
	public void score(Mot m){
		
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}
	// permet au joueur de poser un mot,sur le plateau, engageant: utiliser lettre/ poser lettre sur plateau/ clacul score/ enlever avantage sur case/ completer notre chevalet

	public void joueUnTour(Joueur j){
		
	}



	public TableDeJeux getTable() {
		return table;
	}



	public void setTable(TableDeJeux table) {
		this.table = table;
	}
	//Un des joueurs pioche
	public void PiocheDu(Joueur j){
		j.pioche(pioche);
	}
	
	
}
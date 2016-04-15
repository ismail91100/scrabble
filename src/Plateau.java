import java.util.ArrayList;

public class Plateau {
	
	private ArrayList <Case> plateau=new ArrayList<Case>();
	
	
	public Plateau(){
		this.setPlateau();
		this.getPlateau();
	}

	public ArrayList <Case> getPlateau() {
		return plateau;
	}

	public void setPlateau() {

	for(int i=0;i <15;i++)
		for(int j=0;j<15;j++)
			this.plateau.add(new Case(i,j));
	}
	public void placerUneLettre(Caractere c, Position p){
		int i=0;
			while(i<this.plateau.size()){
				if(this.plateau.get(i).isFill(p)==true)
					this.plateau.get(i).setCase(c);
				else i++;
			}
			
				
	}
	
	public boolean placerUnMot(Mot m, Case init, boolean horizontal){
		boolean tmp=false;
		if(m.correcte()==true){
			int i=0;
			if(horizontal==true)
			while(i<m.getMot().size()){
				this.placerUneLettre(m.getMot().get(i), init.getCoor());
				init.getCoor().incremanteY();
			i++;
			tmp=true;
					
			}
			else if(horizontal==false)
				while(i<m.getMot().size()){
					this.placerUneLettre(m.getMot().get(i), init.getCoor());
					init.getCoor().incremanteX();
				i++;
				
			tmp=true;			
				}
		}return tmp;
	}
	
	
	
	public String toString(){
		String tmp=this.plateau.toString();
		return tmp;
	}
	
}

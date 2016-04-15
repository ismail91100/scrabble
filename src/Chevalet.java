import java.util.ArrayList;

public class Chevalet {
	
	private ArrayList <Caractere> chevalet= new ArrayList<Caractere>();
	
	public Chevalet (){
		this.getChevalet();
	}

	public ArrayList<Caractere> getChevalet() {
		return chevalet;
	}

	public void setChevalet(ArrayList<Caractere> chevalet) {
		this.chevalet = chevalet;
	}

	public void pioche(Pioche p){
		this.chevalet.add(p.piocheRandom());
	}
	public void retirerLettre(Caractere a){
		this.chevalet.remove(a);
	}
	public void remplirChevalet(Pioche p){
		while(this.chevalet.size()<7)
			this.pioche(p);
			
	}
	
	public String toString(){
		String tmp= " ";
		for(int i=0; i <7; i++){
			tmp+= this.chevalet.get(i).toString()+" ";
		}
		return tmp;
	}
	
}

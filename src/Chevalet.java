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
		
		int i=0;
		while(a.getCaractere()!= chevalet.get(i).getCaractere())i++;
		if(a.getCaractere()== chevalet.get(i).getCaractere())this.chevalet.remove(i);
	
	
	
	} 
	
	
	public void remettre(ArrayList<Caractere> c){
		for(int i=0;i<c.size();i++){
			chevalet.add(c.get(i));
		}
	}
	
	
	
	public void remplirChevalet(Pioche p){
		while(this.chevalet.size()<7)
			this.pioche(p);
			
	}
	
	public String toString(){
		String tmp= " ";
		for(int i=0; i <this.chevalet.size(); i++){
			tmp+= this.chevalet.get(i).toString()+" ";
		}
		return tmp;
	}
	
}

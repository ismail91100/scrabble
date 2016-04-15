import java.util.ArrayList;
import java.util.Random;

public class Pioche {
private ArrayList  <Caractere> pioche=new ArrayList <Caractere>();

	public Pioche(){
		this.setPioche();
		this.getPioche();
		
	}

	
	
	
	public ArrayList  <Caractere> getPioche() {
		return pioche;
	}

	public void setPioche() {
		
		for(int i=0;i<9;i++) this.pioche.add(new Caractere('a'));
		for(int i=0;i<1;i++) this.pioche.add(new Caractere('z'));
		for(int i=0;i<15;i++) this.pioche.add(new Caractere('e'));
		for(int i=0;i<6;i++) this.pioche.add(new Caractere('r'));
		for(int i=0;i<6;i++) this.pioche.add(new Caractere('t'));
		for(int i=0;i<1;i++) this.pioche.add(new Caractere('y'));
		for(int i=0;i<6;i++) this.pioche.add(new Caractere('u'));
		for(int i=0;i<8;i++) this.pioche.add(new Caractere('i'));
		for(int i=0;i<6;i++) this.pioche.add(new Caractere('o'));
		for(int i=0;i<2;i++) this.pioche.add(new Caractere('p'));
		for(int i=0;i<1;i++) this.pioche.add(new Caractere('q'));
		for(int i=0;i<6;i++) this.pioche.add(new Caractere('s'));
		for(int i=0;i<3;i++) this.pioche.add(new Caractere('d'));
		for(int i=0;i<2;i++) this.pioche.add(new Caractere('f'));
		for(int i=0;i<2;i++) this.pioche.add(new Caractere('g'));
		for(int i=0;i<2;i++) this.pioche.add(new Caractere('h'));
		for(int i=0;i<1;i++) this.pioche.add(new Caractere('j'));
		for(int i=0;i<1;i++) this.pioche.add(new Caractere('k'));
		for(int i=0;i<5;i++) this.pioche.add(new Caractere('l'));
		for(int i=0;i<3;i++) this.pioche.add(new Caractere('m'));
		for(int i=0;i<1;i++) this.pioche.add(new Caractere('w'));
		for(int i=0;i<1;i++) this.pioche.add(new Caractere('x'));
		for(int i=0;i<2;i++) this.pioche.add(new Caractere('c'));
		for(int i=0;i<2;i++) this.pioche.add(new Caractere('v'));
		for(int i=0;i<2;i++) this.pioche.add(new Caractere('b'));
		for(int i=0;i<6;i++) this.pioche.add(new Caractere('n'));
		for(int i=0;i<2;i++) this.pioche.add(new Caractere('-'));
		
	}
	public void piocheLettre(Caractere a){
			boolean k=false;
			int i =0;
		while(i<this.pioche.size()&& k == false){
			if(this.pioche.get(i).equals(a)== false)
		i++;
			else {
				this.pioche.remove(i);
				k=true;
			}
		}
		
	}
	
	public Caractere piocheRandom(){
		
		Random rand= new Random();
		int a=rand.nextInt(pioche.size()-1);
		Caractere r= new Caractere(this.pioche.get(a));
		this.piocheLettre(r);
		return r;
	
		
	}
	
	
	
	
	public String toString(){
		String tmp = " ";
		
		for(int i=1;i<=this.pioche.size()-1;i++){
		tmp+= this.pioche.get(i).toString()+" "; }
		return tmp;
	}
}

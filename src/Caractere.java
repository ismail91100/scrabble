


public class Caractere {
	private char caractere;
	private int valeurDeCaractere;
	private Position p;
	
	public Caractere(char caractere){
		this.caractere=caractere;
		setValeurDeCaractere(this.caractere);
		getValeurDeCaractere();
		p=null;
		}
	
	public Caractere(Caractere c){
		this.caractere=c.caractere;
		this.valeurDeCaractere=c.valeurDeCaractere;
	}
	
	public Caractere(char caractere,int x,int y){
		this.caractere=caractere;
		setValeurDeCaractere(this.caractere);
		getValeurDeCaractere();
		p=new Position(x,y);
		}
	
	
	public char getCaractere() {
		return caractere;
	}
	public void setCaractere(char caractere) {
		this.caractere = caractere;
	}
	public int getValeurDeCaractere() {
		return valeurDeCaractere;
	}
	
	public void setValeurDeCaractere(char car) {
		int tmp=0;
		char[] tableauBase={'a','e','i','n','o','r','s','t','u','l','d','m','g','b','c','p','f','h','v','j','q','k','w','x','y','z','-',' '};
		for(int i =0; i< tableauBase.length; i++){
			if (car==tableauBase[i]) tmp=i;
		}
		if(tmp>=0 && tmp<=9) this.valeurDeCaractere=1;
		else if(tmp >9 && tmp<=12) this.valeurDeCaractere=2;
		else if(tmp >12 && tmp<=15) this.valeurDeCaractere=3;
		else if(tmp >15 && tmp<=18) this.valeurDeCaractere=4;
		else if(tmp >18 && tmp<=20) this.valeurDeCaractere=8;
		else if(tmp >20 && tmp<=25) this.valeurDeCaractere=10;
		else this.valeurDeCaractere=0;
	}
	
	public void doubleValeur(){
		this.valeurDeCaractere*=2;
	}
	public void tripleValeur(){
		this.valeurDeCaractere*=3;
	}
	
	public boolean equals( Caractere b){
		boolean r=true;
		if (this.caractere== b.caractere) r=true;
		else r=false;
		return r;
	}
	public boolean equals( char b){
		boolean r=true;
		if (this.caractere== b) r=true;
		else r=false;
		return r;
	}
	
	public void setPosition(int x, int y){
		this.p=new Position(x,y);
	}
	public int getX(){
		return p.getX();
	}
public int getY(){
		return p.getY();
	}
	
	public String toString(){
		return this.caractere+"["+this.valeurDeCaractere+"]";
	}
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class Mot {

	private ArrayList  <Caractere> mots;
	
	public Mot(){
		 mots=new ArrayList <Caractere>();
		
	}
	
	
	
	
	public boolean ecritDroit() {
		boolean tmp= false;
		if(verifierHorizontal()||verifierVerticale()){
		
			this.ordonnerenY();
		

			this.ordonnerenX();
			tmp= true;}
		return tmp;
		
		

	/*	ArrayList tmp=new ArrayList();
		for(int i=0;i<mots.size();i++){
			if(this.mots.get(i).getX()==this.mots.get(i).getX()) }*/
				
	
	}


	public void ajouterLettreANotreMot(Caractere c){
		mots.add(c);
	}
	
	
	
	
	public boolean correcte() {
	      boolean tmp = false;
		try{
			Class.forName("org.postgresql.Driver");
			
		      String url = "jdbc:postgresql://localhost:5432/motAccepter";
		      String user = "postgres";
		      String passwd = "159357";
		      
		    Connection conn = DriverManager.getConnection(url, user, passwd);
		    
		    //Création d'un objet Statement
		      Statement state = conn.createStatement();
		      //L'objet ResultSet contient le résultat de la requête SQL
		      ResultSet result = state.executeQuery("SELECT * FROM Colonne1");
		      //On récupère les MetaData
		      ResultSetMetaData resultMeta = result.getMetaData();
			

		      while(result.next()){         
		        for(int i = 1; i <= resultMeta.getColumnCount(); i++)
		          if(result.getObject(i).toString().equals(this.toString()))tmp=true;
		           }
		      

		      
		      
		 } catch (Exception e) {
		      e.printStackTrace();
		    } 
	     return tmp;
		
	}
	
	public boolean bienEcrit(){
		boolean tmp=false;
		ecritDroit();
		if(correcte()) tmp=true;
		
		return tmp;
	}
	
	
	
	
	

	//on retourne le mot sous forme d un string
	public String toString(){
		String tmp= "";
		
		for(int i=0;i<this.mots.size();i++) tmp+=this.mots.get(i).getCaractere();
		
		return tmp;
}
	
	boolean verifierHorizontal(){
		boolean tmp=false;
		for(int i=0;i<mots.size()-1;i++){
		if (mots.get(i).getX()==mots.get(i+1).getX());
		tmp=true;
		}
		return tmp;
	}
	boolean verifierVerticale(){
		boolean tmp=false;
		
		for(int i=0;i<mots.size()-1;i++){
		if (mots.get(0).getY()==mots.get(1).getY());
		tmp=true;}
		return tmp;
	}
	
	public void ordonnerenY(){

		boolean enordre= false;
		int taille=mots.size();
		while(enordre==false){
			enordre=true;
			for(int i=0;i<taille-1;i++){
				if(mots.get(i).getX()>mots.get(i+1).getX()){
					
					
					mots.get(i).swap( mots.get(i+1));
					enordre=false;
				}
			}taille--;
		}}
			
		public void ordonnerenX(){

			boolean enordre= false;
			int taille=mots.size();
			while(enordre==false){
				enordre=true;
				for(int i=0;i<taille-1;i++){
					if(mots.get(i).getY()>mots.get(i+1).getY()){
						
						
						mots.get(i).swap( mots.get(i+1));
						enordre=false;
					}
				}taille--;
			}
		
			
		

		
	}
		
		
		
		

void ajoutePointAJoueur(Joueur j){
	for(int i=0; i<mots.size();i++){
		j.ajoutDeScores(mots.get(i).getValeurDeCaractere());
}
	
}
ArrayList<Caractere> getMot(){
	return mots;
}





}

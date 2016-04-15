import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class Mot {

	private ArrayList  <Caractere> mots=new ArrayList <Caractere>();
	
	public Mot(){
		this.getMot();
	}

	public ArrayList  <Caractere> getMot() {
		return mots;
	}

	public void setMot(ArrayList  <Caractere> mots){
		this.mots=mots;
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
	

	//on retourne le mot sous forme d un string
	public String toString(){
		String tmp= "";
		
		for(int i=0;i<this.mots.size();i++) tmp+=this.mots.get(i).getCaractere();
		
		return tmp;
}

}

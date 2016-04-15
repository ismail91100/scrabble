import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JF extends JFrame{
	public JF(){
		this.setTitle("Scrabble");
	    this.setSize(400, 400);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    
	    
	    JPanel pan= new JPanel();
	    Position p= new Position(0,0);
	   
	    
	    
	    this.setContentPane(pan);
	    this.setVisible(true);
	    
	    
	    
	    
	    
	    
	    
	    
	}
}

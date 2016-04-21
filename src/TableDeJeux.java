
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;


public class TableDeJeux {
	
	private ArrayList<Caractere> surtable;
 
	
	
	private JFrame frame;
	private JTextField txtJoueur;
	private JTextField txtJoueur_1;
	private JTextField txtJoueur_2;
	private JTextField txtJoueur_3;
	private JPanel panel;
	private JPanel panelj1;
	private JPanel panelj2;
	private JPanel panelj3;
	private JPanel panelj4;
	private Caractere LettreEnMain;

	private JPanel scrorej1;
	private JPanel scrorej2;
	private JPanel scrorej3;
	private JPanel scrorej4;
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	
	
	
	
	private Joueur j1;
	private Joueur j2;
	private Joueur j3;
	private Joueur j4;
	
	private Pioche p;
	
	private Mot motEncours;
	
	private int encours;
	/**
	 * Create the application.
	 */
	public TableDeJeux() {
		
		motEncours=new Mot();
		p=new Pioche();
		surtable= new ArrayList<Caractere>();
		j1=new Joueur();
		j2=new Joueur();
		j3=new Joueur();
		j4=new Joueur();
		
		j1.pioche(p);
		j2.pioche(p);
		j3.pioche(p);
		j4.pioche(p);
		
		
		initialize();
		faireLeplateau();
		faireDisparaitreUnJoueur(1);
		faireDisparaitreUnJoueur(2);
		faireDisparaitreUnJoueur(3);
		faireDisparaitreUnJoueur(4);
		lesJoueurs();
		jouer();
		

	}

	public void positionnerNosJetons(){
		for(int i=0; i<this.surtable.size();i++)
		mettreLettre(this.surtable.get(i));
		
	}
	
	
	public void poserUnJetons(Caractere c){
		this.surtable.add(c);
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public JFrame getFrame(){
		return frame;
	}
	
	
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBackground(new Color(0, 100, 0));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setForeground(new Color(0, 100, 0));
		frame.setBounds(100, 100, 749, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		this.panelj1 = new JPanel();
		panelj1.setBackground(new Color(0, 100, 0));
		panelj1.setBounds(500, 120, 224, 35);
		frame.getContentPane().add(panelj1);
		
		
		
		
		
		
		this.panelj2 = new JPanel();
		panelj2.setBackground(new Color(0, 100, 0));
		panelj2.setBounds(500, 230, 224, 35);
		frame.getContentPane().add(panelj2);
		

		
		
		
		this.panelj3 = new JPanel();
		panelj3.setBackground(new Color(0, 100, 0));
		panelj3.setBounds(500, 345, 224, 35);
		frame.getContentPane().add(panelj3);
		

		
		
		
		this.panelj4 = new JPanel();
		panelj4.setBackground(new Color(0, 100, 0));
		panelj4.setBounds(500, 460, 224, 35);
		frame.getContentPane().add(panelj4);
		

		
		this.panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(192, 192, 192));
		panel.setForeground(new Color(0, 100, 0));
		panel.setBounds(35, 70, 454, 439);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		panel.setLayout(gbl_panel);
	}
	

		public void faireLeplateau(){
		
			LettreEnMain=null;
			
			for(int i=0;i<15; i++){


			for(int j=0;j<15;j++){
			
			JPanel panel1 = new JPanel();
			panel1.setBorder(new LineBorder(new Color(255, 255, 255)));
			panel1.setBackground(new Color(0,100,0));
			panel1.setForeground(new Color(0, 0, 0));
			GridBagConstraints gbc_panel_183 = new GridBagConstraints();
			gbc_panel_183.insets = new Insets(0,0,0,0);
			gbc_panel_183.fill = GridBagConstraints.BOTH;
			gbc_panel_183.gridx = i;
			gbc_panel_183.gridy = j;
			panel.add(panel1, gbc_panel_183);
			
			
			
			if(i==j||i+j==14) panel1.setBackground(Color.PINK);
			
			if(i==7&&j==7)
				panel1.setBackground(Color.LIGHT_GRAY);
			
			if(i==0&&j==0||i==0&&j==7||i==0&&j==14||
					i==7&&j==0||i==7&&j==14||
					i==14&&j==0||i==14&&j==7||i==14&&j==14)
				panel1.setBackground(Color.RED);
			
			if(i==0||i==14){
				if(j==3||j==11)panel1.setBackground(Color.CYAN);
			}
			if(i==2||i==12){
				if(j==6||j==8)panel1.setBackground(Color.CYAN);
			}
			if(i==3||i==11){
				if(j==0||j==7||j==14)panel1.setBackground(Color.CYAN);
			}
			if(i==6||i==8){
				if(j==2||j==6||j==8||j==12)panel1.setBackground(Color.CYAN);
			}
			if(i==7){
				if(j==3||j==11)panel1.setBackground(Color.CYAN);
			
			}
			
			if(i==1||i==13){
				if(j==5||j==9) panel1.setBackground(Color.BLUE);
			}
			if(i==5||i==9){
				if(j==1||j==5||j==9||j==13) panel1.setBackground(Color.BLUE);
			}
			
			if (LettreEnMain==null)

				
			panel1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				
					
					Caractere tmp=new Caractere(LettreEnMain);
					
					
					tmp.setPosition(gbc_panel_183.gridx,
					gbc_panel_183.gridy);
					encours=+tmp.getValeurDeCaractere();
					
					
					mettreLettre(tmp);
					positionnerNosJetons();
					panel1.setVisible(false);
					
					ajout(tmp);
					LettreEnMain=null;
					
				}

			});
			
			}
		}	
	}
		
	

		public void setLettreEnMain(Caractere c){
			this.LettreEnMain=c;
		}
		
	
	public void mettreLettre( Caractere c){

		
		JPanel panel_1 =  new JPanel();
		String tmp= c.getCaractere()+".png";
		JLabel image= new JLabel(new ImageIcon(tmp));
		panel_1.add(image);

		image.setPreferredSize(new Dimension(0,0));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = c.getX();
		gbc_panel_1.gridy = c.getY();
		gbc_panel_1.insets= new Insets(1,1, 1, 1);
		panel.add(image, gbc_panel_1);
	}
	
	// on affiche les lettres des joueurs et les donnees
	public void lesJoueurs(){
		
		

		

		
		txtJoueur = new JTextField();
		txtJoueur.setText("Joueur 1");
		txtJoueur.setBounds(559, 83, 86, 20);
		this.frame.getContentPane().add(txtJoueur);
		txtJoueur.setColumns(10);
		
	
		
		
		this.scrorej1 = new JPanel();
		scrorej1.setBackground(new Color(255, 255,200));
		scrorej1.setBounds(650, 75, 50, 35);
		l1=new JLabel(j1.getScore()+"");
		scrorej1.add(l1);
		
		frame.getContentPane().add(scrorej1);
		
		
		
		txtJoueur_1 = new JTextField();
		txtJoueur_1.setText("Joueur 2");
		txtJoueur_1.setBounds(559, 197, 86, 20);
		this.frame.getContentPane().add(txtJoueur_1);
		txtJoueur_1.setColumns(10);
		
		
		
		this.scrorej2 = new JPanel();
		scrorej2.setBackground(new Color(255, 255,200));
		scrorej2.setBounds(650, 197, 50, 35);
		l2=new JLabel(j2.getScore()+"");
		scrorej2.add(l2);

		
		
		txtJoueur_2 = new JTextField();
		txtJoueur_2.setText("Joueur 3");
		txtJoueur_2.setBounds(559, 315, 86, 20);
		this.frame.getContentPane().add(txtJoueur_2);
		txtJoueur_2.setColumns(10);
	
		
		this.scrorej3 = new JPanel();
		scrorej3.setBackground(new Color(255, 255,200));
		scrorej3.setBounds(650, 315, 50, 35);
		l3=new JLabel(j3.getScore()+"");
		scrorej3.add(l3);
		
		
		
		txtJoueur_3 = new JTextField();
		txtJoueur_3.setText("Joueur 4");
		txtJoueur_3.setBounds(559, 426, 86, 20);
		this.frame.getContentPane().add(txtJoueur_3);
		txtJoueur_3.setColumns(10);
	

		this.scrorej4 = new JPanel();
		scrorej4.setBackground(new Color(255, 255,200));
		scrorej4.setBounds(650, 426, 50, 35);
		l4=new JLabel(j4.getScore()+"");
		scrorej4.add(l4);
		frame.getContentPane().add(scrorej2);
		frame.getContentPane().add(scrorej3);
		frame.getContentPane().add(scrorej4);
		
	}
	
		public void faireApparaitreUnJoueur(int i){
			if(i==1) panelj1.setVisible(true);
			if(i==2) panelj2.setVisible(true);
			if(i==3) panelj3.setVisible(true);
			if(i==4) panelj4.setVisible(true);
		}
		public void faireDisparaitreUnJoueur(int i){
			if(i==1) panelj1.setVisible(false);
			if(i==2) panelj2.setVisible(false);
			if(i==3) panelj3.setVisible(false);
			if(i==4) panelj4.setVisible(false);
		}
		
		public void jouer(){
			
				JButton btnJouer = new JButton("Jouer");
			btnJouer.addMouseListener(new MouseAdapter() {
				

				int i=1;
				public void mouseClicked(MouseEvent e) {
					
					
					
					
					if (i==1){
						videmot();
						j1.pioche(p);
					faireApparaitreUnJoueur(1);
					faireDisparaitreUnJoueur(4);
					i++;
					MiseAjourPoint4();
					voirLesChevalet(1);
					
					}
					else if(i==2&&verifie()){
						videmot();
						j2.pioche(p);
						faireApparaitreUnJoueur(2);
						faireDisparaitreUnJoueur(1);
						i++;
						MiseAjourPoint1();
						voirLesChevalet(2);
					}
					
					
					else if(i==3&&verifie()){
						videmot();
						j3.pioche(p);
						faireApparaitreUnJoueur(3);
						faireDisparaitreUnJoueur(2);
						i++;
						MiseAjourPoint2();
						voirLesChevalet(3);
					}
					else if(i==4&&verifie()){
						videmot();
						faireApparaitreUnJoueur(4);
						faireDisparaitreUnJoueur(3);
			
						
						
						
						j4.pioche(p);
					
						panelj1.removeAll();
						panelj2.removeAll();
						panelj3.removeAll();
						panelj4.removeAll();
						voirLesChevalet(4);
						i=1;
				
						MiseAjourPoint3();
					
					}	
				}
			});
	
			btnJouer.setBounds(200,515, 89, 23);
			frame.getContentPane().add(btnJouer);
		}
		

		

		
		
		
	
	public void lacherLettreEnMain(){
		this.LettreEnMain=null;
	}
	public Caractere getLettreEnMain(){
		return this.LettreEnMain;
	}
		
		public void voirLesChevalet(int i){
		if(i==1)	j1.voirChevaletDu(panelj1,this);
		if(i==2)	j2.voirChevaletDu(panelj2,this);
		if(i==3)	j3.voirChevaletDu(panelj3,this);
		if(i==4)	j4.voirChevaletDu(panelj4,this);
		}
		
	void MiseAjourPoint1(){
	
		
		l1.setText(j1.getScore()+"");
	}
void MiseAjourPoint2(){
	
		
		l2.setText(j2.getScore()+"");
	}
	
	
void MiseAjourPoint3(){
	
	
	l3.setText(j3.getScore()+"");
}
void MiseAjourPoint4(){
	
	
	l4.setText(j4.getScore()+"");
}
	
		
boolean verifie(){
	
	boolean tmp=false;
	if (motEncours.bienEcrit()) tmp= true;
	return tmp;
}
		
		public void ajout(Caractere c){
			motEncours.ajouterLettreANotreMot(c);
		}

void videmot(){
	motEncours=new Mot();
}
		

	

	}



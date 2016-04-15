import java.awt.EventQueue;

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
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TableDeJeux {
	
	private ArrayList<Caractere> jetons= new ArrayList<Caractere>();
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
	


	/**
	 * Create the application.
	 */
	public TableDeJeux() {
		
		initialize();
		lesJoueurs(new Joueur(), new Joueur(), new Joueur(), new Joueur() );
	}

	public void positionnerNosJetons(){
		for(int i=0; i<this.jetons.size();i++)
		mettreLettre(this.jetons.get(i));
	}
	
	
	public void poserUnJetons(Caractere c){
		this.jetons.add(c);
		
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
		
		JPanel panel_183 = new JPanel();
		panel_183.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_183.setBackground(new Color(255, 0, 0));
		panel_183.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_183 = new GridBagConstraints();
		gbc_panel_183.insets = new Insets(0, 0, 5, 5);
		gbc_panel_183.fill = GridBagConstraints.BOTH;
		gbc_panel_183.gridx = 0;
		gbc_panel_183.gridy = 0;
		panel.add(panel_183, gbc_panel_183);
		
		JPanel panel_182 = new JPanel();
		panel_182.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_182.setBackground(new Color(0, 100, 0));
		panel_182.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_182 = new GridBagConstraints();
		gbc_panel_182.insets = new Insets(0, 0, 5, 5);
		gbc_panel_182.fill = GridBagConstraints.BOTH;
		gbc_panel_182.gridx = 1;
		gbc_panel_182.gridy = 0;
		panel.add(panel_182, gbc_panel_182);
		
		JPanel panel_181 = new JPanel();
		panel_181.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_181.setBackground(new Color(0, 100, 0));
		panel_181.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_181 = new GridBagConstraints();
		gbc_panel_181.insets = new Insets(0, 0, 5, 5);
		gbc_panel_181.fill = GridBagConstraints.BOTH;
		gbc_panel_181.gridx = 2;
		gbc_panel_181.gridy = 0;
		panel.add(panel_181, gbc_panel_181);
		
		JPanel panel_81 = new JPanel();
		panel_81.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_81.setBackground(new Color(0, 255, 255));
		panel_81.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_81 = new GridBagConstraints();
		gbc_panel_81.insets = new Insets(0, 0, 5, 5);
		gbc_panel_81.fill = GridBagConstraints.BOTH;
		gbc_panel_81.gridx = 3;
		gbc_panel_81.gridy = 0;
		panel.add(panel_81, gbc_panel_81);
		
		JPanel panel_82 = new JPanel();
		panel_82.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_82.setBackground(new Color(0, 100, 0));
		panel_82.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_82 = new GridBagConstraints();
		gbc_panel_82.insets = new Insets(0, 0, 5, 5);
		gbc_panel_82.fill = GridBagConstraints.BOTH;
		gbc_panel_82.gridx = 4;
		gbc_panel_82.gridy = 0;
		panel.add(panel_82, gbc_panel_82);
		
		JPanel panel_83 = new JPanel();
		panel_83.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_83.setBackground(new Color(0, 100, 0));
		panel_83.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_83 = new GridBagConstraints();
		gbc_panel_83.insets = new Insets(0, 0, 5, 5);
		gbc_panel_83.fill = GridBagConstraints.BOTH;
		gbc_panel_83.gridx = 5;
		gbc_panel_83.gridy = 0;
		panel.add(panel_83, gbc_panel_83);
		
		JPanel panel_84 = new JPanel();
		panel_84.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_84.setBackground(new Color(0, 100, 0));
		panel_84.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_84 = new GridBagConstraints();
		gbc_panel_84.insets = new Insets(0, 0, 5, 5);
		gbc_panel_84.fill = GridBagConstraints.BOTH;
		gbc_panel_84.gridx = 6;
		gbc_panel_84.gridy = 0;
		panel.add(panel_84, gbc_panel_84);
		
		JPanel panel_85 = new JPanel();
		panel_85.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_85.setBackground(new Color(255, 0, 0));
		panel_85.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_85 = new GridBagConstraints();
		gbc_panel_85.insets = new Insets(0, 0, 5, 5);
		gbc_panel_85.fill = GridBagConstraints.BOTH;
		gbc_panel_85.gridx = 7;
		gbc_panel_85.gridy = 0;
		panel.add(panel_85, gbc_panel_85);
		
		JPanel panel_86 = new JPanel();
		panel_86.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_86.setBackground(new Color(0, 100, 0));
		panel_86.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_86 = new GridBagConstraints();
		gbc_panel_86.insets = new Insets(0, 0, 5, 5);
		gbc_panel_86.fill = GridBagConstraints.BOTH;
		gbc_panel_86.gridx = 8;
		gbc_panel_86.gridy = 0;
		panel.add(panel_86, gbc_panel_86);
		
		JPanel panel_87 = new JPanel();
		panel_87.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_87.setBackground(new Color(0, 100, 0));
		panel_87.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_87 = new GridBagConstraints();
		gbc_panel_87.insets = new Insets(0, 0, 5, 5);
		gbc_panel_87.fill = GridBagConstraints.BOTH;
		gbc_panel_87.gridx = 9;
		gbc_panel_87.gridy = 0;
		panel.add(panel_87, gbc_panel_87);
		
		JPanel panel_88 = new JPanel();
		panel_88.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_88.setBackground(new Color(0, 100, 0));
		panel_88.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_88 = new GridBagConstraints();
		gbc_panel_88.insets = new Insets(0, 0, 5, 5);
		gbc_panel_88.fill = GridBagConstraints.BOTH;
		gbc_panel_88.gridx = 10;
		gbc_panel_88.gridy = 0;
		panel.add(panel_88, gbc_panel_88);
		
		JPanel panel_89 = new JPanel();
		panel_89.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_89.setBackground(new Color(0, 255, 255));
		panel_89.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_89 = new GridBagConstraints();
		gbc_panel_89.insets = new Insets(0, 0, 5, 5);
		gbc_panel_89.fill = GridBagConstraints.BOTH;
		gbc_panel_89.gridx = 11;
		gbc_panel_89.gridy = 0;
		panel.add(panel_89, gbc_panel_89);
		
		JPanel panel_90 = new JPanel();
		panel_90.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_90.setBackground(new Color(0, 100, 0));
		panel_90.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_90 = new GridBagConstraints();
		gbc_panel_90.insets = new Insets(0, 0, 5, 5);
		gbc_panel_90.fill = GridBagConstraints.BOTH;
		gbc_panel_90.gridx = 12;
		gbc_panel_90.gridy = 0;
		panel.add(panel_90, gbc_panel_90);
		
		JPanel panel_91 = new JPanel();
		panel_91.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_91.setBackground(new Color(0, 100, 0));
		panel_91.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_91 = new GridBagConstraints();
		gbc_panel_91.insets = new Insets(0, 0, 5, 5);
		gbc_panel_91.fill = GridBagConstraints.BOTH;
		gbc_panel_91.gridx = 13;
		gbc_panel_91.gridy = 0;
		panel.add(panel_91, gbc_panel_91);
		
		JPanel panel_92 = new JPanel();
		panel_92.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_92.setBackground(new Color(255, 0, 0));
		panel_92.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_92 = new GridBagConstraints();
		gbc_panel_92.insets = new Insets(0, 0, 5, 0);
		gbc_panel_92.fill = GridBagConstraints.BOTH;
		gbc_panel_92.gridx = 14;
		gbc_panel_92.gridy = 0;
		panel.add(panel_92, gbc_panel_92);
		
		JPanel panel_184 = new JPanel();
		panel_184.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_184.setBackground(new Color(0, 100, 0));
		panel_184.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_184 = new GridBagConstraints();
		gbc_panel_184.insets = new Insets(0, 0, 5, 5);
		gbc_panel_184.fill = GridBagConstraints.BOTH;
		gbc_panel_184.gridx = 0;
		gbc_panel_184.gridy = 1;
		panel.add(panel_184, gbc_panel_184);
		
		JPanel panel_225 = new JPanel();
		panel_225.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_225.setBackground(new Color(250, 128, 114));
		panel_225.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_225 = new GridBagConstraints();
		gbc_panel_225.insets = new Insets(0, 0, 5, 5);
		gbc_panel_225.fill = GridBagConstraints.BOTH;
		gbc_panel_225.gridx = 1;
		gbc_panel_225.gridy = 1;
		panel.add(panel_225, gbc_panel_225);
		
		JPanel panel_224 = new JPanel();
		panel_224.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_224.setBackground(new Color(0, 100, 0));
		panel_224.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_224 = new GridBagConstraints();
		gbc_panel_224.insets = new Insets(0, 0, 5, 5);
		gbc_panel_224.fill = GridBagConstraints.BOTH;
		gbc_panel_224.gridx = 2;
		gbc_panel_224.gridy = 1;
		panel.add(panel_224, gbc_panel_224);
		
		JPanel panel_80 = new JPanel();
		panel_80.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_80.setBackground(new Color(0, 100, 0));
		panel_80.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_80 = new GridBagConstraints();
		gbc_panel_80.insets = new Insets(0, 0, 5, 5);
		gbc_panel_80.fill = GridBagConstraints.BOTH;
		gbc_panel_80.gridx = 3;
		gbc_panel_80.gridy = 1;
		panel.add(panel_80, gbc_panel_80);
		
		JPanel panel_117 = new JPanel();
		panel_117.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_117.setBackground(new Color(0, 100, 0));
		panel_117.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_117 = new GridBagConstraints();
		gbc_panel_117.insets = new Insets(0, 0, 5, 5);
		gbc_panel_117.fill = GridBagConstraints.BOTH;
		gbc_panel_117.gridx = 4;
		gbc_panel_117.gridy = 1;
		panel.add(panel_117, gbc_panel_117);
		
		JPanel panel_118 = new JPanel();
		panel_118.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_118.setBackground(new Color(0, 0, 255));
		panel_118.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_118 = new GridBagConstraints();
		gbc_panel_118.insets = new Insets(0, 0, 5, 5);
		gbc_panel_118.fill = GridBagConstraints.BOTH;
		gbc_panel_118.gridx = 5;
		gbc_panel_118.gridy = 1;
		panel.add(panel_118, gbc_panel_118);
		
		JPanel panel_119 = new JPanel();
		panel_119.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_119.setBackground(new Color(0, 100, 0));
		panel_119.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_119 = new GridBagConstraints();
		gbc_panel_119.insets = new Insets(0, 0, 5, 5);
		gbc_panel_119.fill = GridBagConstraints.BOTH;
		gbc_panel_119.gridx = 6;
		gbc_panel_119.gridy = 1;
		panel.add(panel_119, gbc_panel_119);
		
		JPanel panel_120 = new JPanel();
		panel_120.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_120.setBackground(new Color(0, 100, 0));
		panel_120.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_120 = new GridBagConstraints();
		gbc_panel_120.insets = new Insets(0, 0, 5, 5);
		gbc_panel_120.fill = GridBagConstraints.BOTH;
		gbc_panel_120.gridx = 7;
		gbc_panel_120.gridy = 1;
		panel.add(panel_120, gbc_panel_120);
		
		JPanel panel_121 = new JPanel();
		panel_121.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_121.setBackground(new Color(0, 100, 0));
		panel_121.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_121 = new GridBagConstraints();
		gbc_panel_121.insets = new Insets(0, 0, 5, 5);
		gbc_panel_121.fill = GridBagConstraints.BOTH;
		gbc_panel_121.gridx = 8;
		gbc_panel_121.gridy = 1;
		panel.add(panel_121, gbc_panel_121);
		
		JPanel panel_122 = new JPanel();
		panel_122.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_122.setBackground(new Color(0, 0, 255));
		panel_122.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_122 = new GridBagConstraints();
		gbc_panel_122.insets = new Insets(0, 0, 5, 5);
		gbc_panel_122.fill = GridBagConstraints.BOTH;
		gbc_panel_122.gridx = 9;
		gbc_panel_122.gridy = 1;
		panel.add(panel_122, gbc_panel_122);
		
		JPanel panel_123 = new JPanel();
		panel_123.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_123.setBackground(new Color(0, 100, 0));
		panel_123.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_123 = new GridBagConstraints();
		gbc_panel_123.insets = new Insets(0, 0, 5, 5);
		gbc_panel_123.fill = GridBagConstraints.BOTH;
		gbc_panel_123.gridx = 10;
		gbc_panel_123.gridy = 1;
		panel.add(panel_123, gbc_panel_123);
		
		JPanel panel_124 = new JPanel();
		panel_124.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_124.setBackground(new Color(0, 100, 0));
		panel_124.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_124 = new GridBagConstraints();
		gbc_panel_124.insets = new Insets(0, 0, 5, 5);
		gbc_panel_124.fill = GridBagConstraints.BOTH;
		gbc_panel_124.gridx = 11;
		gbc_panel_124.gridy = 1;
		panel.add(panel_124, gbc_panel_124);
		
		JPanel panel_125 = new JPanel();
		panel_125.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_125.setBackground(new Color(0, 100, 0));
		panel_125.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_125 = new GridBagConstraints();
		gbc_panel_125.insets = new Insets(0, 0, 5, 5);
		gbc_panel_125.fill = GridBagConstraints.BOTH;
		gbc_panel_125.gridx = 12;
		gbc_panel_125.gridy = 1;
		panel.add(panel_125, gbc_panel_125);
		
		JPanel panel_126 = new JPanel();
		panel_126.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_126.setBackground(new Color(250, 128, 114));
		panel_126.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_126 = new GridBagConstraints();
		gbc_panel_126.insets = new Insets(0, 0, 5, 5);
		gbc_panel_126.fill = GridBagConstraints.BOTH;
		gbc_panel_126.gridx = 13;
		gbc_panel_126.gridy = 1;
		panel.add(panel_126, gbc_panel_126);
		
		JPanel panel_93 = new JPanel();
		panel_93.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_93.setBackground(new Color(0, 100, 0));
		panel_93.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_93 = new GridBagConstraints();
		gbc_panel_93.insets = new Insets(0, 0, 5, 0);
		gbc_panel_93.fill = GridBagConstraints.BOTH;
		gbc_panel_93.gridx = 14;
		gbc_panel_93.gridy = 1;
		panel.add(panel_93, gbc_panel_93);
		
		JPanel panel_185 = new JPanel();
		panel_185.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_185.setBackground(new Color(0, 100, 0));
		panel_185.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_185 = new GridBagConstraints();
		gbc_panel_185.insets = new Insets(0, 0, 5, 5);
		gbc_panel_185.fill = GridBagConstraints.BOTH;
		gbc_panel_185.gridx = 0;
		gbc_panel_185.gridy = 2;
		panel.add(panel_185, gbc_panel_185);
		
		JPanel panel_222 = new JPanel();
		panel_222.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_222.setBackground(new Color(0, 100, 0));
		panel_222.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_222 = new GridBagConstraints();
		gbc_panel_222.insets = new Insets(0, 0, 5, 5);
		gbc_panel_222.fill = GridBagConstraints.BOTH;
		gbc_panel_222.gridx = 1;
		gbc_panel_222.gridy = 2;
		panel.add(panel_222, gbc_panel_222);
		
		JPanel panel_223 = new JPanel();
		panel_223.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_223.setBackground(new Color(250, 128, 114));
		panel_223.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_223 = new GridBagConstraints();
		gbc_panel_223.insets = new Insets(0, 0, 5, 5);
		gbc_panel_223.fill = GridBagConstraints.BOTH;
		gbc_panel_223.gridx = 2;
		gbc_panel_223.gridy = 2;
		panel.add(panel_223, gbc_panel_223);
		
		JPanel panel_79 = new JPanel();
		panel_79.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_79.setBackground(new Color(0, 100, 0));
		panel_79.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_79 = new GridBagConstraints();
		gbc_panel_79.insets = new Insets(0, 0, 5, 5);
		gbc_panel_79.fill = GridBagConstraints.BOTH;
		gbc_panel_79.gridx = 3;
		gbc_panel_79.gridy = 2;
		panel.add(panel_79, gbc_panel_79);
		
		JPanel panel_116 = new JPanel();
		panel_116.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_116.setBackground(new Color(0, 100, 0));
		panel_116.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_116 = new GridBagConstraints();
		gbc_panel_116.insets = new Insets(0, 0, 5, 5);
		gbc_panel_116.fill = GridBagConstraints.BOTH;
		gbc_panel_116.gridx = 4;
		gbc_panel_116.gridy = 2;
		panel.add(panel_116, gbc_panel_116);
		
		JPanel panel_145 = new JPanel();
		panel_145.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_145.setBackground(new Color(0, 100, 0));
		panel_145.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_145 = new GridBagConstraints();
		gbc_panel_145.insets = new Insets(0, 0, 5, 5);
		gbc_panel_145.fill = GridBagConstraints.BOTH;
		gbc_panel_145.gridx = 5;
		gbc_panel_145.gridy = 2;
		panel.add(panel_145, gbc_panel_145);
		
		JPanel panel_146 = new JPanel();
		panel_146.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_146.setBackground(new Color(0, 255, 255));
		panel_146.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_146 = new GridBagConstraints();
		gbc_panel_146.insets = new Insets(0, 0, 5, 5);
		gbc_panel_146.fill = GridBagConstraints.BOTH;
		gbc_panel_146.gridx = 6;
		gbc_panel_146.gridy = 2;
		panel.add(panel_146, gbc_panel_146);
		
		JPanel panel_147 = new JPanel();
		panel_147.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_147.setBackground(new Color(0, 100, 0));
		panel_147.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_147 = new GridBagConstraints();
		gbc_panel_147.insets = new Insets(0, 0, 5, 5);
		gbc_panel_147.fill = GridBagConstraints.BOTH;
		gbc_panel_147.gridx = 7;
		gbc_panel_147.gridy = 2;
		panel.add(panel_147, gbc_panel_147);
		
		JPanel panel_148 = new JPanel();
		panel_148.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_148.setBackground(new Color(0, 255, 255));
		panel_148.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_148 = new GridBagConstraints();
		gbc_panel_148.insets = new Insets(0, 0, 5, 5);
		gbc_panel_148.fill = GridBagConstraints.BOTH;
		gbc_panel_148.gridx = 8;
		gbc_panel_148.gridy = 2;
		panel.add(panel_148, gbc_panel_148);
		
		JPanel panel_149 = new JPanel();
		panel_149.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_149.setBackground(new Color(0, 100, 0));
		panel_149.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_149 = new GridBagConstraints();
		gbc_panel_149.insets = new Insets(0, 0, 5, 5);
		gbc_panel_149.fill = GridBagConstraints.BOTH;
		gbc_panel_149.gridx = 9;
		gbc_panel_149.gridy = 2;
		panel.add(panel_149, gbc_panel_149);
		
		JPanel panel_150 = new JPanel();
		panel_150.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_150.setBackground(new Color(0, 100, 0));
		panel_150.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_150 = new GridBagConstraints();
		gbc_panel_150.insets = new Insets(0, 0, 5, 5);
		gbc_panel_150.fill = GridBagConstraints.BOTH;
		gbc_panel_150.gridx = 10;
		gbc_panel_150.gridy = 2;
		panel.add(panel_150, gbc_panel_150);
		
		JPanel panel_151 = new JPanel();
		panel_151.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_151.setBackground(new Color(0, 100, 0));
		panel_151.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_151 = new GridBagConstraints();
		gbc_panel_151.insets = new Insets(0, 0, 5, 5);
		gbc_panel_151.fill = GridBagConstraints.BOTH;
		gbc_panel_151.gridx = 11;
		gbc_panel_151.gridy = 2;
		panel.add(panel_151, gbc_panel_151);
		
		JPanel panel_152 = new JPanel();
		panel_152.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_152.setBackground(new Color(250, 128, 114));
		panel_152.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_152 = new GridBagConstraints();
		gbc_panel_152.insets = new Insets(0, 0, 5, 5);
		gbc_panel_152.fill = GridBagConstraints.BOTH;
		gbc_panel_152.gridx = 12;
		gbc_panel_152.gridy = 2;
		panel.add(panel_152, gbc_panel_152);
		
		JPanel panel_127 = new JPanel();
		panel_127.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_127.setBackground(new Color(0, 100, 0));
		panel_127.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_127 = new GridBagConstraints();
		gbc_panel_127.insets = new Insets(0, 0, 5, 5);
		gbc_panel_127.fill = GridBagConstraints.BOTH;
		gbc_panel_127.gridx = 13;
		gbc_panel_127.gridy = 2;
		panel.add(panel_127, gbc_panel_127);
		
		JPanel panel_94 = new JPanel();
		panel_94.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_94.setBackground(new Color(0, 100, 0));
		panel_94.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_94 = new GridBagConstraints();
		gbc_panel_94.insets = new Insets(0, 0, 5, 0);
		gbc_panel_94.fill = GridBagConstraints.BOTH;
		gbc_panel_94.gridx = 14;
		gbc_panel_94.gridy = 2;
		panel.add(panel_94, gbc_panel_94);
		
		JPanel panel_186 = new JPanel();
		panel_186.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_186.setBackground(new Color(0, 255, 255));
		panel_186.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_186 = new GridBagConstraints();
		gbc_panel_186.insets = new Insets(0, 0, 5, 5);
		gbc_panel_186.fill = GridBagConstraints.BOTH;
		gbc_panel_186.gridx = 0;
		gbc_panel_186.gridy = 3;
		panel.add(panel_186, gbc_panel_186);
		
		JPanel panel_221 = new JPanel();
		panel_221.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_221.setBackground(new Color(0, 100, 0));
		panel_221.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_221 = new GridBagConstraints();
		gbc_panel_221.insets = new Insets(0, 0, 5, 5);
		gbc_panel_221.fill = GridBagConstraints.BOTH;
		gbc_panel_221.gridx = 1;
		gbc_panel_221.gridy = 3;
		panel.add(panel_221, gbc_panel_221);
		
		JPanel panel_220 = new JPanel();
		panel_220.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_220.setBackground(new Color(0, 100, 0));
		panel_220.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_220 = new GridBagConstraints();
		gbc_panel_220.insets = new Insets(0, 0, 5, 5);
		gbc_panel_220.fill = GridBagConstraints.BOTH;
		gbc_panel_220.gridx = 2;
		gbc_panel_220.gridy = 3;
		panel.add(panel_220, gbc_panel_220);
		
		JPanel panel_78 = new JPanel();
		panel_78.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_78.setBackground(new Color(250, 128, 114));
		panel_78.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_78 = new GridBagConstraints();
		gbc_panel_78.insets = new Insets(0, 0, 5, 5);
		gbc_panel_78.fill = GridBagConstraints.BOTH;
		gbc_panel_78.gridx = 3;
		gbc_panel_78.gridy = 3;
		panel.add(panel_78, gbc_panel_78);
		
		JPanel panel_115 = new JPanel();
		panel_115.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_115.setBackground(new Color(0, 100, 0));
		panel_115.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_115 = new GridBagConstraints();
		gbc_panel_115.insets = new Insets(0, 0, 5, 5);
		gbc_panel_115.fill = GridBagConstraints.BOTH;
		gbc_panel_115.gridx = 4;
		gbc_panel_115.gridy = 3;
		panel.add(panel_115, gbc_panel_115);
		
		JPanel panel_144 = new JPanel();
		panel_144.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_144.setBackground(new Color(0, 100, 0));
		panel_144.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_144 = new GridBagConstraints();
		gbc_panel_144.insets = new Insets(0, 0, 5, 5);
		gbc_panel_144.fill = GridBagConstraints.BOTH;
		gbc_panel_144.gridx = 5;
		gbc_panel_144.gridy = 3;
		panel.add(panel_144, gbc_panel_144);
		
		JPanel panel_165 = new JPanel();
		panel_165.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_165.setBackground(new Color(0, 100, 0));
		panel_165.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_165 = new GridBagConstraints();
		gbc_panel_165.insets = new Insets(0, 0, 5, 5);
		gbc_panel_165.fill = GridBagConstraints.BOTH;
		gbc_panel_165.gridx = 6;
		gbc_panel_165.gridy = 3;
		panel.add(panel_165, gbc_panel_165);
		
		JPanel panel_166 = new JPanel();
		panel_166.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_166.setBackground(new Color(0, 255, 255));
		panel_166.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_166 = new GridBagConstraints();
		gbc_panel_166.insets = new Insets(0, 0, 5, 5);
		gbc_panel_166.fill = GridBagConstraints.BOTH;
		gbc_panel_166.gridx = 7;
		gbc_panel_166.gridy = 3;
		panel.add(panel_166, gbc_panel_166);
		
		JPanel panel_167 = new JPanel();
		panel_167.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_167.setBackground(new Color(0, 100, 0));
		panel_167.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_167 = new GridBagConstraints();
		gbc_panel_167.insets = new Insets(0, 0, 5, 5);
		gbc_panel_167.fill = GridBagConstraints.BOTH;
		gbc_panel_167.gridx = 8;
		gbc_panel_167.gridy = 3;
		panel.add(panel_167, gbc_panel_167);
		
		JPanel panel_168 = new JPanel();
		panel_168.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_168.setBackground(new Color(0, 100, 0));
		panel_168.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_168 = new GridBagConstraints();
		gbc_panel_168.insets = new Insets(0, 0, 5, 5);
		gbc_panel_168.fill = GridBagConstraints.BOTH;
		gbc_panel_168.gridx = 9;
		gbc_panel_168.gridy = 3;
		panel.add(panel_168, gbc_panel_168);
		
		JPanel panel_169 = new JPanel();
		panel_169.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_169.setBackground(new Color(0, 100, 0));
		panel_169.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_169 = new GridBagConstraints();
		gbc_panel_169.insets = new Insets(0, 0, 5, 5);
		gbc_panel_169.fill = GridBagConstraints.BOTH;
		gbc_panel_169.gridx = 10;
		gbc_panel_169.gridy = 3;
		panel.add(panel_169, gbc_panel_169);
		
		JPanel panel_170 = new JPanel();
		panel_170.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_170.setBackground(new Color(250, 128, 114));
		panel_170.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_170 = new GridBagConstraints();
		gbc_panel_170.insets = new Insets(0, 0, 5, 5);
		gbc_panel_170.fill = GridBagConstraints.BOTH;
		gbc_panel_170.gridx = 11;
		gbc_panel_170.gridy = 3;
		panel.add(panel_170, gbc_panel_170);
		
		JPanel panel_153 = new JPanel();
		panel_153.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_153.setBackground(new Color(0, 100, 0));
		panel_153.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_153 = new GridBagConstraints();
		gbc_panel_153.insets = new Insets(0, 0, 5, 5);
		gbc_panel_153.fill = GridBagConstraints.BOTH;
		gbc_panel_153.gridx = 12;
		gbc_panel_153.gridy = 3;
		panel.add(panel_153, gbc_panel_153);
		
		JPanel panel_128 = new JPanel();
		panel_128.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_128.setBackground(new Color(0, 100, 0));
		panel_128.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_128 = new GridBagConstraints();
		gbc_panel_128.insets = new Insets(0, 0, 5, 5);
		gbc_panel_128.fill = GridBagConstraints.BOTH;
		gbc_panel_128.gridx = 13;
		gbc_panel_128.gridy = 3;
		panel.add(panel_128, gbc_panel_128);
		
		JPanel panel_95 = new JPanel();
		panel_95.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_95.setBackground(new Color(0, 255, 255));
		panel_95.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_95 = new GridBagConstraints();
		gbc_panel_95.insets = new Insets(0, 0, 5, 0);
		gbc_panel_95.fill = GridBagConstraints.BOTH;
		gbc_panel_95.gridx = 14;
		gbc_panel_95.gridy = 3;
		panel.add(panel_95, gbc_panel_95);
		
		JPanel panel_187 = new JPanel();
		panel_187.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_187.setBackground(new Color(0, 100, 0));
		panel_187.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_187 = new GridBagConstraints();
		gbc_panel_187.insets = new Insets(0, 0, 5, 5);
		gbc_panel_187.fill = GridBagConstraints.BOTH;
		gbc_panel_187.gridx = 0;
		gbc_panel_187.gridy = 4;
		panel.add(panel_187, gbc_panel_187);
		
		JPanel panel_218 = new JPanel();
		panel_218.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_218.setBackground(new Color(0, 100, 0));
		panel_218.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_218 = new GridBagConstraints();
		gbc_panel_218.insets = new Insets(0, 0, 5, 5);
		gbc_panel_218.fill = GridBagConstraints.BOTH;
		gbc_panel_218.gridx = 1;
		gbc_panel_218.gridy = 4;
		panel.add(panel_218, gbc_panel_218);
		
		JPanel panel_219 = new JPanel();
		panel_219.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_219.setBackground(new Color(0, 100, 0));
		panel_219.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_219 = new GridBagConstraints();
		gbc_panel_219.insets = new Insets(0, 0, 5, 5);
		gbc_panel_219.fill = GridBagConstraints.BOTH;
		gbc_panel_219.gridx = 2;
		gbc_panel_219.gridy = 4;
		panel.add(panel_219, gbc_panel_219);
		
		JPanel panel_77 = new JPanel();
		panel_77.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_77.setBackground(new Color(0, 100, 0));
		panel_77.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_77 = new GridBagConstraints();
		gbc_panel_77.insets = new Insets(0, 0, 5, 5);
		gbc_panel_77.fill = GridBagConstraints.BOTH;
		gbc_panel_77.gridx = 3;
		gbc_panel_77.gridy = 4;
		panel.add(panel_77, gbc_panel_77);
		
		JPanel panel_114 = new JPanel();
		panel_114.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_114.setBackground(new Color(250, 128, 114));
		panel_114.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_114 = new GridBagConstraints();
		gbc_panel_114.insets = new Insets(0, 0, 5, 5);
		gbc_panel_114.fill = GridBagConstraints.BOTH;
		gbc_panel_114.gridx = 4;
		gbc_panel_114.gridy = 4;
		panel.add(panel_114, gbc_panel_114);
		
		JPanel panel_143 = new JPanel();
		panel_143.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_143.setBackground(new Color(0, 100, 0));
		panel_143.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_143 = new GridBagConstraints();
		gbc_panel_143.insets = new Insets(0, 0, 5, 5);
		gbc_panel_143.fill = GridBagConstraints.BOTH;
		gbc_panel_143.gridx = 5;
		gbc_panel_143.gridy = 4;
		panel.add(panel_143, gbc_panel_143);
		
		JPanel panel_164 = new JPanel();
		panel_164.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_164.setBackground(new Color(0, 100, 0));
		panel_164.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_164 = new GridBagConstraints();
		gbc_panel_164.insets = new Insets(0, 0, 5, 5);
		gbc_panel_164.fill = GridBagConstraints.BOTH;
		gbc_panel_164.gridx = 6;
		gbc_panel_164.gridy = 4;
		panel.add(panel_164, gbc_panel_164);
		
		JPanel panel_177 = new JPanel();
		panel_177.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_177.setBackground(new Color(0, 100, 0));
		panel_177.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_177 = new GridBagConstraints();
		gbc_panel_177.insets = new Insets(0, 0, 5, 5);
		gbc_panel_177.fill = GridBagConstraints.BOTH;
		gbc_panel_177.gridx = 7;
		gbc_panel_177.gridy = 4;
		panel.add(panel_177, gbc_panel_177);
		
		JPanel panel_178 = new JPanel();
		panel_178.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_178.setBackground(new Color(0, 100, 0));
		panel_178.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_178 = new GridBagConstraints();
		gbc_panel_178.insets = new Insets(0, 0, 5, 5);
		gbc_panel_178.fill = GridBagConstraints.BOTH;
		gbc_panel_178.gridx = 8;
		gbc_panel_178.gridy = 4;
		panel.add(panel_178, gbc_panel_178);
		
		JPanel panel_179 = new JPanel();
		panel_179.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_179.setBackground(new Color(0, 100, 0));
		panel_179.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_179 = new GridBagConstraints();
		gbc_panel_179.insets = new Insets(0, 0, 5, 5);
		gbc_panel_179.fill = GridBagConstraints.BOTH;
		gbc_panel_179.gridx = 9;
		gbc_panel_179.gridy = 4;
		panel.add(panel_179, gbc_panel_179);
		
		JPanel panel_180 = new JPanel();
		panel_180.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_180.setBackground(new Color(250, 128, 114));
		panel_180.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_180 = new GridBagConstraints();
		gbc_panel_180.insets = new Insets(0, 0, 5, 5);
		gbc_panel_180.fill = GridBagConstraints.BOTH;
		gbc_panel_180.gridx = 10;
		gbc_panel_180.gridy = 4;
		panel.add(panel_180, gbc_panel_180);
		
		JPanel panel_171 = new JPanel();
		panel_171.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_171.setBackground(new Color(0, 100, 0));
		panel_171.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_171 = new GridBagConstraints();
		gbc_panel_171.insets = new Insets(0, 0, 5, 5);
		gbc_panel_171.fill = GridBagConstraints.BOTH;
		gbc_panel_171.gridx = 11;
		gbc_panel_171.gridy = 4;
		panel.add(panel_171, gbc_panel_171);
		
		JPanel panel_154 = new JPanel();
		panel_154.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_154.setBackground(new Color(0, 100, 0));
		panel_154.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_154 = new GridBagConstraints();
		gbc_panel_154.insets = new Insets(0, 0, 5, 5);
		gbc_panel_154.fill = GridBagConstraints.BOTH;
		gbc_panel_154.gridx = 12;
		gbc_panel_154.gridy = 4;
		panel.add(panel_154, gbc_panel_154);
		
		JPanel panel_129 = new JPanel();
		panel_129.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_129.setBackground(new Color(0, 100, 0));
		panel_129.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_129 = new GridBagConstraints();
		gbc_panel_129.insets = new Insets(0, 0, 5, 5);
		gbc_panel_129.fill = GridBagConstraints.BOTH;
		gbc_panel_129.gridx = 13;
		gbc_panel_129.gridy = 4;
		panel.add(panel_129, gbc_panel_129);
		
		JPanel panel_96 = new JPanel();
		panel_96.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_96.setBackground(new Color(0, 100, 0));
		panel_96.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_96 = new GridBagConstraints();
		gbc_panel_96.insets = new Insets(0, 0, 5, 0);
		gbc_panel_96.fill = GridBagConstraints.BOTH;
		gbc_panel_96.gridx = 14;
		gbc_panel_96.gridy = 4;
		panel.add(panel_96, gbc_panel_96);
		
		JPanel panel_188 = new JPanel();
		panel_188.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_188.setBackground(new Color(0, 100, 0));
		panel_188.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_188 = new GridBagConstraints();
		gbc_panel_188.insets = new Insets(0, 0, 5, 5);
		gbc_panel_188.fill = GridBagConstraints.BOTH;
		gbc_panel_188.gridx = 0;
		gbc_panel_188.gridy = 5;
		panel.add(panel_188, gbc_panel_188);
		
		JPanel panel_217 = new JPanel();
		panel_217.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_217.setBackground(new Color(0, 0, 255));
		panel_217.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_217 = new GridBagConstraints();
		gbc_panel_217.insets = new Insets(0, 0, 5, 5);
		gbc_panel_217.fill = GridBagConstraints.BOTH;
		gbc_panel_217.gridx = 1;
		gbc_panel_217.gridy = 5;
		panel.add(panel_217, gbc_panel_217);
		
		JPanel panel_216 = new JPanel();
		panel_216.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_216.setBackground(new Color(0, 100, 0));
		panel_216.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_216 = new GridBagConstraints();
		gbc_panel_216.insets = new Insets(0, 0, 5, 5);
		gbc_panel_216.fill = GridBagConstraints.BOTH;
		gbc_panel_216.gridx = 2;
		gbc_panel_216.gridy = 5;
		panel.add(panel_216, gbc_panel_216);
		
		JPanel panel_76 = new JPanel();
		panel_76.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_76.setBackground(new Color(0, 100, 0));
		panel_76.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_76 = new GridBagConstraints();
		gbc_panel_76.insets = new Insets(0, 0, 5, 5);
		gbc_panel_76.fill = GridBagConstraints.BOTH;
		gbc_panel_76.gridx = 3;
		gbc_panel_76.gridy = 5;
		panel.add(panel_76, gbc_panel_76);
		
		JPanel panel_113 = new JPanel();
		panel_113.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_113.setBackground(new Color(0, 100, 0));
		panel_113.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_113 = new GridBagConstraints();
		gbc_panel_113.insets = new Insets(0, 0, 5, 5);
		gbc_panel_113.fill = GridBagConstraints.BOTH;
		gbc_panel_113.gridx = 4;
		gbc_panel_113.gridy = 5;
		panel.add(panel_113, gbc_panel_113);
		
		JPanel panel_142 = new JPanel();
		panel_142.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_142.setBackground(new Color(0, 0, 255));
		panel_142.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_142 = new GridBagConstraints();
		gbc_panel_142.insets = new Insets(0, 0, 5, 5);
		gbc_panel_142.fill = GridBagConstraints.BOTH;
		gbc_panel_142.gridx = 5;
		gbc_panel_142.gridy = 5;
		panel.add(panel_142, gbc_panel_142);
		
		JPanel panel_163 = new JPanel();
		panel_163.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_163.setBackground(new Color(0, 100, 0));
		panel_163.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_163 = new GridBagConstraints();
		gbc_panel_163.insets = new Insets(0, 0, 5, 5);
		gbc_panel_163.fill = GridBagConstraints.BOTH;
		gbc_panel_163.gridx = 6;
		gbc_panel_163.gridy = 5;
		panel.add(panel_163, gbc_panel_163);
		
		JPanel panel_176 = new JPanel();
		panel_176.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_176.setBackground(new Color(0, 100, 0));
		panel_176.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_176 = new GridBagConstraints();
		gbc_panel_176.insets = new Insets(0, 0, 5, 5);
		gbc_panel_176.fill = GridBagConstraints.BOTH;
		gbc_panel_176.gridx = 7;
		gbc_panel_176.gridy = 5;
		panel.add(panel_176, gbc_panel_176);
		
		JPanel panel_175 = new JPanel();
		panel_175.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_175.setBackground(new Color(0, 100, 0));
		panel_175.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_175 = new GridBagConstraints();
		gbc_panel_175.insets = new Insets(0, 0, 5, 5);
		gbc_panel_175.fill = GridBagConstraints.BOTH;
		gbc_panel_175.gridx = 8;
		gbc_panel_175.gridy = 5;
		panel.add(panel_175, gbc_panel_175);
		
		JPanel panel_174 = new JPanel();
		panel_174.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_174.setBackground(new Color(0, 0, 255));
		panel_174.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_174 = new GridBagConstraints();
		gbc_panel_174.insets = new Insets(0, 0, 5, 5);
		gbc_panel_174.fill = GridBagConstraints.BOTH;
		gbc_panel_174.gridx = 9;
		gbc_panel_174.gridy = 5;
		panel.add(panel_174, gbc_panel_174);
		
		JPanel panel_173 = new JPanel();
		panel_173.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_173.setBackground(new Color(0, 100, 0));
		panel_173.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_173 = new GridBagConstraints();
		gbc_panel_173.insets = new Insets(0, 0, 5, 5);
		gbc_panel_173.fill = GridBagConstraints.BOTH;
		gbc_panel_173.gridx = 10;
		gbc_panel_173.gridy = 5;
		panel.add(panel_173, gbc_panel_173);
		
		JPanel panel_172 = new JPanel();
		panel_172.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_172.setBackground(new Color(0, 100, 0));
		panel_172.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_172 = new GridBagConstraints();
		gbc_panel_172.insets = new Insets(0, 0, 5, 5);
		gbc_panel_172.fill = GridBagConstraints.BOTH;
		gbc_panel_172.gridx = 11;
		gbc_panel_172.gridy = 5;
		panel.add(panel_172, gbc_panel_172);
		
		JPanel panel_155 = new JPanel();
		panel_155.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_155.setBackground(new Color(0, 100, 0));
		panel_155.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_155 = new GridBagConstraints();
		gbc_panel_155.insets = new Insets(0, 0, 5, 5);
		gbc_panel_155.fill = GridBagConstraints.BOTH;
		gbc_panel_155.gridx = 12;
		gbc_panel_155.gridy = 5;
		panel.add(panel_155, gbc_panel_155);
		
		JPanel panel_130 = new JPanel();
		panel_130.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_130.setBackground(new Color(0, 0, 255));
		panel_130.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_130 = new GridBagConstraints();
		gbc_panel_130.insets = new Insets(0, 0, 5, 5);
		gbc_panel_130.fill = GridBagConstraints.BOTH;
		gbc_panel_130.gridx = 13;
		gbc_panel_130.gridy = 5;
		panel.add(panel_130, gbc_panel_130);
		
		JPanel panel_97 = new JPanel();
		panel_97.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_97.setBackground(new Color(0, 100, 0));
		panel_97.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_97 = new GridBagConstraints();
		gbc_panel_97.insets = new Insets(0, 0, 5, 0);
		gbc_panel_97.fill = GridBagConstraints.BOTH;
		gbc_panel_97.gridx = 14;
		gbc_panel_97.gridy = 5;
		panel.add(panel_97, gbc_panel_97);
		
		JPanel panel_189 = new JPanel();
		panel_189.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_189.setBackground(new Color(0, 100, 0));
		panel_189.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_189 = new GridBagConstraints();
		gbc_panel_189.insets = new Insets(0, 0, 5, 5);
		gbc_panel_189.fill = GridBagConstraints.BOTH;
		gbc_panel_189.gridx = 0;
		gbc_panel_189.gridy = 6;
		panel.add(panel_189, gbc_panel_189);
		
		JPanel panel_214 = new JPanel();
		panel_214.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_214.setBackground(new Color(0, 100, 0));
		panel_214.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_214 = new GridBagConstraints();
		gbc_panel_214.insets = new Insets(0, 0, 5, 5);
		gbc_panel_214.fill = GridBagConstraints.BOTH;
		gbc_panel_214.gridx = 1;
		gbc_panel_214.gridy = 6;
		panel.add(panel_214, gbc_panel_214);
		
		JPanel panel_215 = new JPanel();
		panel_215.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_215.setBackground(new Color(0, 255, 255));
		panel_215.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_215 = new GridBagConstraints();
		gbc_panel_215.insets = new Insets(0, 0, 5, 5);
		gbc_panel_215.fill = GridBagConstraints.BOTH;
		gbc_panel_215.gridx = 2;
		gbc_panel_215.gridy = 6;
		panel.add(panel_215, gbc_panel_215);
		
		JPanel panel_75 = new JPanel();
		panel_75.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_75.setBackground(new Color(0, 100, 0));
		panel_75.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_75 = new GridBagConstraints();
		gbc_panel_75.insets = new Insets(0, 0, 5, 5);
		gbc_panel_75.fill = GridBagConstraints.BOTH;
		gbc_panel_75.gridx = 3;
		gbc_panel_75.gridy = 6;
		panel.add(panel_75, gbc_panel_75);
		
		JPanel panel_112 = new JPanel();
		panel_112.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_112.setBackground(new Color(0, 100, 0));
		panel_112.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_112 = new GridBagConstraints();
		gbc_panel_112.insets = new Insets(0, 0, 5, 5);
		gbc_panel_112.fill = GridBagConstraints.BOTH;
		gbc_panel_112.gridx = 4;
		gbc_panel_112.gridy = 6;
		panel.add(panel_112, gbc_panel_112);
		
		JPanel panel_141 = new JPanel();
		panel_141.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_141.setBackground(new Color(0, 100, 0));
		panel_141.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_141 = new GridBagConstraints();
		gbc_panel_141.insets = new Insets(0, 0, 5, 5);
		gbc_panel_141.fill = GridBagConstraints.BOTH;
		gbc_panel_141.gridx = 5;
		gbc_panel_141.gridy = 6;
		panel.add(panel_141, gbc_panel_141);
		
		JPanel panel_162 = new JPanel();
		panel_162.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_162.setBackground(new Color(0, 255, 255));
		panel_162.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_162 = new GridBagConstraints();
		gbc_panel_162.insets = new Insets(0, 0, 5, 5);
		gbc_panel_162.fill = GridBagConstraints.BOTH;
		gbc_panel_162.gridx = 6;
		gbc_panel_162.gridy = 6;
		panel.add(panel_162, gbc_panel_162);
		
		JPanel panel_161 = new JPanel();
		panel_161.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_161.setBackground(new Color(0, 100, 0));
		panel_161.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_161 = new GridBagConstraints();
		gbc_panel_161.insets = new Insets(0, 0, 5, 5);
		gbc_panel_161.fill = GridBagConstraints.BOTH;
		gbc_panel_161.gridx = 7;
		gbc_panel_161.gridy = 6;
		panel.add(panel_161, gbc_panel_161);
		
		JPanel panel_160 = new JPanel();
		panel_160.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_160.setBackground(new Color(0, 255, 255));
		panel_160.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_160 = new GridBagConstraints();
		gbc_panel_160.insets = new Insets(0, 0, 5, 5);
		gbc_panel_160.fill = GridBagConstraints.BOTH;
		gbc_panel_160.gridx = 8;
		gbc_panel_160.gridy = 6;
		panel.add(panel_160, gbc_panel_160);
		
		JPanel panel_159 = new JPanel();
		panel_159.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_159.setBackground(new Color(0, 100, 0));
		panel_159.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_159 = new GridBagConstraints();
		gbc_panel_159.insets = new Insets(0, 0, 5, 5);
		gbc_panel_159.fill = GridBagConstraints.BOTH;
		gbc_panel_159.gridx = 9;
		gbc_panel_159.gridy = 6;
		panel.add(panel_159, gbc_panel_159);
		
		JPanel panel_158 = new JPanel();
		panel_158.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_158.setBackground(new Color(0, 100, 0));
		panel_158.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_158 = new GridBagConstraints();
		gbc_panel_158.insets = new Insets(0, 0, 5, 5);
		gbc_panel_158.fill = GridBagConstraints.BOTH;
		gbc_panel_158.gridx = 10;
		gbc_panel_158.gridy = 6;
		panel.add(panel_158, gbc_panel_158);
		
		JPanel panel_157 = new JPanel();
		panel_157.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_157.setBackground(new Color(0, 100, 0));
		panel_157.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_157 = new GridBagConstraints();
		gbc_panel_157.insets = new Insets(0, 0, 5, 5);
		gbc_panel_157.fill = GridBagConstraints.BOTH;
		gbc_panel_157.gridx = 11;
		gbc_panel_157.gridy = 6;
		panel.add(panel_157, gbc_panel_157);
		
		JPanel panel_156 = new JPanel();
		panel_156.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_156.setBackground(new Color(0, 255, 255));
		panel_156.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_156 = new GridBagConstraints();
		gbc_panel_156.insets = new Insets(0, 0, 5, 5);
		gbc_panel_156.fill = GridBagConstraints.BOTH;
		gbc_panel_156.gridx = 12;
		gbc_panel_156.gridy = 6;
		panel.add(panel_156, gbc_panel_156);
		
		JPanel panel_131 = new JPanel();
		panel_131.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_131.setBackground(new Color(0, 100, 0));
		panel_131.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_131 = new GridBagConstraints();
		gbc_panel_131.insets = new Insets(0, 0, 5, 5);
		gbc_panel_131.fill = GridBagConstraints.BOTH;
		gbc_panel_131.gridx = 13;
		gbc_panel_131.gridy = 6;
		panel.add(panel_131, gbc_panel_131);
		
		JPanel panel_98 = new JPanel();
		panel_98.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_98.setBackground(new Color(0, 100, 0));
		panel_98.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_98 = new GridBagConstraints();
		gbc_panel_98.insets = new Insets(0, 0, 5, 0);
		gbc_panel_98.fill = GridBagConstraints.BOTH;
		gbc_panel_98.gridx = 14;
		gbc_panel_98.gridy = 6;
		panel.add(panel_98, gbc_panel_98);
		
		JPanel panel_190 = new JPanel();
		panel_190.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_190.setBackground(new Color(255, 0, 0));
		panel_190.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_190 = new GridBagConstraints();
		gbc_panel_190.insets = new Insets(0, 0, 5, 5);
		gbc_panel_190.fill = GridBagConstraints.BOTH;
		gbc_panel_190.gridx = 0;
		gbc_panel_190.gridy = 7;
		panel.add(panel_190, gbc_panel_190);
		
		JPanel panel_213 = new JPanel();
		panel_213.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_213.setBackground(new Color(0, 100, 0));
		panel_213.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_213 = new GridBagConstraints();
		gbc_panel_213.insets = new Insets(0, 0, 5, 5);
		gbc_panel_213.fill = GridBagConstraints.BOTH;
		gbc_panel_213.gridx = 1;
		gbc_panel_213.gridy = 7;
		panel.add(panel_213, gbc_panel_213);
		
		JPanel panel_212 = new JPanel();
		panel_212.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_212.setBackground(new Color(0, 100, 0));
		panel_212.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_212 = new GridBagConstraints();
		gbc_panel_212.insets = new Insets(0, 0, 5, 5);
		gbc_panel_212.fill = GridBagConstraints.BOTH;
		gbc_panel_212.gridx = 2;
		gbc_panel_212.gridy = 7;
		panel.add(panel_212, gbc_panel_212);
		
		JPanel panel_74 = new JPanel();
		panel_74.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_74.setBackground(new Color(0, 255, 255));
		panel_74.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_74 = new GridBagConstraints();
		gbc_panel_74.insets = new Insets(0, 0, 5, 5);
		gbc_panel_74.fill = GridBagConstraints.BOTH;
		gbc_panel_74.gridx = 3;
		gbc_panel_74.gridy = 7;
		panel.add(panel_74, gbc_panel_74);
		
		JPanel panel_111 = new JPanel();
		panel_111.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_111.setBackground(new Color(0, 100, 0));
		panel_111.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_111 = new GridBagConstraints();
		gbc_panel_111.insets = new Insets(0, 0, 5, 5);
		gbc_panel_111.fill = GridBagConstraints.BOTH;
		gbc_panel_111.gridx = 4;
		gbc_panel_111.gridy = 7;
		panel.add(panel_111, gbc_panel_111);
		
		JPanel panel_140 = new JPanel();
		panel_140.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_140.setBackground(new Color(0, 100, 0));
		panel_140.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_140 = new GridBagConstraints();
		gbc_panel_140.insets = new Insets(0, 0, 5, 5);
		gbc_panel_140.fill = GridBagConstraints.BOTH;
		gbc_panel_140.gridx = 5;
		gbc_panel_140.gridy = 7;
		panel.add(panel_140, gbc_panel_140);
		
		JPanel panel_139 = new JPanel();
		panel_139.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_139.setBackground(new Color(0, 100, 0));
		panel_139.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_139 = new GridBagConstraints();
		gbc_panel_139.insets = new Insets(0, 0, 5, 5);
		gbc_panel_139.fill = GridBagConstraints.BOTH;
		gbc_panel_139.gridx = 6;
		gbc_panel_139.gridy = 7;
		panel.add(panel_139, gbc_panel_139);
		
		JPanel panel_138 = new JPanel();
		panel_138.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_138.setBackground(new Color(244, 164, 96));
		panel_138.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_138 = new GridBagConstraints();
		gbc_panel_138.insets = new Insets(0, 0, 5, 5);
		gbc_panel_138.fill = GridBagConstraints.BOTH;
		gbc_panel_138.gridx = 7;
		gbc_panel_138.gridy = 7;
		panel.add(panel_138, gbc_panel_138);
		
		JPanel panel_137 = new JPanel();
		panel_137.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_137.setBackground(new Color(0, 100, 0));
		panel_137.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_137 = new GridBagConstraints();
		gbc_panel_137.insets = new Insets(0, 0, 5, 5);
		gbc_panel_137.fill = GridBagConstraints.BOTH;
		gbc_panel_137.gridx = 8;
		gbc_panel_137.gridy = 7;
		panel.add(panel_137, gbc_panel_137);
		
		JPanel panel_136 = new JPanel();
		panel_136.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_136.setBackground(new Color(0, 100, 0));
		panel_136.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_136 = new GridBagConstraints();
		gbc_panel_136.insets = new Insets(0, 0, 5, 5);
		gbc_panel_136.fill = GridBagConstraints.BOTH;
		gbc_panel_136.gridx = 9;
		gbc_panel_136.gridy = 7;
		panel.add(panel_136, gbc_panel_136);
		
		JPanel panel_135 = new JPanel();
		panel_135.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_135.setBackground(new Color(0, 100, 0));
		panel_135.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_135 = new GridBagConstraints();
		gbc_panel_135.insets = new Insets(0, 0, 5, 5);
		gbc_panel_135.fill = GridBagConstraints.BOTH;
		gbc_panel_135.gridx = 10;
		gbc_panel_135.gridy = 7;
		panel.add(panel_135, gbc_panel_135);
		
		JPanel panel_134 = new JPanel();
		panel_134.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_134.setBackground(new Color(0, 255, 255));
		panel_134.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_134 = new GridBagConstraints();
		gbc_panel_134.insets = new Insets(0, 0, 5, 5);
		gbc_panel_134.fill = GridBagConstraints.BOTH;
		gbc_panel_134.gridx = 11;
		gbc_panel_134.gridy = 7;
		panel.add(panel_134, gbc_panel_134);
		
		JPanel panel_133 = new JPanel();
		panel_133.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_133.setBackground(new Color(0, 100, 0));
		panel_133.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_133 = new GridBagConstraints();
		gbc_panel_133.insets = new Insets(0, 0, 5, 5);
		gbc_panel_133.fill = GridBagConstraints.BOTH;
		gbc_panel_133.gridx = 12;
		gbc_panel_133.gridy = 7;
		panel.add(panel_133, gbc_panel_133);
		
		JPanel panel_132 = new JPanel();
		panel_132.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_132.setBackground(new Color(0, 100, 0));
		panel_132.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_132 = new GridBagConstraints();
		gbc_panel_132.insets = new Insets(0, 0, 5, 5);
		gbc_panel_132.fill = GridBagConstraints.BOTH;
		gbc_panel_132.gridx = 13;
		gbc_panel_132.gridy = 7;
		panel.add(panel_132, gbc_panel_132);
		
		JPanel panel_99 = new JPanel();
		panel_99.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_99.setBackground(new Color(255, 0, 0));
		panel_99.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_99 = new GridBagConstraints();
		gbc_panel_99.insets = new Insets(0, 0, 5, 0);
		gbc_panel_99.fill = GridBagConstraints.BOTH;
		gbc_panel_99.gridx = 14;
		gbc_panel_99.gridy = 7;
		panel.add(panel_99, gbc_panel_99);
		
		JPanel panel_191 = new JPanel();
		panel_191.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_191.setBackground(new Color(0, 100, 0));
		panel_191.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_191 = new GridBagConstraints();
		gbc_panel_191.insets = new Insets(0, 0, 5, 5);
		gbc_panel_191.fill = GridBagConstraints.BOTH;
		gbc_panel_191.gridx = 0;
		gbc_panel_191.gridy = 8;
		panel.add(panel_191, gbc_panel_191);
		
		JPanel panel_210 = new JPanel();
		panel_210.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_210.setBackground(new Color(0, 100, 0));
		panel_210.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_210 = new GridBagConstraints();
		gbc_panel_210.insets = new Insets(0, 0, 5, 5);
		gbc_panel_210.fill = GridBagConstraints.BOTH;
		gbc_panel_210.gridx = 1;
		gbc_panel_210.gridy = 8;
		panel.add(panel_210, gbc_panel_210);
		
		JPanel panel_211 = new JPanel();
		panel_211.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_211.setBackground(new Color(0, 255, 255));
		panel_211.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_211 = new GridBagConstraints();
		gbc_panel_211.insets = new Insets(0, 0, 5, 5);
		gbc_panel_211.fill = GridBagConstraints.BOTH;
		gbc_panel_211.gridx = 2;
		gbc_panel_211.gridy = 8;
		panel.add(panel_211, gbc_panel_211);
		
		JPanel panel_73 = new JPanel();
		panel_73.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_73.setBackground(new Color(0, 100, 0));
		panel_73.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_73 = new GridBagConstraints();
		gbc_panel_73.insets = new Insets(0, 0, 5, 5);
		gbc_panel_73.fill = GridBagConstraints.BOTH;
		gbc_panel_73.gridx = 3;
		gbc_panel_73.gridy = 8;
		panel.add(panel_73, gbc_panel_73);
		
		JPanel panel_110 = new JPanel();
		panel_110.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_110.setBackground(new Color(0, 100, 0));
		panel_110.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_110 = new GridBagConstraints();
		gbc_panel_110.insets = new Insets(0, 0, 5, 5);
		gbc_panel_110.fill = GridBagConstraints.BOTH;
		gbc_panel_110.gridx = 4;
		gbc_panel_110.gridy = 8;
		panel.add(panel_110, gbc_panel_110);
		
		JPanel panel_109 = new JPanel();
		panel_109.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_109.setBackground(new Color(0, 100, 0));
		panel_109.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_109 = new GridBagConstraints();
		gbc_panel_109.insets = new Insets(0, 0, 5, 5);
		gbc_panel_109.fill = GridBagConstraints.BOTH;
		gbc_panel_109.gridx = 5;
		gbc_panel_109.gridy = 8;
		panel.add(panel_109, gbc_panel_109);
		
		JPanel panel_108 = new JPanel();
		panel_108.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_108.setBackground(new Color(0, 255, 255));
		panel_108.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_108 = new GridBagConstraints();
		gbc_panel_108.insets = new Insets(0, 0, 5, 5);
		gbc_panel_108.fill = GridBagConstraints.BOTH;
		gbc_panel_108.gridx = 6;
		gbc_panel_108.gridy = 8;
		panel.add(panel_108, gbc_panel_108);
		
		JPanel panel_107 = new JPanel();
		panel_107.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_107.setBackground(new Color(0, 100, 0));
		panel_107.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_107 = new GridBagConstraints();
		gbc_panel_107.insets = new Insets(0, 0, 5, 5);
		gbc_panel_107.fill = GridBagConstraints.BOTH;
		gbc_panel_107.gridx = 7;
		gbc_panel_107.gridy = 8;
		panel.add(panel_107, gbc_panel_107);
		
		JPanel panel_106 = new JPanel();
		panel_106.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_106.setBackground(new Color(0, 255, 255));
		panel_106.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_106 = new GridBagConstraints();
		gbc_panel_106.insets = new Insets(0, 0, 5, 5);
		gbc_panel_106.fill = GridBagConstraints.BOTH;
		gbc_panel_106.gridx = 8;
		gbc_panel_106.gridy = 8;
		panel.add(panel_106, gbc_panel_106);
		
		JPanel panel_105 = new JPanel();
		panel_105.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_105.setBackground(new Color(0, 100, 0));
		panel_105.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_105 = new GridBagConstraints();
		gbc_panel_105.insets = new Insets(0, 0, 5, 5);
		gbc_panel_105.fill = GridBagConstraints.BOTH;
		gbc_panel_105.gridx = 9;
		gbc_panel_105.gridy = 8;
		panel.add(panel_105, gbc_panel_105);
		
		JPanel panel_104 = new JPanel();
		panel_104.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_104.setBackground(new Color(0, 100, 0));
		panel_104.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_104 = new GridBagConstraints();
		gbc_panel_104.insets = new Insets(0, 0, 5, 5);
		gbc_panel_104.fill = GridBagConstraints.BOTH;
		gbc_panel_104.gridx = 10;
		gbc_panel_104.gridy = 8;
		panel.add(panel_104, gbc_panel_104);
		
		JPanel panel_103 = new JPanel();
		panel_103.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_103.setBackground(new Color(0, 100, 0));
		panel_103.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_103 = new GridBagConstraints();
		gbc_panel_103.insets = new Insets(0, 0, 5, 5);
		gbc_panel_103.fill = GridBagConstraints.BOTH;
		gbc_panel_103.gridx = 11;
		gbc_panel_103.gridy = 8;
		panel.add(panel_103, gbc_panel_103);
		
		JPanel panel_102 = new JPanel();
		panel_102.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_102.setBackground(new Color(0, 255, 255));
		panel_102.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_102 = new GridBagConstraints();
		gbc_panel_102.insets = new Insets(0, 0, 5, 5);
		gbc_panel_102.fill = GridBagConstraints.BOTH;
		gbc_panel_102.gridx = 12;
		gbc_panel_102.gridy = 8;
		panel.add(panel_102, gbc_panel_102);
		
		JPanel panel_101 = new JPanel();
		panel_101.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_101.setBackground(new Color(0, 100, 0));
		panel_101.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_101 = new GridBagConstraints();
		gbc_panel_101.insets = new Insets(0, 0, 5, 5);
		gbc_panel_101.fill = GridBagConstraints.BOTH;
		gbc_panel_101.gridx = 13;
		gbc_panel_101.gridy = 8;
		panel.add(panel_101, gbc_panel_101);
		
		JPanel panel_100 = new JPanel();
		panel_100.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_100.setBackground(new Color(0, 100, 0));
		panel_100.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_100 = new GridBagConstraints();
		gbc_panel_100.insets = new Insets(0, 0, 5, 0);
		gbc_panel_100.fill = GridBagConstraints.BOTH;
		gbc_panel_100.gridx = 14;
		gbc_panel_100.gridy = 8;
		panel.add(panel_100, gbc_panel_100);
		
		JPanel panel_192 = new JPanel();
		panel_192.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_192.setBackground(new Color(0, 100, 0));
		panel_192.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_192 = new GridBagConstraints();
		gbc_panel_192.insets = new Insets(0, 0, 5, 5);
		gbc_panel_192.fill = GridBagConstraints.BOTH;
		gbc_panel_192.gridx = 0;
		gbc_panel_192.gridy = 9;
		panel.add(panel_192, gbc_panel_192);
		
		JPanel panel_209 = new JPanel();
		panel_209.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_209.setBackground(new Color(0, 0, 255));
		panel_209.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_209 = new GridBagConstraints();
		gbc_panel_209.insets = new Insets(0, 0, 5, 5);
		gbc_panel_209.fill = GridBagConstraints.BOTH;
		gbc_panel_209.gridx = 1;
		gbc_panel_209.gridy = 9;
		panel.add(panel_209, gbc_panel_209);
		
		JPanel panel_208 = new JPanel();
		panel_208.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_208.setBackground(new Color(0, 100, 0));
		panel_208.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_208 = new GridBagConstraints();
		gbc_panel_208.insets = new Insets(0, 0, 5, 5);
		gbc_panel_208.fill = GridBagConstraints.BOTH;
		gbc_panel_208.gridx = 2;
		gbc_panel_208.gridy = 9;
		panel.add(panel_208, gbc_panel_208);
		
		JPanel panel_72 = new JPanel();
		panel_72.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_72.setBackground(new Color(0, 100, 0));
		panel_72.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_72 = new GridBagConstraints();
		gbc_panel_72.insets = new Insets(0, 0, 5, 5);
		gbc_panel_72.fill = GridBagConstraints.BOTH;
		gbc_panel_72.gridx = 3;
		gbc_panel_72.gridy = 9;
		panel.add(panel_72, gbc_panel_72);
		
		JPanel panel_71 = new JPanel();
		panel_71.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_71.setBackground(new Color(0, 100, 0));
		panel_71.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_71 = new GridBagConstraints();
		gbc_panel_71.insets = new Insets(0, 0, 5, 5);
		gbc_panel_71.fill = GridBagConstraints.BOTH;
		gbc_panel_71.gridx = 4;
		gbc_panel_71.gridy = 9;
		panel.add(panel_71, gbc_panel_71);
		
		JPanel panel_70 = new JPanel();
		panel_70.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_70.setBackground(new Color(0, 0, 255));
		panel_70.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_70 = new GridBagConstraints();
		gbc_panel_70.insets = new Insets(0, 0, 5, 5);
		gbc_panel_70.fill = GridBagConstraints.BOTH;
		gbc_panel_70.gridx = 5;
		gbc_panel_70.gridy = 9;
		panel.add(panel_70, gbc_panel_70);
		
		JPanel panel_69 = new JPanel();
		panel_69.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_69.setBackground(new Color(0, 100, 0));
		panel_69.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_69 = new GridBagConstraints();
		gbc_panel_69.insets = new Insets(0, 0, 5, 5);
		gbc_panel_69.fill = GridBagConstraints.BOTH;
		gbc_panel_69.gridx = 6;
		gbc_panel_69.gridy = 9;
		panel.add(panel_69, gbc_panel_69);
		
		JPanel panel_68 = new JPanel();
		panel_68.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_68.setBackground(new Color(0, 100, 0));
		panel_68.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_68 = new GridBagConstraints();
		gbc_panel_68.insets = new Insets(0, 0, 5, 5);
		gbc_panel_68.fill = GridBagConstraints.BOTH;
		gbc_panel_68.gridx = 7;
		gbc_panel_68.gridy = 9;
		panel.add(panel_68, gbc_panel_68);
		
		JPanel panel_67 = new JPanel();
		panel_67.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_67.setBackground(new Color(0, 100, 0));
		panel_67.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_67 = new GridBagConstraints();
		gbc_panel_67.insets = new Insets(0, 0, 5, 5);
		gbc_panel_67.fill = GridBagConstraints.BOTH;
		gbc_panel_67.gridx = 8;
		gbc_panel_67.gridy = 9;
		panel.add(panel_67, gbc_panel_67);
		
		JPanel panel_66 = new JPanel();
		panel_66.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_66.setBackground(new Color(0, 0, 255));
		panel_66.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_66 = new GridBagConstraints();
		gbc_panel_66.insets = new Insets(0, 0, 5, 5);
		gbc_panel_66.fill = GridBagConstraints.BOTH;
		gbc_panel_66.gridx = 9;
		gbc_panel_66.gridy = 9;
		panel.add(panel_66, gbc_panel_66);
		
		JPanel panel_65 = new JPanel();
		panel_65.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_65.setBackground(new Color(0, 100, 0));
		panel_65.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_65 = new GridBagConstraints();
		gbc_panel_65.insets = new Insets(0, 0, 5, 5);
		gbc_panel_65.fill = GridBagConstraints.BOTH;
		gbc_panel_65.gridx = 10;
		gbc_panel_65.gridy = 9;
		panel.add(panel_65, gbc_panel_65);
		
		JPanel panel_64 = new JPanel();
		panel_64.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_64.setBackground(new Color(0, 100, 0));
		panel_64.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_64 = new GridBagConstraints();
		gbc_panel_64.insets = new Insets(0, 0, 5, 5);
		gbc_panel_64.fill = GridBagConstraints.BOTH;
		gbc_panel_64.gridx = 11;
		gbc_panel_64.gridy = 9;
		panel.add(panel_64, gbc_panel_64);
		
		JPanel panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_63.setBackground(new Color(0, 100, 0));
		panel_63.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_63 = new GridBagConstraints();
		gbc_panel_63.insets = new Insets(0, 0, 5, 5);
		gbc_panel_63.fill = GridBagConstraints.BOTH;
		gbc_panel_63.gridx = 12;
		gbc_panel_63.gridy = 9;
		panel.add(panel_63, gbc_panel_63);
		
		JPanel panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_62.setBackground(new Color(0, 0, 255));
		panel_62.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_62 = new GridBagConstraints();
		gbc_panel_62.insets = new Insets(0, 0, 5, 5);
		gbc_panel_62.fill = GridBagConstraints.BOTH;
		gbc_panel_62.gridx = 13;
		gbc_panel_62.gridy = 9;
		panel.add(panel_62, gbc_panel_62);
		
		JPanel panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_61.setBackground(new Color(0, 100, 0));
		panel_61.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_61 = new GridBagConstraints();
		gbc_panel_61.insets = new Insets(0, 0, 5, 0);
		gbc_panel_61.fill = GridBagConstraints.BOTH;
		gbc_panel_61.gridx = 14;
		gbc_panel_61.gridy = 9;
		panel.add(panel_61, gbc_panel_61);
		
		JPanel panel_193 = new JPanel();
		panel_193.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_193.setBackground(new Color(0, 100, 0));
		panel_193.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_193 = new GridBagConstraints();
		gbc_panel_193.insets = new Insets(0, 0, 5, 5);
		gbc_panel_193.fill = GridBagConstraints.BOTH;
		gbc_panel_193.gridx = 0;
		gbc_panel_193.gridy = 10;
		panel.add(panel_193, gbc_panel_193);
		
		JPanel panel_206 = new JPanel();
		panel_206.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_206.setBackground(new Color(0, 100, 0));
		panel_206.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_206 = new GridBagConstraints();
		gbc_panel_206.insets = new Insets(0, 0, 5, 5);
		gbc_panel_206.fill = GridBagConstraints.BOTH;
		gbc_panel_206.gridx = 1;
		gbc_panel_206.gridy = 10;
		panel.add(panel_206, gbc_panel_206);
		
		JPanel panel_207 = new JPanel();
		panel_207.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_207.setBackground(new Color(0, 100, 0));
		panel_207.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_207 = new GridBagConstraints();
		gbc_panel_207.insets = new Insets(0, 0, 5, 5);
		gbc_panel_207.fill = GridBagConstraints.BOTH;
		gbc_panel_207.gridx = 2;
		gbc_panel_207.gridy = 10;
		panel.add(panel_207, gbc_panel_207);
		
		JPanel panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_49.setBackground(new Color(0, 100, 0));
		panel_49.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_49 = new GridBagConstraints();
		gbc_panel_49.insets = new Insets(0, 0, 5, 5);
		gbc_panel_49.fill = GridBagConstraints.BOTH;
		gbc_panel_49.gridx = 3;
		gbc_panel_49.gridy = 10;
		panel.add(panel_49, gbc_panel_49);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_50.setBackground(new Color(250, 128, 114));
		panel_50.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_50 = new GridBagConstraints();
		gbc_panel_50.insets = new Insets(0, 0, 5, 5);
		gbc_panel_50.fill = GridBagConstraints.BOTH;
		gbc_panel_50.gridx = 4;
		gbc_panel_50.gridy = 10;
		panel.add(panel_50, gbc_panel_50);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_51.setBackground(new Color(0, 100, 0));
		panel_51.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_51 = new GridBagConstraints();
		gbc_panel_51.insets = new Insets(0, 0, 5, 5);
		gbc_panel_51.fill = GridBagConstraints.BOTH;
		gbc_panel_51.gridx = 5;
		gbc_panel_51.gridy = 10;
		panel.add(panel_51, gbc_panel_51);
		
		JPanel panel_52 = new JPanel();
		panel_52.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_52.setBackground(new Color(0, 100, 0));
		panel_52.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_52 = new GridBagConstraints();
		gbc_panel_52.insets = new Insets(0, 0, 5, 5);
		gbc_panel_52.fill = GridBagConstraints.BOTH;
		gbc_panel_52.gridx = 6;
		gbc_panel_52.gridy = 10;
		panel.add(panel_52, gbc_panel_52);
		
		JPanel panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_53.setBackground(new Color(0, 100, 0));
		panel_53.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_53 = new GridBagConstraints();
		gbc_panel_53.insets = new Insets(0, 0, 5, 5);
		gbc_panel_53.fill = GridBagConstraints.BOTH;
		gbc_panel_53.gridx = 7;
		gbc_panel_53.gridy = 10;
		panel.add(panel_53, gbc_panel_53);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_54.setBackground(new Color(0, 100, 0));
		panel_54.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_54 = new GridBagConstraints();
		gbc_panel_54.insets = new Insets(0, 0, 5, 5);
		gbc_panel_54.fill = GridBagConstraints.BOTH;
		gbc_panel_54.gridx = 8;
		gbc_panel_54.gridy = 10;
		panel.add(panel_54, gbc_panel_54);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_55.setBackground(new Color(0, 100, 0));
		panel_55.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_55 = new GridBagConstraints();
		gbc_panel_55.insets = new Insets(0, 0, 5, 5);
		gbc_panel_55.fill = GridBagConstraints.BOTH;
		gbc_panel_55.gridx = 9;
		gbc_panel_55.gridy = 10;
		panel.add(panel_55, gbc_panel_55);
		
		JPanel panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_56.setBackground(new Color(250, 128, 114));
		panel_56.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_56 = new GridBagConstraints();
		gbc_panel_56.insets = new Insets(0, 0, 5, 5);
		gbc_panel_56.fill = GridBagConstraints.BOTH;
		gbc_panel_56.gridx = 10;
		gbc_panel_56.gridy = 10;
		panel.add(panel_56, gbc_panel_56);
		
		JPanel panel_57 = new JPanel();
		panel_57.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_57.setBackground(new Color(0, 100, 0));
		panel_57.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_57 = new GridBagConstraints();
		gbc_panel_57.insets = new Insets(0, 0, 5, 5);
		gbc_panel_57.fill = GridBagConstraints.BOTH;
		gbc_panel_57.gridx = 11;
		gbc_panel_57.gridy = 10;
		panel.add(panel_57, gbc_panel_57);
		
		JPanel panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_58.setBackground(new Color(0, 100, 0));
		panel_58.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_58 = new GridBagConstraints();
		gbc_panel_58.insets = new Insets(0, 0, 5, 5);
		gbc_panel_58.fill = GridBagConstraints.BOTH;
		gbc_panel_58.gridx = 12;
		gbc_panel_58.gridy = 10;
		panel.add(panel_58, gbc_panel_58);
		
		JPanel panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_59.setBackground(new Color(0, 100, 0));
		panel_59.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_59 = new GridBagConstraints();
		gbc_panel_59.insets = new Insets(0, 0, 5, 5);
		gbc_panel_59.fill = GridBagConstraints.BOTH;
		gbc_panel_59.gridx = 13;
		gbc_panel_59.gridy = 10;
		panel.add(panel_59, gbc_panel_59);
		
		JPanel panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_60.setBackground(new Color(0, 100, 0));
		panel_60.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_60 = new GridBagConstraints();
		gbc_panel_60.insets = new Insets(0, 0, 5, 0);
		gbc_panel_60.fill = GridBagConstraints.BOTH;
		gbc_panel_60.gridx = 14;
		gbc_panel_60.gridy = 10;
		panel.add(panel_60, gbc_panel_60);
		
		JPanel panel_194 = new JPanel();
		panel_194.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_194.setBackground(new Color(0, 255, 255));
		panel_194.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_194 = new GridBagConstraints();
		gbc_panel_194.insets = new Insets(0, 0, 5, 5);
		gbc_panel_194.fill = GridBagConstraints.BOTH;
		gbc_panel_194.gridx = 0;
		gbc_panel_194.gridy = 11;
		panel.add(panel_194, gbc_panel_194);
		
		JPanel panel_205 = new JPanel();
		panel_205.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_205.setBackground(new Color(0, 100, 0));
		panel_205.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_205 = new GridBagConstraints();
		gbc_panel_205.insets = new Insets(0, 0, 5, 5);
		gbc_panel_205.fill = GridBagConstraints.BOTH;
		gbc_panel_205.gridx = 1;
		gbc_panel_205.gridy = 11;
		panel.add(panel_205, gbc_panel_205);
		
		JPanel panel_204 = new JPanel();
		panel_204.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_204.setBackground(new Color(0, 100, 0));
		panel_204.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_204 = new GridBagConstraints();
		gbc_panel_204.insets = new Insets(0, 0, 5, 5);
		gbc_panel_204.fill = GridBagConstraints.BOTH;
		gbc_panel_204.gridx = 2;
		gbc_panel_204.gridy = 11;
		panel.add(panel_204, gbc_panel_204);
		
		JPanel panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_48.setBackground(new Color(250, 128, 114));
		panel_48.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_48 = new GridBagConstraints();
		gbc_panel_48.insets = new Insets(0, 0, 5, 5);
		gbc_panel_48.fill = GridBagConstraints.BOTH;
		gbc_panel_48.gridx = 3;
		gbc_panel_48.gridy = 11;
		panel.add(panel_48, gbc_panel_48);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_47.setBackground(new Color(0, 100, 0));
		panel_47.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_47 = new GridBagConstraints();
		gbc_panel_47.insets = new Insets(0, 0, 5, 5);
		gbc_panel_47.fill = GridBagConstraints.BOTH;
		gbc_panel_47.gridx = 4;
		gbc_panel_47.gridy = 11;
		panel.add(panel_47, gbc_panel_47);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_46.setBackground(new Color(0, 100, 0));
		panel_46.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_46 = new GridBagConstraints();
		gbc_panel_46.insets = new Insets(0, 0, 5, 5);
		gbc_panel_46.fill = GridBagConstraints.BOTH;
		gbc_panel_46.gridx = 5;
		gbc_panel_46.gridy = 11;
		panel.add(panel_46, gbc_panel_46);
		
		JPanel panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_45.setBackground(new Color(0, 100, 0));
		panel_45.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_45 = new GridBagConstraints();
		gbc_panel_45.insets = new Insets(0, 0, 5, 5);
		gbc_panel_45.fill = GridBagConstraints.BOTH;
		gbc_panel_45.gridx = 6;
		gbc_panel_45.gridy = 11;
		panel.add(panel_45, gbc_panel_45);
		
		JPanel panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_44.setBackground(new Color(0, 255, 255));
		panel_44.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_44 = new GridBagConstraints();
		gbc_panel_44.insets = new Insets(0, 0, 5, 5);
		gbc_panel_44.fill = GridBagConstraints.BOTH;
		gbc_panel_44.gridx = 7;
		gbc_panel_44.gridy = 11;
		panel.add(panel_44, gbc_panel_44);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_43.setBackground(new Color(0, 100, 0));
		panel_43.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_43 = new GridBagConstraints();
		gbc_panel_43.insets = new Insets(0, 0, 5, 5);
		gbc_panel_43.fill = GridBagConstraints.BOTH;
		gbc_panel_43.gridx = 8;
		gbc_panel_43.gridy = 11;
		panel.add(panel_43, gbc_panel_43);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_42.setBackground(new Color(0, 100, 0));
		panel_42.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_42 = new GridBagConstraints();
		gbc_panel_42.insets = new Insets(0, 0, 5, 5);
		gbc_panel_42.fill = GridBagConstraints.BOTH;
		gbc_panel_42.gridx = 9;
		gbc_panel_42.gridy = 11;
		panel.add(panel_42, gbc_panel_42);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_41.setBackground(new Color(0, 100, 0));
		panel_41.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_41 = new GridBagConstraints();
		gbc_panel_41.insets = new Insets(0, 0, 5, 5);
		gbc_panel_41.fill = GridBagConstraints.BOTH;
		gbc_panel_41.gridx = 10;
		gbc_panel_41.gridy = 11;
		panel.add(panel_41, gbc_panel_41);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_40.setBackground(new Color(250, 128, 114));
		panel_40.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_40 = new GridBagConstraints();
		gbc_panel_40.insets = new Insets(0, 0, 5, 5);
		gbc_panel_40.fill = GridBagConstraints.BOTH;
		gbc_panel_40.gridx = 11;
		gbc_panel_40.gridy = 11;
		panel.add(panel_40, gbc_panel_40);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_39.setBackground(new Color(0, 100, 0));
		panel_39.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_39 = new GridBagConstraints();
		gbc_panel_39.insets = new Insets(0, 0, 5, 5);
		gbc_panel_39.fill = GridBagConstraints.BOTH;
		gbc_panel_39.gridx = 12;
		gbc_panel_39.gridy = 11;
		panel.add(panel_39, gbc_panel_39);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_38.setBackground(new Color(0, 100, 0));
		panel_38.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_38 = new GridBagConstraints();
		gbc_panel_38.insets = new Insets(0, 0, 5, 5);
		gbc_panel_38.fill = GridBagConstraints.BOTH;
		gbc_panel_38.gridx = 13;
		gbc_panel_38.gridy = 11;
		panel.add(panel_38, gbc_panel_38);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_37.setBackground(new Color(0, 255, 255));
		panel_37.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_37 = new GridBagConstraints();
		gbc_panel_37.insets = new Insets(0, 0, 5, 0);
		gbc_panel_37.fill = GridBagConstraints.BOTH;
		gbc_panel_37.gridx = 14;
		gbc_panel_37.gridy = 11;
		panel.add(panel_37, gbc_panel_37);
		
		JPanel panel_195 = new JPanel();
		panel_195.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_195.setBackground(new Color(0, 100, 0));
		panel_195.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_195 = new GridBagConstraints();
		gbc_panel_195.insets = new Insets(0, 0, 5, 5);
		gbc_panel_195.fill = GridBagConstraints.BOTH;
		gbc_panel_195.gridx = 0;
		gbc_panel_195.gridy = 12;
		panel.add(panel_195, gbc_panel_195);
		
		JPanel panel_202 = new JPanel();
		panel_202.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_202.setBackground(new Color(0, 100, 0));
		panel_202.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_202 = new GridBagConstraints();
		gbc_panel_202.insets = new Insets(0, 0, 5, 5);
		gbc_panel_202.fill = GridBagConstraints.BOTH;
		gbc_panel_202.gridx = 1;
		gbc_panel_202.gridy = 12;
		panel.add(panel_202, gbc_panel_202);
		
		JPanel panel_203 = new JPanel();
		panel_203.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_203.setBackground(new Color(250, 128, 114));
		panel_203.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_203 = new GridBagConstraints();
		gbc_panel_203.insets = new Insets(0, 0, 5, 5);
		gbc_panel_203.fill = GridBagConstraints.BOTH;
		gbc_panel_203.gridx = 2;
		gbc_panel_203.gridy = 12;
		panel.add(panel_203, gbc_panel_203);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_25.setBackground(new Color(0, 100, 0));
		panel_25.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_25 = new GridBagConstraints();
		gbc_panel_25.insets = new Insets(0, 0, 5, 5);
		gbc_panel_25.fill = GridBagConstraints.BOTH;
		gbc_panel_25.gridx = 3;
		gbc_panel_25.gridy = 12;
		panel.add(panel_25, gbc_panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_26.setBackground(new Color(0, 100, 0));
		panel_26.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_26 = new GridBagConstraints();
		gbc_panel_26.insets = new Insets(0, 0, 5, 5);
		gbc_panel_26.fill = GridBagConstraints.BOTH;
		gbc_panel_26.gridx = 4;
		gbc_panel_26.gridy = 12;
		panel.add(panel_26, gbc_panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_27.setBackground(new Color(0, 100, 0));
		panel_27.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_27 = new GridBagConstraints();
		gbc_panel_27.insets = new Insets(0, 0, 5, 5);
		gbc_panel_27.fill = GridBagConstraints.BOTH;
		gbc_panel_27.gridx = 5;
		gbc_panel_27.gridy = 12;
		panel.add(panel_27, gbc_panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_28.setBackground(new Color(0, 255, 255));
		panel_28.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_28 = new GridBagConstraints();
		gbc_panel_28.insets = new Insets(0, 0, 5, 5);
		gbc_panel_28.fill = GridBagConstraints.BOTH;
		gbc_panel_28.gridx = 6;
		gbc_panel_28.gridy = 12;
		panel.add(panel_28, gbc_panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_29.setBackground(new Color(0, 100, 0));
		panel_29.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_29 = new GridBagConstraints();
		gbc_panel_29.insets = new Insets(0, 0, 5, 5);
		gbc_panel_29.fill = GridBagConstraints.BOTH;
		gbc_panel_29.gridx = 7;
		gbc_panel_29.gridy = 12;
		panel.add(panel_29, gbc_panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_30.setBackground(new Color(0, 255, 255));
		panel_30.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_30 = new GridBagConstraints();
		gbc_panel_30.insets = new Insets(0, 0, 5, 5);
		gbc_panel_30.fill = GridBagConstraints.BOTH;
		gbc_panel_30.gridx = 8;
		gbc_panel_30.gridy = 12;
		panel.add(panel_30, gbc_panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_31.setBackground(new Color(0, 100, 0));
		panel_31.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_31 = new GridBagConstraints();
		gbc_panel_31.insets = new Insets(0, 0, 5, 5);
		gbc_panel_31.fill = GridBagConstraints.BOTH;
		gbc_panel_31.gridx = 9;
		gbc_panel_31.gridy = 12;
		panel.add(panel_31, gbc_panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_32.setBackground(new Color(0, 100, 0));
		panel_32.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_32 = new GridBagConstraints();
		gbc_panel_32.insets = new Insets(0, 0, 5, 5);
		gbc_panel_32.fill = GridBagConstraints.BOTH;
		gbc_panel_32.gridx = 10;
		gbc_panel_32.gridy = 12;
		panel.add(panel_32, gbc_panel_32);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_33.setBackground(new Color(0, 100, 0));
		panel_33.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_33 = new GridBagConstraints();
		gbc_panel_33.insets = new Insets(0, 0, 5, 5);
		gbc_panel_33.fill = GridBagConstraints.BOTH;
		gbc_panel_33.gridx = 11;
		gbc_panel_33.gridy = 12;
		panel.add(panel_33, gbc_panel_33);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_34.setBackground(new Color(250, 128, 114));
		panel_34.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_34 = new GridBagConstraints();
		gbc_panel_34.insets = new Insets(0, 0, 5, 5);
		gbc_panel_34.fill = GridBagConstraints.BOTH;
		gbc_panel_34.gridx = 12;
		gbc_panel_34.gridy = 12;
		panel.add(panel_34, gbc_panel_34);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_35.setBackground(new Color(0, 100, 0));
		panel_35.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_35 = new GridBagConstraints();
		gbc_panel_35.insets = new Insets(0, 0, 5, 5);
		gbc_panel_35.fill = GridBagConstraints.BOTH;
		gbc_panel_35.gridx = 13;
		gbc_panel_35.gridy = 12;
		panel.add(panel_35, gbc_panel_35);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_36.setBackground(new Color(0, 100, 0));
		panel_36.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_36 = new GridBagConstraints();
		gbc_panel_36.insets = new Insets(0, 0, 5, 0);
		gbc_panel_36.fill = GridBagConstraints.BOTH;
		gbc_panel_36.gridx = 14;
		gbc_panel_36.gridy = 12;
		panel.add(panel_36, gbc_panel_36);
		
		JPanel panel_196 = new JPanel();
		panel_196.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_196.setBackground(new Color(0, 100, 0));
		panel_196.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_196 = new GridBagConstraints();
		gbc_panel_196.insets = new Insets(0, 0, 5, 5);
		gbc_panel_196.fill = GridBagConstraints.BOTH;
		gbc_panel_196.gridx = 0;
		gbc_panel_196.gridy = 13;
		panel.add(panel_196, gbc_panel_196);
		
		JPanel panel_201 = new JPanel();
		panel_201.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_201.setBackground(new Color(250, 128, 114));
		panel_201.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_201 = new GridBagConstraints();
		gbc_panel_201.insets = new Insets(0, 0, 5, 5);
		gbc_panel_201.fill = GridBagConstraints.BOTH;
		gbc_panel_201.gridx = 1;
		gbc_panel_201.gridy = 13;
		panel.add(panel_201, gbc_panel_201);
		
		JPanel panel_200 = new JPanel();
		panel_200.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_200.setBackground(new Color(0, 100, 0));
		panel_200.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_200 = new GridBagConstraints();
		gbc_panel_200.insets = new Insets(0, 0, 5, 5);
		gbc_panel_200.fill = GridBagConstraints.BOTH;
		gbc_panel_200.gridx = 2;
		gbc_panel_200.gridy = 13;
		panel.add(panel_200, gbc_panel_200);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_13.setBackground(new Color(0, 100, 0));
		panel_13.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_13 = new GridBagConstraints();
		gbc_panel_13.insets = new Insets(0, 0, 5, 5);
		gbc_panel_13.fill = GridBagConstraints.BOTH;
		gbc_panel_13.gridx = 3;
		gbc_panel_13.gridy = 13;
		panel.add(panel_13, gbc_panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_14.setBackground(new Color(0, 100, 0));
		panel_14.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.insets = new Insets(0, 0, 5, 5);
		gbc_panel_14.fill = GridBagConstraints.BOTH;
		gbc_panel_14.gridx = 4;
		gbc_panel_14.gridy = 13;
		panel.add(panel_14, gbc_panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_15.setBackground(new Color(0, 0, 255));
		panel_15.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.insets = new Insets(0, 0, 5, 5);
		gbc_panel_15.fill = GridBagConstraints.BOTH;
		gbc_panel_15.gridx = 5;
		gbc_panel_15.gridy = 13;
		panel.add(panel_15, gbc_panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_16.setBackground(new Color(0, 100, 0));
		panel_16.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.insets = new Insets(0, 0, 5, 5);
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.gridx = 6;
		gbc_panel_16.gridy = 13;
		panel.add(panel_16, gbc_panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_17.setBackground(new Color(0, 100, 0));
		panel_17.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.insets = new Insets(0, 0, 5, 5);
		gbc_panel_17.fill = GridBagConstraints.BOTH;
		gbc_panel_17.gridx = 7;
		gbc_panel_17.gridy = 13;
		panel.add(panel_17, gbc_panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_18.setBackground(new Color(0, 100, 0));
		panel_18.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_18 = new GridBagConstraints();
		gbc_panel_18.insets = new Insets(0, 0, 5, 5);
		gbc_panel_18.fill = GridBagConstraints.BOTH;
		gbc_panel_18.gridx = 8;
		gbc_panel_18.gridy = 13;
		panel.add(panel_18, gbc_panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_19.setBackground(new Color(0, 0, 255));
		panel_19.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_19 = new GridBagConstraints();
		gbc_panel_19.insets = new Insets(0, 0, 5, 5);
		gbc_panel_19.fill = GridBagConstraints.BOTH;
		gbc_panel_19.gridx = 9;
		gbc_panel_19.gridy = 13;
		panel.add(panel_19, gbc_panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_20.setBackground(new Color(0, 100, 0));
		panel_20.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_20 = new GridBagConstraints();
		gbc_panel_20.insets = new Insets(0, 0, 5, 5);
		gbc_panel_20.fill = GridBagConstraints.BOTH;
		gbc_panel_20.gridx = 10;
		gbc_panel_20.gridy = 13;
		panel.add(panel_20, gbc_panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_21.setBackground(new Color(0, 100, 0));
		panel_21.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_21 = new GridBagConstraints();
		gbc_panel_21.insets = new Insets(0, 0, 5, 5);
		gbc_panel_21.fill = GridBagConstraints.BOTH;
		gbc_panel_21.gridx = 11;
		gbc_panel_21.gridy = 13;
		panel.add(panel_21, gbc_panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_22.setBackground(new Color(0, 100, 0));
		panel_22.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_22 = new GridBagConstraints();
		gbc_panel_22.insets = new Insets(0, 0, 5, 5);
		gbc_panel_22.fill = GridBagConstraints.BOTH;
		gbc_panel_22.gridx = 12;
		gbc_panel_22.gridy = 13;
		panel.add(panel_22, gbc_panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_23.setBackground(new Color(250, 128, 114));
		panel_23.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_23 = new GridBagConstraints();
		gbc_panel_23.insets = new Insets(0, 0, 5, 5);
		gbc_panel_23.fill = GridBagConstraints.BOTH;
		gbc_panel_23.gridx = 13;
		gbc_panel_23.gridy = 13;
		panel.add(panel_23, gbc_panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_24.setBackground(new Color(0, 100, 0));
		panel_24.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_24 = new GridBagConstraints();
		gbc_panel_24.insets = new Insets(0, 0, 5, 0);
		gbc_panel_24.fill = GridBagConstraints.BOTH;
		gbc_panel_24.gridx = 14;
		gbc_panel_24.gridy = 13;
		panel.add(panel_24, gbc_panel_24);
		
		JPanel panel_197 = new JPanel();
		panel_197.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_197.setBackground(new Color(255, 0, 0));
		panel_197.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_197 = new GridBagConstraints();
		gbc_panel_197.insets = new Insets(0, 0, 0, 5);
		gbc_panel_197.fill = GridBagConstraints.BOTH;
		gbc_panel_197.gridx = 0;
		gbc_panel_197.gridy = 14;
		panel.add(panel_197, gbc_panel_197);
		
		JPanel panel_198 = new JPanel();
		panel_198.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_198.setBackground(new Color(0, 100, 0));
		panel_198.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_198 = new GridBagConstraints();
		gbc_panel_198.insets = new Insets(0, 0, 0, 5);
		gbc_panel_198.fill = GridBagConstraints.BOTH;
		gbc_panel_198.gridx = 1;
		gbc_panel_198.gridy = 14;
		panel.add(panel_198, gbc_panel_198);
		
		JPanel panel_199 = new JPanel();
		panel_199.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_199.setBackground(new Color(0, 100, 0));
		panel_199.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_199 = new GridBagConstraints();
		gbc_panel_199.insets = new Insets(0, 0, 0, 5);
		gbc_panel_199.fill = GridBagConstraints.BOTH;
		gbc_panel_199.gridx = 2;
		gbc_panel_199.gridy = 14;
		panel.add(panel_199, gbc_panel_199);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12.setBackground(new Color(0, 255, 255));
		panel_12.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 0, 5);
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 3;
		gbc_panel_12.gridy = 14;
		panel.add(panel_12, gbc_panel_12);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBackground(new Color(0, 100, 0));
		panel_11.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 0, 5);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 4;
		gbc_panel_11.gridy = 14;
		panel.add(panel_11, gbc_panel_11);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setBackground(new Color(0, 100, 0));
		panel_10.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 0, 5);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 5;
		gbc_panel_10.gridy = 14;
		panel.add(panel_10, gbc_panel_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBackground(new Color(0, 100, 0));
		panel_9.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 0, 5);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 6;
		gbc_panel_9.gridy = 14;
		panel.add(panel_9, gbc_panel_9);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBackground(new Color(255, 0, 0));
		panel_8.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 0, 5);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 7;
		gbc_panel_8.gridy = 14;
		panel.add(panel_8, gbc_panel_8);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBackground(new Color(0, 100, 0));
		panel_7.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 0, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 8;
		gbc_panel_7.gridy = 14;
		panel.add(panel_7, gbc_panel_7);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(new Color(0, 100, 0));
		panel_6.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 9;
		gbc_panel_6.gridy = 14;
		panel.add(panel_6, gbc_panel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(new Color(0, 100, 0));
		panel_5.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 0, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 10;
		gbc_panel_5.gridy = 14;
		panel.add(panel_5, gbc_panel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(new Color(0, 255, 255));
		panel_4.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 0, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 11;
		gbc_panel_4.gridy = 14;
		panel.add(panel_4, gbc_panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(0, 100, 0));
		panel_3.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 12;
		gbc_panel_3.gridy = 14;
		panel.add(panel_3, gbc_panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(0, 100, 0));
		panel_2.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 13;
		gbc_panel_2.gridy = 14;
		panel.add(panel_2, gbc_panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setForeground(new Color(188, 143, 143));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 14;
		gbc_panel_1.gridy = 14;
		panel.add(panel_1, gbc_panel_1);
		

		
		JButton btnJouer = new JButton("JOUER");
		btnJouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJouer.setBounds(211, 531, 89, 23);
		frame.getContentPane().add(btnJouer);
	}
	
		public void AfficherChevalet(Joueur j){
			
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
		gbc_panel_1.insets= new Insets(0, 0, 5, 5);
		panel.add(image, gbc_panel_1);
	}
	
	// on affiche les lettres des joueur
	public void lesJoueurs(Joueur j1, Joueur j2, Joueur j3, Joueur j4){
		txtJoueur = new JTextField();
		txtJoueur.setText("Joueur 1");
		txtJoueur.setBounds(559, 83, 86, 20);
		this.frame.getContentPane().add(txtJoueur);
		txtJoueur.setColumns(10);
		j1.voirChevaletDu(panelj1);
		
		txtJoueur_1 = new JTextField();
		txtJoueur_1.setText("Joueur 2");
		txtJoueur_1.setBounds(559, 197, 86, 20);
		this.frame.getContentPane().add(txtJoueur_1);
		txtJoueur_1.setColumns(10);
		j2.voirChevaletDu(panelj2);

		
		
		txtJoueur_2 = new JTextField();
		txtJoueur_2.setText("Joueur 3");
		txtJoueur_2.setBounds(559, 315, 86, 20);
		this.frame.getContentPane().add(txtJoueur_2);
		txtJoueur_2.setColumns(10);
		j3.voirChevaletDu(panelj3);

		
		
		txtJoueur_3 = new JTextField();
		txtJoueur_3.setText("Joueur 4");
		txtJoueur_3.setBounds(559, 426, 86, 20);
		this.frame.getContentPane().add(txtJoueur_3);
		txtJoueur_3.setColumns(10);
		j4.voirChevaletDu(panelj4);

		
		
	}
	
	  public Position mouseClicked(MouseEvent event) { 

		GridBagLayout layoutManager = (GridBagLayout)panel.getLayout();
		GridBagConstraints constraints = layoutManager.getConstraints(panelj1);
		int row = constraints.gridy;
		int column = constraints.gridx;
	
		return new Position(row, column);
	  }
	}



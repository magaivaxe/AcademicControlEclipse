package mainPack;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mainPack.Global.Student;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MainForme extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	static MainForme current;
	
	class MyTableModel extends DefaultTableModel
	{
		//Columns Names
		private String columnNames [] = {"ID","Pré-nom","Nom","Mi-session","Project","Examen Final","Moyenne","Status"};
		//Constructor
		public MyTableModel()
		{
			super();
			this.setColumnCount(columnNames.length);
			this.setColumnIdentifiers(columnNames);
			this.setRowCount(0);
		}
		//
		public void setList(ArrayList<Student> list, int actual_length)
		{
			this.setRowCount(0);
			for(int i = 0; i < actual_length; i++)
			{
				Object [] ligne = new Object [columnNames.length];
				ligne[0] = list.get(i).id;
				ligne[1] = list.get(i).prenom;
				ligne[2] = list.get(i).nom;
				ligne[3] = list.get(i).miSession;
				ligne[4] = list.get(i).projet;
				ligne[5] = list.get(i).examenFinal;
				ligne[6] = list.get(i).moyenne;
				ligne[7] = list.get(i).status;
				this.addRow(ligne);
			}
		}
		//
		public Object [] getRow(int row)
		{
			Object [] ligne = new Object [columnNames.length];
			ligne[0] = this.getValueAt(row, 0);
			ligne[1] = this.getValueAt(row, 1);
			ligne[2] = this.getValueAt(row, 2);
			ligne[3] = this.getValueAt(row, 3);
			ligne[4] = this.getValueAt(row, 4);
			ligne[5] = this.getValueAt(row, 5);
			ligne[6] = this.getValueAt(row, 6);
			ligne[7] = this.getValueAt(row, 7);
			return ligne;
		}
	}
	
	MyTableModel dataModel = new MyTableModel();

	/**
	 * Create the frame.
	 */
	public MainForme() {
		setResizable(false);
		getContentPane().setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mntmNouveau = new JMenuItem("Nouveau");
		mnFichier.add(mntmNouveau);
		
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
		mntmOuvrir.addActionListener(new ActionListener() 
		{
			//I stopped here
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		mnFichier.add(mntmOuvrir);
		
		JSeparator separator = new JSeparator();
		mnFichier.add(separator);
		
		JMenuItem mntmFermer = new JMenuItem("Fermer");
		mnFichier.add(mntmFermer);
		
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
		
		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mnEdition.add(mntmAjouter);
		
		JMenu mnOutils = new JMenu("Outils");
		menuBar.add(mnOutils);
		
		JMenuItem mntmRechercher = new JMenuItem("Rechercher");
		mnOutils.add(mntmRechercher);
		
		JMenuItem mntmLister = new JMenuItem("Lister");
		mnOutils.add(mntmLister);
		
		JMenu mnOrdonner = new JMenu("Ordonner");
		mnOutils.add(mnOrdonner);
		
		JMenuItem mntmId = new JMenuItem("ID");
		mnOrdonner.add(mntmId);
		
		JMenuItem mntmNom = new JMenuItem("Nom");
		mnOrdonner.add(mntmNom);
		
		JMenu mnAide = new JMenu("Aide");
		menuBar.add(mnAide);
		
		JMenuItem mntmPropos = new JMenuItem("À propos");
		mnAide.add(mntmPropos);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 688, 444);
		
		//------------------------------ TABLE
		
		table = new JTable();
		//Table creation 
		table.setModel(dataModel);
		scrollPane.setViewportView(table);
		getContentPane().add(scrollPane);
	}
}

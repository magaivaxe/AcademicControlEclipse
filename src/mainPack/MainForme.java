package mainPack;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;

public class MainForme extends JFrame {

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainForm frame = new MainForm();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public MainForme() {
		getContentPane().setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 398);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mntmNouveau = new JMenuItem("Nouveau");
		mnFichier.add(mntmNouveau);
		
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
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
	}
}

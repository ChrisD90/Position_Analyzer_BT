package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_Window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Window frame = new Main_Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main_Window() {
		setTitle("Position_Analyzer");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Calculating Optimal Position");
			}
		});
		btnSubmit.setBounds(678, 523, 106, 37);
		contentPane.add(btnSubmit);
		
		JLabel lblAusdauer = new JLabel("Ausdauer (gelaufene km)");
		lblAusdauer.setBounds(10, 39, 236, 14);
		contentPane.add(lblAusdauer);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(256, 30, 53, 20);
		contentPane.add(spinner);
		
		JLabel lblAnzahlDerSprints = new JLabel("Anzahl der Sprints");
		lblAnzahlDerSprints.setBounds(10, 64, 236, 14);
		contentPane.add(lblAnzahlDerSprints);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(256, 55, 53, 20);
		contentPane.add(spinner_1);
		
		JLabel lblDurchscnSprintsrecke = new JLabel("Durchschn. Sprintstrecke");
		lblDurchscnSprintsrecke.setBounds(10, 89, 236, 14);
		contentPane.add(lblDurchscnSprintsrecke);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(256, 80, 53, 20);
		contentPane.add(spinner_2);
		
		JLabel lblSprungkraftinCm = new JLabel("Sprungkraft (in cm)");
		lblSprungkraftinCm.setBounds(10, 114, 236, 14);
		contentPane.add(lblSprungkraftinCm);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(256, 105, 53, 20);
		contentPane.add(spinner_3);
		
		JLabel lblZweikmpfegesamt = new JLabel("Zweik\u00E4mpfe (gesamt)");
		lblZweikmpfegesamt.setBounds(10, 139, 236, 14);
		contentPane.add(lblZweikmpfegesamt);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(256, 130, 53, 20);
		contentPane.add(spinner_4);
		
		JLabel lblZweikmpfeAmBoden = new JLabel("Zweik\u00E4mpfe am Boden (gewonnen)");
		lblZweikmpfeAmBoden.setBounds(10, 161, 236, 14);
		contentPane.add(lblZweikmpfeAmBoden);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(256, 155, 53, 20);
		contentPane.add(spinner_5);
		
		JLabel lblZweikmpfeAmBoden_1 = new JLabel("Zweik\u00E4mpfe am Boden (verloren)");
		lblZweikmpfeAmBoden_1.setBounds(10, 186, 236, 14);
		contentPane.add(lblZweikmpfeAmBoden_1);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(256, 180, 53, 20);
		contentPane.add(spinner_6);
		
		JLabel lblZweikmpfeInDer = new JLabel("Zweik\u00E4mpfe in der Luft (gewonnen)");
		lblZweikmpfeInDer.setBounds(10, 211, 236, 14);
		contentPane.add(lblZweikmpfeInDer);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(256, 205, 53, 20);
		contentPane.add(spinner_7);
		
		JLabel lblZweikmpfeInDer_1 = new JLabel("Zweik\u00E4mpfe in der Luft (verloren)");
		lblZweikmpfeInDer_1.setBounds(10, 236, 236, 14);
		contentPane.add(lblZweikmpfeInDer_1);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(256, 230, 53, 20);
		contentPane.add(spinner_8);
		
		JLabel lblPssegesamt = new JLabel("P\u00E4sse (gesamt)");
		lblPssegesamt.setBounds(10, 261, 236, 14);
		contentPane.add(lblPssegesamt);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(256, 258, 53, 20);
		contentPane.add(spinner_9);
		
		JLabel lblPsseangekommen = new JLabel("P\u00E4sse (angekommen)");
		lblPsseangekommen.setBounds(10, 286, 236, 14);
		contentPane.add(lblPsseangekommen);
		
		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(256, 283, 53, 20);
		contentPane.add(spinner_10);
		
		JLabel lblPssekurzeDistanz = new JLabel("P\u00E4sse (kurze Distanz");
		lblPssekurzeDistanz.setBounds(10, 311, 236, 14);
		contentPane.add(lblPssekurzeDistanz);
		
		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(256, 308, 53, 20);
		contentPane.add(spinner_11);
		
		JLabel lblDribblingzeitIm = new JLabel("Dribbling (Zeit in sec. im Parcour)");
		lblDribblingzeitIm.setBounds(10, 336, 236, 14);
		contentPane.add(lblDribblingzeitIm);
		
		JSpinner spinner_12 = new JSpinner();
		spinner_12.setBounds(256, 333, 53, 20);
		contentPane.add(spinner_12);
		
		JLabel lblSpielverstndnis = new JLabel("Spielverst\u00E4ndnis (1 - 6)");
		lblSpielverstndnis.setBounds(10, 361, 236, 14);
		contentPane.add(lblSpielverstndnis);
		
		JSpinner spinner_13 = new JSpinner();
		spinner_13.setModel(new SpinnerNumberModel(1.0, 1.0, 6.0, 1.0));
		spinner_13.setBounds(256, 358, 53, 20);
		contentPane.add(spinner_13);
		
		JLabel lblFlankengesamt = new JLabel("Flanken (gesamt)");
		lblFlankengesamt.setBounds(10, 386, 236, 14);
		contentPane.add(lblFlankengesamt);
		
		JSpinner spinner_14 = new JSpinner();
		spinner_14.setBounds(256, 383, 53, 20);
		contentPane.add(spinner_14);
		
		JLabel lblFlankenerfolgreich = new JLabel("Flanken (erfolgreich)");
		lblFlankenerfolgreich.setBounds(10, 411, 236, 14);
		contentPane.add(lblFlankenerfolgreich);
		
		JSpinner spinner_15 = new JSpinner();
		spinner_15.setBounds(256, 408, 53, 20);
		contentPane.add(spinner_15);
		
		JLabel lblSchsseAufsTor = new JLabel("Sch\u00FCsse aufs Tor");
		lblSchsseAufsTor.setBounds(10, 436, 236, 14);
		contentPane.add(lblSchsseAufsTor);
		
		JSpinner spinner_16 = new JSpinner();
		spinner_16.setBounds(256, 433, 53, 20);
		contentPane.add(spinner_16);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 21);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
	}
}

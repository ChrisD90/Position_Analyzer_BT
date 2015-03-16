package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.Player;

import java.awt.Toolkit;

import javax.swing.JSeparator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Component;
import java.awt.Window;

import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import control.Analyzer_TestData;

public class Main_Window_Testdata extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// GENERAL STUFF
	private JPanel contentPane;
	public double[] values = new double[18];

	Player player;

	// MENU
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmClose;
	private JMenu mnHelp;
	private JMenuItem mntmCheatSheet;
	private JSeparator separator;
	private JMenuItem mntmAbout;

	// DIVERSE BUTTONS
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnSubmit;
	private JButton btnBack;
	private JRadioButton rdbtnEherLinks;
	private JRadioButton rdbtnEherRechts;
	private JRadioButton rdbtnBeidfig;

	//SPINNERS
	private JSpinner spinner_0;
	private JSpinner spinner_1;
	private JSpinner spinner_2;
	private JSpinner spinner_3;
	private JSpinner spinner_4;
	private JSpinner spinner_5;
	private JSpinner spinner_6;
	private JSpinner spinner_7;
	private JSpinner spinner_8;
	private JSpinner spinner_9;
	private JSpinner spinner_10;
	private JSpinner spinner_11;
	private JSpinner spinner_12;
	private JSpinner spinner_13;
	private JSpinner spinner_14;
	private JSpinner spinner_15;
	private JLabel lblSchussstrke;
	private JSpinner spinner_16;
	
	/**
	 * Create the frame.
	 */
	public Main_Window_Testdata() {
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Main_Window_Testdata.class.getResource("/media/player.jpg")));
		setTitle("Analyse auf Grundlage von Testdaten...");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = dimension.width;
		int y = dimension.height;
		setBounds(((x-800)/2), ((y-600)/2), 800, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		initMenu();

		initButtons();

		initLabels();

		initSpinners();

		initActionListeners(mntmClose, mntmCheatSheet, mntmAbout, btnSubmit,
				btnBack);

		
		
		
	}

	/**
	 * 
	 */
	private void initButtons() {
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSubmit.setBounds(669, 511, 106, 37);
		contentPane.add(btnSubmit);

		btnBack = new JButton("Back");
		btnBack.setBounds(15, 515, 115, 29);
		contentPane.add(btnBack);

		rdbtnEherLinks = new JRadioButton("eher links");
		buttonGroup.add(rdbtnEherLinks);
		rdbtnEherLinks.setBounds(419, 331, 109, 23);
		contentPane.add(rdbtnEherLinks);

		rdbtnEherRechts = new JRadioButton("eher rechts");
		buttonGroup.add(rdbtnEherRechts);
		rdbtnEherRechts.setBounds(530, 331, 109, 23);
		contentPane.add(rdbtnEherRechts);

		rdbtnBeidfig = new JRadioButton("beidf\u00FC\u00DFig");
		buttonGroup.add(rdbtnBeidfig);
		rdbtnBeidfig.setBounds(641, 331, 109, 23);
		contentPane.add(rdbtnBeidfig);
	}

	/**
	 * 
	 */
	private void initMenu() {
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 21);
		contentPane.add(menuBar);

		mnFile = new JMenu("File");
		menuBar.add(mnFile);

		mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);

		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		mntmCheatSheet = new JMenuItem("Cheat Sheet");
		mnHelp.add(mntmCheatSheet);

		separator = new JSeparator();
		mnHelp.add(separator);

		mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
	}

	/**
	 * 
	 */
	private void initLabels() {
		JLabel lblAusdauer = new JLabel("Ergebnis - Yo-Yo Test (in m)");
		lblAusdauer
				.setToolTipText("Der Yo-Yo Test zeigt nach Di Salvo et al. (2006) eine enge Korrelation \r\nzwischen der zur\u00FCckgelegten Distanz im Test und der Positionsrolle \r\ndes Spielers.");
		lblAusdauer.setBounds(10, 60, 236, 14);
		contentPane.add(lblAusdauer);

		JLabel lblAusdauerfhigkeiten = new JLabel("Ausdauerf\u00E4higkeiten");
		lblAusdauerfhigkeiten.setToolTipText("");
		lblAusdauerfhigkeiten.setFont(new Font("Arial",
				Font.BOLD | Font.ITALIC, 13));
		lblAusdauerfhigkeiten.setBounds(10, 35, 236, 14);
		contentPane.add(lblAusdauerfhigkeiten);

		JLabel lblSchnelligkeitsfhigkeiten = new JLabel(
				"Schnelligkeitsf\u00E4higkeiten");
		lblSchnelligkeitsfhigkeiten.setFont(new Font("Arial", Font.BOLD
				| Font.ITALIC, 13));
		lblSchnelligkeitsfhigkeiten.setBounds(10, 95, 299, 14);
		contentPane.add(lblSchnelligkeitsfhigkeiten);

		JLabel lblmZeit = new JLabel("5m - Zeit in 1/10s");
		lblmZeit.setBounds(10, 120, 236, 14);
		contentPane.add(lblmZeit);

		JLabel lblNewLabel_1 = new JLabel("10m - Zeit in 1/10s");
		lblNewLabel_1.setBounds(10, 145, 236, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblmZeit_1 = new JLabel("30m - Zeit in 1/10s");
		lblmZeit_1.setBounds(10, 170, 236, 14);
		contentPane.add(lblmZeit_1);

		JLabel lblSprungkraft = new JLabel("Sprungkraft");
		lblSprungkraft.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblSprungkraft.setBounds(10, 205, 236, 14);
		contentPane.add(lblSprungkraft);

		JLabel lblErgebnisJump = new JLabel("Ergebnis - Jump & Reach (in cm)");
		lblErgebnisJump.setBounds(10, 230, 236, 14);
		contentPane.add(lblErgebnisJump);

		JLabel lblPassspiel = new JLabel("Passspiel/Flanken");
		lblPassspiel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblPassspiel.setBounds(10, 265, 236, 14);
		contentPane.add(lblPassspiel);

		JLabel lblFlankenAngekommen = new JLabel("Flanken - angekommen");
		lblFlankenAngekommen.setBounds(10, 340, 236, 14);
		contentPane.add(lblFlankenAngekommen);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(401, 32, 12, 461);
		contentPane.add(verticalStrut);

		JLabel lblDribbling = new JLabel("Dribbling");
		lblDribbling.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblDribbling.setBounds(419, 95, 236, 14);
		contentPane.add(lblDribbling);

		JLabel lblmZeit_2 = new JLabel("5m - Zeit in 1/10s");
		lblmZeit_2.setBounds(419, 119, 236, 14);
		contentPane.add(lblmZeit_2);

		JLabel lblmZeit_3 = new JLabel("10m - Zeit in 1/10s");
		lblmZeit_3.setBounds(419, 144, 236, 14);
		contentPane.add(lblmZeit_3);

		JLabel lblmZeit_4 = new JLabel("30m - Zeit in 1/10s");
		lblmZeit_4.setBounds(419, 169, 236, 14);
		contentPane.add(lblmZeit_4);

		JLabel lblTorschuss = new JLabel("Torschuss");
		lblTorschuss.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblTorschuss.setBounds(423, 226, 236, 14);
		contentPane.add(lblTorschuss);

		JLabel lblSchsseAufsTor_1 = new JLabel(
				"Sch\u00FCsse aufs Tor - erfolgreich");
		lblSchsseAufsTor_1.setBounds(423, 251, 236, 14);
		contentPane.add(lblSchsseAufsTor_1);

		JLabel lblZweikampfverhalten = new JLabel("Zweikampfverhalten");
		lblZweikampfverhalten.setFont(new Font("Arial",
				Font.BOLD | Font.ITALIC, 13));
		lblZweikampfverhalten.setBounds(10, 375, 236, 14);
		contentPane.add(lblZweikampfverhalten);

		JLabel lblOffensiveZweikmpfe = new JLabel(
				"Offensive Zweik\u00E4mpfe - gewonnen");
		lblOffensiveZweikmpfe.setBounds(10, 400, 236, 14);
		contentPane.add(lblOffensiveZweikmpfe);

		JLabel lblDefensiveZweikmpfe = new JLabel(
				"Defensive Zweik\u00E4mpfe - gewonnen");
		lblDefensiveZweikmpfe.setBounds(10, 425, 236, 14);
		contentPane.add(lblDefensiveZweikmpfe);

		JLabel lblSpielverstndnis = new JLabel("Spielverst\u00E4ndnis");
		lblSpielverstndnis.setFont(new Font("Arial", Font.BOLD | Font.ITALIC,
				13));
		lblSpielverstndnis.setBounds(419, 35, 237, 14);
		contentPane.add(lblSpielverstndnis);

		JLabel lblEinschtzungAlsSchulnote = new JLabel(
				"Einsch\u00E4tzung als Schulnote");
		lblEinschtzungAlsSchulnote.setBounds(419, 60, 236, 14);
		contentPane.add(lblEinschtzungAlsSchulnote);

		JLabel lblFuarbeit = new JLabel("Fu\u00DFarbeit");
		lblFuarbeit.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblFuarbeit.setBounds(419, 310, 236, 14);
		contentPane.add(lblFuarbeit);
		
		JLabel lblPassKurz = new JLabel("Pass kurz - Zeit in sec");
		lblPassKurz.setBounds(10, 290, 236, 14);
		contentPane.add(lblPassKurz);
		
		JLabel lblPassWeit = new JLabel("Pass weit - erflogreich");
		lblPassWeit.setBounds(10, 316, 236, 14);
		contentPane.add(lblPassWeit);
		
		JLabel lblmZeit_5 = new JLabel("60m - Zeit in 10/s");
		lblmZeit_5.setBounds(419, 194, 220, 14);
		contentPane.add(lblmZeit_5);
		
		lblSchussstrke = new JLabel("Schussst\u00E4rke");
		lblSchussstrke.setBounds(423, 276, 299, 14);
		contentPane.add(lblSchussstrke);
	}

	/**
	 * 
	 */
	private void initSpinners() {
		spinner_0 = new JSpinner();
		spinner_0.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_0.setBounds(310, 57, 54, 20);
		contentPane.add(spinner_0);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_1.setBounds(310, 117, 54, 20);
		contentPane.add(spinner_1);
		
		spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_2.setBounds(310, 142, 54, 20);
		contentPane.add(spinner_2);
		
		spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_3.setBounds(310, 167, 54, 20);
		contentPane.add(spinner_3);
		
		spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_4.setBounds(310, 227, 54, 20);
		contentPane.add(spinner_4);
		
		spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_5.setBounds(310, 287, 54, 20);
		contentPane.add(spinner_5);
		
		spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
		spinner_6.setBounds(310, 313, 54, 20);
		contentPane.add(spinner_6);
		
		spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
		spinner_7.setBounds(310, 337, 54, 20);
		contentPane.add(spinner_7);
		
		spinner_8 = new JSpinner();
		spinner_8.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
		spinner_8.setBounds(310, 397, 54, 20);
		contentPane.add(spinner_8);
		
		spinner_9 = new JSpinner();
		spinner_9.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 1.0));
		spinner_9.setBounds(310, 422, 54, 20);
		contentPane.add(spinner_9);
		
		spinner_10 = new JSpinner();
		spinner_10.setModel(new SpinnerNumberModel(1.0, 1.0, 5.0, 1.0));
		spinner_10.setBounds(721, 57, 54, 20);
		contentPane.add(spinner_10);
		
		spinner_11 = new JSpinner();
		spinner_11.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_11.setBounds(721, 117, 54, 20);
		contentPane.add(spinner_11);
		
		spinner_12 = new JSpinner();
		spinner_12.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_12.setBounds(721, 142, 54, 20);
		contentPane.add(spinner_12);
		
		spinner_13 = new JSpinner();
		spinner_13.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_13.setBounds(721, 167, 54, 20);
		contentPane.add(spinner_13);
		
		spinner_14 = new JSpinner();
		spinner_14.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinner_14.setBounds(721, 191, 54, 20);
		contentPane.add(spinner_14);
		
		spinner_15 = new JSpinner();
		spinner_15.setModel(new SpinnerNumberModel(0.0, 0.0, 48.0, 1.0));
		spinner_15.setBounds(725, 248, 54, 20);
		contentPane.add(spinner_15);
		
		spinner_16 = new JSpinner();
		spinner_16.setModel(new SpinnerNumberModel(0.0, 0.0, 3.0, 1.0));
		spinner_16.setBounds(725, 273, 54, 20);
		contentPane.add(spinner_16);
	}

	/**
	 * @param mntmClose
	 * @param mntmCheatSheet
	 * @param mntmAbout
	 * @param btnSubmit
	 * @param btnBack
	 */
	private void initActionListeners(JMenuItem mntmClose,
			JMenuItem mntmCheatSheet, JMenuItem mntmAbout, JButton btnSubmit,
			JButton btnBack) {
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Start_Window sw = new Start_Window();
				sw.setVisible(true);
				dispose();
			}
		});

		mntmAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				About_Window aw = new About_Window();
				aw.setVisible(true);

			}
		});

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Progress_Bar_Window dialog = new Progress_Bar_Window(25);
				dialog.setVisible(true);

				System.out.println("Calculating Optimal Position");

				getValues();
				
				Analyzer_TestData atd = new Analyzer_TestData(values);
				String string = atd.run();
				System.out.println(string);


			}
		});

		mntmCheatSheet.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Help_Window hw = new Help_Window();
				hw.setVisible(true);

			}
		});

		mntmClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
	}

	/**
	 * fills the blank array with the values from the spinners
	 */
	private void getValues() {
		
		double foot = 0;
		
		values[0] = (double) spinner_0.getValue();
		values[1] = (double) spinner_1.getValue();
		values[2] = (double) spinner_2.getValue();		
		values[3] = (double) spinner_3.getValue();
		values[4] = (double) spinner_4.getValue();
		values[5] = (double) spinner_5.getValue();		
		values[6] = (double) spinner_6.getValue();
		values[7] = (double) spinner_7.getValue();
		values[8] = (double) spinner_8.getValue();		
		values[9] = (double) spinner_9.getValue();
		values[10] = (double) spinner_10.getValue();
		values[11] = (double) spinner_11.getValue();		
		values[12] = (double) spinner_12.getValue();
		values[13] = (double) spinner_13.getValue();
		values[14] = (double) spinner_14.getValue();
		values[15] = (double) spinner_15.getValue();	
		values[16] = (double) spinner_16.getValue();
				
		//linker Fuﬂ = 1, rechter Fuﬂ = 2; beidf¸ﬂig = 3
		if(rdbtnEherLinks.isSelected()) {
			foot = 1.0;
		} else if(rdbtnEherRechts.isSelected()) {
			foot = 2.0;
		} else if(rdbtnBeidfig.isSelected()) {
			foot = 3.0;
		}
		values[17] = foot;
		
		System.out.println(values[16]);
		
	}
	public double[] deliverValues() {
		return values;
	}
}

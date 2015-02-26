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

import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Main_Window_Testdata extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// GENERAL STUFF
	private JPanel contentPane;
	public int[] values = new int[20];

	Player player;

	// SPINNER
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
	private JSpinner spinner_16;
	private JSpinner spinner_17;
	private JSpinner spinner_18;

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
		rdbtnEherLinks.setBounds(419, 397, 109, 23);
		contentPane.add(rdbtnEherLinks);

		rdbtnEherRechts = new JRadioButton("eher rechts");
		buttonGroup.add(rdbtnEherRechts);
		rdbtnEherRechts.setBounds(530, 397, 109, 23);
		contentPane.add(rdbtnEherRechts);

		rdbtnBeidfig = new JRadioButton("beidf\u00FC\u00DFig");
		buttonGroup.add(rdbtnBeidfig);
		rdbtnBeidfig.setBounds(641, 397, 109, 23);
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

		JLabel lblPassspiel = new JLabel("Passspiel");
		lblPassspiel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblPassspiel.setBounds(10, 265, 236, 14);
		contentPane.add(lblPassspiel);

		JLabel lblKurzePsse = new JLabel("kurze P\u00E4sse - total");
		lblKurzePsse.setBounds(10, 290, 236, 14);
		contentPane.add(lblKurzePsse);

		JLabel lblLangePsse = new JLabel("lange P\u00E4sse - total");
		lblLangePsse.setBounds(10, 315, 236, 14);
		contentPane.add(lblLangePsse);

		JLabel lblKurzePsse_1 = new JLabel("kurze P\u00E4sse - erfolgreich");
		lblKurzePsse_1.setBounds(10, 340, 236, 14);
		contentPane.add(lblKurzePsse_1);

		JLabel lblLangePsseErfolgreich = new JLabel(
				"lange P\u00E4sse - erfolgreich");
		lblLangePsseErfolgreich.setBounds(10, 365, 236, 14);
		contentPane.add(lblLangePsseErfolgreich);

		JLabel lblFlanken = new JLabel("Flanken");
		lblFlanken.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblFlanken.setBounds(10, 400, 236, 14);
		contentPane.add(lblFlanken);

		JLabel lblFlankenTotal = new JLabel("Flanken - total");
		lblFlankenTotal.setBounds(10, 425, 236, 14);
		contentPane.add(lblFlankenTotal);

		JLabel lblFlankenAngekommen = new JLabel("Flanken - angekommen");
		lblFlankenAngekommen.setBounds(10, 450, 236, 14);
		contentPane.add(lblFlankenAngekommen);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(401, 32, 12, 461);
		contentPane.add(verticalStrut);

		JLabel lblDribbling = new JLabel("Dribbling");
		lblDribbling.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblDribbling.setBounds(423, 36, 236, 14);
		contentPane.add(lblDribbling);

		JLabel lblmZeit_2 = new JLabel("5m - Zeit in 1/10s");
		lblmZeit_2.setBounds(423, 60, 236, 14);
		contentPane.add(lblmZeit_2);

		JLabel lblmZeit_3 = new JLabel("10m - Zeit in 1/10s");
		lblmZeit_3.setBounds(423, 85, 236, 14);
		contentPane.add(lblmZeit_3);

		JLabel lblmZeit_4 = new JLabel("30m - Zeit in 1/10s");
		lblmZeit_4.setBounds(423, 110, 236, 14);
		contentPane.add(lblmZeit_4);

		JLabel lblTorschuss = new JLabel("Torschuss");
		lblTorschuss.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblTorschuss.setBounds(423, 145, 236, 14);
		contentPane.add(lblTorschuss);

		JLabel lblSchsseAufsTor = new JLabel("Sch\u00FCsse aufs Tor - total");
		lblSchsseAufsTor.setBounds(423, 170, 236, 14);
		contentPane.add(lblSchsseAufsTor);

		JLabel lblSchsseAufsTor_1 = new JLabel(
				"Sch\u00FCsse aufs Tor - erfolgreich");
		lblSchsseAufsTor_1.setBounds(423, 195, 236, 14);
		contentPane.add(lblSchsseAufsTor_1);

		JLabel lblZweikampfverhalten = new JLabel("Zweikampfverhalten");
		lblZweikampfverhalten.setFont(new Font("Arial",
				Font.BOLD | Font.ITALIC, 13));
		lblZweikampfverhalten.setBounds(423, 230, 236, 14);
		contentPane.add(lblZweikampfverhalten);

		JLabel lblOffensiveZweikmpfe = new JLabel(
				"Offensive Zweik\u00E4mpfe - gewonnen");
		lblOffensiveZweikmpfe.setBounds(423, 255, 236, 14);
		contentPane.add(lblOffensiveZweikmpfe);

		JLabel lblDefensiveZweikmpfe = new JLabel(
				"Defensive Zweik\u00E4mpfe - gewonnen");
		lblDefensiveZweikmpfe.setBounds(423, 280, 236, 14);
		contentPane.add(lblDefensiveZweikmpfe);

		JLabel lblSpielverstndnis = new JLabel("Spielverst\u00E4ndnis");
		lblSpielverstndnis.setFont(new Font("Arial", Font.BOLD | Font.ITALIC,
				13));
		lblSpielverstndnis.setBounds(423, 315, 237, 14);
		contentPane.add(lblSpielverstndnis);

		JLabel lblEinschtzungAlsSchulnote = new JLabel(
				"Einsch\u00E4tzung als Schulnote");
		lblEinschtzungAlsSchulnote.setBounds(423, 340, 236, 14);
		contentPane.add(lblEinschtzungAlsSchulnote);

		JLabel lblFuarbeit = new JLabel("Fu\u00DFarbeit");
		lblFuarbeit.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		lblFuarbeit.setBounds(423, 380, 236, 14);
		contentPane.add(lblFuarbeit);
	}

	/**
	 * 
	 */
	private void initSpinners() {
		spinner_0 = new JSpinner();
		spinner_0.setBounds(256, 57, 53, 20);
		contentPane.add(spinner_0);

		spinner_1 = new JSpinner();
		spinner_1.setBounds(256, 117, 53, 20);
		contentPane.add(spinner_1);

		spinner_2 = new JSpinner();
		spinner_2.setBounds(256, 142, 53, 20);
		contentPane.add(spinner_2);

		spinner_3 = new JSpinner();
		spinner_3.setBounds(256, 167, 53, 20);
		contentPane.add(spinner_3);

		spinner_4 = new JSpinner();
		spinner_4.setBounds(256, 227, 53, 20);
		contentPane.add(spinner_4);

		spinner_5 = new JSpinner();
		spinner_5.setBounds(256, 287, 53, 20);
		contentPane.add(spinner_5);

		spinner_6 = new JSpinner();
		spinner_6.setBounds(256, 312, 53, 20);
		contentPane.add(spinner_6);

		spinner_7 = new JSpinner();
		spinner_7.setBounds(256, 337, 53, 20);
		contentPane.add(spinner_7);

		spinner_8 = new JSpinner();
		spinner_8.setBounds(256, 362, 53, 20);
		contentPane.add(spinner_8);

		spinner_9 = new JSpinner();
		spinner_9.setBounds(256, 422, 53, 20);
		contentPane.add(spinner_9);

		spinner_10 = new JSpinner();
		spinner_10.setBounds(256, 447, 53, 20);
		contentPane.add(spinner_10);

		spinner_11 = new JSpinner();
		spinner_11.setBounds(669, 57, 53, 20);
		contentPane.add(spinner_11);

		spinner_12 = new JSpinner();
		spinner_12.setBounds(669, 82, 53, 20);
		contentPane.add(spinner_12);

		spinner_13 = new JSpinner();
		spinner_13.setBounds(669, 107, 53, 20);
		contentPane.add(spinner_13);

		spinner_14 = new JSpinner();
		spinner_14.setBounds(673, 167, 49, 20);
		contentPane.add(spinner_14);

		spinner_15 = new JSpinner();
		spinner_15.setBounds(673, 192, 49, 20);
		contentPane.add(spinner_15);

		spinner_16 = new JSpinner();
		spinner_16.setBounds(673, 252, 49, 20);
		contentPane.add(spinner_16);

		spinner_17 = new JSpinner();
		spinner_17.setBounds(673, 277, 49, 20);
		contentPane.add(spinner_17);

		spinner_18 = new JSpinner();
		spinner_18.setModel(new SpinnerNumberModel(1, 1, 6, 1));
		spinner_18.setBounds(673, 337, 49, 20);
		contentPane.add(spinner_18);
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
				
				player = new Player(values);
				player.printValues(values);
				player.calcPos();

				// String inhabits the calculated Positions
				String string = player.positions;

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
		
		int foot = 0;
		
		values[0] = Integer.parseInt(spinner_0.getValue().toString());
		values[1] = Integer.parseInt(spinner_1.getValue().toString());
		values[2] = Integer.parseInt(spinner_2.getValue().toString());
		values[3] = Integer.parseInt(spinner_3.getValue().toString());
		values[4] = Integer.parseInt(spinner_4.getValue().toString());
		values[5] = Integer.parseInt(spinner_5.getValue().toString());
		values[6] = Integer.parseInt(spinner_6.getValue().toString());
		values[7] = Integer.parseInt(spinner_7.getValue().toString());
		values[8] = Integer.parseInt(spinner_8.getValue().toString());
		values[9] = Integer.parseInt(spinner_9.getValue().toString());
		values[10] = Integer.parseInt(spinner_10.getValue().toString());
		values[11] = Integer.parseInt(spinner_11.getValue().toString());
		values[12] = Integer.parseInt(spinner_12.getValue().toString());
		values[13] = Integer.parseInt(spinner_13.getValue().toString());
		values[14] = Integer.parseInt(spinner_14.getValue().toString());
		values[15] = Integer.parseInt(spinner_15.getValue().toString());
		values[16] = Integer.parseInt(spinner_16.getValue().toString());
		values[17] = Integer.parseInt(spinner_17.getValue().toString());
		values[18] = Integer.parseInt(spinner_18.getValue().toString());
		
		//linker Fuﬂ = 1, rechter Fuﬂ = 2; beidf¸ﬂig = 3
		if(rdbtnEherLinks.isSelected()) {
			foot = 1;
		} else if(rdbtnEherRechts.isSelected()) {
			foot = 2;
		} else if(rdbtnBeidfig.isSelected()) {
			foot = 3;
		}
		values[19] = foot;
		
	}
	public int[] deliverValues() {
		return values;
	}
}

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

import javax.swing.JDesktopPane;

import model.Player;

import javax.swing.SwingConstants;

import java.awt.Toolkit;
import java.awt.SystemColor;

import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Main_Window_Testdata extends JFrame {

	private JPanel contentPane;
	public int[] values = new int[17];
	private JSpinner spinner;

	Player player;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public Main_Window_Testdata() {
		setBackground(SystemColor.window);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Main_Window_Testdata.class.getResource("/media/player.jpg")));
		setTitle("Position_Analyzer");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAusdauer = new JLabel("Yo-Yo Test (in m)");
		lblAusdauer.setBounds(10, 60, 236, 14);
		contentPane.add(lblAusdauer);

		spinner = new JSpinner();
		spinner.setBounds(256, 57, 53, 20);
		contentPane.add(spinner);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 21);
		contentPane.add(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmCheatSheet = new JMenuItem("Cheat Sheet");
		mnHelp.add(mntmCheatSheet);

		JSeparator separator = new JSeparator();
		mnHelp.add(separator);

		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(673, 507, 106, 37);
		contentPane.add(btnSubmit);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(15, 515, 115, 29);
		contentPane.add(btnBack);

		JLabel lblAusdauerfhigkeiten = new JLabel("Ausdauerf\u00E4higkeiten");
		lblAusdauerfhigkeiten.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAusdauerfhigkeiten.setBounds(10, 35, 236, 14);
		contentPane.add(lblAusdauerfhigkeiten);

		JLabel lblSchnelligkeitsfhigkeiten = new JLabel(
				"Schnelligkeitsf\u00E4higkeiten");
		lblSchnelligkeitsfhigkeiten.setFont(new Font("Tahoma", Font.BOLD, 12));
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

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(256, 117, 53, 20);
		contentPane.add(spinner_1);

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(256, 142, 53, 20);
		contentPane.add(spinner_2);

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(256, 167, 53, 20);
		contentPane.add(spinner_3);

		JLabel lblSprungkraft = new JLabel("Sprungkraft");
		lblSprungkraft.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSprungkraft.setBounds(10, 205, 236, 14);
		contentPane.add(lblSprungkraft);

		JLabel lblErgebnisJump = new JLabel("Ergebnis - Jump & Reach (in cm)");
		lblErgebnisJump.setBounds(10, 230, 236, 14);
		contentPane.add(lblErgebnisJump);

		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(256, 227, 53, 20);
		contentPane.add(spinner_4);

		JLabel lblPassspiel = new JLabel("Passspiel");
		lblPassspiel.setFont(new Font("Tahoma", Font.BOLD, 12));
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

		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(256, 287, 53, 20);
		contentPane.add(spinner_5);

		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(256, 312, 53, 20);
		contentPane.add(spinner_6);

		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(256, 337, 53, 20);
		contentPane.add(spinner_7);

		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(256, 362, 53, 20);
		contentPane.add(spinner_8);

		JLabel lblFlanken = new JLabel("Flanken");
		lblFlanken.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFlanken.setBounds(10, 400, 236, 14);
		contentPane.add(lblFlanken);

		JLabel lblFlankenTotal = new JLabel("Flanken - total");
		lblFlankenTotal.setBounds(10, 425, 236, 14);
		contentPane.add(lblFlankenTotal);

		JLabel lblFlankenAngekommen = new JLabel("Flanken - angekommen");
		lblFlankenAngekommen.setBounds(10, 450, 236, 14);
		contentPane.add(lblFlankenAngekommen);

		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(256, 422, 53, 20);
		contentPane.add(spinner_9);

		JSpinner spinner_10 = new JSpinner();
		spinner_10.setBounds(256, 447, 53, 20);
		contentPane.add(spinner_10);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(401, 32, 12, 461);
		contentPane.add(verticalStrut);

		JLabel lblDribbling = new JLabel("Dribbling");
		lblDribbling.setFont(new Font("Tahoma", Font.BOLD, 12));
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

		JSpinner spinner_11 = new JSpinner();
		spinner_11.setBounds(669, 57, 53, 20);
		contentPane.add(spinner_11);

		JSpinner spinner_12 = new JSpinner();
		spinner_12.setBounds(669, 82, 53, 20);
		contentPane.add(spinner_12);

		JSpinner spinner_13 = new JSpinner();
		spinner_13.setBounds(669, 107, 53, 20);
		contentPane.add(spinner_13);

		JLabel lblTorschuss = new JLabel("Torschuss");
		lblTorschuss.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTorschuss.setBounds(423, 145, 236, 14);
		contentPane.add(lblTorschuss);

		JLabel lblSchsseAufsTor = new JLabel("Sch\u00FCsse aufs Tor - total");
		lblSchsseAufsTor.setBounds(423, 170, 236, 14);
		contentPane.add(lblSchsseAufsTor);

		JLabel lblSchsseAufsTor_1 = new JLabel(
				"Sch\u00FCsse aufs Tor - erfolgreich");
		lblSchsseAufsTor_1.setBounds(423, 195, 236, 14);
		contentPane.add(lblSchsseAufsTor_1);

		JSpinner spinner_14 = new JSpinner();
		spinner_14.setBounds(673, 167, 49, 20);
		contentPane.add(spinner_14);

		JSpinner spinner_15 = new JSpinner();
		spinner_15.setBounds(673, 192, 49, 20);
		contentPane.add(spinner_15);

		JLabel lblZweikampfverhalten = new JLabel("Zweikampfverhalten");
		lblZweikampfverhalten.setFont(new Font("Tahoma", Font.BOLD, 12));
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

		JSpinner spinner_16 = new JSpinner();
		spinner_16.setBounds(673, 252, 49, 20);
		contentPane.add(spinner_16);

		JSpinner spinner_17 = new JSpinner();
		spinner_17.setBounds(673, 277, 49, 20);
		contentPane.add(spinner_17);

		JLabel lblSpielverstndnis = new JLabel("Spielverst\u00E4ndnis");
		lblSpielverstndnis.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSpielverstndnis.setBounds(423, 315, 237, 14);
		contentPane.add(lblSpielverstndnis);

		JLabel lblEinschtzungAlsSchulnote = new JLabel(
				"Einsch\u00E4tzung als Schulnote");
		lblEinschtzungAlsSchulnote.setBounds(423, 340, 236, 14);
		contentPane.add(lblEinschtzungAlsSchulnote);

		JSpinner spinner_18 = new JSpinner();
		spinner_18.setModel(new SpinnerNumberModel(1, 1, 6, 1));
		spinner_18.setBounds(673, 337, 49, 20);
		contentPane.add(spinner_18);

		JLabel lblFuarbeit = new JLabel("Fu\u00DFarbeit");
		lblFuarbeit.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFuarbeit.setBounds(423, 380, 236, 14);
		contentPane.add(lblFuarbeit);

		JRadioButton rdbtnEherLinks = new JRadioButton("eher links");
		buttonGroup.add(rdbtnEherLinks);
		rdbtnEherLinks.setBounds(419, 397, 109, 23);
		contentPane.add(rdbtnEherLinks);

		JRadioButton rdbtnEherRechts = new JRadioButton("eher rechts");
		buttonGroup.add(rdbtnEherRechts);
		rdbtnEherRechts.setBounds(530, 397, 109, 23);
		contentPane.add(rdbtnEherRechts);

		JRadioButton rdbtnBeidfig = new JRadioButton("beidf\u00FC\u00DFig");
		buttonGroup.add(rdbtnBeidfig);
		rdbtnBeidfig.setBounds(641, 397, 109, 23);
		contentPane.add(rdbtnBeidfig);

		initActionListeners(mntmClose, mntmCheatSheet, mntmAbout, btnSubmit,
				btnBack);
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

				Progress_Bar_Window dialog = new Progress_Bar_Window();
				dialog.setVisible(true);

				System.out.println("Calculating Optimal Position");

				player = new Player(values);
				// player.printValues(values);
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

	public int[] deliverValues() {
		return values;
	}
}

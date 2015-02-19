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

public class Main_Window extends JFrame {

	private JPanel contentPane;
	public int[] values = new int[17];
	private JSpinner spinner;
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

	Player player;

	/**
	 * Create the frame.
	 */
	public Main_Window() {
		setBackground(SystemColor.window);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Main_Window.class.getResource("/media/player.jpg")));
		setTitle("Position_Analyzer");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		desktopPane.setBounds(350, 30, 434, 420);
		contentPane.add(desktopPane);

		// ####################SPINNER####################

		JLabel lblAusdauer = new JLabel("Ausdauer (gelaufene km)");
		lblAusdauer.setBounds(10, 39, 236, 14);
		contentPane.add(lblAusdauer);

		spinner = new JSpinner();
		spinner.setBounds(256, 30, 53, 20);
		contentPane.add(spinner);

		JLabel lblAnzahlDerSprints = new JLabel("Anzahl der Sprints");
		lblAnzahlDerSprints.setBounds(10, 64, 236, 14);
		contentPane.add(lblAnzahlDerSprints);

		spinner_1 = new JSpinner();
		spinner_1.setBounds(256, 55, 53, 20);
		contentPane.add(spinner_1);

		JLabel lblDurchscnSprintsrecke = new JLabel("Durchschn. Sprintstrecke");
		lblDurchscnSprintsrecke.setBounds(10, 89, 236, 14);
		contentPane.add(lblDurchscnSprintsrecke);

		spinner_2 = new JSpinner();
		spinner_2.setBounds(256, 80, 53, 20);
		contentPane.add(spinner_2);

		JLabel lblSprungkraftinCm = new JLabel("Sprungkraft (in cm)");
		lblSprungkraftinCm.setBounds(10, 114, 236, 14);
		contentPane.add(lblSprungkraftinCm);

		spinner_3 = new JSpinner();
		spinner_3.setBounds(256, 105, 53, 20);
		contentPane.add(spinner_3);

		JLabel lblZweikmpfegesamt = new JLabel("Zweik\u00E4mpfe (gesamt)");
		lblZweikmpfegesamt.setBounds(10, 139, 236, 14);
		contentPane.add(lblZweikmpfegesamt);

		spinner_4 = new JSpinner();
		spinner_4.setBounds(256, 130, 53, 20);
		contentPane.add(spinner_4);

		JLabel lblZweikmpfeAmBoden = new JLabel(
				"Zweik\u00E4mpfe am Boden (gewonnen)");
		lblZweikmpfeAmBoden.setBounds(10, 161, 236, 14);
		contentPane.add(lblZweikmpfeAmBoden);

		spinner_5 = new JSpinner();
		spinner_5.setBounds(256, 155, 53, 20);
		contentPane.add(spinner_5);

		JLabel lblZweikmpfeAmBoden_1 = new JLabel(
				"Zweik\u00E4mpfe am Boden (verloren)");
		lblZweikmpfeAmBoden_1.setBounds(10, 186, 236, 14);
		contentPane.add(lblZweikmpfeAmBoden_1);

		spinner_6 = new JSpinner();
		spinner_6.setBounds(256, 180, 53, 20);
		contentPane.add(spinner_6);

		JLabel lblZweikmpfeInDer = new JLabel(
				"Zweik\u00E4mpfe in der Luft (gewonnen)");
		lblZweikmpfeInDer.setBounds(10, 211, 236, 14);
		contentPane.add(lblZweikmpfeInDer);

		spinner_7 = new JSpinner();
		spinner_7.setBounds(256, 205, 53, 20);
		contentPane.add(spinner_7);

		JLabel lblZweikmpfeInDer_1 = new JLabel(
				"Zweik\u00E4mpfe in der Luft (verloren)");
		lblZweikmpfeInDer_1.setBounds(10, 236, 236, 14);
		contentPane.add(lblZweikmpfeInDer_1);

		spinner_8 = new JSpinner();
		spinner_8.setBounds(256, 230, 53, 20);
		contentPane.add(spinner_8);

		JLabel lblPssegesamt = new JLabel("P\u00E4sse (gesamt)");
		lblPssegesamt.setBounds(10, 261, 236, 14);
		contentPane.add(lblPssegesamt);

		spinner_9 = new JSpinner();
		spinner_9.setBounds(256, 258, 53, 20);
		contentPane.add(spinner_9);

		JLabel lblPsseangekommen = new JLabel("P\u00E4sse (angekommen)");
		lblPsseangekommen.setBounds(10, 286, 236, 14);
		contentPane.add(lblPsseangekommen);

		spinner_10 = new JSpinner();
		spinner_10.setBounds(256, 283, 53, 20);
		contentPane.add(spinner_10);

		JLabel lblPssekurzeDistanz = new JLabel("P\u00E4sse (kurze Distanz");
		lblPssekurzeDistanz.setBounds(10, 311, 236, 14);
		contentPane.add(lblPssekurzeDistanz);

		spinner_11 = new JSpinner();
		spinner_11.setBounds(256, 308, 53, 20);
		contentPane.add(spinner_11);

		JLabel lblDribblingzeitIm = new JLabel(
				"Dribbling (Zeit in sec. im Parcour)");
		lblDribblingzeitIm.setBounds(10, 336, 236, 14);
		contentPane.add(lblDribblingzeitIm);

		spinner_12 = new JSpinner();
		spinner_12.setBounds(256, 333, 53, 20);
		contentPane.add(spinner_12);

		JLabel lblSpielverstndnis = new JLabel("Spielverst\u00E4ndnis (1 - 6)");
		lblSpielverstndnis.setBounds(10, 361, 236, 14);
		contentPane.add(lblSpielverstndnis);

		spinner_13 = new JSpinner();
		spinner_13.setModel(new SpinnerNumberModel(1, 1, 6, 1));
		spinner_13.setBounds(256, 358, 53, 20);
		contentPane.add(spinner_13);

		JLabel lblFlankengesamt = new JLabel("Flanken (gesamt)");
		lblFlankengesamt.setBounds(10, 386, 236, 14);
		contentPane.add(lblFlankengesamt);

		spinner_14 = new JSpinner();
		spinner_14.setBounds(256, 383, 53, 20);
		contentPane.add(spinner_14);

		JLabel lblFlankenerfolgreich = new JLabel("Flanken (erfolgreich)");
		lblFlankenerfolgreich.setBounds(10, 411, 236, 14);
		contentPane.add(lblFlankenerfolgreich);

		spinner_15 = new JSpinner();
		spinner_15.setBounds(256, 408, 53, 20);
		contentPane.add(spinner_15);

		JLabel lblSchsseAufsTor = new JLabel("Sch\u00FCsse aufs Tor");
		lblSchsseAufsTor.setBounds(10, 436, 236, 14);
		contentPane.add(lblSchsseAufsTor);

		spinner_16 = new JSpinner();
		spinner_16.setBounds(256, 433, 53, 20);
		contentPane.add(spinner_16);

		// ####################MENU####################

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 21);
		contentPane.add(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		mntmClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmCheatSheet = new JMenuItem("Cheat Sheet");
		mnHelp.add(mntmCheatSheet);
		
		JSeparator separator = new JSeparator();
		mnHelp.add(separator);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		mntmAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				About_Window aw = new About_Window();
				aw.setVisible(true);
				
			}
		});
		
		mntmCheatSheet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Help_Window hw = new Help_Window();
				hw.setVisible(true);
				
			}
		});

		// ####################BUTTONS####################
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Dialog_Window dialog = new Dialog_Window();
				dialog.setVisible(true);
								

				System.out.println("Calculating Optimal Position");

				values[0] = Integer.parseInt(spinner.getValue().toString());
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

				player = new Player(values);
				// player.printValues(values);
				player.calcPos();

				// String inhabits the calculated Positions
				String string = player.positions;

				desktopPane.setBackground(Color.GREEN);
				JLabel lblNewLabel = new JLabel(
						"Perfect Position(s) for Player: " + string);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(141, 142, 200, 97);
				desktopPane.add(lblNewLabel);

			}
		});

		btnSubmit.setBounds(678, 523, 106, 37);
		contentPane.add(btnSubmit);
	}

	public int[] deliverValues() {
		return values;
	}
}

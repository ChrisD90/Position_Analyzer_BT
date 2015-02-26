package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ButtonGroup;


public class Start_Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public Start_Window() {
		setResizable(false);
		setTitle("Select Option");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = dimension.width;
		int y = dimension.height;
		setBounds(((x-400)/2), ((y-300)/2), 400, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnTesdaten = new JRadioButton("Analyse auf Grund von Tesdaten");
		buttonGroup.add(rdbtnTesdaten);
		rdbtnTesdaten.setBounds(11, 79, 372, 29);
		contentPane.add(rdbtnTesdaten);
		
		JRadioButton rdbtnAnalyseAufGrund_1 = new JRadioButton("Analyse auf Grund von Spielbeobachtungsdaten");
		buttonGroup.add(rdbtnAnalyseAufGrund_1);
		rdbtnAnalyseAufGrund_1.setBounds(11, 131, 372, 29);
		contentPane.add(rdbtnAnalyseAufGrund_1);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(264, 215, 115, 29);
		contentPane.add(btnOk);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 394, 31);
		contentPane.add(menuBar);
		
		JMenu mnData = new JMenu("Data");
		menuBar.add(mnData);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnData.add(mntmHelp);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnData.add(mntmClose);
		initActions(rdbtnTesdaten, rdbtnAnalyseAufGrund_1, btnOk, mntmClose);
		
	}

	private void initActions(JRadioButton rdbtnTesdaten,
			JRadioButton rdbtnAnalyseAufGrund_1, JButton btnOk,
			JMenuItem mntmClose) {
		mntmClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnTesdaten.isSelected()) {
					Main_Window_Testdata mw = new Main_Window_Testdata();
					mw.setVisible(true);
					dispose();
				} else if(rdbtnAnalyseAufGrund_1.isSelected()) {
					Main_Window_Spielbeobachtung mws = new Main_Window_Spielbeobachtung();
					mws.setVisible(true);
					dispose();
				}
				
			}
		});
	}
}

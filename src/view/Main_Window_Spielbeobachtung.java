package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Main_Window_Spielbeobachtung extends JFrame {

	private JPanel contentPane;

	String pdf_path;
	/**
	 * Create the frame.
	 */
	public Main_Window_Spielbeobachtung(String pdf_Path) {
		this.pdf_path = pdf_Path;
		//Test Path
		System.out.println(pdf_path);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel(this.pdf_path);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}
	
	private void readPdf() {
		
	}

}

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import control.FileChooser;
import control.PDFreader;

public class Main_Window_Spielbeobachtung extends JFrame {

	private JPanel contentPane;

	String pdf_path;

	/**
	 * Create the frame.
	 */
	public Main_Window_Spielbeobachtung() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(15, 498, 115, 29);
		contentPane.add(btnBack);

		JButton btnSelectFile = new JButton("Select File");
		btnSelectFile.setBounds(15, 16, 115, 29);
		contentPane.add(btnSelectFile);

		JButton btnReadPdf = new JButton("Read PDF");
		btnReadPdf.setEnabled(false);
		btnReadPdf.setBounds(15, 77, 115, 29);
		contentPane.add(btnReadPdf);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(145, 20, 618, 20);
		contentPane.add(lblNewLabel);

		btnSelectFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				FileChooser fc = new FileChooser();
				pdf_path = fc.dataPath();
				lblNewLabel.setText(pdf_path);
				btnReadPdf.setEnabled(true);
			}
		});

		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Start_Window sw = new Start_Window();
				sw.setVisible(true);
				dispose();
			}
		});
		
		btnReadPdf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				PDFreader reader = new PDFreader(pdf_path);
			}
		});
	}

	private void readPdf() {

	}

}

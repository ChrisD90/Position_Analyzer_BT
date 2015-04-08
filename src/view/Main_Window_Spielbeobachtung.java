package view;

import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import control.FileChooser;
import control.PDFreader;

import javax.swing.JTable;
import javax.swing.ImageIcon;

public class Main_Window_Spielbeobachtung extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	Start_Window sw = new Start_Window();
	String pdf_path;

	/**
	 * Create the frame.
	 */
	public Main_Window_Spielbeobachtung() {
		setTitle("Analyse auf Grundlage von Spielbeobachtungsdaten...");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = dimension.width;
		int y = dimension.height;
		setBounds(((x - 800) / 2), ((y - 600) / 2), 350, 240);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(145, 20, 618, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(145, 167, 58, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sw.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Main_Window_Spielbeobachtung.class.getResource("/media/nothing_to_do_here_gif_by_cartoonzack-d5l4eqj.jpg")));
		lblNewLabel_1.setBounds(0, 0, 334, 201);
		contentPane.add(lblNewLabel_1);
	}

	/**
	 * TO-DO: shows Data as a JTable
	 */
	private void initTable() {
		
	}
}

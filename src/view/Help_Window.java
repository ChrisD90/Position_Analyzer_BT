package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;


import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help_Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Help_Window() {
		setAlwaysOnTop(true);
		setBackground(Color.WHITE);
		setTitle("Help");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = dimension.width;
		int y = dimension.height;
		setBounds(((x-800)/2), ((y-600)/2), 800, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(685, 527, 89, 23);
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		contentPane.add(btnClose);
		
		JLabel lblV = new JLabel("v. 1.0 - authored by N. Bayer & C. Doeringer - all Rights reserved\r\n");
		lblV.setBounds(10, 531, 665, 14);
		contentPane.add(lblV);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.setText("For Help, please contact\n\nchristoph.doeringer@gmail.com");
		textArea.setBounds(0, 0, 784, 521);
		contentPane.add(textArea);
	}
}

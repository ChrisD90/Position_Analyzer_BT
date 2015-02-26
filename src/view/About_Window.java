package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.TextArea;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.Label;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About_Window extends JDialog {

	/**
	 * Create the dialog.
	 */
	public About_Window() {
		setAlwaysOnTop(true);
		setBackground(SystemColor.window);
		setTitle("About...");
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = dimension.width;
		int y = dimension.height;
		setBounds(((x-530)/2), ((y-300)/2), 530, 300);
		getContentPane().setLayout(null);
		
		{
			JButton btnClose = new JButton("Close");
			btnClose.setBounds(425, 237, 89, 23);
			getContentPane().add(btnClose);
			btnClose.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();					
				}
			});
		}
		{
			TextArea textArea = new TextArea();
			textArea.setFont(new Font("Arial", Font.BOLD, 13));
			textArea.setText("\"Requirement profile according to playing position in Soccer - \r\nAnalysis based on test data and game observation data\"\r\n\r\nThis project was created by\r\nNicolas Bayer & Christoph Doeringer\r\nTU Darmstadt, 2015\r\n\r\n\r\nAll pictures are their owners purpose!\r\nData was provided by Instat - http://www.instatfootball.com/\r\n\r\nThis software was created with Eclipse Lunar - \r\ndownloadable via https://eclipse.org/");
			textArea.setBounds(102, 0, 422, 231);
			getContentPane().add(textArea);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBackground(Color.LIGHT_GRAY);
			lblNewLabel.setIcon(new ImageIcon(About_Window.class.getResource("/media/DFBEagle.svg.jpg")));
			lblNewLabel.setBounds(10, 79, 75, 88);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(About_Window.class.getResource("/media/Wolfsburg.jpg")));
			lblNewLabel_1.setBounds(10, 178, 75, 75);
			getContentPane().add(lblNewLabel_1);
		}
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(About_Window.class.getResource("/media/photo.png")));
		lblNewLabel_2.setBounds(10, 11, 50, 50);
		getContentPane().add(lblNewLabel_2);
	}
}

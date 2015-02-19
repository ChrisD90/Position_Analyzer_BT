package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Dialog_Window extends JDialog {

	/**
	 * Create the dialog.
	 */
	public Dialog_Window() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JButton okButton = new JButton("OK");
			okButton.setBounds(15, 186, 106, 42);
			getContentPane().add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
			
			okButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				dispose();
					
				}
			});
		}
		
		JLabel lblPositionWirdAuf = new JLabel("Position wird berechnet!!");
		lblPositionWirdAuf.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPositionWirdAuf.setHorizontalAlignment(SwingConstants.CENTER);
		lblPositionWirdAuf.setBounds(15, 68, 398, 56);
		getContentPane().add(lblPositionWirdAuf);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Dialog_Window.class.getResource("/media/player.jpg")));
		lblNewLabel.setBounds(0, 0, 428, 244);
		getContentPane().add(lblNewLabel);
	}
}

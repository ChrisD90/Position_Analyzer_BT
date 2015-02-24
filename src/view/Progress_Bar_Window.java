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

import java.awt.Toolkit;

import javax.swing.JProgressBar;

import java.awt.Color;

public class Progress_Bar_Window extends JDialog {

	JProgressBar progressBar;

	/**
	 * Create the dialog.
	 */
	public Progress_Bar_Window() {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Progress_Bar_Window.class.getResource("/media/player.jpg")));
		setBounds(450, 200, 450, 300);
		getContentPane().setLayout(null);

		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(51, 204, 51));
		progressBar.setBounds(100, 135, 232, 14);
		getContentPane().add(progressBar);
		progressBar.setStringPainted(true);
		
		JButton okButton = new JButton("OK");
		okButton.setEnabled(false);
		okButton.setBounds(15, 208, 106, 42);
		getContentPane().add(okButton);
		getRootPane().setDefaultButton(okButton);

		okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i <= 100; i++) {
					try {
						Thread.sleep(25);
					} catch (InterruptedException ex) {
					}
					progressBar.setValue(i);
					
				}
				okButton.setEnabled(true);
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();

		JLabel lblPositionWirdAuf = new JLabel("Position wird berechnet!!");
		lblPositionWirdAuf.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPositionWirdAuf.setHorizontalAlignment(SwingConstants.CENTER);
		lblPositionWirdAuf.setBounds(15, 68, 398, 56);
		getContentPane().add(lblPositionWirdAuf);

		

	}

}
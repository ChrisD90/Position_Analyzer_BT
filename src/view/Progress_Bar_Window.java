package view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Toolkit;

import javax.swing.JProgressBar;

import java.awt.Color;

public class Progress_Bar_Window extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JProgressBar progressBar;

	int time;
	String string;
	/**
	 * Create the dialog.
	 */
	public Progress_Bar_Window(int time, String string) {
		this.time = time;
		this.string = string;
		
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Progress_Bar_Window.class.getResource("/media/player.jpg")));

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = dimension.width;
		int y = dimension.height;
		setBounds(((x - 450) / 2), ((y - 300) / 2), 450, 300);
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
				Result_Testdata_Window rtw = new Result_Testdata_Window(string);
				rtw.setVisible(true);
				dispose();
			}
		});

		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i <= 100; i++) {
					try {
						Thread.sleep(time);
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

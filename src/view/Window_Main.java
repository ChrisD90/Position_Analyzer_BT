package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import control.FileChooser;

@SuppressWarnings("serial")
public class Window_Main extends JFrame {

	JButton openFile;

	public Window_Main() {

		int windowX = 800;
		int windowY = 600;
		final Dimension d = this.getToolkit().getScreenSize();

		setLocation((int) ((d.getWidth() - this.getWidth()) / 2) - windowX / 2,
				(int) ((d.getHeight() - this.getHeight()) / 2) - windowY / 2);
		setSize(windowX, windowY);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());

		initButtons();
		
		this.add(openFile, BorderLayout.SOUTH);

		setVisible(true);
	}
	
	private void initButtons() {
		openFile = new JButton("open PDF");
		openFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				FileChooser fc = new FileChooser();

			}
		});
	}
}

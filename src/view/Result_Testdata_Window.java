package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Result_Testdata_Window extends JFrame {

	private JPanel contentPane;

	String string;
	
	/**
	 * Create the frame.
	 */
	public Result_Testdata_Window(String string) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Result_Testdata_Window.class.getResource("/media/player.jpg")));
		setTitle("Results...");
		
		this.string = string;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = dimension.width;
		int y = dimension.height;
		setBounds(((x - 450) / 2), ((y - 300) / 2), 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText(string);
		textPane.setEditable(false);
		textPane.setBounds(0, 0, 434, 222);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
	}
}

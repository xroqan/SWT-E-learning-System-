import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class BackButton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BackButton frame = new BackButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BackButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Arbeitsraum");
		btnNewButton.setBounds(76, 29, 251, 38);
		contentPane.add(btnNewButton);
		
		JButton btnDateiordner = new JButton("Dateiordner");
		btnDateiordner.setBounds(76, 77, 251, 38);
		contentPane.add(btnDateiordner);
		
		JButton btnNewButton_1_1 = new JButton("Forum");
		btnNewButton_1_1.setBounds(76, 125, 251, 38);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Gruppenverwaltung");
		btnNewButton_1_2.setBounds(76, 176, 251, 38);
		contentPane.add(btnNewButton_1_2);
	}
}

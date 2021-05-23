import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dateiordner {

	private JFrame frmFfvgbgbh;
	private JTextField txtDateiordner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dateiordner window = new Dateiordner();
					window.frmFfvgbgbh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dateiordner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFfvgbgbh = new JFrame();
		frmFfvgbgbh.setTitle("ffvgbgbh");
		frmFfvgbgbh.getContentPane().setBackground(new Color(0, 191, 255));
		frmFfvgbgbh.setBounds(100, 100, 450, 300);
		frmFfvgbgbh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFfvgbgbh.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Hochladen");
		btnNewButton.setBounds(21, 232, 85, 21);
		frmFfvgbgbh.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("L\u00F6schen");
		btnNewButton_2.setBounds(341, 232, 85, 21);
		frmFfvgbgbh.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Herunterladen ");
		btnNewButton_1.setBounds(171, 232, 85, 21);
		frmFfvgbgbh.getContentPane().add(btnNewButton_1);
		
		txtDateiordner = new JTextField();
		txtDateiordner.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtDateiordner.setHorizontalAlignment(SwingConstants.CENTER);
		txtDateiordner.setText("Dateiordner");
		txtDateiordner.setBounds(43, 10, 324, 19);
		frmFfvgbgbh.getContentPane().add(txtDateiordner);
		txtDateiordner.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("x");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BackButton obj = new BackButton();
				obj.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBounds(380, 9, 46, 20);
		frmFfvgbgbh.getContentPane().add(btnNewButton_3);
	}
}

package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class ResetPass {

	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResetPass window = new ResetPass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResetPass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 229);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsernameuser = new JLabel("Username:user");
		lblUsernameuser.setBounds(53, 11, 126, 14);
		frame.getContentPane().add(lblUsernameuser);
		
		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setBounds(36, 56, 126, 14);
		frame.getContentPane().add(lblNewPassword);
		
		JLabel lblPassword = new JLabel("Confirm Password:");
		lblPassword.setBounds(23, 92, 145, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 89, 211, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(139, 53, 211, 20);
		frame.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(139, 140, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(0, 191, 255));
		btnCancel.setBounds(261, 140, 89, 23);
		frame.getContentPane().add(btnCancel);
	}

}

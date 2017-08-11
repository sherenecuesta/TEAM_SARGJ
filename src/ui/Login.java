package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class Login {

	private static final int CENTER = 0;
	private JFrame frame;
	private JTextField textField;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PRODUCT MANAGEMENT SYSTEM");
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setSize(500,500);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLogin.setBounds(216, 49, 57, 36);
		frame.getContentPane().add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(187, 152, 116, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(69, 155, 89, 14);
		frame.getContentPane().add(lblUsername);
		
		lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(69, 190, 79, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(187, 187, 116, 20);
		frame.getContentPane().add(passwordField);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(115, 273, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(0, 191, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBounds(240, 273, 89, 23);
		frame.getContentPane().add(btnExit);
	}
}

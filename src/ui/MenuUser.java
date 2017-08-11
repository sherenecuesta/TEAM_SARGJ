package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MenuUser {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUser window = new MenuUser();
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
	public MenuUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PRODUCT MANAGEMENT SYSTEM");
		frame.setVisible(true);
		frame.getContentPane().setForeground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenuAdmin = new JLabel("Menu: Admin");
		lblMenuAdmin.setBounds(155, 34, 124, 25);
		lblMenuAdmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblMenuAdmin);
		
		JButton btnNewButton = new JButton("Set Administrative Rights");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(102, 104, 207, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMaintainProduct = new JButton("Maintain Product");
		btnMaintainProduct.setBackground(new Color(0, 191, 255));
		btnMaintainProduct.setForeground(Color.BLACK);
		btnMaintainProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMaintainProduct.setBounds(102, 138, 207, 23);
		frame.getContentPane().add(btnMaintainProduct);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(0, 191, 255));
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setBounds(102, 172, 207, 23);
		frame.getContentPane().add(btnLogout);
	}
}

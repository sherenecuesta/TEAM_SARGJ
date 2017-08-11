package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DeleteUser {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteUser window = new DeleteUser();
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
	public DeleteUser() {
		setTitle("ADD USER RIGHTS");
		initialize();
	}

	private void setTitle(String string) {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("DELETE USER");
		frame.setVisible(true);
		frame.setBounds(100, 100, 542, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:user");
		lblUsername.setBounds(62, 49, 99, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblMaintainProductRights = new JLabel("Maintain Product Rights");
		lblMaintainProductRights.setBounds(39, 96, 137, 14);
		frame.getContentPane().add(lblMaintainProductRights);
		
		JLabel lblPrintReportRights = new JLabel("Print Report Rights");
		lblPrintReportRights.setBounds(39, 174, 137, 14);
		frame.getContentPane().add(lblPrintReportRights);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(127, 314, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("No");
		btnCancel.setBackground(new Color(0, 191, 255));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.setBounds(271, 314, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblCanAdd = new JLabel("Can Add");
		lblCanAdd.setBounds(62, 124, 99, 14);
		frame.getContentPane().add(lblCanAdd);
		
		JLabel lblCanDelete = new JLabel("Can Delete");
		lblCanDelete.setBounds(167, 124, 99, 14);
		frame.getContentPane().add(lblCanDelete);
		
		JLabel lblCanUpdate = new JLabel("Can Update");
		lblCanUpdate.setBounds(272, 124, 99, 14);
		frame.getContentPane().add(lblCanUpdate);
		
		JLabel lblCanView = new JLabel("Can View");
		lblCanView.setBounds(391, 124, 99, 14);
		frame.getContentPane().add(lblCanView);
		
		JLabel lblCanPrintPrice = new JLabel("Can Print Price History");
		lblCanPrintPrice.setBounds(62, 199, 154, 14);
		frame.getContentPane().add(lblCanPrintPrice);
		
		JLabel lblCanPrintProduct = new JLabel("Can Print Product List");
		lblCanPrintProduct.setBounds(62, 234, 137, 14);
		frame.getContentPane().add(lblCanPrintProduct);
		
		JLabel lblCanPrintSales = new JLabel("Can Print Sales");
		lblCanPrintSales.setBounds(62, 272, 99, 14);
		frame.getContentPane().add(lblCanPrintSales);
		
		JLabel lblAreYouSure = new JLabel("Are you sure to delete this user?");
		lblAreYouSure.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAreYouSure.setBounds(137, 11, 281, 14);
		frame.getContentPane().add(lblAreYouSure);
	}
}

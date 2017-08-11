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

public class AddUser {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser window = new AddUser();
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
	public AddUser() {
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
		
		
		frame = new JFrame("ADD USER");
		frame.setVisible(true);
		frame.setBounds(100, 100, 542, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(62, 49, 67, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(221, 49, 82, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblMaintainProductRights = new JLabel("Maintain Product Rights");
		lblMaintainProductRights.setBounds(39, 96, 137, 14);
		frame.getContentPane().add(lblMaintainProductRights);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Can Add");
		chckbxNewCheckBox.setBounds(53, 139, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxCanDelete = new JCheckBox("Can Delete");
		chckbxCanDelete.setBounds(152, 139, 97, 23);
		frame.getContentPane().add(chckbxCanDelete);
		
		JCheckBox chckbxCanUpdate = new JCheckBox("Can Update");
		chckbxCanUpdate.setBounds(263, 139, 97, 23);
		frame.getContentPane().add(chckbxCanUpdate);
		
		JCheckBox chckbxCanView = new JCheckBox("Can View");
		chckbxCanView.setBounds(380, 139, 97, 23);
		frame.getContentPane().add(chckbxCanView);
		
		JLabel lblPrintReportRights = new JLabel("Print Report Rights");
		lblPrintReportRights.setBounds(39, 189, 137, 14);
		frame.getContentPane().add(lblPrintReportRights);
		
		JCheckBox chckbxPrintPriceHistory = new JCheckBox("Print Price History");
		chckbxPrintPriceHistory.setBounds(64, 220, 152, 23);
		frame.getContentPane().add(chckbxPrintPriceHistory);
		
		JCheckBox chckbxPrintProductList = new JCheckBox("Print Product List");
		chckbxPrintProductList.setBounds(64, 246, 152, 23);
		frame.getContentPane().add(chckbxPrintProductList);
		
		JCheckBox chckbxPrintSales = new JCheckBox("Print Sales");
		chckbxPrintSales.setBounds(64, 272, 97, 23);
		frame.getContentPane().add(chckbxPrintSales);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(127, 314, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(0, 191, 255));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.setBounds(271, 314, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(125, 46, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(285, 46, 97, 20);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(285, 74, 97, 20);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setBounds(170, 74, 146, 14);
		frame.getContentPane().add(lblConfirmPassword);
	}
}

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

public class UserUpdate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserUpdate window = new UserUpdate();
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
	public UserUpdate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("UPDATE USER");
		frame.setVisible(true);
		frame.setBounds(100, 100, 542, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username: user");
		lblUsername.setBounds(39, 51, 99, 14);
		frame.getContentPane().add(lblUsername);
		
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
		chckbxPrintPriceHistory.setBounds(64, 220, 137, 23);
		frame.getContentPane().add(chckbxPrintPriceHistory);
		
		JCheckBox chckbxPrintProductList = new JCheckBox("Print Product List");
		chckbxPrintProductList.setBounds(64, 246, 137, 23);
		frame.getContentPane().add(chckbxPrintProductList);
		
		JCheckBox chckbxPrintSales = new JCheckBox("Print Sales");
		chckbxPrintSales.setBounds(64, 272, 137, 23);
		frame.getContentPane().add(chckbxPrintSales);
		
		JButton btnNewButton = new JButton("Update");
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
	}
}

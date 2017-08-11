package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class AddPrice {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPrice window = new AddPrice();
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
	public AddPrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("ADD PRICE");
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblProductCodeExad = new JLabel("Product Code: ");
		lblProductCodeExad.setBounds(49, 37, 150, 14);
		frame.getContentPane().add(lblProductCodeExad);
		
		JLabel lblProductDescriptionToshiba = new JLabel("Product Description:");
		lblProductDescriptionToshiba.setBounds(49, 67, 311, 14);
		frame.getContentPane().add(lblProductDescriptionToshiba);
		
		JLabel lblProductUnitea = new JLabel("Product unit:");
		lblProductUnitea.setBounds(49, 92, 126, 14);
		frame.getContentPane().add(lblProductUnitea);
		
		JLabel lblCurrentPrice = new JLabel("Effective Date:");
		lblCurrentPrice.setBounds(49, 117, 150, 14);
		frame.getContentPane().add(lblCurrentPrice);
		
		JButton btnNewButton = new JButton("Add Price");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(99, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNo = new JButton("Cancel");
		btnNo.setBackground(new Color(0, 191, 255));
		btnNo.setBounds(235, 215, 89, 23);
		frame.getContentPane().add(btnNo);
		
		textField = new JTextField();
		textField.setBounds(134, 117, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUnitPrice = new JLabel("Unit Price:");
		lblUnitPrice.setBounds(49, 148, 150, 14);
		frame.getContentPane().add(lblUnitPrice);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(134, 145, 86, 20);
		frame.getContentPane().add(textField_1);
	}

}

package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class EditProduct {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditProduct window = new EditProduct();
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
	public EditProduct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("EDIT PRODUCT");
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Code:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(59, 39, 115, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(202, 36, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblProductDescription = new JLabel("Product Description:");
		lblProductDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductDescription.setBounds(59, 75, 133, 14);
		frame.getContentPane().add(lblProductDescription);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 74, 139, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblProductUnit = new JLabel("Product Unit:");
		lblProductUnit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductUnit.setBounds(59, 120, 133, 14);
		frame.getContentPane().add(lblProductUnit);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(202, 119, 139, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 160, 139, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(202, 198, 139, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblEffectiveDate = new JLabel("Effective Date:");
		lblEffectiveDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEffectiveDate.setBounds(59, 163, 133, 14);
		frame.getContentPane().add(lblEffectiveDate);
		
		JLabel lblCurrentPrice = new JLabel("Current Price:");
		lblCurrentPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCurrentPrice.setBounds(59, 201, 133, 14);
		frame.getContentPane().add(lblCurrentPrice);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(103, 260, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(0, 191, 255));
		btnCancel.setBounds(223, 260, 89, 23);
		frame.getContentPane().add(btnCancel);
	}

}

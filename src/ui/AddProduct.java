package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class AddProduct {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProduct window = new AddProduct();
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
	public AddProduct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame("ADD PRODUCT");
		frame.setVisible(true);
		frame.setBounds(100, 100, 419, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Code:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(54, 33, 122, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(213, 30, 110, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(213, 67, 110, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblProductDescription = new JLabel("Product Description:");
		lblProductDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductDescription.setBounds(54, 68, 149, 14);
		frame.getContentPane().add(lblProductDescription);
		
		JLabel lblProductUnit = new JLabel("Product Unit:");
		lblProductUnit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductUnit.setBounds(54, 105, 149, 14);
		frame.getContentPane().add(lblProductUnit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setEditable(true);
		comboBox.setBounds(213, 104, 68, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblEffectiveDate = new JLabel("Effective Date:");
		lblEffectiveDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEffectiveDate.setBounds(54, 160, 149, 14);
		frame.getContentPane().add(lblEffectiveDate);
		
		JLabel lblProductPrice = new JLabel("Product Price:");
		lblProductPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProductPrice.setBounds(54, 214, 149, 14);
		frame.getContentPane().add(lblProductPrice);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 213, 110, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(102, 306, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(0, 191, 255));
		btnCancel.setBounds(234, 306, 89, 23);
		frame.getContentPane().add(btnCancel);
	}
}

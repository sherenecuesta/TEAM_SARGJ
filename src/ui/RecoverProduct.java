package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class RecoverProduct {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecoverProduct window = new RecoverProduct();
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
	public RecoverProduct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARE YOU SURE YOU WANT TO RECOVER THIS PRODUCT?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(26, 27, 398, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblProductCodeExad = new JLabel("Product Code: ");
		lblProductCodeExad.setBounds(49, 78, 150, 14);
		frame.getContentPane().add(lblProductCodeExad);
		
		JLabel lblProductDescriptionToshiba = new JLabel("Product Description: Toshiba Convio 1TB");
		lblProductDescriptionToshiba.setBounds(49, 111, 227, 14);
		frame.getContentPane().add(lblProductDescriptionToshiba);
		
		JLabel lblProductUnitea = new JLabel("Product unit:ea");
		lblProductUnitea.setBounds(49, 140, 126, 14);
		frame.getContentPane().add(lblProductUnitea);
		
		JLabel lblCurrentPrice = new JLabel("Current Price: 2910.15");
		lblCurrentPrice.setBounds(49, 165, 150, 14);
		frame.getContentPane().add(lblCurrentPrice);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(99, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNo = new JButton("No");
		btnNo.setBackground(new Color(0, 191, 255));
		btnNo.setBounds(235, 215, 89, 23);
		frame.getContentPane().add(btnNo);
	}

}

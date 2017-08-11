package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PrintReports {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintReports window = new PrintReports();
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
	public PrintReports() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PRODUCT MANAGEMENT SYSTEM");
		frame.setBounds(100, 100, 450, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPrintReports = new JLabel("Print Reports");
		lblPrintReports.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrintReports.setBounds(179, 11, 140, 14);
		frame.getContentPane().add(lblPrintReports);
		
		JButton btnNewButton = new JButton("Print Price Report");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(71, 51, 293, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnProductListReport = new JButton("Product List Report");
		btnProductListReport.setBackground(new Color(0, 191, 255));
		btnProductListReport.setBounds(71, 102, 293, 51);
		frame.getContentPane().add(btnProductListReport);
		
		JButton btnSalesReport = new JButton("Sales Report");
		btnSalesReport.setBackground(new Color(0, 191, 255));
		btnSalesReport.setBounds(71, 153, 293, 51);
		frame.getContentPane().add(btnSalesReport);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 191, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBack.setBounds(71, 203, 293, 51);
		frame.getContentPane().add(btnBack);
	}

}

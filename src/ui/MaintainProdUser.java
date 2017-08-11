package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class MaintainProdUser {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaintainProdUser window = new MaintainProdUser();
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
	public MaintainProdUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PRODUCT MANAGEMENT SYSTEM");
		frame.setVisible(true);
		frame.setBounds(100, 100, 584, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Product Code:");
		
		JLabel lblNewLabel_1 = new JLabel("Maintain Product: User");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Produc Description:");
		
		JLabel lblProducList = new JLabel("Produc Unit:");
		
		JLabel lblCurrentPrice = new JLabel("Current Price: ");
		
		JLabel lblProducStamp = new JLabel("Produc Stamp:");
		
		JButton btnNewButton = new JButton("Add Product");
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnEditProduct = new JButton("Edit Product");
		btnEditProduct.setBackground(new Color(0, 191, 255));
		
		JButton btnDeleteProduct = new JButton("Delete Product");
		btnDeleteProduct.setBackground(new Color(0, 191, 255));
		
		JButton btnAddeditPrice = new JButton("Add/Edit Price");
		btnAddeditPrice.setBackground(new Color(0, 191, 255));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton button = new JButton("<<");
		button.setBackground(new Color(0, 191, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBackground(new Color(0, 191, 255));
		
		JButton btnNext = new JButton("Next");
		btnNext.setBackground(new Color(0, 191, 255));
		
		JButton btnArrow = new JButton(">>");
		btnArrow.setBackground(new Color(0, 191, 255));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(0, 191, 255));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(465, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(443, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblProducList, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(443, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCurrentPrice, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(443, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(165)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(203, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnEditProduct, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnPrevious)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnDeleteProduct, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnAddeditPrice, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnArrow, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))))
							.addGap(61))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblProducStamp, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(42, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblProducList)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCurrentPrice)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblProducStamp)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnEditProduct)
						.addComponent(btnDeleteProduct)
						.addComponent(btnAddeditPrice))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(btnPrevious)
						.addComponent(btnNext)
						.addComponent(btnArrow)
						.addComponent(btnBack))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setBackground(new Color(0, 139, 139));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Effective Date", "Unit Price", "Stamp"
			}
		));
		scrollPane.setViewportView(table);
		frame.getContentPane().setLayout(groupLayout);
	}

}

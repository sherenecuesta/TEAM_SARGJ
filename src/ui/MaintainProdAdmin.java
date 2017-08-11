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

public class MaintainProdAdmin {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaintainProdAdmin window = new MaintainProdAdmin();
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
	public MaintainProdAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("PRODUCT MANAGEMENT SYSTEM");
		frame.setVisible(true);
		frame.setBounds(100, 100, 611, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Product Code:");
		
		JLabel lblNewLabel_1 = new JLabel("Maintain Product: Admin");
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
		
		JButton btnRecoverProduct = new JButton("Recover Product");
		btnRecoverProduct.setBackground(new Color(0, 191, 255));
		
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
					.addContainerGap(479, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(457, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblProducList, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(457, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCurrentPrice, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(457, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblProducStamp, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(457, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(187)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(204, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnPrevious, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEditProduct, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnDeleteProduct, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnRecoverProduct))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnArrow, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
							.addGap(4)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnBack, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAddeditPrice, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
					.addGap(10))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(14, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 573, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
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
						.addComponent(btnEditProduct)
						.addComponent(btnDeleteProduct)
						.addComponent(btnRecoverProduct)
						.addComponent(btnAddeditPrice)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(btnPrevious)
						.addComponent(btnNext)
						.addComponent(btnBack)
						.addComponent(btnArrow))
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

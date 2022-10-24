package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travelling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
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
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(26, 11, 1297, 81);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Victor's Travel Ticketing Office");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Class");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(39, 133, 128, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnStandard.setBounds(26, 174, 146, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnEconomy.setBounds(26, 226, 169, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnFirstClass.setBounds(26, 284, 169, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnReturnTicket.setBounds(197, 226, 180, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnSingleTicket.setBounds(197, 174, 180, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(39, 167, 467, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnAdult.setBounds(379, 174, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 18));
		rdbtnChild.setBounds(379, 226, 109, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox cmbDestination = new JComboBox();
		cmbDestination.setFont(new Font("Tahoma", Font.BOLD, 20));
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Tampa", "Orlando", "Jacksonville"}));
		cmbDestination.setBounds(201, 285, 312, 22);
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(39, 343, 467, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(39, 370, 61, 40);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("SubTotal");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(39, 430, 148, 31);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(39, 490, 120, 29);
		frame.getContentPane().add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTax.setBounds(213, 379, 107, 31);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtSubTotal.setBounds(213, 434, 107, 31);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTotal.setBounds(213, 492, 107, 32);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				double tax = 19.50;
				
				double MilesK8 = 250.78;  //tampa
				double MilesK12 = 375.10; //Orlando
				double MilesK20 = 450.23; // Jacksonville
				
				double totalCost, eco = 300.85, fclass = 500.60;
				
				//=========================================================================== TAMPA=======================================================================================================
				if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
						
				{	
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
						
					{	
						totalCost = (tax * MilesK8) / 100;
						String sTax = String.format("$%.2f", totalCost);
						txtTax.setText(sTax);
						String subTotal = String.format("$%.2f", MilesK8);
						txtSubTotal.setText(subTotal);
						String Total = String.format("$%.2f", MilesK8 + totalCost);
						txtTotal.setText(Total);
						txtPrice.setText(Total);
						txtClass.setText("STD");
						txtTicket.setText("ONE WAY");
						txtAdult.setText("ONE");
						txtChild.setText("NIL");
					}
				else if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost -25);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost - 18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
			
				//============================================================================ORLANDO==============================================================================================================
				
				if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost -25);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost - 18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				//================================================================================Jacksonville====================================================================
				
				if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost -25);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnStandard.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost - 18);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				else if ((rdbtnStandard.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				
				
				
				//************************************* E  C   O     N   O    M  Y       P  R  I   C  I   N  G   *************************************************************
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost+ eco);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost + eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost + eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				else if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost -25 + eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost - 18 + eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
			
				//============================================================================ORLANDO   ECON ==============================================================================================================
				
				if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12+ eco) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost+ eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12+ eco) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost -25+ eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12+ eco) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost - 18+ eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12+ eco) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("€%.2f", MilesK12 + totalCost+ eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				//================================================================================Jacksonville   ECONOMY ====================================================================
				
				if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20+ eco) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost+ eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20+ eco) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost -25+ eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnEconomy.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20+ eco) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost - 18+ eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				if ((rdbtnEconomy.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20) / 100;
					String sTax = String.format("$%.2f", totalCost+ eco);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20+ eco);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost+ eco);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				//============================================== F      I    R      S    T          C   L    A     S    S  =======================================================
				
				
				
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8 + fclass) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost + fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8 + fclass) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost + fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8 + fclass) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost -25 + fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Tampa"))
					
				{	
					totalCost = (tax * MilesK8 + fclass) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK8 + totalCost - 18 + fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
			
				//============================================================================ORLANDO   ECON ==============================================================================================================
				
				if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12+ fclass) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost+ fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12+ fclass) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost -25+ fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12+ fclass) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost - 18+ fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Orlando"))
					
				{	
					totalCost = (tax * MilesK12+ fclass) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK12+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK12 + totalCost+ fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				//================================================================================Jacksonville   ECONOMY ====================================================================
				
				if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20+ fclass) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost+ fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20+ fclass) / 100;
					String sTax = String.format("$%.2f", totalCost -25);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost -25+ fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				else if ((rdbtnFirstClass.isSelected())&& (rdbtnReturnTicket.isSelected())&& (rdbtnChild.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20+ fclass) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost - 18+ fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				if ((rdbtnFirstClass.isSelected())&& (rdbtnSingleTicket.isSelected())&& (rdbtnAdult.isSelected())&& cmbDestination.getSelectedItem().equals("Jacksonville"))
					
				{	
					totalCost = (tax * MilesK20+ fclass) / 100;
					String sTax = String.format("$%.2f", totalCost);
					txtTax.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK20+ fclass);
					txtSubTotal.setText(subTotal);
					String Total = String.format("$%.2f", MilesK20 + totalCost+ fclass);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
				}
				
				
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//=========================TIME=============================
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				//========================DATE==============================
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyy");
				txtDate.setText(tDate.format(timer.getTime()));
				
				txtFrom.setText("Jackonville, Florida");
				txtTo.setText((String) cmbDestination.getSelectedItem()+ " *");
				
				//============RANDOM NUMBER GENERATOR for ticket no.============
				
				int num1;
				String q1 = "";
				num1 = 1325 + (int) (Math.random() * 4238);
				q1 += num1 + 1325;
				txtTicketNo.setText(q1);
				
				//=============================================================
				
				txtRoute.setText("ANY");
				
			}
		});
		btnTotal.setToolTipText("Total Cost of Ticket");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTotal.setBounds(48, 569, 119, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnEconomy.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				txtTo.setText(null);
				txtFrom.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				txtChild.setText(null);
				txtClass.setText(null);
				txtTicket.setText(null);
				txtTicketNo.setText(null);
				txtAdult.setText(null);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(241, 569, 109, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confrim if you want to exit", "Ticketing Systems",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}
				
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(408, 569, 105, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(39, 543, 467, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(541, 167, 2, 378);
		frame.getContentPane().add(separator_3);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClass.setBounds(617, 166, 148, 31);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicket.setBounds(824, 169, 148, 31);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdult.setBounds(1022, 167, 148, 31);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChild.setBounds(1206, 167, 148, 31);
		frame.getContentPane().add(lblChild);
		
		txtClass = new JTextField();
		txtClass.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtClass.setColumns(10);
		txtClass.setBounds(610, 230, 107, 31);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTicket.setColumns(10);
		txtTicket.setBounds(824, 230, 107, 31);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAdult.setColumns(10);
		txtAdult.setBounds(1015, 230, 107, 31);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtChild.setColumns(10);
		txtChild.setBounds(1206, 230, 107, 31);
		frame.getContentPane().add(txtChild);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(610, 327, 148, 31);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTo.setBounds(610, 399, 148, 31);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(610, 466, 148, 31);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTime.setBounds(610, 543, 148, 31);
		frame.getContentPane().add(lblTime);
		
		txtFrom = new JTextField();
		txtFrom.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtFrom.setColumns(10);
		txtFrom.setBounds(716, 327, 215, 31);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTo.setColumns(10);
		txtTo.setBounds(716, 399, 215, 31);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDate.setColumns(10);
		txtDate.setBounds(824, 466, 107, 31);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTime.setColumns(10);
		txtTime.setBounds(824, 543, 107, 31);
		frame.getContentPane().add(txtTime);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setBounds(970, 297, 2, 307);
		frame.getContentPane().add(separator_3_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(603, 284, 709, 2);
		frame.getContentPane().add(separator_2_1);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketNo.setBounds(1104, 327, 148, 31);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(1104, 430, 148, 31);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoute.setBounds(1104, 527, 148, 31);
		frame.getContentPane().add(lblRoute);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(1105, 370, 107, 31);
		frame.getContentPane().add(txtTicketNo);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPrice.setColumns(10);
		txtPrice.setBounds(1104, 470, 107, 31);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtRoute.setColumns(10);
		txtRoute.setBounds(1105, 569, 107, 31);
		frame.getContentPane().add(txtRoute);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(603, 208, 709, 2);
		frame.getContentPane().add(separator_2_1_1);
	}
}

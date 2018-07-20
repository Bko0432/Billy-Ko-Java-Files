package Payroll_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Payrolls {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField PayDate;
	private JTextField textField_13;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField PaySlip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payrolls window = new Payrolls();
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
	public Payrolls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Ref. No.:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(29, 89, 239, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmployee = new JLabel("Employee Name: ");
		lblEmployee.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmployee.setBounds(29, 137, 239, 35);
		frame.getContentPane().add(lblEmployee);
		
		JLabel lblPostCode = new JLabel("Post Code:");
		lblPostCode.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPostCode.setBounds(29, 242, 239, 35);
		frame.getContentPane().add(lblPostCode);
		
		JLabel lblEmployeeAddress = new JLabel("Employee Address:");
		lblEmployeeAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmployeeAddress.setBounds(29, 194, 239, 35);
		frame.getContentPane().add(lblEmployeeAddress);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(239, 86, 281, 41);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(239, 140, 281, 41);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(239, 191, 281, 41);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(239, 242, 281, 41);
		frame.getContentPane().add(textField_4);
		
		JLabel lblInnerCityWeighting = new JLabel("Inner City Weighting:");
		lblInnerCityWeighting.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInnerCityWeighting.setBounds(29, 317, 239, 35);
		frame.getContentPane().add(lblInnerCityWeighting);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary:");
		lblBasicSalary.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBasicSalary.setBounds(29, 373, 239, 35);
		frame.getContentPane().add(lblBasicSalary);
		
		JLabel lblOverTime = new JLabel("Over Time:");
		lblOverTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOverTime.setBounds(29, 421, 239, 35);
		frame.getContentPane().add(lblOverTime);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(239, 314, 281, 41);
		frame.getContentPane().add(textField);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(239, 367, 281, 41);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(239, 418, 281, 41);
		frame.getContentPane().add(textField_6);
		
		JLabel lblGrossPay = new JLabel("Gross Pay:");
		lblGrossPay.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGrossPay.setBounds(29, 530, 239, 35);
		frame.getContentPane().add(lblGrossPay);
		
		JLabel lblPensionablePay = new JLabel("Pensionable Pay:");
		lblPensionablePay.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPensionablePay.setBounds(29, 578, 239, 35);
		frame.getContentPane().add(lblPensionablePay);
		
		JLabel lblNetPay = new JLabel("Net Pay:");
		lblNetPay.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNetPay.setBounds(29, 626, 239, 35);
		frame.getContentPane().add(lblNetPay);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(239, 524, 281, 41);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(239, 572, 281, 41);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(239, 620, 281, 41);
		frame.getContentPane().add(textField_9);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(12, 13, 1328, 62);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Payroll Management System");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(409, 13, 456, 42);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 32));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(551, 99, 371, 55);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Pay Date:");
		lblNewLabel_2.setBounds(12, 13, 116, 29);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(lblNewLabel_2);
		
		PayDate = new JTextField();
		PayDate.setBounds(182, 12, 177, 30);
		panel_1.add(PayDate);
		PayDate.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(551, 174, 371, 210);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Tax Period:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(12, 13, 144, 29);
		panel_2.add(lblNewLabel_3);
		
		JLabel label = new JLabel("Tax Code:");
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(12, 65, 144, 29);
		panel_2.add(label);
		
		JLabel lblNiCode = new JLabel("NI Code:");
		lblNiCode.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNiCode.setBounds(12, 117, 144, 29);
		panel_2.add(lblNiCode);
		
		JLabel lblNiNumber = new JLabel("NI Number:");
		lblNiNumber.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNiNumber.setBounds(12, 168, 144, 29);
		panel_2.add(lblNiNumber);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(182, 168, 177, 30);
		panel_2.add(textField_13);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(182, 13, 177, 30);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(182, 65, 177, 30);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(182, 117, 177, 30);
		panel_2.add(comboBox_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(950, 99, 390, 55);
		frame.getContentPane().add(panel_3);
		
		JLabel lblPaySlip = new JLabel("Pay Slip:");
		lblPaySlip.setVerticalAlignment(SwingConstants.TOP);
		lblPaySlip.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPaySlip.setBounds(12, 13, 116, 29);
		panel_3.add(lblPaySlip);
		
		PaySlip = new JTextField();
		PaySlip.setColumns(10);
		PaySlip.setBounds(171, 13, 177, 30);
		panel_3.add(PaySlip);
		
		JLabel lblNewLabel_4 = new JLabel("Tax:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(561, 428, 118, 35);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblPension = new JLabel("Pension:");
		lblPension.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPension.setBounds(561, 476, 118, 35);
		frame.getContentPane().add(lblPension);
		
		JLabel lblStudentLoan = new JLabel("Student Loan:");
		lblStudentLoan.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblStudentLoan.setBounds(561, 524, 168, 35);
		frame.getContentPane().add(lblStudentLoan);
		
		JLabel lblNiPayment = new JLabel("NI Payment:");
		lblNiPayment.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNiPayment.setBounds(561, 575, 168, 35);
		frame.getContentPane().add(lblNiPayment);
		
		JLabel lblTaxable = new JLabel("Taxable Pay:");
		lblTaxable.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTaxable.setBounds(561, 623, 168, 35);
		frame.getContentPane().add(lblTaxable);
		
		JLabel lblDeductions = new JLabel("Deductions:");
		lblDeductions.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDeductions.setBounds(561, 669, 143, 35);
		frame.getContentPane().add(lblDeductions);
		
		textField_10 = new JTextField();
		textField_10.setBounds(747, 430, 194, 41);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(747, 476, 194, 41);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(747, 524, 194, 41);
		frame.getContentPane().add(textField_12);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(747, 572, 194, 41);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(747, 620, 194, 41);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(747, 669, 194, 41);
		frame.getContentPane().add(textField_16);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(950, 174, 390, 356);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 13, 366, 330);
		panel_4.add(textArea);
		
		JButton btnNetWages = new JButton("Net Wages");
		btnNetWages.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNetWages.setBounds(972, 543, 168, 70);
		frame.getContentPane().add(btnNetWages);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(972, 647, 168, 70);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(1152, 647, 168, 70);
		frame.getContentPane().add(btnExit);
		
		JButton btnPaySlip = new JButton("Pay Slip");
		btnPaySlip.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnPaySlip.setBounds(1153, 543, 168, 70);
		frame.getContentPane().add(btnPaySlip);
	}
}

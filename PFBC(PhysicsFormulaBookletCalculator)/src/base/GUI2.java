package base;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


import java.awt.Color;

public class GUI2 extends JFrame {

	private JTextArea DisplayCalculation;
	private JComboBox<String> FormulaList;
	private JLabel Variable1;
	private JLabel Variable2;
	private JLabel Variable3;
	private JLabel Variable4;
	private JLabel Variable5;
	private JLabel Variable6;
	private JLabel Variable7;
	private JLabel Variable8;
	private JButton btnPreviousPage;
	private JSeparator separator;
	private JButton btnResetCalculator;
	private JButton btnCalculate;
	private JButton btnRearrangeFormula;
	private JTextField textAreaV1;
	private JTextField textAreaV2;
	private JTextField textAreaV3;
	private JTextField textAreaV4;
	private JTextField textAreaV5;
	private JTextField textAreaV6;
	private JTextField textAreaV7;
	private JTextField textAreaV8;
	private JTextArea txtrUserManual;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public GUI2() {
		initialize();
		setHidden();
		
	}

	public void setHidden()
	{
		setVisible(false);
	}
	
	public void showGUI2(DefaultComboBoxModel<String> dcm)
	{
		FormulaList.setModel(dcm);
		setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Image image;
		try {
			System.out.println("");
			image = ImageIO.read(getClass().getResourceAsStream("/img/logo-blueprint.jpg"));
			setIconImage(image);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setTitle("PFBC");
		setBounds(0,0, 1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		JLabel background;
		try {
			background = new JLabel(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/img/pexels-photo.jpeg"))));
			this.setContentPane(background);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FormulaList = new JComboBox<String>();
		FormulaList.setBounds(37, 49, 513, 89);
		getContentPane().add(FormulaList);
		
		Variable1 = new JLabel("Variable 1");
		Variable1.setBounds(604, 34, 65, 60);
		getContentPane().add(Variable1);
		
		Variable2 = new JLabel("Variable 2");
		Variable2.setBounds(604, 121, 92, 60);
		getContentPane().add(Variable2);
		
		Variable3 = new JLabel("Variable 3");
		Variable3.setBounds(604, 215, 74, 60);
		getContentPane().add(Variable3);
		
		Variable4 = new JLabel("Variable 4");
		Variable4.setBounds(604, 306, 65, 60);
	    getContentPane().add(Variable4);
		
		Variable5 = new JLabel("Variable 5");
		Variable5.setBounds(604, 399, 74, 60);
		getContentPane().add(Variable5);
		
		Variable6 = new JLabel("Variable 6");
		Variable6.setBounds(604, 494, 74, 60);
		getContentPane().add(Variable6);
		
		Variable7 = new JLabel("Variable 7");
		Variable7.setBounds(604, 589, 65, 60);
		getContentPane().add(Variable7);
		
		Variable8 = new JLabel("Variable 8");
		Variable8.setBounds(604, 691, 74, 60);
		getContentPane().add(Variable8);
		
		btnPreviousPage = new JButton("Previous Page");
		btnPreviousPage.setBounds(581, 835, 316, 66);
		getContentPane().add(btnPreviousPage);
		
		DisplayCalculation = new JTextArea();
		DisplayCalculation.setBounds(31, 199, 519, 260);
		getContentPane().add(DisplayCalculation);
		DisplayCalculation.setColumns(10);
		
		separator = new JSeparator();
		separator.setBounds(37, 529, 517, 25);
		getContentPane().add(separator);
		
		btnResetCalculator = new JButton("Reset Calculator");
		btnResetCalculator.setBounds(37, 586, 134, 42);
		getContentPane().add(btnResetCalculator);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(205, 586, 120, 42);
		getContentPane().add(btnCalculate);
		
		btnRearrangeFormula = new JButton("Rearrange Formula ");
		btnRearrangeFormula.setBounds(356, 586, 161, 42);
		getContentPane().add(btnRearrangeFormula);
		
		textAreaV1 = new JTextField();
		textAreaV1.setBounds(681, 49, 272, 41);
		getContentPane().add(textAreaV1);
		
		textAreaV2 = new JTextField();
		textAreaV2.setBounds(681, 140, 272, 41);
		getContentPane().add(textAreaV2);
		
		textAreaV3 = new JTextField();
		textAreaV3.setBounds(681, 234, 272, 41);
		getContentPane().add(textAreaV3);
		
		textAreaV4 = new JTextField();
		textAreaV4.setBounds(681, 325, 272, 41);
		getContentPane().add(textAreaV4);
		
		textAreaV5 = new JTextField();
		textAreaV5.setBounds(681, 418, 272, 41);
		getContentPane().add(textAreaV5);
		
		textAreaV6 = new JTextField();
		textAreaV6.setBounds(681, 513, 272, 41);
		getContentPane().add(textAreaV6);
		
		textAreaV7 = new JTextField();
		textAreaV7.setBounds(681, 608, 272, 41);
		getContentPane().add(textAreaV7);
		
		textAreaV8 = new JTextField();
		textAreaV8.setBounds(681, 710, 272, 41);
		getContentPane().add(textAreaV8);
		
		 txtrUserManual = new JTextArea();
		txtrUserManual.setBackground(Color.WHITE);
		txtrUserManual.setLineWrap(true);
		txtrUserManual.setText("User Manual :\r\n\r\n1. Pick a Formula from the Drop Down box (Top Left Corner)\r\n2. Then it will display the amount of variables of the\r\nchosen formula (located in the Right Side)\r\n3. You have the option to rearrange or directly calculate\r\nthe formula you chose.\r\n4. Displays the Result\r\n5. Then Reset the Calculator or Click the Previous Button\r\nto choose a different Topic");
		txtrUserManual.setBounds(38, 685, 479, 196);
		getContentPane().add(txtrUserManual);
		
		DisplayCalculation.setFont(DisplayCalculation.getFont().deriveFont(25f));
	}

	public void setDisplayCalculation(String Input){
		DisplayCalculation.setText(Input);
		
	}
	
	public void ResetCalculator(){
		textAreaV1.setText("");
		textAreaV1.setVisible(false);
		textAreaV2.setText("");
		textAreaV2.setVisible(false);
		textAreaV3.setText("");
		textAreaV3.setVisible(false);
		textAreaV4.setText("");
		textAreaV4.setVisible(false);
		textAreaV5.setText("");
		textAreaV5.setVisible(false);
		textAreaV6.setText("");
		textAreaV6.setVisible(false);
		textAreaV7.setText("");
		textAreaV7.setVisible(false);
		textAreaV8.setText("");
		textAreaV8.setVisible(false);
		Variable1.setText("");
		Variable2.setText("");
		Variable3.setText("");
		Variable4.setText("");
		Variable5.setText("");
		Variable6.setText("");
		Variable7.setText("");
		Variable8.setText("");
		DisplayCalculation.setText("");
		
	}
	
	
	public void addPreviousPage(ActionListener PreviousPage){
		btnPreviousPage.addActionListener(PreviousPage);
		}
	
	public void addCalculate(ActionListener Calculate){
		btnCalculate.addActionListener(Calculate);
		
	}
	public void addResetCalculator(ActionListener ResetCalculator){
		btnResetCalculator.addActionListener(ResetCalculator);
	}
	public void addRearrangeFormula(ActionListener RearrangeFormula){
		btnRearrangeFormula.addActionListener(RearrangeFormula);
	}
	
	public void changeSelection(ItemListener changeSelection)
	{
		FormulaList.addItemListener(changeSelection);
	}

	public int getFormulaSelectedIndex()
	{
		return FormulaList.getSelectedIndex();
	}
	
	public void setVariable1(String variable1) {
		Variable1.setText(variable1);
		Variable1.setVisible(true);
		textAreaV1.setVisible(true);
	}

	public void setVariable2(String variable2) {
		Variable2.setText(variable2);
		Variable2.setVisible(true);
		textAreaV2.setVisible(true);
	}

	public void setVariable3(String variable3) {
		Variable3.setText(variable3);
		Variable3.setVisible(true);
		textAreaV3.setVisible(true);
	}

	public void setVariable4(String variable4) {
		Variable4.setText(variable4);
		Variable4.setVisible(true);
		textAreaV4.setVisible(true);
	}

	public void setVariable5(String variable5) {
		Variable5.setText(variable5);
		Variable5.setVisible(true);
		textAreaV5.setVisible(true);
	}

	public void setVariable6(String variable6) {
		Variable6.setText(variable6);
		Variable6.setVisible(true);
		textAreaV6.setVisible(true);
	}

	public void setVariable7(String variable7) {
		Variable7.setText(variable7);
		Variable7.setVisible(true);
		textAreaV7.setVisible(true);
	}

	public void setVariable8(String variable8) {
		Variable8.setText(variable8);
		Variable8.setVisible(true);
		textAreaV8.setVisible(true);
	}

	public JTextField getTextAreaV1() {
		return textAreaV1;
	}

	public JTextField getTextAreaV2() {
		return textAreaV2;
	}

	public JTextField getTextAreaV3() {
		return textAreaV3;
	}


	public JTextField getTextAreaV4() {
		return textAreaV4;
	}



	public JTextField getTextAreaV5() {
		return textAreaV5;
	}



	public JTextField getTextAreaV6() {
		return textAreaV6;
	}



	public JTextField getTextAreaV7() {
		return textAreaV7;
	}


	public JTextField getTextAreaV8() {
		return textAreaV8;
	}
	
}



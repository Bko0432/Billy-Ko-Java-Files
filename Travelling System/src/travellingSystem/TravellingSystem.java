package travellingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class TravellingSystem {

	private JFrame frame;
	private JTextField Tax;
	private JTextField SubTotal;
	private JTextField Total;
	private JTextField FirstName;
	private JTextField Class;
	private JTextField TicketType;
	private JTextField CustomerType;
	private JTextField Date;
	private JTextField Time;
	private JTextField Price;
	private JTextField TicketNumber;
	private JTextField MiddleName;
	private JTextField LastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravellingSystem window = new TravellingSystem();
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
	public TravellingSystem() {
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
		
		JComboBox ClassComboBox = new JComboBox();
		ClassComboBox.setBounds(29, 191, 150, 27);
		frame.getContentPane().add(ClassComboBox);
		
		JComboBox TicketTypeComboBox = new JComboBox();
		TicketTypeComboBox.setBounds(29, 267, 150, 27);
		frame.getContentPane().add(TicketTypeComboBox);
		
		JComboBox AgeComboBox = new JComboBox();
		AgeComboBox.setBounds(29, 338, 150, 27);
		frame.getContentPane().add(AgeComboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 142, 430, 12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 395, 430, 12);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTravellingSystem = new JLabel("Travelling System");
		lblTravellingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblTravellingSystem.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblTravellingSystem.setBounds(494, 13, 318, 57);
		frame.getContentPane().add(lblTravellingSystem);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(12, 548, 439, 12);
		frame.getContentPane().add(separator_2);
		
		JLabel lblClass = new JLabel("Class ");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClass.setBounds(29, 167, 80, 16);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicketingType = new JLabel("Ticketing Type ");
		lblTicketingType.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketingType.setBounds(29, 231, 161, 23);
		frame.getContentPane().add(lblTicketingType);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge.setBounds(29, 307, 150, 27);
		frame.getContentPane().add(lblAge);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(29, 423, 56, 16);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(29, 464, 125, 16);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(29, 505, 56, 16);
		frame.getContentPane().add(lblTotal);
		
		Tax = new JTextField();
		Tax.setBounds(176, 415, 209, 27);
		frame.getContentPane().add(Tax);
		Tax.setColumns(10);
		
		SubTotal = new JTextField();
		SubTotal.setBounds(176, 459, 209, 27);
		frame.getContentPane().add(SubTotal);
		SubTotal.setColumns(10);
		
		Total = new JTextField();
		Total.setColumns(10);
		Total.setBounds(176, 499, 209, 28);
		frame.getContentPane().add(Total);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(500, 142, 24, 498);
		frame.getContentPane().add(separator_3);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(380, 586, 108, 55);
		frame.getContentPane().add(btnExit);
		
		FirstName = new JTextField();
		FirstName.setBounds(260, 193, 182, 25);
		frame.getContentPane().add(FirstName);
		FirstName.setColumns(10);
		
		JLabel lblCustomername = new JLabel("First Name");
		lblCustomername.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCustomername.setBounds(260, 167, 166, 18);
		frame.getContentPane().add(lblCustomername);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(554, 142, 740, 12);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(554, 205, 740, 12);
		frame.getContentPane().add(separator_5);
		
		JLabel lblClass_1 = new JLabel("Class");
		lblClass_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClass_1.setBounds(578, 113, 56, 16);
		frame.getContentPane().add(lblClass_1);
		
		JLabel lblTicketType = new JLabel("Ticket Type");
		lblTicketType.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketType.setBounds(841, 108, 116, 27);
		frame.getContentPane().add(lblTicketType);
		
		JLabel lblCustomertype = new JLabel("Customer Type");
		lblCustomertype.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCustomertype.setBounds(1103, 110, 191, 22);
		frame.getContentPane().add(lblCustomertype);
		
		Class = new JTextField();
		Class.setBounds(578, 155, 204, 40);
		frame.getContentPane().add(Class);
		Class.setColumns(10);
		
		TicketType = new JTextField();
		TicketType.setColumns(10);
		TicketType.setBounds(838, 155, 197, 40);
		frame.getContentPane().add(TicketType);
		
		CustomerType = new JTextField();
		CustomerType.setColumns(10);
		CustomerType.setBounds(1103, 155, 191, 40);
		frame.getContentPane().add(CustomerType);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(923, 231, 24, 398);
		frame.getContentPane().add(separator_6);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(554, 246, 69, 27);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTo.setBounds(554, 299, 69, 27);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(554, 356, 69, 27);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTime.setBounds(554, 415, 69, 27);
		frame.getContentPane().add(lblTime);
		
		Date = new JTextField();
		Date.setColumns(10);
		Date.setBounds(664, 359, 223, 27);
		frame.getContentPane().add(Date);
		
		Time = new JTextField();
		Time.setColumns(10);
		Time.setBounds(664, 418, 223, 27);
		frame.getContentPane().add(Time);
		
		JLabel lblTicketNumber = new JLabel("Ticket Number:");
		lblTicketNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketNumber.setBounds(554, 533, 166, 27);
		frame.getContentPane().add(lblTicketNumber);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(554, 476, 69, 27);
		frame.getContentPane().add(lblPrice);
		
		JTextArea GenerateReceipt = new JTextArea();
		GenerateReceipt.setBounds(953, 251, 367, 366);
		frame.getContentPane().add(GenerateReceipt);
		
		JComboBox FromComboBox = new JComboBox();
		FromComboBox.setBounds(664, 251, 223, 22);
		frame.getContentPane().add(FromComboBox);
		
		JComboBox ToComboBox = new JComboBox();
		ToComboBox.setBounds(664, 304, 223, 22);
		frame.getContentPane().add(ToComboBox);
		

		ArrayList<String> Countries = new ArrayList<String>();
		Countries.add("US");
		Countries.add("Canada");
		Countries.add("Great Britain");
		Countries.add("Netherlands");
		Countries.add("Malaysia");
		Countries.add("Singapore");
		Countries.add("Philippines");
		Countries.add("China");
		Countries.add("Hong Kong");
		Countries.add("Macau");
		Countries.add("Taiwan");
		Countries.add("Japan");
		Countries.add("North Korea");
		Countries.add("South Korea");
		Countries.add("Italy");
		Countries.add("Germany");
		Countries.add("Dubai");
		Countries.add("Abu Dhabi");
		Countries.add("Russia");
		Countries.add("Spain");
		Countries.add("Portugal");
		Countries.add("Sweden");
		Countries.add("Denmark");
		Countries.add("Norway");
		Countries.add("Finland");
		Countries.add("Thailand");
		
		String[] items4 = new String[Countries.size()];
		Countries.toArray(items4);
		ToComboBox.setModel(new DefaultComboBoxModel<String>(items4));
		FromComboBox.setModel(new DefaultComboBoxModel<String>(items4));
		
		
		JButton btnGenerateReceipt = new JButton("Generate Receipt");
		btnGenerateReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CustomerType.setText(AgeComboBox.getSelectedItem().toString());
				TicketType.setText(TicketTypeComboBox.getSelectedItem().toString());
				Class.setText(ClassComboBox.getSelectedItem().toString());
				String tax = String.format(Tax.getText());
				String totalAmount = String.format(Total.getText());
			
				//=====================================================================================
				int refs = 1325 + (int) (Math.random() * 4238);
				//=====================================================================================
					Calendar timer = Calendar.getInstance();
					timer.getTime();
					SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
					tTime.format(timer.getTime());
					SimpleDateFormat Tdate = new SimpleDateFormat("dd,MM,yyyy");
					Tdate.format(timer.getTime());
					
				//=====================================================================================	
			
					GenerateReceipt.append("\tTravelling Systems\n" + 
				"Reference: \t\t\t" + refs + 
				"\n===========================================\t " + 
				"\nName: \t\t\t " + FirstName.getText()+" "+ MiddleName.getText()+ " "+ LastName.getText() +
				"\nClass: \t\t\t " + Class.getText() +
				"\nTicketType: \t\t\t " + TicketType.getText() +
				"\nAmount: \t\t\t " + totalAmount +
				"\nTo: " + ToComboBox.getSelectedItem().toString()+
						"\nFrom: " + FromComboBox.getSelectedItem().toString()+
						"\n=======================================\t " +
						"\nDate: " + Tdate.format(timer.getTime()) +
						"\t\tTime: " + tTime.format(timer.getTime()) +
						
						"\n\n\t\tThank you\n");
			
					
			}
			});
		
		btnGenerateReceipt.setBounds(202, 586, 166, 54);
		frame.getContentPane().add(btnGenerateReceipt);
		
		Price = new JTextField();
		Price.setColumns(10);
		Price.setBounds(664, 479, 223, 27);
		frame.getContentPane().add(Price);
		
		TicketNumber = new JTextField();
		TicketNumber.setColumns(10);
		TicketNumber.setBounds(720, 533, 167, 27);
		frame.getContentPane().add(TicketNumber);
		
		
		JLabel lblLastName = new JLabel("Middle Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLastName.setBounds(260, 231, 166, 18);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLastName_1.setBounds(260, 311, 166, 18);
		frame.getContentPane().add(lblLastName_1);
		
		MiddleName = new JTextField();
		MiddleName.setColumns(10);
		MiddleName.setBounds(260, 265, 182, 27);
		frame.getContentPane().add(MiddleName);
		
		LastName = new JTextField();
		LastName.setColumns(10);
		LastName.setBounds(260, 338, 182, 27);
		frame.getContentPane().add(LastName);
		

		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double BasePrice = 0;
				if(ClassComboBox.getSelectedItem().toString().equals("Economy")){
					BasePrice = 200;
				}
				else if (ClassComboBox.getSelectedItem().toString().equals("Business")){
					BasePrice = 300;
				}
				else if (ClassComboBox.getSelectedItem().toString().equals("First Class")){
					BasePrice = 500;
				}
				if(AgeComboBox.getSelectedItem().toString().equals("Under 18") || AgeComboBox.getSelectedItem().toString().equals("65 over")){
				BasePrice *= 0.90;
				}
				SubTotal.setText(BasePrice+"");
				Tax.setText(12 + "");
				Total.setText(BasePrice *1.12 + "");
			}
		});
		btnTotal.setBounds(12, 586, 80, 54);
		frame.getContentPane().add(btnTotal);
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstName.setText("");
				MiddleName.setText("");
				LastName.setText("");
				Tax.setText("");
				SubTotal.setText("");
				Total.setText("");
				Class.setText("");
				TicketType.setText("");
				CustomerType.setText("");
				Date.setText("");
				Time.setText("");
				Price.setText("");
				TicketNumber.setText("");
				
				
			}
		});
		btnReset.setBounds(102, 586, 88, 54);
		frame.getContentPane().add(btnReset);
	
	ArrayList<String> Class = new ArrayList<String>();
	Class.add("Business");
	Class.add("First Class");
	Class.add("Economy");
	
	String[] items = new String[Class.size()];
	Class.toArray(items);
	ClassComboBox.setModel(new DefaultComboBoxModel<String>(items));
	
	ArrayList<String> TicketType = new ArrayList<String>();
	TicketType.add("Single Trip");
	TicketType.add("Round Trip");
	
	String[] items2 = new String[Class.size()];
	TicketType.toArray(items2);
	TicketTypeComboBox.setModel(new DefaultComboBoxModel<String>(items2));
	
	ArrayList<String> Age = new ArrayList<String>();
	Age.add("Under 18");
	Age.add("19 - 64");
	Age.add("65 over");
	
	String[] items3 = new String[Class.size()];
	Age.toArray(items3);
	AgeComboBox.setModel(new DefaultComboBoxModel<String>(items3));
	

	
	
	
	
	}
}

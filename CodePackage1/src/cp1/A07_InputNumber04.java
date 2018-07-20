package cp1;

import javax.swing.JOptionPane;

//Makes use of the double (for the decimal)

public class A07_InputNumber04
{

	public static void main(String[] args)
	{
	      String a = JOptionPane.showInputDialog("Enter a number:");        
	        int b = Integer.parseInt(a);
	        
	        a = JOptionPane.showInputDialog("Enter another number:");        
	        double c = Double.parseDouble(a); 
	        
	        double d = b + c;
	        
	        System.out.println("The total is " + d);
	}

}

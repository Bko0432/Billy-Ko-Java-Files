package cp1;

import javax.swing.*;

public class A19_WhileLogin
{

	public static void main(String[] args)
	{
		  int ctr = 0; //initial value
	        int passcode = 12345;
	              
	        while (ctr <= 2) //condition
	        {
	            passcode = Integer.parseInt(JOptionPane.showInputDialog("Enter your passcode:"));
	            
	            if (passcode == 12345)
	            {
	              break;
	            }
	            
	            else
	            
	            {
	                JOptionPane.showMessageDialog(null, "Please Try Again!");
	                ctr++; // counter	                
	            }	            
	        }
	        
	        if (passcode == 12345)
	        {
	            JOptionPane.showMessageDialog(null, "WELCOME!");
	        }
	        
	        else
	        {
	            JOptionPane.showMessageDialog(null, "Sorry your card has been captured!");
	        }
	}

}

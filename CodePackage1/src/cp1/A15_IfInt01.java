package cp1;

import javax.swing.*;

public class A15_IfInt01
{

	public static void main(String[] args)
	{
		  int x = Integer.parseInt(JOptionPane.showInputDialog("Pick a Number between 1-3:"));  
	        
	        if ((x >= 3) && (x <= 5))
	        {
	            System.out.println("you're third");
	        }
	        
	        if ( x == 2)
	        {
	            System.out.println("you're second");
	        }
	        
	        if ( x == 1)
	        {
	            System.out.println("you're first");
	            System.out.println("Yea!");
	        }
	}

}





package cp1;

import javax.swing.*;

public class A17_RandomNumber
{

	public static void main(String[] args)
	{
	       int x = (int) (Math.floor(Math.random() * 10) + 1);
           // 10 - maximum and 1 - minimum
          
           JOptionPane.showMessageDialog(null, x);
           
           int total = x + 5;
           
           JOptionPane.showMessageDialog(null, "If I add 5 to the random number, the total will be " + total);
           
	}

}

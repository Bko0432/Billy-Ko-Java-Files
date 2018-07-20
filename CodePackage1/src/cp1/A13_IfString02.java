package cp1;

import javax.swing.*;

public class A13_IfString02
{

	public static void main(String[] args)
	{
		String x = JOptionPane.showInputDialog("Input Name: ");
        
        if (x.equals("Andrew") || x.equals("andrew") ||  x.equals("ANDREW"))
        {
           System.out.println("You are a gwapo guy!");
           
        }
        else
        {
           System.out.println("You are not a gwapo guy!");
        }
        
	}
}



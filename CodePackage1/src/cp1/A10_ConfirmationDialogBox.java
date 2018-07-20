package cp1;

import javax.swing.*;

public class A10_ConfirmationDialogBox
{

	public static void main(String[] args)
	{
		  int selection=0;
	        while (true)
	        {
	            selection = JOptionPane.showConfirmDialog(null, "Play Another Game again","ConfirmationWindowTitle", JOptionPane.OK_CANCEL_OPTION);
	            
	            if (selection == JOptionPane.OK_OPTION)
	            {
	                JOptionPane.showMessageDialog(null, "You clicked on OK");
	            }
	            if (selection == JOptionPane.CANCEL_OPTION)
	            {
	                JOptionPane.showMessageDialog(null, "You clicked on CANCEL");
	                break;
	            }
	        }

	}	
}
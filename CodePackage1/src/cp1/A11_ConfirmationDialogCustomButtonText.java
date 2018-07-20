package cp1;

import javax.swing.*;

public class A11_ConfirmationDialogCustomButtonText
{

	public static void main(String[] args)
	{
		 Object[] options = {"Buy!", "Save!", "Give"};

	        int n = JOptionPane.showOptionDialog(null,
	        		"What would you do if you had a million dollars?",
	                "Million Dollar Question",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE,
	                null,     //do not use a custom Icon
	                options,  //the titles of buttons
	                options[0]); //default button title
	        
	        if (n == 0)
	        {
	            System.out.println("Buy a new laptop!");
	        }

	        if (n == 1)
	        {
	            System.out.println("Save for a rainy day!");
	        }

	        if (n == 2)
	        {
	            System.out.println("Give it to charity!");
	        }
	}

}

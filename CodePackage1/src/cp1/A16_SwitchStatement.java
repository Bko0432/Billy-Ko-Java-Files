package cp1;

import javax.swing.*;

public class A16_SwitchStatement
{

	public static void main(String[] args)
	{

		while(true)
		{
		String sortingHat = JOptionPane.showInputDialog("What house are you in?");

	        switch (sortingHat)
	        {
	            case "Gryffindor":
	            System.out.println("Destined for greatness");
	            break;

	            case "Slytherin":
	            System.out.println("Clever but wicked");
	            break;

	            case "Hufflepuff":
	            System.out.println("You are a loyal friend");
	            break;
	            
	            case "Ravenclaw":
	            System.out.println("You are the brains of the operation");
	            break;
	            
	            default: 
	            System.out.println("You are a muggle!");
	        }
	        
	        int choice = Integer.parseInt(JOptionPane.showInputDialog("Do you want to play again? \npress 1 for yes and press 2 for no"));
	        
	        if (choice == 1)
	        {
	        	
	        }	
	        if (choice == 2)
	        {
	        	break;
	        }
		}
	
	}

}

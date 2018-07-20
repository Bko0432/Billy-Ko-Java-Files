package cp1;

import javax.swing.*;

public class A14_IfString03
{

	public static void main(String[] args)
	{
		 String fastFood = JOptionPane.showInputDialog("Where would you like to eat today?: Mcdonalds, KFC or Burger King");

	        if (fastFood.equals("Mcdonalds") || fastFood.equals("mcdonalds"))
	        {
	            System.out.println("I'll get a Big Mac!");
	        }

	        else

	        if (fastFood.equals("KFC") || fastFood.equals("kfc"))
	        {
	            System.out.println("I'll get a 2 piece chicken meal.");
	        }

	        else

	        if (fastFood.equals("Burger King") || fastFood.equals("burger king"))

	        {
	            System.out.println("I'll get a Whopper!");
	        }

	        else

	        {
	            System.out.println("Sorry can you type that again? Thanks");
	        }   
	}

}

package cp1;

import javax.swing.*;

public class A12_IfString01
{

	public static void main(String[] args)
	{
		String Batman;

        Batman = JOptionPane.showInputDialog("Who is Batman?"); //ask user input

        if (Batman.equals("Mr. Fulo"))
        {
            System.out.println("That's right");
        }
        else
        {
            System.out.println("You're wrong!!!!!");
        }
	}

}

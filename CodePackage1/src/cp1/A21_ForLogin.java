package cp1;

import javax.swing.*;

public class A21_ForLogin
{

	public static void main(String[] args)
	{
		int passcode = 12345;
        String username = "kat"; 

        JOptionPane.showMessageDialog(null, "Good day welcome to the Bank - -");
        JOptionPane.showMessageDialog(null, "Please enter your username and passcode");

        for (int i=0; i<=2; i++)
        {
            username = JOptionPane.showInputDialog("Enter your username:");
            passcode = Integer.parseInt(JOptionPane.showInputDialog("Enter your passcode:"));

            if ((passcode == 12345) && (username.equals ("kat")))
            {
                break;
            }

            else

            {
                JOptionPane.showMessageDialog(null, "Please Try Again!");
            }

        }

        if ((passcode == 12345) && (username.equals ("kat")))
        {
            JOptionPane.showMessageDialog(null, "WELCOME!");
        }

        else
        {
            JOptionPane.showMessageDialog(null, "Sorry your card has been captured!");
        }
	}

}

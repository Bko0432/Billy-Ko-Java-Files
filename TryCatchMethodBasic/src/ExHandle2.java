import javax.swing.*;
public class ExHandle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;

		do 
		{

		try
		{
		int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Give Me a first number?"));
		int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Give Me a second number?"));

		int total = firstNumber / secondNumber;

		JOptionPane.showMessageDialog(null,total);
		x = 2;
		}

		catch (Exception e)
		{
		int selection = JOptionPane.showConfirmDialog(null, "A wrong or no Input was placed. Do you want to try again?","Confirmation", JOptionPane.OK_CANCEL_OPTION);

		if (selection == JOptionPane.OK_OPTION)
		{

		}
		if (selection == JOptionPane.CANCEL_OPTION)
		{
		break;
		}

		//JOptionPane.showMessageDialog(null,"Wrong input: "+ e);
		//System.exit(0);
		}
		}
		while (x == 1);

		JOptionPane.showMessageDialog(null,"Goodbye");

		}
	}



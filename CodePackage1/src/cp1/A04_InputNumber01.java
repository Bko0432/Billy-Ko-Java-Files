package cp1;

import javax.swing.JOptionPane;

public class A04_InputNumber01
{
	public static void main(String[] args)
	{
		int firstNumber;
        int secondNumber;
        int totalNumber;

        //Integer.parseInt - will convert to an integer
        //Double.parseDouble - will convert to a double        

        firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Give Me a first number?"));
        secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Give Me a second number?"));

        totalNumber = firstNumber + secondNumber;

        
        JOptionPane.showMessageDialog(null, "The total of the\n two numbers is  " + totalNumber,"TITLE", JOptionPane.PLAIN_MESSAGE);
	}
}

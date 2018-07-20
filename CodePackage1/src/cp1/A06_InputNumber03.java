package cp1;

import javax.swing.JOptionPane;

public class A06_InputNumber03
{

	public static void main(String[] args)
	{
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        int totalNumber = x + 5; //i'm adding an new variable from a given
        System.out.println("I added 5 to your input which made " + totalNumber);
	}

}

package cp1;

import javax.swing.JOptionPane;

public class A05_InputNumber02
{
	public static void main(String[] args)
	{
		int x; //this is the first number
        int y; // this is the second number
        int total; // this will give me the total

        x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
        total = x+y;

        System.out.println("Your numbers equal to " + total);
	}
	
	
}

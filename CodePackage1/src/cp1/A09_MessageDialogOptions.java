package cp1;

import javax.swing.*;

public class A09_MessageDialogOptions
{

	public static void main(String[] args)
	{
        JOptionPane.showMessageDialog(null, "A\nB\nC","TITLE", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is the Content", "ComSci 11", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "CONTENT", "TITLE", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "CONTENT", "TITLE", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "CONTENT", "TITLE", JOptionPane.ERROR_MESSAGE);
		
	}

}

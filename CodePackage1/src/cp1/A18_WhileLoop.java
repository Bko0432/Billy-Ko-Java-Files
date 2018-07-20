package cp1;

import javax.swing.*;

public class A18_WhileLoop
{

	public static void main(String[] args)
	{

        while(true)
        {                       
            int a = 0;
            a = JOptionPane.showConfirmDialog(null, "Are you handsome, tell me the truth?", "- - -", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.NO_OPTION )
            {
                break;
            }
            
            int b = 0;
            b = JOptionPane.showConfirmDialog(null, "No seriously, tell me the truth?", "- - -", JOptionPane.YES_NO_OPTION);
            if (b == JOptionPane.NO_OPTION )
            {
                break;
            }
            
            int c = 0;
            c = JOptionPane.showConfirmDialog(null, "Dammit stop lying, tell me the truth?", "- - -", JOptionPane.YES_NO_OPTION);
            if (c == JOptionPane.NO_OPTION )
            {
                break;
            }
            
            int d = 0;
            d = JOptionPane.showConfirmDialog(null, "Yes or NO", "- - -", JOptionPane.YES_NO_OPTION);
            if (d == JOptionPane.NO_OPTION )
            {
                break;
            }
            
        }
        
        JOptionPane.showMessageDialog(null,"Thanks for being honest!", "The End", JOptionPane.PLAIN_MESSAGE);
	}

}

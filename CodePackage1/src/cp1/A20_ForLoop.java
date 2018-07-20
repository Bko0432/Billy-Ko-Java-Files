package cp1;

import javax.swing.*;

public class A20_ForLoop
{

	public static void main(String[] args)
	{
		for (int i=0; i<5; i++)
        {
            int ctr = 0;
            int ans = 0;
            
            JOptionPane.showMessageDialog(null, "This is round "+ i);           
            
            JOptionPane.showMessageDialog(null, "Let's count how many times you press YES.");

            ans = JOptionPane.showConfirmDialog(null, "Please press YES", "Counting", JOptionPane.YES_NO_OPTION);

            if(ans == JOptionPane.YES_OPTION ) 
            {
                ctr++;
            }

            ans = JOptionPane.showConfirmDialog(null, "Please press YES again", "Counting", JOptionPane.YES_NO_OPTION);

            if(ans == JOptionPane.YES_OPTION ) 
            {
                ctr++;
            }

            ans = JOptionPane.showConfirmDialog(null, "Please press YES and again", "Counting", JOptionPane.YES_NO_OPTION);

            if(ans == JOptionPane.YES_OPTION ) 
            {
                ctr++;
            }

            JOptionPane.showMessageDialog(null, "You pressed the YES button " + ctr + " times");

	}

}
}

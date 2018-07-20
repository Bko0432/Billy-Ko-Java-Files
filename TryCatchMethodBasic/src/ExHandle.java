import javax.swing.*;

public class ExHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numKids, pieces, left;

		try
		{
		numKids = Integer.parseInt(JOptionPane.showInputDialog("How many kids?"));
		pieces = 24 / numKids;
		left = 24 - numKids*pieces;

		JOptionPane.showMessageDialog(null,"Each kid will receive " + pieces);
		JOptionPane.showMessageDialog(null,"Cookies left " + left);
		}
		catch (Exception e)
		{

		JOptionPane.showMessageDialog(null,"Error: " + e);
		//JOptionPane.showMessageDialog(null,"Error");

		}
	}

}

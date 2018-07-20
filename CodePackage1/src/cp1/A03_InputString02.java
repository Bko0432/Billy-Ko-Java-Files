package cp1;

import javax.swing.JOptionPane;

public class A03_InputString02
{
	public static void main(String[] args)
	{
		String name;
        String home;
        String artist;

        name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Wattup, " + name);

        home = JOptionPane.showInputDialog("Where do you live?");
        System.out.println("A nice place to live is " + home);

        artist = JOptionPane.showInputDialog("Who is you favorite musical artist?");
        System.out.println(artist + " is my favorite artist, too!"); 
	}

}

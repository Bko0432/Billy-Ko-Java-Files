package cp1;

import javax.swing.*;

public class A02_InputString01
{
	public static void main(String[] args)
	{
		// Variable Declaration
        String name1;
        String age;
        String location;
        String burger;
        
        // Variable process
        
        name1 = JOptionPane.showInputDialog("What is your name?"); /*use this for a standard input method*/
        age = JOptionPane.showInputDialog("How old are you?"); /*use this for a standard input method*/
        location = JOptionPane.showInputDialog("Where are you from?"); /*use this for a standard input method*/
        burger = JOptionPane.showInputDialog("What is your favorite burger?"); /*use this for a standard input method*/
                
        System.out.println("Hi " + name1 + ", how are you doing?"); //Concatenation
        System.out.println("");
        System.out.println("So you're "+ age + " years old!");
        System.out.println("");
        System.out.println("How is it living in " + location + "?");
        System.out.println("");
        System.out.println("I see that you like " + burger);

        
        
	}

}

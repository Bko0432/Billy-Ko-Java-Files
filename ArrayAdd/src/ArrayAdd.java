import javax.swing.*;

public class ArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] title = new String[100];
String[] artist = new String[100];
String[] genre = new String[100];
int i = 0;

while(true)
{
int choice = Integer.parseInt(JOptionPane.showInputDialog("Pick"));

if (choice == 1);//add
{
 title [i] = JOptionPane.showInputDialog("Give Title");
 artist [i] = JOptionPane.showInputDialog("Give Artist");
 genre [i] = JOptionPane.showInputDialog("Give genre");
}

if (choice == 4);//Display
{
for(i = 0; i < 10; i++)
	{
	System.out.println(title[i]);
	System.out.println(artist[i]);
	System.out.println(genre[i]);
	} // Nested Loop
}
}
}
}
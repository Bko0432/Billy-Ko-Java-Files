import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Book> bookshelf = new ArrayList();
Book b = new Book(36, "The Love Ceremony", "William Yu Ko Jr", "Hi","Romance","UK", "12-06-2017");
bookshelf.add(b);
System.out.println(b.getD());
System.out.println(bookshelf.get(0).getAuthor());
b = new Book (Integer.parseInt(JOptionPane.showInputDialog("Number of pages")),JOptionPane.showInputDialog("What is the title")
	,JOptionPane.showInputDialog("Who's the author"), JOptionPane.showInputDialog("What does the blurb say"), JOptionPane.showInputDialog("What genre")
	,JOptionPane.showInputDialog("Where it was published"), JOptionPane.showInputDialog("When it was published"));

bookshelf.size();
Book a = new Book(200, "Recursion", "Atul Khanna", "Cool","Computer","Harvard University", "02-16-2000");
bookshelf.add(a);
System.out.println(a.getPublished());
System.out.println(a.getAuthor());
	}

}

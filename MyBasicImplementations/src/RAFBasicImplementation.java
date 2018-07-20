
import java.io.*;
import javax.swing.*;
public class RAFBasicImplementation {

final static int RECORDLENGTH = 43;
int recno = 0;

String bookTitle = "Harry Potter";
String author = "Charles Dickens";
String Publisher = "Pearson";
int pages = 20;

RandomAccessFile book;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

new RAFBasicImplementation();


	}
public RAFBasicImplementation()
{
try	
{
book = new RandomAccessFile("Harry.txt", "rw");
long recno = (book.length() / RECORDLENGTH);
book.seek(recno*RECORDLENGTH); // 
book.writeUTF(bookTitle);

book.seek((recno*RECORDLENGTH)+15); 
book.writeUTF(author);

book.seek((recno*RECORDLENGTH)+28); 
book.writeUTF(Publisher);

book.seek((recno*RECORDLENGTH)+39);
book.writeUTF(pages+"");

System.out.println("BOOK:" + recno); 

book.close();
}catch (Exception exc){

}
System.out.println("File Error");

}
}


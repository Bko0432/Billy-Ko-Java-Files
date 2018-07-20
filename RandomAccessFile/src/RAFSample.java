import javax.swing.*;
import java.io.*;

public class RAFSample
{
final static int RECORDLENGTH = 43; // number of character adding all fields
int recno = 0; 
String brand = "Toyota"; //10 + 2 characters 
String type = "Sedan"; //10 + 2 characters
String color = "Blue"; // 10 + 2 characters
String eor = "**"; // 2 + 2 End of Record marker

RandomAccessFile car;

public static void main (String [] args)
{
new RAFSample();

}

public RAFSample() // Constructor
{
try
{ 
car = new RandomAccessFile("kotse.txt", "rw");

System.out.println(car.length());
long fileLength = car.length();
long recno = (fileLength / RECORDLENGTH);

car.seek(recno*RECORDLENGTH); // 
car.writeUTF(brand);

car.seek((recno*RECORDLENGTH)+13); // 0 + 12 = 12, then Start on the 13th
car.writeUTF(type);

car.seek((recno*RECORDLENGTH)+26); // 13 + 12 = 25. then Start on the 26th
car.writeUTF(color);

car.seek((recno*RECORDLENGTH)+39); // 26 + 12 = 38 Start on the 39th
car.writeUTF(eor);

System.out.println("L:" + fileLength + " LR:" + recno); 

car.close();
}
catch (Exception e)
{ 
System.out.println("File error");
}
}
}

	




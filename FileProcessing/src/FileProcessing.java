import java.io.*; // File processing of Java
import java.util.Scanner;

public class FileProcessing {

public static void main(String[] args){
		// TODO Auto-generated method stub
File newFile = new File("C:\\Users\\billy\\Desktop\\New Text Document.txt");
Scanner scanner1;
Scanner scanner2;
int id;
String name;
double sum;
try {
	scanner1 = new Scanner(newFile);
	while(scanner1.hasNextLine()){
		// scanner1 checks if the file has a next line if it does it will print it.
		//System.out.println (scanner1.nextLine());
		//statements
		scanner2 = new Scanner(scanner1.nextLine());
		id = scanner2.nextInt( );
		name = scanner2.next();
		sum = 0;
		while (scanner2.hasNextDouble()){
			double hours = scanner2.nextDouble( );
			System.out.println(hours);
			sum += hours;
		}
		System.out.println(name + ", id number " + id +", worked " + sum +" hours. ");
	}
	}
 catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}try {
	PrintWriter writer = new PrintWriter("C:\\Users\\billy\\Desktop\\New Text Document2.txt", "UTF-8");
	writer.println("hey");
	writer.close();
}catch (Exception e)
{
}

}
}
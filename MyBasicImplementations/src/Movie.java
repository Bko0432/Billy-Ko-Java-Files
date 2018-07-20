import java.io.RandomAccessFile;

public class Movie {
final static int RECORDLENGTH = 0;
int recno = 0;

String name = " The Great Gatsby "; // 20 + 2 = 22
String genre = " Horror "; // 10 + 2 = 12 
String director = " Baz Luhrman "; // 25 + 2 =
String end = "**"; // 2 + 2 = 4

//*** Current byte count 65
RandomAccessFile move;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Movie();
	}



public Movie(){
	try{
		move = new RandomAccessFile("movie.txt", "rw");
	
		long fileLength = move.length();
		long recno = (fileLength / RECORDLENGTH);
		
		move.seek(recno*RECORDLENGTH); //
		move.writeUTF(name);
		
		move.seek((recno*RECORDLENGTH)+ 23); // 0 + 22 (write on 23)
		move.writeUTF(genre);
		
		move.seek((recno*RECORDLENGTH)+ 36);
		move.writeUTF(director);
		
		move.seek((recno*RECORDLENGTH)+ 64);
		move.writeUTF(end);
	
	
}
catch(Exception e){
	System.out.println("File error");
}

}
}

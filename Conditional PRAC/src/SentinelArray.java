import java.util.Scanner;

public class SentinelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = new int[8];
int number = 0;
Scanner scanner = new Scanner(System.in);

for (int counter = 0; counter < array.length && number != -999; counter++  ){
	number = scanner.nextInt();
	array[counter] = number;

	}
for (int counter = 0; counter < array.length; counter++) {
	System.out.println(array[counter]);
}
}
}
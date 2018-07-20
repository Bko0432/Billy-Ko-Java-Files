import java.util.Random;

public class Indefinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 0;
Random r = new Random();
while (num != 5){

num = r.nextInt(5)+ 1;
System.out.println(num);

	}

}
}
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] cool= new int[10];

for (int x = 0; x < 11; x++){

	cool[x] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));


	
}


Arrays.sort(cool);

System.out.println(cool[9]-cool[0]);

	}
}

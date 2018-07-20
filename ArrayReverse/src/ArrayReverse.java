import javax.swing.JOptionPane;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(JOptionPane.showInputDialog("What are the user input?"));
int[] array = new int [a];
for(int b = 0; b < array.length; b++){
array[b] = Integer.parseInt(JOptionPane.showInputDialog("Enter Value"));
}
int[] opah = new int [a];
a--;
for(int c = 0; c < array.length; c++){
	opah[c] = array[a];
a--;
}
for(int d = 0; d < array.length; d++){
array[d] = opah[d];
System.out.println(array[d]);
}
	}

}

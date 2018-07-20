import javax.swing.JOptionPane;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Index\tValue");
		int[] numList = {33,354,22,88,78};
		int total = 0;
		for(int counter = 0 ; counter < 5; counter++)
		{
			System.out.println(counter + "\t" + numList[counter]);
			
		}
		for (int counter = 0 ; counter < numList.length; counter++)
		{
			total = total + numList[counter];
		}
		System.out.println(total);
		
	}
}
	



import java.util.*;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] setArray = {1,2,3,4,5,6,7,8,9,10};
			int sum = 8;
			for (int i = 0; i < setArray.length; i++){
			for (int a = 0; a < setArray.length; a++){
			if (setArray[i] + setArray [a] == sum && i!= a)
			{
			
			System.out.println(setArray[i] + " + " + setArray[a] + " = " + sum);
			setArray[i] = 0;
			setArray[a] = 0;
			break;
			}		
		}
	}
  }
}

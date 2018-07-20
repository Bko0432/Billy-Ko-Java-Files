
public class ArrayToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {2,3,5,6,8,9,10};
int[] array1 = new int[7];
//{3,5,6,8,9,10,2}

for(int i = 0; i < array.length -1; i++){

array1[i] = array[1+i];
System.out.println(array1[i]);

	}
array1[6] = array[0];
System.out.println(array1[6]);
	}
}

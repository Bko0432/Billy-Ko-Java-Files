
public class ArrayToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {6,15,20,7,8,9};
int[] array = new int[6];
array[0] = a[5];
System.out.println(array[0]);
for(int i = 1; i < a.length; i++){

array[i] = a[i-1];
System.out.println(array[i]);
}


	}
	}


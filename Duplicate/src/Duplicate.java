import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {10,55,66,44,55,77,77};
int duplicate = 0;
int duplicateCounter = 0;
for(int x = 0; x < array.length; x++) {
	
	

for(int dex = 0 ; dex < array.length; dex++ ) {
	if(array[x] == array[dex] && x < dex)
	{
		System.out.print("duplicates: ");
		System.out.println(array[x]);
		duplicateCounter++;
		//System.out.println(array[x]);
	}
    }



}
System.out.print("duplicate count: ");
System.out.println(duplicateCounter);
	}
}


import java.lang.reflect.Array;
import java.util.Arrays;

public class arAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arAge = {2,45,31,28,45,5,6,9,28,16}; //(1)
int array = 0;
int counter = 0;
int counterodd = 0;
Arrays.sort(arAge);
//for (int dex = 0 ; dex < arAge.length; dex++){ 
for (int dex = arAge.length -1 ; dex > 0; dex--){       
//System.out.println(arAge[dex]); 
	 
//if (arAge[dex] % 2 == 0){ 
//	even
	counter++;
//	(!=) = means not    //(4)
//}	//else { 
	//counterodd++ ;
	
//odd
	// (%) = Remainder
//}
//System.out.println(arAge[dex]);

//if ( dex % 2 == 0){     //(6)
	//System.out.println(arAge[dex]);

if(arAge[dex] >18 && arAge[dex] <45){
	System.out.println(arAge[dex]);
}
//	System.out.println(arAge[dex]);
//System.out.println("minor");
// System.out.println(counter);
//System.out.println(counterodd);
	} 

	}
}
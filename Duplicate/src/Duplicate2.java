
public class Duplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]array = {3,5,3,5,2,2,3,3};
int[]array2 = new int[array.length];
int counter = 0;
boolean flag;
for(int x = 0; x < array.length; x++){
flag = true;
	for(int d = 0; d < array2.length; d++)
{
	if(array2[d] == array[x]){
	flag = false;
	}

}
if(flag)
{
	for(int dex = 1; dex < array.length; dex++){
		if (array[x] == array[dex]) 
			{
	 counter++;
	 array2[counter] = array[x];
	 System.out.println(array2[counter]);
	}
}
}

	


}
	}

}

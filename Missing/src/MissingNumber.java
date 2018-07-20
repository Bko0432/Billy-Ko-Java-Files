public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {10,54,66,44,55,76,77};
int[] arraytosearch = {10,54,66,44,55,76};
int Matchctr = 0;	

for(int x = 0; x < array.length; x++) {
Matchctr = 0;
for(int dex = 0 ; dex < arraytosearch.length; dex++ ) {
	if(array[x] == arraytosearch[dex])
	{
		Matchctr++;
		//System.out.println(array[x]);
		//System.out.println(array[x]);
	}
	
    }

if(Matchctr==0)
{
	System.out.println(array[x]);
	
}

}
	}
}


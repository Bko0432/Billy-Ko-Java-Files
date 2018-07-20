
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {3,2,5,8,1};

for(int i = 0; i<arr.length; i++){
	
for(int j = i+1; j<arr.length; j++){
	
if(arr[i] > arr[j])
	
{	
	int temp = arr[j];
	arr[j] = arr[i];
	arr[i] = temp;
    }
  }
}
for(int i = 0; i<arr.length; i++){
	System.out.println(arr[i] + " ");
	}
	}
}

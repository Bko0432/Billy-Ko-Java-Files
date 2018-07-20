
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {1,5,4,6,8,9};
String[] name = {"Ed", "Carl", "Naruto", "Orochimaru", "Shikamaru", "Sasuke"};
if(array[0] == 1){
	System.out.println("one is found");
}
	if(name[4].equalsIgnoreCase("Shikamaru")){
		System.out.println("Shikamaru is found");
		}
for(int b = 0; b < 6; b++){
	System.out.println("");
if(name[b].equalsIgnoreCase("Orochimaru")){
	System.out.println("Orochimaru is found");
}
}
	

for(int a = 0; a < 6; a++){
	System.out.println(a);
if(array[a] == 5){
	System.out.println("five is found");
	
}

	}
	}
}

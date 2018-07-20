
public class Array2D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String array [][] = new String[5][5];
for(int y = 0; y < 5; y++){
for(int x = 0; x < 5; x++){

if (y == 0 || y == 4 || x == 0 || x == 4) {
	
array[x][y] = "x";
System.out.print(array[x][y]);
}
else {
	if(y == 2 && x == 2){
		array[x][y] = "Y";
	}
	else{
		array[x][y] = "O";
	}
System.out.print(array[x][y]);
}
	}

System.out.println("");
	}
	}
}
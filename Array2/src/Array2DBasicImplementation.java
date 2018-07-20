
public class Array2DBasicImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ROW then COLUMN
// int tableArray [row] [ column]
		
int tableArray [] [] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};


for(int row = 0; row < 3; row++){
	System.out.println("");
	System.out.println("");
	
for(int column = 0; column < 4; column++){
	System.out.print(tableArray[row][column]+ "   ");
}
}

System.out.println(tableArray[1][2]);
	}

}

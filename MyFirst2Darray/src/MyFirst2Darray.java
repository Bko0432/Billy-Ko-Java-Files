
public class MyFirst2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] ArrayA ={"Superman", "Batman", "Green Lantern", "IronMan", "Joker", "TwoFace", "Poison Ivy"};
String[] ArrayB ={"Metropolis", "Gotham", "Space", "New York", "Gotham", "Gotham", "Gotham"};
String [][] finalArray2d = new String [9][9];

for(int i = 0; i < ArrayA.length; i++){
	finalArray2d[i][1] = ArrayA[i];
	//System.out.println(finalArray2d[i][1]);
}
for(int dex = 0; dex < ArrayB.length; dex++ )	{
	finalArray2d[dex][2] = ArrayB[dex];
	//System.out.println(finalArray2d[dex][2]);
}
for(int a = 0; a <ArrayA.length; a++){
	if (finalArray2d[a][2].equalsIgnoreCase("Gotham")){
		System.out.println(finalArray2d[a][1]);// .equals is for password (case sensitive) 
	}
	                                                  // .equalsIgnoreCase is for username ( not case sensitive)
}
{
	
}

}
}
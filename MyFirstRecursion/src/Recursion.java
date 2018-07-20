
public class Recursion {
public static void recursion(int a){
System.out.println("");
	for(int dex = 0; dex < a; dex++ )	
	System.out.print("*");
if(a != 0)
	{
	recursion(a - 1);
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
recursion(5);
	}

}

public class Recursion2 {
	public static void recursion(int a,int number){
		
		if(a <= number)
			{
			System.out.println("");
			for(int dex = 0; dex < a; dex++ )	
			System.out.print("*");
		if(a != 0)
			{
			recursion(a+1,number);
			}

		}
	}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		recursion(1,5);
			}

}




public class Factorial {

	public static void main(String[] args) {
		Factorial(4,4);
	}
		// TODO Auto-generated method stub
	public static void Factorial(int n,double num){
if (n == 2){
	 // base case
	}else{
	num *= (n-1);//recursive case
	System.out.println(num);
	Factorial(n - 1,num);
	
	}
	}
}

import javax.swing.*;
public class ReturnValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum = add(100,150,200);
int result = sum * 6;

System.out.println(result);

	}
	public static int add(int a, int b, int c)
	{ 
return(a+b+c);
}
}
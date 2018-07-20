import java.util.*;
public class MyFirstStacksProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stack s = new Stack();
	
	s.push("{");
	s.push("{");
	s.push("{");
	s.push("}");
	s.push("}");
	s.push("{");
	s.push("}");
	s.push("}");
	s.push("{");
	s.push("}");
	String A = "";
	int counter1 = 0;
	int counter2 = 0;
for (int x = 0; x < s.size(); x++){
	A=s.pop()+"";
	if(A.equalsIgnoreCase("{"))
	{
	counter1++;		
	}
	else{
	counter2++;
	}
}
	if(counter1 == counter2)
	{
	System.out.println(counter1);
	}
	else if(counter1 < counter2){
	System.out.println(counter1);	
	}
	else{
	System.out.println(counter2);
	}
	}
}
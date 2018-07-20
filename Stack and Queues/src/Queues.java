import java.util.*;
public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> q = new LinkedList<String>();
q.add("My GirlFriend");
q.add("Sexy");
q.size();
System.out.println(q.size());
System.out.println(q.peek());
System.out.println(q.remove());
System.out.println(q.isEmpty());
System.out.println(q.remove());
System.out.println(q.isEmpty());
		
String[]array = {"www", "gfg" , "fgk",};
for(int x = 0; x < array.length; x++){
q.add(array[x]);

System.out.println(array[x]);
double sum = 0;
Queue<Double> i = new LinkedList<Double>();
i.add(6.45);
i.add(23.6);
i.add(13.5);

for(int s = 0; s < i.size(); s++) {
sum += i.remove(); 
}
System.out.println();
}

	
	}
}

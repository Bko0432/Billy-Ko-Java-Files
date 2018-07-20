import javax.swing.*;
import java.util.ArrayList;
import java.util.*;

public class MrFulosArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<>();

list.add("California");
list.add("Oregon");
list.add("Washington");

System.out.println(list);

list.add("alaska");
System.out.println(list);

list.remove(0);
System.out.println(list);

String state = list.get(1);
System.out.println("The second state is " + state);

int pos = list.indexOf("Alaska");
System.out.println("Alaska is at position " + pos);

//Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
Collections.sort(list);
System.out.println("The sorted list is:");
System.out.println(list);

	}
	

}

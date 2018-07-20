	import javax.swing.*;
	import java.util.LinkedList;
public class LinkedListExample {
	

	    public static void main (String [] args){
	    	
	    
	        LinkedList<String> name = new LinkedList<String>();

	        name.add("John");
	        name.add("Mark");
	        name.add("Stephanie");
	        name.add("Kris");
	        name.add("Jeff");

	        name.addFirst("Andrew");
	        name.addLast("Osh");
	        
	        name.removeFirst();
	        name.removeLast();
	        name.remove(3); //remove a specific index
	        
	        //name.set(index, element) used for replacing content for a particular index.
	        // Add to a specific index by overloading the method name.add(index, element)

	        name.add(1, "Fulo"); 
	        
	        System.out.println (name.size());
	        
	        //name.clear(); //This removes all the data in the list
	        
	        for (String x : name)
	        {
	            System.out.println(x);
	        }
	        
	    }
	}



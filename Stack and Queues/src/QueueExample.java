import javax.swing.*;
import java.util.*;
public class QueueExample{



    public static void main (String [] args)
    {

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty())
        {
            System.out.println(q.remove());

        }
        System.out.println(q);
    }
}




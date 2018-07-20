import javax.swing.*;
import java.util.*;
public class StacksExample //LIFO - Last In First Out
{

    public static void main (String [] args)
    {

        Stack<Integer> s = new Stack<Integer>();

        s.push(45);
        s.push(3);
        s.push(35);
        s.push(18);
        s.push(21);

       System.out.println(s);
        //while (!s.isEmpty())
        //{
            s.pop();
        //}
        
        System.out.println(s);
    }
}




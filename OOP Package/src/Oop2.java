import javax.swing.*;
import java.io.*;
import java.text.*;

public class Oop2 //Name of the Class
{

    public static void main (String args[]) //this line is considered as the main method
    {
     System.out.println('\f');
        
     Person2 person1 = new Person2("Andrew", "11.15.80", 33);
     Person2 person2 = new Person2("Mike", "2.9.84", 47 );
     Person2 person3 = new Person2("John", "3.22.90", 55);
     
     System.out.println("Person 1: " + "\n"
                            + "Name: " + person1.name + "\n"
                            + "Date of Birth: " + person1.dob + "\n"
                            + "Age: " + person1.age + "\n");
                            
     System.out.println("Person 2: " + "\n"
                            + "Name: " + person2.name + "\n"
                            + "Date of Birth: " + person2.dob + "\n"
                            + "Age: " + person2.age + "\n");
                            
     System.out.println("Person 3: " + "\n"
                            + "Name: " + person3.name + "\n"
                            + "Date of Birth: " + person3.dob + "\n"
                            + "Age: " + person3.age);
    }

}

import javax.swing.*;
import java.io.*;
import java.text.*;

public class NewPerson //Name of the Class
{

    public static void main (String args[]) //this line is considered as the main method
    {
        
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.name = "Andrew";
        person1.dob = "11.15.80";
        person1.age = 33;

        person2.name = "Mike";
        person2.dob = "2.9.84";
        person2.age = 47;

        person3.name = "John";
        person3.dob = "3.22.90";
        person3.age = 55;

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

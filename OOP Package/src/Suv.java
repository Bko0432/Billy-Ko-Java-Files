public class Suv

{
    String color = "Grey";
    
    public static void main (String args[])
    {
        System.out.println('\f');

        Honda car1 = new Honda();
        Honda car2 = new Honda();

        car1.displaySUV();
        car1.color = "Green";
        car1.displayColor();
        
        System.out.println("");
        
        car2.displayCompact();
        car2.color = "Blue";
        car2.displayColor();
    }

}
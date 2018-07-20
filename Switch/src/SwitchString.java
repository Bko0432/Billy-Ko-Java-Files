import javax.swing.*;
public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String okay = JOptionPane.showInputDialog("Welcome Pick a letter from A - E");

			
			switch (okay)
	        {
	            case "A":	            
	            System.out.println("Cool");	       
	            break;


	            case "B":
	            System.out.println("Sweet");
	            break;


	            case "C":
	            System.out.println("Dangerous");
	            break;


	            case "D":
	            System.out.println("Passionate");
	            break;


	            case "E":
	            System.out.println("Wholesome");
	            break;
	            
	            


	            default:
	            System.out.println("None");
	            break;


	        }


	    }
	

	}



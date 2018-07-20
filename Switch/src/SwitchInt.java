import javax.swing.*;
public class SwitchInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int okay = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 1-7"));
         

	        switch (okay)
	        {
	            case 1:
	            System.out.println("Police");
	            break;


	            case 2:
	            System.out.println("Engineer");
	            break;


	            case 3:
	            System.out.println("Business Man");
	            break;
	            
	            case 4:
	            System.out.println("Lawyer");
	            break;
	            
	            case 5: 
	            System.out.println("Carpenter");
	            break;
	            
	            case 6:
	            System.out.println("Fisherman");
	            break;
	            
	            case 7:
	            System.out.println("Programming");
	            break;
	            
	            default: 
	            System.out.println("Choose again");
	            break;
	            
	           
	            
	        }


	    }
	

	}



import javax.swing.JOptionPane;

public class StringTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ask what the user would input IF its a number printout Number IF its a string printout string
	  String s = JOptionPane.showInputDialog("What to input?");
	  //int i = Integer.parseInt(s);
	  
	 
		  
	 
		try{ 
			 int i = Integer.parseInt(s);
			  
		}catch(Exception e){
	System.out.println("hi");}
		System.out.println("It still goes here");
	}
}


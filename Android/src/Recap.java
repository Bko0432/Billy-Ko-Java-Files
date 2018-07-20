import javax.swing.JOptionPane;

public class Recap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
int b = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

int c = a+b;
System.out.println(c);

}
catch(Exception e){
	JOptionPane.showMessageDialog(null,"Error: " );
}


}
}
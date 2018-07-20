import javax.swing.JOptionPane;

public class ArraySearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] name = new String[5];
for(int p = 0; p < 5; p++){
	name[p] = JOptionPane.showInputDialog("Insert Name");
	System.out.println(name[p]);
	
}
for(int d = 0; d < 5; d++){


if(name[d].equalsIgnoreCase(JOptionPane.showInputDialog("What name?"))){
	System.out.println(name[d]);
	
}
}
}
}
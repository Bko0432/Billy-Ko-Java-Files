
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList2 {
	
public static void main(String[] args) {

ArrayList<String> Countries = new ArrayList();
for(int a = 0; a < 8; a++){
	Countries.add(JOptionPane.showInputDialog("Country Names"));
	System.out.println(Countries.get(a));
}


}
}

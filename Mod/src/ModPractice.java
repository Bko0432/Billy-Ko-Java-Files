import javax.swing.JOptionPane;

public class ModPractice {
	public static void main(String args[]){
		int q;
		int d;
		int n;
		int c;
		int remaining;
		int x = Integer.parseInt(JOptionPane.showInputDialog("how much money you got?"));
		q = x/25;
		remaining = x % 25;
		d = remaining/10;
		remaining%=10;
		n = remaining/5;
		remaining%=5;
		c = remaining/1;
		
		
		System.out.println(q);
		System.out.println(d);
		System.out.println(n);
		System.out.println(c);
	}
}

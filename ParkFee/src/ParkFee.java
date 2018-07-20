import javax.swing.JOptionPane;

public class ParkFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x;
	int payment;
x = Integer.parseInt(JOptionPane.showInputDialog("Hours and Parking"));

if (x <= 3) {
	 payment = 40;
}else 
	payment = 40+((x-3)*10);
System.out.println(payment);
	}
}

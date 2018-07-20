import java.awt.*;
 import javax.swing.*;
 import java.awt.geom.*;
public class loans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiePanel loans = new PiePanel(4);
		loans.addSlice(Color.green, 101F);
		loans.addSlice(Color.yellow, 68F);
		loans.addSlice(Color.blue, 91F);
		loans.addSlice(Color.red, 25F);
	}

}

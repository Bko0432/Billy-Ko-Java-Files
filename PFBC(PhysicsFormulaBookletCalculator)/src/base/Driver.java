package base;

public class Driver {
 public static void main (String[] args)
 {
	 GUI0 gui0 = new GUI0();
	 gui0.setVisible(true);
	 GUI gui = new GUI();
	 gui.setVisible(false);
	 GUI2 gui2 = new GUI2();
	// gui2.setVisible(false);
	 Logic logic = new Logic();
	 Controller control = new Controller(gui0, gui, gui2, logic);
 }
}


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PokeGUI PGUI = new PokeGUI();
Logic l = new Logic();
Controller c = new Controller(l,PGUI);
PGUI.setVisible(true);
	}

}

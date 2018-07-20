
public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PhysicsCalcGUI PcG = new PhysicsCalcGUI();
Logic L = new Logic();
Controller c = new Controller(L, PcG);
PcG.setVisible(true);

	}

}

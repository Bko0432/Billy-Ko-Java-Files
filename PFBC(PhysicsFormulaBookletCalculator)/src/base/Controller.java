package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

public class Controller {
private GUI0 gui0;
 private GUI gui;
 private GUI2 gui2;
 private Logic logic;
 private int reArrangeNumber;
 private formulaBase formula;
 private int numberVariables;
	public Controller(GUI0 gui0, GUI gui, GUI2 gui2, Logic logic)
 {
	this.gui0 = gui0;
	 this.gui = gui;
	 this.gui2 =gui2;
	 this.logic = logic;
	 gui0.setResizable(false);
	 gui.setResizable(false);
	 gui2.setResizable(false);
	 
	 gui0.addNextPage(new FirstPageListener());
	 gui.addNextPage(new NextPageListener());
	 gui2.addPreviousPage(new PreviousPageListener());
	 gui2.addResetCalculator(new ResetListener());
	 gui2.changeSelection(new ChangeSelection());
	 gui2.addRearrangeFormula(new RearrangeListener());
	 gui2.addCalculate(new CalculateListener());
 }

public void reset()
{
	int x;
	x = logic.getNumVariables(formula)-1;
	gui2.ResetCalculator();
	switch(x){
		case 7:gui2.setVariable8(logic.getVariableName(formula, x)); x--;
		case 6:gui2.setVariable7(logic.getVariableName(formula, x)); x--;
		case 5:gui2.setVariable6(logic.getVariableName(formula, x)); x--;
		case 4:gui2.setVariable5(logic.getVariableName(formula, x)); x--;
		case 3:gui2.setVariable4(logic.getVariableName(formula, x)); x--;
		case 2:gui2.setVariable3(logic.getVariableName(formula, x)); x--;
		case 1:gui2.setVariable2(logic.getVariableName(formula, x)); x--;
		case 0:gui2.setVariable1(logic.getVariableName(formula, x)); x--;
		}
}
	class NextPageListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			gui.setHidden();
			gui2.showGUI2(logic.setTopicNumber(gui.getTopic()));
			reArrangeNumber = 0;
			formula = logic.getFormulas(0);
			reset();
			gui2.setDisplayCalculation("Current Formula:" + logic.getStringFormula(formula, 0));
			
		}
	}
	
	class FirstPageListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			gui0.setVisible(false);
			gui.setVisible(true);
			gui.resetColors();
			reArrangeNumber = 0;
			formula = logic.getFormulas(0);
			reset();
			gui2.setDisplayCalculation("Current Formula:" + logic.getStringFormula(formula, 0));
			
		}
	}
	class PreviousPageListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			gui.setVisible(true);
			gui2.setHidden();
			
		}	
	}
	
	class ResetListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
			gui2.ResetCalculator();
		}
		
	}
	
	class ChangeSelection implements ItemListener{
		
		@Override
		public void itemStateChanged(ItemEvent e)
		{
			gui2.ResetCalculator();
			formula = logic.getFormulas(gui2.getFormulaSelectedIndex());
			reset();
			gui2.setDisplayCalculation("Current Formula:" + logic.getStringFormula(formula, 0));
		}
	}
	
	class CalculateListener implements ActionListener{
		boolean check = true;
		@Override
		public void actionPerformed(ActionEvent e){
		int x = logic.getNumVariables(formula)-1;
		switch(x)
		{
		case 7:try {formula.setVariable8(Double.parseDouble(gui2.getTextAreaV8().getText()));} catch(Exception except){}
		case 6:try {formula.setVariable7(Double.parseDouble(gui2.getTextAreaV7().getText()));} catch(Exception except){}
		case 5:try {formula.setVariable6(Double.parseDouble(gui2.getTextAreaV6().getText()));} catch(Exception except){}
		case 4:try {formula.setVariable5(Double.parseDouble(gui2.getTextAreaV5().getText()));} catch(Exception except){}
		case 3:try {formula.setVariable4(Double.parseDouble(gui2.getTextAreaV4().getText()));} catch(Exception except){}
		case 2:try {formula.setVariable3(Double.parseDouble(gui2.getTextAreaV3().getText()));} catch(Exception except){}
		case 1:try {formula.setVariable2(Double.parseDouble(gui2.getTextAreaV2().getText()));} catch(Exception except){}
		case 0:try {formula.setVariable1(Double.parseDouble(gui2.getTextAreaV1().getText()));} catch(Exception except){}
		}
//		if(check)
//		{
			formula.solve();
			gui2.setDisplayCalculation("Current Formula:" + logic.getStringFormula(formula, reArrangeNumber)+"\n"+
			"\nSolution: "+formula.getAnswer());
//		}
	}
	
}
	class RearrangeListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e){
		formula.setCount();
		reArrangeNumber = formula.returnCount();
		reset();
		gui2.setDisplayCalculation("Current Formula:" + logic.getStringFormula(formula, reArrangeNumber));
	}
	
}
}

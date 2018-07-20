package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics15 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = η; variable2 = Useful Work; variable3 = Energy Input;  
        if (count == 0) {
            answer1 = getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics15(){
    	numFormulas = 3;
    	variables.add("η");
    	variables.add("Useful Work");
    	variables.add("Energy Input");
  
    	
    	
        formulas.add("η = Useful Work/Energy Input");
        formulas.add("Useful Work = η*Energy Input");
        formulas.add("Energy Input = η/Useful Work");
       
}
}

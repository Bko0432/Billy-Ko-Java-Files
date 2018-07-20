package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics17 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = B; variable2 = ρf; variable3 = Vf; 
        if (count == 0) {
            answer1 = getVariable2()*getVariable3()*9.81;
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3()*9.81;
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2()*9.81;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics17(){
    	numFormulas = 3;
    	variables.add("B");
    	variables.add("ρf");
    	variables.add("Vf");
    	
    	
        formulas.add("B = ρf*Vf*g");
        formulas.add("ρf = B/Vf*g ");
        formulas.add("Vf = B/ρf*g");
       
}
}

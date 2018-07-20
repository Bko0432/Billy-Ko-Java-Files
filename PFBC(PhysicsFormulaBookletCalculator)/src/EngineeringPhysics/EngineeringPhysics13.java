package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics13 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = ∆S; variable2 = ∆Q; variable3 = T;  
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
  public EngineeringPhysics13(){
    	numFormulas = 3;
    	variables.add("∆S");
    	variables.add("∆Q");
    	variables.add("T");
  
    	
    	
        formulas.add("∆S = ∆Q/T");
        formulas.add("∆Q = ∆S*T");
        formulas.add("T = ∆S/∆Q");
       
}
}

package EngineeringPhysics;

import base.formulaBase;
public class EngineeringPhysics11 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = Q; variable2 = ∆U; variable3 = W;  
        if (count == 0) {
            answer1 = getVariable2()+getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()-getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()-getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics11(){
    	numFormulas = 3;
    	variables.add("Q");
    	variables.add("∆U");
    	variables.add("W");
  
    	
    	
        formulas.add("Q = ∆U+W");
        formulas.add("∆U = Q-W");
        formulas.add("W = Q-∆U");
       
}
}

package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics14 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = W; variable2 = p; variable3 = ∆V;  
        if (count == 0) {
            answer1 = getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics14(){
    	numFormulas = 3;
    	variables.add("W");
    	variables.add("p");
    	variables.add("∆V");
  
    	
    	
        formulas.add("W = p*∆V");
        formulas.add("p = W/∆V");
        formulas.add("∆V = W/p");
       
}
}

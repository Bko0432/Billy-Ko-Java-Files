package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics9 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = L; variable2 = I; variable3 = ω;  
        if (count == 0) {
            answer1 = getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable2()/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics9(){
    	numFormulas = 3;
    	variables.add("L");
    	variables.add("I");
    	variables.add("ω");
  
    	
    	
        formulas.add("L = I*ω");
        formulas.add("I = L/ω");
        formulas.add("ω = I/L");
       
}
}

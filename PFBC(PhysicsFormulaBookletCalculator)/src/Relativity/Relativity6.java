package Relativity;

import base.formulaBase;

public class Relativity6 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = θ; variable2 = v; 
        if (count == 0) {
            answer1 = getVariable2()/Math.pow(3*10, 8);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = Math.pow(3*10, 8)*Math.tan(getVariable1());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity6(){
    	numFormulas = 2;
    	variables.add("θ");
    	variables.add("v");
    	
    	
        formulas.add("tan(θ) = (v/c)");
        formulas.add("v = c*tan(θ)");
     
}
}

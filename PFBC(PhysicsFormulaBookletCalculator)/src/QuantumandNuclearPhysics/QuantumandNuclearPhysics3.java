package QuantumandNuclearPhysics;

import base.formulaBase;

public class QuantumandNuclearPhysics3 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = E; variable2 = n;
        if (count == 0) {
            answer1 = -13.6/Math.pow(getVariable2(), 2);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = Math.sqrt(13.6/getVariable1())*-1;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public QuantumandNuclearPhysics3(){
    	numFormulas = 2;
    	variables.add("E");
    	variables.add("n");
    	
    	
    	
    	
        formulas.add("E = -13.6/n^2");
        formulas.add("n = sqrt(13.6/E)");
        
}
}

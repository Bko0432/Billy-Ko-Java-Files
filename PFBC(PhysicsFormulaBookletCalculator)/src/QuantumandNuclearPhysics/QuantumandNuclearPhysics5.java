package QuantumandNuclearPhysics;

import base.formulaBase;

public class QuantumandNuclearPhysics5 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = A;  variable2 = R; 
        if (count == 0) {
            answer1 = Math.pow(1.20*10, -15)*Math.pow(getVariable1(), 1/3);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = Math.pow(getVariable2(), 3)/Math.pow(1.20*10, -15^3);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public QuantumandNuclearPhysics5(){
    	numFormulas = 2;
    	variables.add("A");
    	variables.add("R");
    	
    	
    	
        formulas.add("R = Ro*A^1/3");
        formulas.add("A = R^3/Ro^3");
      
        

}
}

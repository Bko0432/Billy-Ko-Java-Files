package QuantumandNuclearPhysics;

import base.formulaBase;

public class QuantumandNuclearPhysics6 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = λ;  variable2 = t; variable3 = N; variable4 = No;
        if (count == 0) {
            answer1 = getVariable4()*Math.pow(2.718, -getVariable1()*getVariable2());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()/Math.pow(2.718, -getVariable1()*getVariable2());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public QuantumandNuclearPhysics6(){
    	numFormulas = 2;
    	variables.add("λ");
    	variables.add("t");
    	variables.add("No");
    	variables.add("N");
    	
    	
    	
        formulas.add("N = No*e^-λ*τ");
        formulas.add("No = N/e^-λ*τ");
      
        

}
}

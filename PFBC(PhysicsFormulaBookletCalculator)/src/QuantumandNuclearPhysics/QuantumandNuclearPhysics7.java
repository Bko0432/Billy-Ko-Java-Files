package QuantumandNuclearPhysics;

import base.formulaBase;

public class QuantumandNuclearPhysics7 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = A; variable2 = No;  variable3 = λ; variable4 = t;
        if (count == 0) {
            answer1 = getVariable3()*getVariable2()*Math.pow(2.718, -getVariable3()*getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3()*Math.pow(2.718, -getVariable3()*getVariable4());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public QuantumandNuclearPhysics7(){
    	numFormulas = 2;
    	variables.add("A");
    	variables.add("No");
    	variables.add("λ");
    	variables.add("t");
    	
        formulas.add("A = λ*No*e^-λ*t");
        formulas.add("No = A/λ*e^-λ*t");
      
        

}
}

package QuantumandNuclearPhysics;

import base.formulaBase;

public class QuantumandNuclearPhysics1 extends formulaBase {
	@Override
    public String solve() {
        // variable1 = E;  variable2 = f;
        if (count == 0) {
            answer1 = Math.pow(6.63*10,-34)*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/Math.pow(6.63*10, -34);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public QuantumandNuclearPhysics1(){
    	numFormulas = 2;
    	variables.add("E");
    	variables.add("f");
    	
        formulas.add("E = h*f");
        formulas.add("f = E/h");
               

}
}

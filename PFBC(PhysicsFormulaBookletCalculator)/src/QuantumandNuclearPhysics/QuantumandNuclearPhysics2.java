package QuantumandNuclearPhysics;

import base.formulaBase;

public class QuantumandNuclearPhysics2 extends formulaBase{
	@Override
    public String solve() {
        // variable1 = E; variable2 = f; variable3 = Φ
        if (count == 0) {
            answer1 = Math.pow(6.63*10,-34)*getVariable2()-getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = Math.pow(6.63*10, -34)*getVariable2()-getVariable1();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable3()+getVariable1()/Math.pow(6.63*10, -34);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public QuantumandNuclearPhysics2(){
    	numFormulas = 3;
    	variables.add("E");
    	variables.add("f");
    	variables.add("Φ");
    	
    	
    	
        formulas.add("E = h*f-Φ");
        formulas.add("Φ = h*f-E");
        formulas.add("f = Φ+E/h");
        

}
}

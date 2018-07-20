package QuantumandNuclearPhysics;

import base.formulaBase;

public class QuantumandNuclearPhysics4 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = m; variable2 = v; variable3 = r; variable4 = n;
        if (count == 0) {
            answer1 = getVariable4()*Math.pow(6.63*10, -34)*getVariable2()*getVariable3()/2*Math.PI;
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable4()*Math.pow(6.63*10, -34)*getVariable1()*getVariable3()/2*Math.PI;
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable4()*Math.pow(6.63*10, -34)*getVariable1()*getVariable2()/2*Math.PI;
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = 2*Math.PI*getVariable1()*getVariable2()*getVariable3()/Math.pow(6.63*10, -34);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public QuantumandNuclearPhysics4(){
    	numFormulas = 4;
    	variables.add("m");
    	variables.add("v");
    	variables.add("r");
    	variables.add("n");
    	
    	
        formulas.add("m = n*h*v*r/2*π");
        formulas.add("v = n*h*m*r/2*π");
        formulas.add("r = n*h*m*v/2*π");
        formulas.add("n = 2*π*m*v*r/h");
}
}

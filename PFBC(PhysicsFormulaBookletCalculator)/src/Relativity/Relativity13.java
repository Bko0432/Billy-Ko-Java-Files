package Relativity;

import base.formulaBase;

public class Relativity13 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Δt; variable2 = Δto; variable3 = Rs; variable4 = r;
        if (count == 0) {
            answer1 = getVariable2()/Math.sqrt(1-getVariable3()/getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = Math.sqrt(1-getVariable3()/getVariable4())*getVariable1();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = -getVariable3()/Math.pow(getVariable2()/getVariable1(), 2) -1;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity13(){
    	numFormulas = 2;
    	variables.add("Δt");
    	variables.add("Δto");
    	variables.add("Rs");
    	variables.add("r");
    	
    	formulas.add("Δt = Δto/sqrt(1-Rs/r)");
    	formulas.add("Δto = sqrt(1-Rs/r)*Δt");
        formulas.add("r = -Rs/(Δto/Δt)^2-1");
        
        
      
}
}

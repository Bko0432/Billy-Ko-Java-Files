package Relativity;

import base.formulaBase;

public class Relativity3 extends formulaBase{


	@Override
    public String solve() {
        // variable1 = γ; variable2 = v; 
        if (count == 0) {
            answer1 = Math.sqrt(Math.pow(3*10^8, 2)/Math.pow(3*10^8, 2)-Math.pow(getVariable2(), 2));
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = Math.sqrt(Math.pow(3*10^8, 2)-(Math.pow(3*10^8, 2)/Math.pow(getVariable1(), 2)));
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity3(){
    	numFormulas = 2;
    	variables.add("γ");
    	variables.add("v");
    	    	
    	
        formulas.add("γ = sqrt(c^2/c^2-v^2)");
        formulas.add("v = sqrt(c^2-(c^2/γ^2)");
   
      
}
}

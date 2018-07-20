package Relativity;

import base.formulaBase;

public class Relativity7 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = E; variable2 = γ; variable3 = m(o);  
        if (count == 0) {
            answer1 = getVariable2()*getVariable3()*Math.pow(3*Math.pow(10, 8), 2);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3()*Math.pow(3*Math.pow(10, 8), 2);
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2()*Math.pow(3*Math.pow(10, 8), 2);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity7(){
    	numFormulas = 3;
    	variables.add("E");
    	variables.add("γ");
    	variables.add("m(o)");
    	
    	
    	
        formulas.add("E = γ*m(o)*c^2");
        formulas.add("γ = E/m(o)*c^2");
        formulas.add("m(o) = E/γ*c^2");
        
      
}
}

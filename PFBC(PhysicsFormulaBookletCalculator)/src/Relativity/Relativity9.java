package Relativity;

import base.formulaBase;

public class Relativity9 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Ek; variable2 = γ; variable3 = m(o);  
        if (count == 0) {
            answer1 = (getVariable2()-1)*getVariable3()*Math.pow(3*Math.pow(10, 8), 2);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = (getVariable1()/getVariable3()*Math.pow(3*Math.pow(10, 8), 2) + 1);
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/(getVariable2()-1)*Math.pow(3*Math.pow(10, 8), 2);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity9(){
    	numFormulas = 3;
    	variables.add("Ek");
    	variables.add("γ");
    	variables.add("m(o)");
    	
    	
    	
        formulas.add("Ek = (γ-1)*m(o)*c^2");
        formulas.add("γ = (Ek/m(o)*c^2)+1");
        formulas.add("m(o) = Ek/(γ-1)*c^2");
        
      
}
}

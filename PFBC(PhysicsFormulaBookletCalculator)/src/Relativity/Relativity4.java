package Relativity;

import base.formulaBase;

public class Relativity4 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = ∆t; variable2 = γ; variable3 = ∆to;  
        if (count == 0) {
            answer1 = getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity4(){
    	numFormulas = 3;
    	variables.add("∆t");
    	variables.add("γ");
    	variables.add("∆to");
    	
    	
        formulas.add("∆t = γ*∆to");
        formulas.add("γ = ∆t/∆to");
        formulas.add("∆to = ∆t/γ");
      
}
}

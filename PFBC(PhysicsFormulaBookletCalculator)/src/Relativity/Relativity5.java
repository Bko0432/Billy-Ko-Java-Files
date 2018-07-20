package Relativity;

import base.formulaBase;

public class Relativity5 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = L; variable2 = Lo; variable3 = γ;  
        if (count == 0) {
            answer1 = getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity5(){
    	numFormulas = 3;
    	variables.add("L");
    	variables.add("Lo");
    	variables.add("γ");
    	
    	
        formulas.add("L = Lo/γ");
        formulas.add("Lo = L*γ");
        formulas.add("γ = L/Lo");
      
}
}

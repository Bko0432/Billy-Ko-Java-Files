package Relativity;

import base.formulaBase;

public class Relativity11 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = ΔEk; variable2 = q; variable3 = v;
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
  public Relativity11(){
    	numFormulas = 3;
    	variables.add("ΔEk");
    	variables.add("q");
    	variables.add("v");
    	
    	
    	
        formulas.add("ΔEk = q*v");
        formulas.add("q = ΔEk/v");
        formulas.add("v = ΔEk/q");
      
}
}

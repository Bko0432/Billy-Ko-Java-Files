package Relativity;

import base.formulaBase;

public class Relativity2 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = u'; variable2 = u; variable3 = v;  
        if (count == 0) {
            answer1 = getVariable2()-getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()+getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()-getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity2(){
    	numFormulas = 3;
    	variables.add("u'");
    	variables.add("u");
    	variables.add("v");
    	
    	
        formulas.add("u' = u-v");
        formulas.add("u = u'+ v");
        formulas.add("v = u'- u");
      
}
}

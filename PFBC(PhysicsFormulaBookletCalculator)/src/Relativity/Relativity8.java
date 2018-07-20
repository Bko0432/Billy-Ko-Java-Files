package Relativity;

import base.formulaBase;

public class Relativity8 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Eo;  variable2 = m(o);  
        if (count == 0) {
            answer1 = getVariable2()*Math.pow(3*Math.pow(10, 8), 2);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable2()*Math.pow(3*Math.pow(10, 8), 2);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity8(){
    	numFormulas = 2;
    	variables.add("Eo");
    	variables.add("m(o)");
    	
        formulas.add("Eo = m(o)*c^2");
        formulas.add("m(o) = Eo/c^2");
        
      
}
}

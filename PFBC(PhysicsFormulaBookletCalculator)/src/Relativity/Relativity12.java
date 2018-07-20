package Relativity;

import base.formulaBase;

public class Relativity12 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Rs; variable2 = M; 
        if (count == 0) {
            answer1 = 2*Math.pow(6.67*10, -11)*getVariable2()/Math.pow(3*Math.pow(10, 8), 2);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()*Math.pow(3*Math.pow(10, 8), 2)/2*Math.pow(6.67*10, -11);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity12(){
    	numFormulas = 2;
    	variables.add("Rs");
    	variables.add("M");
    	
    	
    	
        formulas.add("Rs = 2*G*M/c^2");
        formulas.add("M = Rs*c^2/2*G");
        
      
}
}

package Fields;

import base.formulaBase;

public class Fields1 extends formulaBase {

	 @Override
	    public String solve() {
	        // variable1 = W; variable2 = ∆Ve; variable3 = q; 
	        if (count == 0) {
	            answer1 = getVariable3()*getVariable2();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()/getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable1()/getVariable2();
	            setAnswer(answer1 + "");
	        } 
	        return getAnswer();
	    }
	  public Fields1(){
	    	numFormulas = 3;
	    	variables.add("W");
	    	variables.add("∆Ve");
	    	variables.add("q");
	   
	    	
	    	
	        formulas.add("W = q*∆Ve");
	        formulas.add("∆Ve = W/q");
	        formulas.add("q = W/∆Ve");
}
}

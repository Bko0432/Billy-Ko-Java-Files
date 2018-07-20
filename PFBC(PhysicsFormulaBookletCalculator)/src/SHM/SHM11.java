package SHM;

import base.formulaBase;

public class SHM11 extends formulaBase{
	
	 @Override
	    public String solve() {
	        // variable1 = d; variable2 = n; variable3 = m; variable4 = λ;
	        if (count == 0) {
	            answer1 = getVariable2()*getVariable4();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = 2*getVariable1()*getVariable2()/getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = 2*getVariable1()*getVariable2()/getVariable4();
	            setAnswer(answer1 + "");
	        } 
	        return getAnswer();
	    }
	  public SHM11(){
	    	numFormulas = 3;
	    	variables.add("n");
	    	variables.add("λ");
	    	variables.add("d");
	    	variables.add("m");
	    	
	    	
	        formulas.add("n = m*λ/2*d");
	        formulas.add("λ = 2*d*n/m");
	        formulas.add("d = m*λ/2*n");
	        formulas.add("m = 2*d*n/λ");
	        
	    }





}

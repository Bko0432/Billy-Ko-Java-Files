package SHM;

import base.formulaBase;

public class SHM14 extends formulaBase{

	 @Override
	    public String solve() {
	        // variable1 = R; variable2 = m; variable3 = N; 
	        if (count == 0) {
	            answer1 = getVariable2()*getVariable3();
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
	  public SHM14(){
	    	numFormulas = 3;
	    	variables.add("R");
	    	variables.add("m");
	    	variables.add("N");
	   
	    	
	    	
	        formulas.add("R = m*N");
	        formulas.add("m = R/N");
	        formulas.add("N = R/m");
}
}
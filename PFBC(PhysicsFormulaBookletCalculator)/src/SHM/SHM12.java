package SHM;

import base.formulaBase;

public class SHM12 extends formulaBase{

	 @Override
	    public String solve() {
	        // variable1 = b; variable2 = λ; variable3 = θ; 
	        if (count == 0) {
	            answer1 = 1.22*getVariable2()/getVariable1();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable3()/getVariable1()*1.22;
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable3()/getVariable2()*1.22;
	            setAnswer(answer1 + "");
	        } 
	    
	        return getAnswer();
	    }
	  public SHM12(){
	    	numFormulas = 3;
	  
	    	variables.add("λ");
	    	variables.add("θ");
	    	variables.add("b");
	    	
	    	
	        formulas.add("θ = 1.22*λ/b");
	        formulas.add("λ = θ/b*1.22");
	        formulas.add("b = θ/λ*1.22");
	    }




}

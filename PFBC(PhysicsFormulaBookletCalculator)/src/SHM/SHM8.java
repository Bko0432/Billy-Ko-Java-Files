package SHM;

import base.formulaBase;

public class SHM8 extends formulaBase{
	
	 @Override
	    public String solve() {
	        // variable1 = θ; variable2 = λ; variable3 = b;
	        if (count == 0) {
	            answer1 = getVariable2() / getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1() * getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable2() / getVariable1();
	            setAnswer(answer1 + "");
	        }
	    
	        return getAnswer();
	    }
	  public SHM8(){
	    	numFormulas = 3;
	    	variables.add("θ");
	    	variables.add("λ");
	    	variables.add("b");
	    	
	    	
	        formulas.add("θ = λ/b");
	        formulas.add("λ = θ*b");
	        formulas.add("b = λ/θ");
	    }


	
	

}

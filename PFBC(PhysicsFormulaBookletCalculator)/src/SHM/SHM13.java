package SHM;

import base.formulaBase;

public class SHM13 extends formulaBase {
	
	 @Override
	    public String solve() {
	        // variable1 = R; variable2 = λ; variable3 = ∆λ; 
	        if (count == 0) {
	            answer1 = getVariable2()/getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()*getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable2()/getVariable1();
	            setAnswer(answer1 + "");
	        } 
	    
	        return getAnswer();
	    }
	  public SHM13(){
	    	numFormulas = 3;
	  
	    	variables.add("λ");
	    	variables.add("∆λ");
	    	variables.add("R");
	    	
	    	
	        formulas.add("R = λ/∆λ");
	        formulas.add("λ = R*∆λ");
	        formulas.add("∆λ = λ/R");

}
}
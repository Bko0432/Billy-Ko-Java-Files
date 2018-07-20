package Waves;

import base.formulaBase;

public class waves10 extends formulaBase{

	 @Override
	    public String solve() {
	        // variable1 = Path Difference ; variable2 = n ; variable3 = λ
	        if (count == 0) {
	            answer1 = (getVariable2()+0.5)*getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = (getVariable1()/getVariable3())*-0.5;
	            setAnswer(answer1 + "");
	        }else if (count == 2) {
	            answer1 = getVariable1()/getVariable2()+0.5;
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }
	    public waves10(){
	    	numFormulas = 3;
	    	variables.add("Path Difference");
	    	variables.add("n");
	    	variables.add("λ");
	    	
	        formulas.add("Path Difference = (n+0.5)*λ");
	        formulas.add("n = (Path Difference/λ)-0.5");
	        formulas.add("λ = Path Difference/n+0.5");


	    }
}

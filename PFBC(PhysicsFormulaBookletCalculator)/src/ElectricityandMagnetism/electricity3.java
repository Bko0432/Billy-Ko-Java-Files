package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity3 extends formulaBase {

	 @Override
	    public String solve() {
	        // variable1 = k; variable2 = εi; 
	        if (count == 0) {
	            answer1 = 1 / 4*Math.PI*getVariable2();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()*2*Math.PI;
	            setAnswer(answer1 + "");
	        } 
	        return getAnswer();
	    }

	 public electricity3() {
		 numFormulas = 2;
		 variables.add("k");
		 variables.add("εi");
		 
	        formulas.add("k = 1/4*π*εi");
	        formulas.add("εi = k*4*π");
	      
	    }
	}


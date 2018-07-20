package SHM;

import base.formulaBase;

public class SHM15 extends formulaBase{

	 @Override
	    public String solve() {
	        // variable1 = f'; variable2 = f; variable3 = v; variable4 = Us;
	        if (count == 0) {
	            answer1 = getVariable2()*(getVariable3()/getVariable3()-getVariable4());
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable2()*(getVariable3()/getVariable3()+getVariable4());
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }

	    public SHM15() {
	    	numFormulas = 2;
	    	variables.add("f'");
	    	variables.add("f");
	    	variables.add("v");
	    	variables.add("Us");
	    	
	        formulas.add("f' = f*(v/v-Us)");
	        formulas.add("f' = f*(v/v+Us");

	    }
	
	
}

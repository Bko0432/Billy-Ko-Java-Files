package SHM;

import base.formulaBase;

public class SHM16 extends formulaBase{

	
	 @Override
	    public String solve() {
	        // variable1 = f'; variable2 = f; variable3 = v; variable4 = Uo;
	        if (count == 0) {
	            answer1 = getVariable2()*(getVariable3()-getVariable4()/getVariable3());
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable2()*(getVariable3()+getVariable4()/getVariable3());
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }

	    public SHM16() {
	    	numFormulas = 2;
	    	variables.add("f'");
	    	variables.add("f");
	    	variables.add("v");
	    	variables.add("Uo");
	    	
	        formulas.add("f' = f*(v-Uo/v)");
	        formulas.add("f' = f*(v+Uo/v)");

	    }
	
}

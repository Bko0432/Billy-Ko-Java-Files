package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction4 extends formulaBase{
	
	 @Override
	    public String solve() {
	        // variable1 = ε; variable2 = B; variable3 = N; variable4 = l; variable5 = v; 
	        if (count == 0) {
	            answer1 = -getVariable2()*getVariable5()*getVariable4()*getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()/getVariable2()*getVariable5()*getVariable4();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable1()/getVariable2()*getVariable5()*getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 3) {
	            answer1 = getVariable1()/getVariable5()*getVariable4()*getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 4) {
	            answer1 = getVariable1()/getVariable2()*getVariable4()*getVariable3();
	            setAnswer(answer1 + "");
	        } 
	        return getAnswer();
	    }
	  public ElectroMagneticInduction4(){
	    	numFormulas = 5;
	    	variables.add("ε");
	    	variables.add("B");
	    	variables.add("N");
	    	variables.add("l");
	    	variables.add("v");
	    	
	    	
	        formulas.add("ε = B*v*l*N");
	        formulas.add("N = ε/B*v*l");
	        formulas.add("l = ε/B*v*N");
	        formulas.add("B = ε/v*l*N");
	        formulas.add("v = ε/B*l*N");
}

}

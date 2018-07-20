package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction3 extends formulaBase{
	
	 @Override
	    public String solve() {
	        // variable1 = ε; variable2 = B; variable3 = v; variable4 = l;
	        if (count == 0) {
	            answer1 = getVariable2()*getVariable3()*getVariable4();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()/getVariable2()*getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable1()/getVariable2()*getVariable4();
	            setAnswer(answer1 + "");
	        } else if (count == 3) {
	            answer1 = getVariable1()/getVariable3()*getVariable4();
	            setAnswer(answer1 + "");
	        } 
	        return getAnswer();
	    }
	  public ElectroMagneticInduction3(){
	    	numFormulas = 4;
	    	variables.add("ε");
	    	variables.add("B");
	    	variables.add("v");
	    	variables.add("l");
	    	
	    	
	        formulas.add("ε = B*v*l");
	        formulas.add("l = ε/B*v");
	        formulas.add("v = ε/B*l");
	        formulas.add("B = ε/v*l");
}

}

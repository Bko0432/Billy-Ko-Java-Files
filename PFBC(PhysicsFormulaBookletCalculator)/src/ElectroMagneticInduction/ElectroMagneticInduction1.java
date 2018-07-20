package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction1 extends formulaBase {

	
	 @Override
	    public String solve() {
	        // variable1 = Φ; variable2 = B; variable3 = A; variable4 = θ;
	        if (count == 0) {
	            answer1 = getVariable2()*getVariable3()*Math.cos(getVariable4());
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()/getVariable3()*Math.cos(getVariable4());
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable1()/getVariable2()*Math.cos(getVariable4());
	            setAnswer(answer1 + "");
	        } else if (count == 3) {
	            answer1 = getVariable1()/getVariable2()*getVariable3();
	            setAnswer(answer1 + "");
	        } 
	        return getAnswer();
	    }
	  public ElectroMagneticInduction1(){
	    	numFormulas = 4;
	    	variables.add("Φ");
	    	variables.add("B");
	    	variables.add("A");
	    	variables.add("θ");
	    	
	    	
	        formulas.add("Φ = B*A*cosθ");
	        formulas.add("B = Φ/Acosθ");
	        formulas.add("A = Φ/Bcosθ");
	        formulas.add("cosθ = Φ/B*A");
}
}
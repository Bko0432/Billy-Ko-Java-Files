package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction10 extends formulaBase{

	 @Override
	    public String solve() {
	        // variable1 = C;  variable2 = q; variable3 = V; 
	        if (count == 0) {
	            answer1 = getVariable2()/getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = 2*getVariable1()*getVariable3();
	            setAnswer(answer1 + "");
	        }else if (count == 2) {
	            answer1 = 2*getVariable2()/getVariable1();
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }
	  public ElectroMagneticInduction10(){
	    	numFormulas = 3;
	    	variables.add("C");
	    	variables.add("q");
	    	variables.add("V");
	    	
	    	
	        formulas.add("C = q/V");
	        formulas.add("q = C*V");
	        formulas.add("V = q/C");
	 

}
}

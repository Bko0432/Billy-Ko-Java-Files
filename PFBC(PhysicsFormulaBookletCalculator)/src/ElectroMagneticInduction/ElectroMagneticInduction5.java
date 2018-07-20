package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction5 extends formulaBase {
	 @Override
	    public String solve() {
	        // variable1 = I(rms); variable2 = Io; 
	        if (count == 0) {
	            answer1 = getVariable2()/Math.sqrt(2);
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()*Math.sqrt(2);
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }
	  public ElectroMagneticInduction5(){
	    	numFormulas = 2;
	    	variables.add("I(rms)");
	    	variables.add("Io");
	    	
	    	
	    	
	        formulas.add("I(rms) = Io/sqrt(2)");
	        formulas.add("Io = I(rms)*sqrt(2)");
	       

}
}
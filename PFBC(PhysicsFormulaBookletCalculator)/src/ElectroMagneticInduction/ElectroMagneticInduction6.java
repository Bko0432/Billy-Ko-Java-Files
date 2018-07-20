package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction6 extends formulaBase{

	 @Override
	    public String solve() {
	        // variable1 = V(rms); variable2 = Vo; 
	        if (count == 0) {
	            answer1 = getVariable2()/Math.sqrt(2);
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()*Math.sqrt(2);
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }
	  public ElectroMagneticInduction6(){
	    	numFormulas = 2;
	    	variables.add("V");
	    	variables.add("Vo");
	    	
	    	
	    	
	        formulas.add("V(rms) = Vo/sqrt(2)");
	        formulas.add("Vo = V(rms)*sqrt(2)");
}
}
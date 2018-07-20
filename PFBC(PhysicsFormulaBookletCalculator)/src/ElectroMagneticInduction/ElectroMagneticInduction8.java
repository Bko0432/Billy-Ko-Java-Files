package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction8 extends formulaBase{

	 @Override
	    public String solve() {
	        // variable1 = P(max);  variable2 = Io; variable3 = Vo; 
	        if (count == 0) {
	            answer1 = getVariable2()*getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()/getVariable2();
	            setAnswer(answer1 + "");
	        }else if (count == 2) {
	            answer1 = getVariable1()/getVariable3();
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }
	  public ElectroMagneticInduction8(){
	    	numFormulas = 3;
	    	variables.add("P(max)");
	    	variables.add("Vo");
	    	variables.add("Io");
	    
	    	
	        formulas.add("P(max) = Io*Vo");
	        formulas.add("Vo = P/Io");
	        formulas.add("Io = P/Vo");
	 

}
}

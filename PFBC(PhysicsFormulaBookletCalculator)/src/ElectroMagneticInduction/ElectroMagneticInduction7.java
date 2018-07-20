package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction7 extends formulaBase {
	
	 @Override
	    public String solve() {
	        // variable1 = R;  variable2 = Io; variable3 = Vo; 
	        if (count == 0) {
	            answer1 = getVariable3()/getVariable2();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable2()*getVariable1();
	            setAnswer(answer1 + "");
	        }else if (count == 2) {
	            answer1 = getVariable3()/getVariable1();
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }
	  public ElectroMagneticInduction7(){
	    	numFormulas = 3;
	    	variables.add("R");
	    	variables.add("Vo");
	    	variables.add("Io");
	    
	    	
	        formulas.add("R = Vo/Io");
	        formulas.add("Vo = Io*R");
	        formulas.add("Io = Vo/R");
	 

}
}
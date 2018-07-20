package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction9 extends formulaBase {

	
	 @Override
	    public String solve() {
	        // variable1 = Pav;  variable2 = Io; variable3 = Vo; 
	        if (count == 0) {
	            answer1 = getVariable2()*getVariable3()/2;
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = 2*getVariable1()/getVariable2();
	            setAnswer(answer1 + "");
	        }else if (count == 2) {
	            answer1 = 2*getVariable1()/getVariable3();
	            setAnswer(answer1 + "");
	        }
	        return getAnswer();
	    }
	  public ElectroMagneticInduction9(){
	    	numFormulas = 3;
	    	variables.add("Pav");
	    	variables.add("Vo");
	    	variables.add("Io");
	    	
	    	
	        formulas.add("Pav = Io*Vo/2");
	        formulas.add("Vo = 2*Pav/Io");
	        formulas.add("Io = 2*Pav/Vo");
	 

}
}

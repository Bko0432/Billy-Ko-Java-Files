package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics10 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Ek; variable2 = I; variable3 = ω;  
        if (count == 0) {
            answer1 = getVariable2()*Math.pow(getVariable3(), 2)/2;
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = Math.sqrt(2*getVariable1()/getVariable2());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = 2*getVariable1()/Math.pow(getVariable3(), 2);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics10(){
    	numFormulas = 3;
    	variables.add("Ek)");
    	variables.add("I");
    	variables.add("ω");
  
    	
    	
        formulas.add("Ek = I*ω^2/2");
        formulas.add("ω = sqrt(2*Ek/I)");
        formulas.add("I = 2*Ek/ω^2");
       
}
}

package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics2 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = I; variable2 = m; variable3 = r;  
        if (count == 0) {
            answer1 = getVariable2()*Math.pow(getVariable3(), 2);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/Math.pow(getVariable3(), 2);
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = Math.sqrt(getVariable1()/getVariable2());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics2(){
    	numFormulas = 3;
    	variables.add("I");
    	variables.add("m");
    	variables.add("r");
  
    	
    	
        formulas.add("I = m*r^2");
        formulas.add("m = I/r^2");
        formulas.add("r = sqrt(I/m)");
       
}
}

package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics3 extends formulaBase{

	
	@Override
    public String solve() {
        // variable1 = Γ; variable2 = I; variable3 = α;  
        if (count == 0) {
            answer1 = getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics3(){
    	numFormulas = 3;
    	variables.add("Γ");
    	variables.add("I");
    	variables.add("α");
  
    	
    	
        formulas.add("Γ = I*α");
        formulas.add("I = Γ/α");
        formulas.add("α = Γ/I");
       
}
}

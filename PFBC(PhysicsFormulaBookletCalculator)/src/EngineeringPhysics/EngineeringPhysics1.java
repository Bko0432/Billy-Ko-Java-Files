package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics1 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Γ; variable2 = F; variable3 = r; variable4 = θ; 
        if (count == 0) {
            answer1 = getVariable2()*getVariable3()*Math.sin(getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3()*Math.sin(getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable2()*Math.sin(getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics1(){
    	numFormulas = 2;
    	variables.add("Γ");
    	variables.add("F");
    	variables.add("r");
    	variables.add("θ");
    	
    	
        formulas.add("Γ = F*r*sinθ");
        formulas.add("F = Γ/r*sinθ");
        formulas.add("r = Γ/F*sinθ");
        formulas.add("sinθ = Γ/F*r");
}
}

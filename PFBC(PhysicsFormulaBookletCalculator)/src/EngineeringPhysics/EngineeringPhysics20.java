package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics20 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = R; variable2 = ρ; variable3 = η; variable4 = v; variable5 = r
        if (count == 0) {
            answer1 = getVariable4()*getVariable5()*getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()*getVariable3()/getVariable4()*getVariable5();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable4()*getVariable5()*getVariable2();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1()*getVariable3()/getVariable5()*getVariable2();
            setAnswer(answer1 + "");
        }else if (count == 4) {
            answer1 = getVariable1()*getVariable3()/getVariable4()*getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics20(){
    	numFormulas = 5;
    	variables.add("R");
    	variables.add("ρ");
    	variables.add("η");
    	variables.add("v");
    	variables.add("r");
    	
    	
        formulas.add("R = v*r*ρ/η");
        formulas.add("ρ = R*η/v*r");
        formulas.add("η = R/v*r*ρ");
        formulas.add("v = R*η/r*p");
        formulas.add("r = R*η/v*ρ");
}
}

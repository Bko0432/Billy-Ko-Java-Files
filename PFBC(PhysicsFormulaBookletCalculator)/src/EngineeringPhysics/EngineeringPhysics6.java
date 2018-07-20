package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics6 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = ω(f); variable2 = ω(i); variable3 = α; variable4 = θ;
        if (count == 0) {
            answer1 = Math.sqrt(Math.pow(getVariable2(), 2) + 2*getVariable3()*getVariable4());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(Math.pow(getVariable1(), 2) - 2*getVariable3()*getVariable4());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = Math.pow(getVariable1(), 2) - Math.pow(getVariable2(), 2)/2*getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 3) {
            answer1 = Math.pow(getVariable1(), 2) - Math.pow(getVariable2(), 2)/2*getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public EngineeringPhysics6() {
    	numFormulas = 4;
    	variables.add("ω(f)");
    	variables.add("ω(i)");
    	variables.add("α");
    	variables.add("θ");
    	
        formulas.add("ω(f) = sqrt(ω(i)^2 + 2*α*θ)");
        formulas.add("ω(i) = sqrt(ω(f)^2 - 2*α*θ)");
        formulas.add("α = ω(f)^2 - ω(i)^2/2*θ");
        formulas.add("θ = ω(f)^2 - ω(i)^2/2*α");
    }
}

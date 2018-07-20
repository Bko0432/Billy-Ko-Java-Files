package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics7 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = t; variable2 = ω(i); variable3 = α; variable4 = θ;
        if (count == 0) {
            answer1 = Math.sqrt(2*getVariable4()/getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = 2*getVariable4() - getVariable3()*Math.pow(getVariable1(),2)/2*getVariable1();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = 2*getVariable4() - getVariable2()*getVariable1()/Math.pow(getVariable1(), 2);
            setAnswer(answer1 + "");
        } else if (count == 3) {
            answer1 = getVariable2()*getVariable1() + getVariable3()*Math.pow(getVariable1(), 2)/2;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public EngineeringPhysics7() {
    	numFormulas = 4;
    	variables.add("θ");
    	variables.add("ω(i)");
    	variables.add("α");
    	variables.add("t");
    	
    	
    	
    	formulas.add("θ = ω(i)*t + α*t^2/2");
        formulas.add("t = sqrt(2*θ/α)");
        formulas.add("ω(i) = 2*θ - α*t^2/2*t");
        formulas.add("α = 2*θ - ω(i)*t/t^2");
       
    }
}

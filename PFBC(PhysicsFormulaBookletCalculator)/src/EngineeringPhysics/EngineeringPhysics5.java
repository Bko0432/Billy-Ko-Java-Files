package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics5 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = ω(f); variable2 = ω(i); variable3 = α; variable4 = t;
        if (count == 0) {
            answer1 = getVariable2()+getVariable3()*getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1()-getVariable3()*getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1()-getVariable2()/getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 3) {
            answer1 = getVariable1()-getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public EngineeringPhysics5() {
    	numFormulas = 4;
    	variables.add("ω(f)");
    	variables.add("ω(i)");
    	variables.add("α");
    	variables.add("t");
    	
        formulas.add("ω(f) = ω(i) + α*t");
        formulas.add("ω(i) = ω(f) - α*t");
        formulas.add("α = ω(f) - ω(i)/t");
        formulas.add("t = ω(f) - ω(i)/α");
    }
	
}
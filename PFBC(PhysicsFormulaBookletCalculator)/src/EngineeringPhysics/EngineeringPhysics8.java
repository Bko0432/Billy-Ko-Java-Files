package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics8 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = ω(f); variable2 = ω(i); variable3 = t; variable4 = θ;
        if (count == 0) {
            answer1 = 2*getVariable4()/(getVariable1() + getVariable2());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = (2*getVariable4()/getVariable3()) - getVariable1();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = (2*getVariable4()/getVariable3()) - getVariable2();
            setAnswer(answer1 + "");
        } else if (count == 3) {
            answer1 = (getVariable1() + getVariable2()/2)*getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public EngineeringPhysics8() {
    	numFormulas = 4;
    	variables.add("θ");
    	variables.add("ω(f)");
    	variables.add("ω(i)");
    	variables.add("t");
    	
    	
    	
    	formulas.add("θ = (ω(f) + w(i)/2)*t");
    	formulas.add("ω(f) = (2*θ/t) - ω(i)");
    	formulas.add("ω(i) = (2*θ/t) - ω(f)");
        formulas.add("t = 2*θ/(ω(f) + ω(i))");
     
      
    }
}

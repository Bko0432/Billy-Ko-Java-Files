package Waves;

import base.formulaBase;

/**
 * Created by Billy on 11/10/2017.
 */

public class waves6 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = v1 ; variable2 = v2 ; variable3 = θ1; variable4 = θ2;
        if (count == 0) {
            answer1 = Math.sin(getVariable4())/(getVariable2() *Math.sin(getVariable3())) ;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() *Math.sin(getVariable4())/Math.sin(getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable2() /(getVariable1() *Math.sin(getVariable4()));
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable2() *Math.sin(getVariable3())/ getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public waves6(){
    	numFormulas = 4;
    	variables.add("v1");
    	variables.add("v2");
    	variables.add("θ1");
    	variables.add("θ2");
    	
        formulas.add("v1 = sinθ2/v2*sinθ1");
        formulas.add("v2 = v1*sinθ2/sinθ1");
        formulas.add("sinθ1 = v2/v1*sinθ2");
        formulas.add("sinθ2 = v2*sinθ1/v1")

        ;
    }
}

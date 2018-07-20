package Waves;

import base.formulaBase;

/**
 * Created by Billy on 11/10/2017.
 */

public class waves4 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = n1 ; variable2 = n2 ; variable3 = θ1; variable4 = θ2;
        if (count == 0) {
            answer1 = getVariable2() *Math.sin(getVariable4())/Math.sin(getVariable3()) ;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sin(getVariable4())/(getVariable1() *Math.sin(getVariable3()));
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() /(getVariable2() *Math.sin(getVariable4()));
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1() *Math.sin(getVariable3())/ getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public waves4(){
    	numFormulas = 4;
    	variables.add("n1");
    	variables.add("n2");
    	variables.add("θ1");
    	variables.add("θ2");
    	
        formulas.add("n1 = n2*sinθ2/sinθ1");
        formulas.add("n2= sinθ2/n1*sinθ1");
        formulas.add("sinθ1 = n1/n2*sinθ2");
        formulas.add("sinθ2 = n1*sinθ1/n2");


    }
}


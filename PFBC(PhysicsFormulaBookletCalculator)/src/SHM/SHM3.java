package SHM;

import base.formulaBase;

/**
 * Created by Billy on 12/17/2017.
 */

public class SHM3 extends formulaBase {


    @Override
    public String solve() {
        // variable1 = ω; variable2 = a; variable3 = x;
        if (count == 0) {
            answer1 = Math.pow(-getVariable1(),2)*getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(-getVariable3()/getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable2()/Math.pow(-getVariable1(),2);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public SHM3() {
    	
    	numFormulas = 3;
    	variables.add("a");
    	variables.add("ω");
    	variables.add("x");

        formulas.add("a = -ω^2*x");
        formulas.add("ω^2 = -a/x");
        formulas.add("x = a/-ω^2");
    }
}

package NuclearPhysics;

import base.formulaBase;

/**
 * Created by Billy on 11/24/2017.
 */

public class nuclear2 extends formulaBase {
    @Override
    public String solve() {
        // variable1 = E ; variable2 = λ;
        if (count == 0) {
            answer1 = Math.pow(10, -34) * 6.63 * Math.pow(10, 8) * 3 / getVariable1();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.pow(10, -34) * 6.63 * Math.pow(10, 8) * 3 / getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public nuclear2() {
    	numFormulas = 2;
    	variables.add("λ");
    	variables.add("E");
    	
        formulas.add("λ= h*c/E");
        formulas.add("E = h*c/λ");


    }
}
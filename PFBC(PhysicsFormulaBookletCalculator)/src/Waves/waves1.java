package Waves;

import base.formulaBase;

/**
 * Created by Billy on 11/4/2017.
 */

public class waves1 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = T ; variable2 = 1 ; variable3 = f;
        if (count == 0) {
            answer1 = getVariable2() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable2() / getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public waves1(){
    	numFormulas = 2;
    	variables.add("T");
    	variables.add("f");

        formulas.add("T = 1/f");
        formulas.add("f = 1/T");

        ;
    }
}

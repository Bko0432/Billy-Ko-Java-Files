package Waves;

import base.formulaBase;

/**
 * Created by Billy on 11/10/2017.
 */

public class waves2 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = c ; variable2 = f ; variable3 = λ;
        if (count == 0) {
            answer1 = getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public waves2(){
    	numFormulas = 3;
    	variables.add("c");
    	variables.add("f");
    	variables.add("λ");

        formulas.add("c = f*λ");
        formulas.add("f = c/λ");
        formulas.add("λ = c/f");

        ;
    }
}


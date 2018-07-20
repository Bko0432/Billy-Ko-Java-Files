package Waves;

import base.formulaBase;

/**
 * Created by Billy on 11/10/2017.
 */

public class waves3 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = I ; variable2 = θ;
        if (count == 0) {
            answer1 = Math.pow(Math.cos(getVariable2()), 2) ;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public waves3(){
    	numFormulas = 1;
    	variables.add("I");
    	variables.add("θ");

        formulas.add("I = Io*cos^2*θ");


        ;
    }

}

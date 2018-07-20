package Waves;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class waves8 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = n ; variable2 = θc ;
        if (count == 0) {
            answer1 = 1/ getVariable1();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = 1/Math.sin(getVariable2());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public waves8(){
    	numFormulas = 2;
    	variables.add("n");
    	variables.add("θc");
    	
        formulas.add("sinθc = 1/n");
        formulas.add("n = 1/sinθc");



    }
}

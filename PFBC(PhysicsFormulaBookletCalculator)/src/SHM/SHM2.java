package SHM;

import base.formulaBase;

/**
 * Created by Billy on 12/17/2017.
 */

public class SHM2 extends formulaBase {


    @Override
    public String solve() {
        // variable1 = ω; variable2 = f;
        if (count == 0) {
            answer1 = 2*Math.PI*getVariable2();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = 2*Math.PI/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public SHM2() {
    	numFormulas = 2;
    	variables.add("ω");
    	variables.add("f");
    	
        formulas.add("ω = 2*π*f");
        formulas.add("f = 2*π/ω");

    }
}
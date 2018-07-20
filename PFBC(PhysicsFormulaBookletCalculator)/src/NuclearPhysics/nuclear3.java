package NuclearPhysics;

import base.formulaBase;

/**
 * Created by Billy on 11/24/2017.
 */

public class nuclear3 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = E ; variable2 = m;
        if (count == 0) {
            answer1 = getVariable2()*Math.pow(3*Math.pow(10,8),2);
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1()/(Math.pow(3*Math.pow(10,8),2));
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public nuclear3() {
    	numFormulas = 2;
    	variables.add("E");
    	variables.add("m");
    	
        formulas.add("E = m*c^2");
        formulas.add("m = E/c^2");


    }
}

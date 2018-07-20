package NuclearPhysics;

import base.formulaBase;

/**
 * Created by Billy on 11/24/2017.
 */

public class nuclear1 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = E ; variable2 = f;
        if (count == 0) {
            answer1 = Math.pow(10,-34)*6.63*getVariable2();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1()/(Math.pow(10,-34)*6.63);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public nuclear1(){
    	numFormulas = 2;
    	variables.add("E");
    	variables.add("f");
        formulas.add("E = h*f");
        formulas.add("f = E/h");



    }
}

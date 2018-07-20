package ThermalPhysics;

import base.formulaBase;

/**
 * Created by Billy on 11/4/2017.
 */

public class thermal2 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = Q ; variable2 = m ; variable3 = L;
        if (count == 0) {
            answer1 = getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public thermal2(){
    	numFormulas = 3;
    	variables.add("Q");
    	variables.add("L");
    	variables.add("m");
        formulas.add("Q = m*L");
        formulas.add("L = Q/m");
        formulas.add("m = Q/L");

        ;
    }
}

package ThermalPhysics;

import base.formulaBase;

/**
 * Created by Billy on 11/4/2017.
 */

public class thermal3 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = P ; variable2 = F ; variable3 = A;
        if (count == 0) {
            answer1 = getVariable2() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public thermal3(){
    	numFormulas = 3;
    	variables.add("P");
    	variables.add("F");
    	variables.add("A");
    	
        formulas.add("P = F/A");
        formulas.add("F = P*A");
        formulas.add("A = P/F");

        ;
    }
}

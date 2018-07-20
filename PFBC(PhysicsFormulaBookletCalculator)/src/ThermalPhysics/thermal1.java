package ThermalPhysics;

import base.formulaBase;

/**
 * Created by Billy on 11/4/2017.
 */

public class thermal1 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = Q ; variable2 = m ; variable3 = c; variable4 = ΔT;
        if (count == 0) {
            answer1 = getVariable2() * getVariable3() * getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() /(getVariable2() * getVariable4());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() /(getVariable2() * getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 3) {
            answer1 = getVariable1() /(getVariable3() * getVariable4());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public thermal1(){
    	numFormulas = 4;
    	variables.add("Q");
    	variables.add("c");
    	variables.add("ΔT");
    	variables.add("m");
    	
        formulas.add("Q = m*c*ΔT");
        formulas.add("c = Q/m*ΔT");
        formulas.add("ΔT = Q/m*c");
        formulas.add("m = Q/c*ΔT");
        ;
    }
}

package EnergyProduction;

import base.formulaBase;

/**
 * Created by Billy on 12/17/2017.
 */

public class EnergyProduction4 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = I; variable2 = P; variable3 = A;
        if (count == 0) {
            answer1 = getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1()*getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable2()/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public EnergyProduction4() {
    	numFormulas = 3;
    	variables.add("I");
    	variables.add("P");
    	variables.add("A");
    	
        formulas.add("I = P/A");
        formulas.add("P = I*A");
        formulas.add("A = P/I");
    }
}

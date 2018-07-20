package Waves;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class waves7 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = S ; variable2 = λ ; variable3 = D; variable4 = d;
        if (count == 0) {
            answer1 = getVariable2() * getVariable3() / getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() * getVariable4() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() * getVariable4() / getVariable2();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1() / getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public waves7(){
    	numFormulas = 4;
    	variables.add("S");
    	variables.add("λ");
    	variables.add("D");
    	variables.add("d");

        formulas.add("S = λ*D/d");
        formulas.add("λ = S*d/D");
        formulas.add("D = S*d/λ");
        formulas.add("d = S/λ*D");


    }
}

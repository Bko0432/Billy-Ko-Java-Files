package Motion;

import base.formulaBase;

/**
 * Created by Billy on 10/20/2017.
 */

public class motion12 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = P ; variable2 = F ; variable3 = v ;
        if (count == 0) {
            answer1 = getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public motion12(){
    	numFormulas = 3;
    	variables.add("P");
    	variables.add("F");
    	variables.add("v");

        formulas.add("P = F*v");
        formulas.add("F = P/v");
        formulas.add("v = P/F");
        ;
    }
}

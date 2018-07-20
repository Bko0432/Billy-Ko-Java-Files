package CircularMotion;

import base.formulaBase;

/**
 * Created by Billy on 11/24/2017.
 */

public class circular5 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = F ; variable2 = m; variable3 = g ;
        if (count == 0) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable2()*9.81;
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1()/9.81;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public circular5(){
    	numFormulas = 3;
    	variables.add("F");
    	variables.add("m");
    	variables.add("g");
        formulas.add("g = F/m");
        formulas.add("F = m*g");
        formulas.add("m = F/g");


    }
}

package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity1 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = I ; variable2 = q ; variable3 = t;
        if (count == 0) {
            answer1 = getVariable2() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable2() / getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public electricity1(){
    	numFormulas = 3;
    	variables.add("I");
    	variables.add("q");
    	variables.add("t");
        formulas.add("I = q/t");
        formulas.add("q = I*t");
        formulas.add("t = q/I");


    }
}

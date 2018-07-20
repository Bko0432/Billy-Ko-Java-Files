package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity8 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = P ; variable2 = V ; variable3 = I ;
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
    public electricity8(){

        formulas.add("P = V*I");
        formulas.add("I = P/V");
        formulas.add("V = P/I");


    }
}

package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity7 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = I ; variable2 = V ; variable3 = R ;
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
    public electricity7(){

        formulas.add("I = V/R");
        formulas.add("V = I*R");
        formulas.add("R = V*I");


    }
}

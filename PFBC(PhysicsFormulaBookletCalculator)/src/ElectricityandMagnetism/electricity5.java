package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity5 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = E ; variable2 = F ; variable3 = q ;
        if (count == 0) {
            answer1 = getVariable2() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public electricity5(){

        formulas.add("E = F/q");
        formulas.add("F = E*q");
        formulas.add("q = E/F");


    }
}

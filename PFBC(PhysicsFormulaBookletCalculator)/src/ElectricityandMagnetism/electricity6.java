package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity6 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = I ; variable2 = n ; variable3 = A; variable4 = V; variable5 = q
        if (count == 0) {
            answer1 = getVariable2() * getVariable3() * getVariable4() * getVariable5();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable2() * getVariable3() * getVariable5();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable2() * getVariable3() * getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 3) {
            answer1 = getVariable1() / getVariable2() * getVariable4() * getVariable5();
            setAnswer(answer1 + "");
        } else if (count == 4) {
            answer1 = getVariable1() / getVariable3() * getVariable4() * getVariable5();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public electricity6(){

        formulas.add("I = n*A*V*q");
        formulas.add("V = I/n*A*q");
        formulas.add("q = I/n*A*V");
        formulas.add("A = I/n*V*q");
        formulas.add("n = I/A*V*q");
    }

}

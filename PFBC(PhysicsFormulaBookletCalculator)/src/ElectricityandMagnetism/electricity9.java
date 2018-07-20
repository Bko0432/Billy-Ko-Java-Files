package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity9 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = P ; variable2 = I ; variable3 = R ;
        if (count == 0) {
            answer1 = Math.pow(getVariable2(),2)* getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(getVariable1() / getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() /Math.pow(getVariable2(),2);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public electricity9(){

        formulas.add("P = I^2*R");
        formulas.add("I = sqrt(P/R)");
        formulas.add("R = P/I^2");


    }

    }


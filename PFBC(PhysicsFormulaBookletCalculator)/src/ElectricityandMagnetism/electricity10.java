package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity10 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = P ; variable2 = V ; variable3 = R ;
        if (count == 0) {
            answer1 = Math.pow(getVariable2(),2)/ getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(getVariable1() * getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = Math.pow(getVariable2(),2)/ getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public electricity10(){

    	numFormulas = 3;
    	variables.add("P");
    	variables.add("V");
    	variables.add("R");
        formulas.add("P = V^2/R");
        formulas.add("V = sqrt(P*R)");
        formulas.add("R = V^2/P");


    }
}

package ThermalPhysics;

import base.formulaBase;

/**
 * Created by Billy on 11/10/2017.
 */

public class thermal4 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = p ; variable2 = V ; variable3 = n; variable4 = T;
        if (count == 0) {
            answer1 = getVariable3() *8.31* getVariable4() / getVariable2();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable3() *8.31* getVariable4() / getVariable1();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = (getVariable1() * getVariable2())/(8.31* getVariable4());
            setAnswer(answer1 + "");
        }
        else if (count == 3) {
            answer1 = (getVariable1() * getVariable2())/(getVariable3() *8.31);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public thermal4(){

    	numFormulas = 4;
    	variables.add("p");
    	variables.add("v");
    	variables.add("n");
    	variables.add("T");
    	
        formulas.add("p = n*R*T/V");
        formulas.add("v = n*R*T/P");
        formulas.add("n = p*V/R*T");
        formulas.add("T = p*V/n*R");
    }
}

package CircularMotion;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class circular2 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = v ; variable2 = a; variable3 = r ;
        if (count == 0) {
            answer1 = Math.pow(getVariable1(),2)/ getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(getVariable2() * getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = Math.pow(getVariable1(),2)/ getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public circular2(){
    	numFormulas = 3;
    	variables.add("v");
    	variables.add("a");
    	variables.add("r");
        formulas.add("a = v^2/r");
        formulas.add("v = sqrt(a*r)");
        formulas.add("r = v^2/a");


    }
}

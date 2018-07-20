package Waves;

import base.formulaBase;

/**
 * Created by Billy on 11/10/2017.
 */

public class waves5 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = v1 ; variable2 = v2 ; variable3 = n1; variable4 = n2;
        if (count == 0) {
            answer1 = getVariable3() / getVariable4() * getVariable2();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable3() * getVariable1() / getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable4() * getVariable2() / getVariable1();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable2() / getVariable3() * getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public waves5(){
    	numFormulas = 4;
    	variables.add("v1");
    	variables.add("v2");
    	variables.add("n1");
    	variables.add("n2");
    	
        formulas.add("v1 = n1/n2*v2");
        formulas.add("v2= n1*v1/n2");
        formulas.add("n1 = n2*v2/v1");
        formulas.add("n2 = v2/n1*v1")

        ;
    }
}

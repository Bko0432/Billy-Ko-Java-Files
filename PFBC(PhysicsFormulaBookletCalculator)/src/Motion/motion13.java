package Motion;

import base.formulaBase;

/**
 * Created by Billy on 10/20/2017.
 */

public class motion13 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = Efficiency ; variable2 = Useful Work  ; variable3 = Total Work;
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
    public motion13(){
    	numFormulas = 3;
    	variables.add("η");
    	variables.add("Useful Work");
    	variables.add("Total Work");
        formulas.add("η = Useful Work/Total Work");
        formulas.add("Useful Work = η*Total Work");
        formulas.add("Total Work = Useful Work/η");
        ;
    }

}

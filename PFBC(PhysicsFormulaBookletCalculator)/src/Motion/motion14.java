package Motion;

import base.formulaBase;

/**
 * Created by Billy on 10/20/2017.
 */

public class motion14 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = Efficiency ; variable2 = Power Output  ; variable3 = Total Power;
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
    public motion14(){
    	numFormulas = 3;
    	variables.add("η");
    	variables.add("Power Output");
    	variables.add("Total Power");
    	
        formulas.add("η = Power Output/Total Power");
        formulas.add("Power Output = η*Total Power");
        formulas.add("Total Power = Power Output/η");
        ;
    }
}

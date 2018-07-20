package Motion;

import base.formulaBase;

/**
 * Created by Billy on 10/20/2017.
 */

public class motion15 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = ρ ; variable2 = m ; variable3 = v;
        if (count == 0) {
            answer1 = getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public motion15(){
    	numFormulas = 3;
    	variables.add("ρ");
    	variables.add("v");
    	variables.add("m");
    	
        formulas.add("ρ = m*v");
        formulas.add("v = ρ/m");
        formulas.add("m = ρ/v");
        ;
    }
}

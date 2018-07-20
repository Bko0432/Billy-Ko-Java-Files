package Motion;

import base.formulaBase;

/**
 * Created by Billy on 10/20/2017.
 */

public class motion18 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = Impulse ; variable2 = F  ; variable3 = Change in Time;
        if (count == 0) {
            answer1 = getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public motion18(){
    	numFormulas = 3;
    	variables.add("Impulse");
    	variables.add("F");
    	variables.add("∆t");
    	
        formulas.add("Impulse = F*∆t");
        formulas.add("F = Impulse/∆t");
        formulas.add("∆t = Impulse/F");
        ;
    }
}

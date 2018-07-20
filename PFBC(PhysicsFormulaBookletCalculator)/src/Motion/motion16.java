package Motion;

import base.formulaBase;

/**
 * Created by Billy on 10/20/2017.
 */

public class motion16 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = F ; variable2 = ∆ρ; variable3 = ∆t;
        if (count == 0) {
            answer1 = getVariable2() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public motion16(){
    	numFormulas = 3;
    	variables.add("F");
    	variables.add("∆ρ");
    	variables.add("∆t");

        formulas.add("F = ∆ρ/∆t");
        formulas.add("∆ρ = F*∆t");
        formulas.add("∆t = F/∆ρ");
        ;
    }
}

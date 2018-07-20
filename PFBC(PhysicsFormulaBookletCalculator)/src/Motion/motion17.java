package Motion;

import base.formulaBase;

/**
 * Created by Billy on 10/20/2017.
 */

public class motion17 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = Ek ; variable2 = Momentum  ; variable3 = m;
        if (count == 0) {
            answer1 = Math.pow(getVariable2(), 2)/ 2* getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = 2* getVariable1() /Math.pow(getVariable2(), 2);
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = Math.sqrt(2* getVariable1() * getVariable3());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public motion17(){
    	numFormulas = 3;
    	variables.add("Ek");
    	variables.add("m");
    	variables.add("Momentum");
    	
        formulas.add("Ek = Momentum^2/2*m");
        formulas.add("m = 2*Ek/Momentum");
        formulas.add("Momentum = sqrt(2*Ek*m)");
        ;
    }
}

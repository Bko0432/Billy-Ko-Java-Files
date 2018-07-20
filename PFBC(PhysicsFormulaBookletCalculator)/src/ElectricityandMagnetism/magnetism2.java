package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/17/2017.
 */

public class magnetism2 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = F ; variable2 = I ; variable3 = L; variable4 = B;
        if (count == 0) {
            answer1 = Math.sin(getVariable2() * getVariable3() * getVariable4())  ;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() /Math.sin(getVariable3() * getVariable4());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() /Math.sin(getVariable2() * getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1() /Math.sin(getVariable2() * getVariable3());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public magnetism2(){
    	numFormulas = 4;
    	variables.add("F");
    	variables.add("I");
    	variables.add("L");
    	variables.add("B");
        formulas.add("F = I*L*B*sinθ");
        formulas.add("I = F/L*B*sinθ");
        formulas.add("L = F/I*B*sinθ");
        formulas.add("B = F/I*L*sinθ");


    }
}

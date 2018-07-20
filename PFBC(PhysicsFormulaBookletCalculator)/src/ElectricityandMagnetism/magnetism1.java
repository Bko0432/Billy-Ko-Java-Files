package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class magnetism1 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = F ; variable2 = q ; variable3 = v; variable4 = B;
        if (count == 0) {
            answer1 = Math.sin(getVariable2() * getVariable3() * getVariable4());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() /Math.sin(getVariable2() * getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() /Math.sin(getVariable3() * getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1() /Math.sin(getVariable2() * getVariable4());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public magnetism1(){
    	numFormulas = 4;
    	variables.add("F");
    	variables.add("B");
    	variables.add("q");
    	variables.add("v");
    	
        formulas.add("F = q*v*b*sinθ");
        formulas.add("B = F/q*v*sinθ");
        formulas.add("q = F/v*B*sinθ");
        formulas.add("v = F/q*B*sinθ");


    }
}

package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class motion2 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = v ; variable2 = d ; variable3 = t
        if(count == 0) {
            answer1 = getVariable2() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() * getVariable3();
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = getVariable2() / getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion2()
    {
    	numFormulas = 3;
    	variables.add("v");
    	variables.add("d");
    	variables.add("t");
    	
        formulas.add("v = d / t");
        formulas.add("d = vt ");
        formulas.add("t = d / v");
    }
}

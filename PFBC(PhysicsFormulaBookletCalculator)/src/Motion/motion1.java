package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class motion1 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = v ; variable2 = u ; variable3 = a ; variable4 = t
        if(count == 0) {
            answer1 = getVariable2() + getVariable2() * getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = (getVariable1() - getVariable2())/ getVariable3();
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = (getVariable1() - getVariable2())/ getVariable4();
            setAnswer(answer1 + "");
        }
        else if (count == 3) {
            answer1 = -1* getVariable3() * getVariable4() + getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion1()
    {
    	
    	numFormulas = 4;
    	variables.add("v");
    	variables.add("t");
    	variables.add("a");
    	variables.add("u");
    	
        formulas.add("v = u + a*t");
        formulas.add("t = (v - u) / a");
        formulas.add("a = (v - u) / t");
        formulas.add("u = -a*t + v");
    }
}

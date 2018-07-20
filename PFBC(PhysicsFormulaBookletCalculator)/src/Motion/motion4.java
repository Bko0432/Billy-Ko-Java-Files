package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class motion4 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = s ; variable2 = v ; variable3 = u ; variable4 = t
        if(count == 0) {
            answer1 = (getVariable2() + getVariable3())* getVariable4() /2;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = 2* getVariable1() /(getVariable4() - getVariable3());
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = 2* getVariable1() /(getVariable4() - getVariable2());
            setAnswer(answer1 + "");
        }
        else if (count == 3){
            answer1 = getVariable1() /((getVariable3() + getVariable2())/2);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion4()
    {
    	numFormulas = 4;
    	variables.add("s");
    	variables.add("v");
    	variables.add("u");
    	variables.add("t");
        formulas.add("s = ((v + u)t)/2");
        formulas.add("v = 2s/(t-u)");
        formulas.add("u = 2s/(t-v");
        formulas.add("t = s/((v+u)/2)");
    }

}

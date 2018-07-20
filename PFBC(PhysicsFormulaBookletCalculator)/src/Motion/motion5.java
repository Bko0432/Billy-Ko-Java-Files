package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class motion5 extends formulaBase {

    @Override
    public String solve()
    {
        // variable1 = s ; variable2 = a ; variable3 = u ; variable4 = t
        if(count == 0) {
            answer1 = getVariable3() * getVariable4() + getVariable2() *Math.pow(getVariable4(),2)/2;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = (2* getVariable1() - getVariable2() *Math.pow(getVariable4(),2)/2* getVariable4());
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = (2* getVariable1() - getVariable3() * getVariable4())*Math.pow(getVariable4(),2);
            setAnswer(answer1 + "");
        }
        else if (count == 3){
            answer1 = Math.sqrt(2* getVariable1() / getVariable2());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion5()
    {
    	numFormulas = 4;
    	variables.add("s");
    	variables.add("u");
    	variables.add("a");
    	variables.add("t");
    	
        formulas.add("s = ut + at^2/2");
        formulas.add("u = (2s-at^2)/2t)");
        formulas.add("a = (2s-ut)t^2");
        formulas.add("t = sqrt(2s/a)");
    }

}

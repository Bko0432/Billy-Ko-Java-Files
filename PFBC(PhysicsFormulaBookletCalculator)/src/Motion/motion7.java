package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class motion7 extends formulaBase {

    @Override
    public String solve()
    {
        // variable1 = Ff ; variable2 = Md ; variable3 = R ;
        if(count == 0) {
            answer1 = getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion7()
    {
    	numFormulas = 3;
    	variables.add("Ff");
    	variables.add("μd");
    	variables.add("R");
        formulas.add("Ff = μd*R");
        formulas.add("μd = Ff/R");
        formulas.add("R = Ff/μd");

    }

}


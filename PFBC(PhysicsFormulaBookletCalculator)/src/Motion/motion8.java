package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class motion8 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = W ; variable2 = F ; variable3 = s ; variable4 = θ
        if(count == 0) {
            answer1 = getVariable2() * getVariable3() *Math.cos(getVariable4());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable2() *Math.cos(getVariable4());
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = getVariable1() / getVariable3() *Math.cos(getVariable4());
            setAnswer(answer1 + "");
        }
        else if (count == 3){
            answer1 = getVariable1() / getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion8()
    {
    	numFormulas = 4;
    	variables.add("W");
    	variables.add("F");
    	variables.add("s");
    	variables.add("cos(θ)");
    	
        formulas.add("W = F*s*cos(θ)");
        formulas.add("s = W/F*cos(θ)");
        formulas.add("F = W/s*cos(θ)");
        formulas.add("cos(θ) = W/F*s");
    }

}


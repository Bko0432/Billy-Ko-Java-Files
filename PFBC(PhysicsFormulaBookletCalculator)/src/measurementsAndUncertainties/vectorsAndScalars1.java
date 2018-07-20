 package measurementsAndUncertainties;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class vectorsAndScalars1 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = A ; variable2 = θ; variable3 = Ah
        if(count == 0)
        {
            answer1 = getVariable1() * Math.cos(getVariable2());
            setAnswer(answer1 + "");
        } else if (count == 1)
        {
            answer1 = getVariable3() / getVariable1();
            setAnswer(answer1 + "");
        }
        else if (count == 2)
        {
            answer1 = getVariable3() / Math.cos(getVariable2());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public vectorsAndScalars1(){
    	variables.add("Ah");
    	variables.add("cosθ");
    	variables.add("A");
    	
        formulas.add("Ah = A * cosθ");
        formulas.add("cosθ = Ah / A");
        formulas.add("A = Ah / cosθ");
    }
}

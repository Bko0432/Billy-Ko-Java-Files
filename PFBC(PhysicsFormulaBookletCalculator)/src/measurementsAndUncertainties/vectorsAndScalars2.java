package measurementsAndUncertainties;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class vectorsAndScalars2 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = A ; variable2 = θ ; variable3 = Av
        if(count == 0)
        {
            answer1 = getVariable1() * Math.sin(getVariable2());
            setAnswer(answer1 + "");
        } else if (count == 1)
        {
            answer1 = getVariable3() / Math.sin(getVariable2());
            setAnswer(answer1 + "");
        }
        else if (count == 2)
        {
            answer1 = getVariable3() / getVariable1();
            setAnswer(answer1 + "");

        }
        return getAnswer();
    }

    public vectorsAndScalars2()
    {
    	numFormulas = 3;
    	variables.add("Av");
    	variables.add("A");
    	variables.add("sinθ");
    	
        formulas.add("Av = A * sinθ");
        formulas.add("A = Av / sinθ");
        formulas.add("sinθ = Av / a");
    }
}

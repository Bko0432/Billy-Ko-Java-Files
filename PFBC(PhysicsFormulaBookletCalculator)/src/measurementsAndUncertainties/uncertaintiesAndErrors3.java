package measurementsAndUncertainties;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class uncertaintiesAndErrors3 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = a ; variable2 = n
        if(count == 0) {
            answer1 = Math.pow(getVariable1(), getVariable2());
            setAnswer(answer1+ "");
        }
        return getAnswer();
    }

    public uncertaintiesAndErrors3()
    {
    	numFormulas = 1;
    	variables.add("a");
    	variables.add("n");
    	
        formulas.add("y = a^n");
    }
}

package measurementsAndUncertainties;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class uncertaintiesAndErrors1 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = a ; variable2 = b ; variable3 = c ; variable4 = y
        if(count == 0)
        {
            setAnswer(getVariable1() * getVariable2() / getVariable3() + "");
        } else if (count == 1)
        {
            setAnswer(getVariable1() * getVariable2() / getVariable4() +"");
        }
        else if (count == 2)
        {
            setAnswer(getVariable3() * getVariable4() / getVariable2() + "");
        }
        else if (count == 3)
        {
            setAnswer(getVariable3() * getVariable4() / getVariable1() + "");
        }
        return getAnswer();
    }

    public uncertaintiesAndErrors1()
    {
    	numFormulas = 4;
    	variables.add("a");
    	variables.add("b");
    	variables.add("c");
    	variables.add("y");
        formulas.add("y = (ab)/c");
        formulas.add("c = (ab)/y");
        formulas.add("a = (cy)/b");
        formulas.add("b = (cy)/a");
    }
}

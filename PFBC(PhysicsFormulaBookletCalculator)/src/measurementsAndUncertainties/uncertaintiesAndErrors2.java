package measurementsAndUncertainties;

import base.formulaBase;

/**
 * Created by Billy on 8/26/2017.
 */

public class uncertaintiesAndErrors2 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = a ; variable2 = b ; variable3 = y
        if(count == 0)
        {
            answer1 = getVariable1() + getVariable2();
            answer2 = getVariable1() - getVariable2();
            setAnswer(answer1 + " ; " + answer2);
        } else if (count == 1)
        {
            answer1 = -1* getVariable3() + getVariable2();
            answer2 = -1* getVariable3() - getVariable2();
            setAnswer(answer1 + " ; " + answer2);
        }
        else if (count == 2)
        {
            answer1 = -1* getVariable3() - getVariable1();
            setAnswer(answer1 + " ; " + (-1*answer1));
        }
        return getAnswer();
    }

    public uncertaintiesAndErrors2()
    {
    	numFormulas = 3;
    	variables.add("a");
    	variables.add("b");
    	variables.add("y");
        formulas.add("y = a +- b ");
        formulas.add("a = - y +- b");
        formulas.add("+-b = -y - a");
    }
}

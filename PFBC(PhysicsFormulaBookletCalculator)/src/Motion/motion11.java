package Motion;

import base.formulaBase;

/**
 * Created by Billy on 10/20/2017.
 */

public class motion11 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = Ep ; variable2 = m ; variable3 = g ; variable4 = h
        if(count == 0) {
            answer1 = getVariable2() * getVariable3() * getVariable4();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = getVariable1() / getVariable2() * getVariable4();
            setAnswer(answer1 + "");
        }
        else if (count == 3){
            answer1 = getVariable1() / getVariable3() * getVariable4();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion11()
    {
    	numFormulas = 4;
    	variables.add("Ep");
    	variables.add("h");
    	variables.add("g");
    	variables.add("m");
    	
        formulas.add("Ep = m*g*h");
        formulas.add("h = EP/m*g");
        formulas.add("g = EP/m*h");
        formulas.add("m = EP/g*h");
    }
}

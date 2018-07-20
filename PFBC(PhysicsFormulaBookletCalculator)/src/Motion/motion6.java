package Motion;


import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class motion6 extends formulaBase {

    @Override
    public String solve()
    {
        // variable1 = F ; variable2 = m ; variable3 = a ;
        if(count == 0) {
            answer1 = getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        }

        return getAnswer();
    }

    public motion6()
    {
    	numFormulas = 3;
    	variables.add("F");
    	variables.add("a");
    	variables.add("m");
        formulas.add("F = ma");
        formulas.add("a = F/m");
        formulas.add("m = F/a");

    }

}


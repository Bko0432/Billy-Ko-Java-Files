package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/28/2017.
 */

public class motion10 extends formulaBase {

    @Override
    public String solve()
    {
        // variable1 = EPE ; variable2 = k ; variable3 = x ;
        if(count == 0) {
            answer1 = getVariable2() *Math.pow(getVariable3(),2)/2;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = 2* getVariable1() /Math.pow(getVariable3(),2);
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = Math.sqrt(2* getVariable1() / getVariable2());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion10()
    {
    	numFormulas = 3;
    	variables.add("EPE");
    	variables.add("k");
    	variables.add("x");
    	
        formulas.add("EPE = k*x^2/2");
        formulas.add("k = 2*EPE/x^2");
        formulas.add("x = sqrt 2*EPE/k");
    }
}

package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/28/2017.
 */

public class motion9 extends formulaBase {

    @Override
    public String solve()
    {
        // variable1 = Ek ; variable2 = m ; variable3 = v ;
        if(count == 0) {
            answer1 = getVariable2() * getVariable3() /2;
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

    public motion9()
    {
    	numFormulas = 3;
    	variables.add("Ek");
    	variables.add("m");
    	variables.add("v");
    	
        formulas.add("Ek = m*v^2/2");
        formulas.add("m = 2*Ek/v^2");
        formulas.add("v = sqrt 2Ek/m");
    }

}


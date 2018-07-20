package Motion;

import base.formulaBase;

/**
 * Created by Billy on 9/23/2017.
 */

public class motion3 extends formulaBase {
    @Override
    public String solve()
    {
        // variable1 = v ; variable2 = u ; variable3 = a ; variable4 = s
        if(count == 0) {
            answer1 = Math.sqrt(Math.pow(getVariable2(),2)+2* getVariable3() * getVariable4());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(Math.pow(getVariable1(),2)-2* getVariable3() * getVariable4());
            setAnswer(answer1 + "");
        }
        else if (count == 2){
            answer1 = Math.pow(getVariable1(),2)-Math.pow(getVariable2(),2)/(2* getVariable4());
            setAnswer(answer1 + "");
        }
        else if (count == 3){
            answer1 = (Math.pow(getVariable1(),2)-Math.pow(getVariable2(),2))/(2* getVariable3());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public motion3()
    {
    	numFormulas = 4;
    	variables.add("v");
    	variables.add("u");
    	variables.add("a");
    	variables.add("s");
    	
        formulas.add("v = Sqrt(u^2 + 2as)");
        formulas.add("u = Sqrt(v^2 - 2as)");
        formulas.add("a = v^2 - u^2/2s");
        formulas.add("s = (v^2-u^2)/2a");
    }
}

package CircularMotion;

import base.formulaBase;

/**
 * Created by Billy on 11/24/2017.
 */

public class circular6 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = g ; variable2 = m; variable3 = r ;
        if (count == 0) {
            answer1 = Math.pow(10,-11)*6.67*getVariable2()/Math.pow(getVariable3(),2);
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.pow(10,-11)*6.67*getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1()*Math.pow(getVariable3(),2)/(Math.pow(10,-11)*6.67);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public circular6(){
    	numFormulas = 3;
    	variables.add("g");
    	variables.add("r");
    	variables.add("m");
    	
        formulas.add("g = G*m/r^2");
        formulas.add("r = sqrt(G*m/g)");
        formulas.add("m = g*r^2/G");


    }
}

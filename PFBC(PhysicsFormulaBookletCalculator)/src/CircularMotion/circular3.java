package CircularMotion;

import base.formulaBase;

/**
 * Created by Billy on 11/17/2017.
 */

public class circular3 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = a ; variable2 = T; variable3 = r ;
        if (count == 0) {
            answer1 = 4* Math.pow(Math.PI,2)/Math.pow(getVariable2(),2) ;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(4*Math.pow(Math.PI,2)*getVariable3()/getVariable1());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1()*Math.pow(getVariable2(),2)/ 4*Math.pow(Math.PI,2);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public circular3(){
    	numFormulas = 3;
    	variables.add("a");
    	variables.add("T");
    	variables.add("r");
        formulas.add("a = 4*π^2*r");
        formulas.add("T = sqrt(4*π^2*r/a)");
        formulas.add("r = (a*T^2)/(4*π^2)");


    }

}

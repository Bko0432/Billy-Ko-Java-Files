package CircularMotion;

import base.formulaBase;

/**
 * Created by Billy on 11/24/2017.
 */

public class circular4 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = F ; variable2 = r; variable3 = m1 ; variable4 = m2
        if (count == 0) {
            answer1 = Math.pow(10,-11)*6.67*getVariable3()*getVariable4()/Math.pow(getVariable2(),2);
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(Math.pow(10,-11)*6.67*getVariable3()*getVariable4()/getVariable1());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1()*Math.pow(getVariable2(),2)/Math.pow(10,-11)*6.67*getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 3) {
            answer1 = getVariable1()*Math.pow(getVariable2(),2)/Math.pow(10,-11)*6.67*getVariable4();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public circular4(){
    	numFormulas = 4;
    	variables.add("F");
    	variables.add("r");
    	variables.add("m1");
    	variables.add("m2");

   
        formulas.add("F = G*m1*m2/r^2");
        formulas.add("r = sqrt(G*m1*m2/F)");
        formulas.add("m2 = F*r^2/G*m1");
        formulas.add("m1 = F*r^2/G*m2");

    }
}

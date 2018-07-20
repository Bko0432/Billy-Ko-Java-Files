package EnergyProduction;

import base.formulaBase;

/**
 * Created by Billy on 11/24/2017.
 */

public class EnergyProduction1 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = E ; variable2 = P; variable3 = t ;
        if (count == 0) {
            answer1 = getVariable1()/getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public EnergyProduction1(){
    	numFormulas = 3;
    	variables.add("P");
    	variables.add("E");
    	variables.add("t");
    	
        formulas.add("P = E/t");
        formulas.add("E = P*t)");
        formulas.add("t = E/P");


    }
}

package EnergyProduction;

import base.formulaBase;

/**
 * Created by Billy on 12/17/2017.
 */

public class EnergyProduction3 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = P; variable2 = A; variable3 = T ;
        if (count == 0) {
            answer1 = Math.pow(1.60*10,-19)*Math.pow(5.67*10,-8)*getVariable2()*Math.pow(getVariable3(),4) ;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1()/Math.pow(1.60*10,-19)* Math.pow(5.67*10,-8)*Math.pow(getVariable3(),4) ;
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = Math.pow(getVariable1(),0.25)/Math.pow(1.60*10,-19)*Math.pow(5.67*10,-8)*Math.pow(getVariable2(),0.25);
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public EnergyProduction3(){
    	numFormulas = 3;
    	variables.add("P");
    	variables.add("A");
    	variables.add("T");
        formulas.add("P = e*σ*A*T^4");
        formulas.add("A = P/e*σ*T^4");
        formulas.add("T^4 = P/e*σ*A");


    }
}

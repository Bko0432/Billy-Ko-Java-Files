package ElectricityandMagnetism;

import base.formulaBase;

/**
 * Created by Billy on 11/12/2017.
 */

public class electricity2 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = F ; variable2 = q1 ; variable3 = q2; variable4 = r;
        if (count == 0) {
            answer1 = Math.pow(10,-19)*1.6* getVariable2() * getVariable3() /Math.pow(getVariable4(),2)  ;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.sqrt(Math.pow(10,-19)*1.6* getVariable2() * getVariable3() / getVariable1());
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() *Math.pow(getVariable4(),2)/Math.pow(10,-19)*1.6* getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1() *Math.pow(getVariable4(),2)/Math.pow(10,-19)*1.6* getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public electricity2(){
    	numFormulas = 4;
    	variables.add("F");
    	variables.add("r");
    	variables.add("q1");
    	variables.add("q2");
    	
        formulas.add("F = k*(q1*q2/r^2)");
        formulas.add("r = sqrt(k*q1*q2/F");
        formulas.add("q1 = F*r^2/k*q2");
        formulas.add("q2 = F*r^2/k*q1");


    }
}

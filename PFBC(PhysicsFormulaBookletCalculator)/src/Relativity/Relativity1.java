package Relativity;

import base.formulaBase;

public class Relativity1 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = x'; variable2 = x; variable3 = v;  variable4 = t;
        if (count == 0) {
            answer1 = getVariable2()-getVariable3()*getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()+getVariable3()/getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = -(getVariable1()-getVariable2()/getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1()-getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity1(){
    	numFormulas = 4;
    	variables.add("x'");
    	variables.add("x");
    	variables.add("v");
    	variables.add("t");
    	
        formulas.add("x' = x-v*t");
        formulas.add("x = x'+v/t");
        formulas.add("v = -(x'-x/t)");
        formulas.add("t = x'-x/v");
}
}

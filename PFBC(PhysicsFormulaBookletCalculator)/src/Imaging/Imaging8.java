package Imaging;

import base.formulaBase;

public class Imaging8 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = n; variable2 = c; 
        if (count == 0) {
            answer1 = 1/Math.sin(getVariable2());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = 1/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging8(){
    	numFormulas = 2;
    	variables.add("n");
    	variables.add("c");
 
    
        formulas.add("n = 1/sin(c)");
        formulas.add("sin(c) = 1/n");

       
}
}

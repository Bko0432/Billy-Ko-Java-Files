package Imaging;

import base.formulaBase;

public class Imaging11 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = μ;  variable2 = x; variable3 = I; variable4 = Io;
        if (count == 0) {
            answer1 = getVariable4()*Math.pow(2.718, -getVariable1()/getVariable2());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()/Math.pow(2.718, -getVariable1()/getVariable2());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging11(){
    	numFormulas = 2;
    	variables.add("μ");
    	variables.add("x");
    	variables.add("Io");
    	variables.add("I");
    	
    	
    	
        formulas.add("I = Io*e^-μ/x");
        formulas.add("Io = I/e^-μ/x");
      
        

}
}

package Imaging;

import base.formulaBase;

public class Imaging7 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = M infinity; variable2 = fo; variable3 = fe;
        if (count == 0) {
            answer1 = getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()*getVariable1();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging7(){
    	numFormulas = 3;
    	variables.add("M ");
    	variables.add("fo");
    	variables.add("fe");
    
  
    	
    	
        formulas.add("M = fo/fe");
        formulas.add("fo = fe*M");
        formulas.add("fe = M/fo");
       
}
}

package Imaging;

import base.formulaBase;

public class Imaging6 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = M infinity; variable2 = D; variable3 = f;
        if (count == 0) {
            answer1 = getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()*getVariable1();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable2()/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging6(){
    	numFormulas = 3;
    	variables.add("M infinity");
    	variables.add("D");
    	variables.add("f");
    
  
    	
    	
        formulas.add("M infinity = D/f");
        formulas.add("D = f*M infinity");
        formulas.add("f = D/M infinity");
       
}
}

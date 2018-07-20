package Imaging;

import base.formulaBase;

public class Imaging1 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = P; variable2 = f;  
        if (count == 0) {
            answer1 = 1/getVariable2();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = 1/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging1(){
    	numFormulas = 2;
    	variables.add("P");
    	variables.add("f");
    
  
    	
    	
        formulas.add("P = 1/f");
        formulas.add("f = 1/P");
        
       
}
}

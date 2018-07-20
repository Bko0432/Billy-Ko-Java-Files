package Imaging;

import base.formulaBase;

public class Imaging4 extends formulaBase{
	@Override
    public String solve() {
        // variable1 = M; variable2 = θi; variable3 = θo;
        if (count == 0) {
            answer1 = getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable2()/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging4(){
    	numFormulas = 3;
    	variables.add("M");
    	variables.add("θi");
    	variables.add("θo");
    
  
    	
    	
        formulas.add("M = θi/θo");
        formulas.add("θi = M*θo");
        formulas.add("θo = θi/M");
       
}
}

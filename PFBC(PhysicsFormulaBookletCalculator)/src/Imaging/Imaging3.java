package Imaging;

import base.formulaBase;

public class Imaging3 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = m; variable2 = v; variable3 = u;
        if (count == 0) {
            answer1 = -getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = -getVariable1()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = -getVariable2()/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging3(){
    	numFormulas = 3;
    	variables.add("m");
    	variables.add("v");
    	variables.add("u");
    
  
    	
        formulas.add("m = (-)v/u");
        formulas.add("v = (-)m*u");
        formulas.add("u = (-)v/m");
        
       
}
}

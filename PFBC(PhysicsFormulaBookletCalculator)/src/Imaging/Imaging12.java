package Imaging;

import base.formulaBase;

public class Imaging12 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Z; variable2 = ρ; variable3 = c;
        if (count == 0) {
            answer1 = getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging12(){
    	numFormulas = 3;
    	variables.add("Z");
    	variables.add("ρ");
    	variables.add("c");
    
  
    	
    	
        formulas.add("Z = ρ*c");
        formulas.add("ρ = Z/c");
        formulas.add("c = Z/ρ");
       
}
}

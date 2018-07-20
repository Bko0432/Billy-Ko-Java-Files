package Imaging;

import base.formulaBase;

public class Imaging9 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Attenuation; variable2 = I; variable3 = I0;
        if (count == 0) {
            answer1 = Math.log10(getVariable2()/getVariable3());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()*Math.pow(10, getVariable1());
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable2()/Math.pow(10, getVariable1());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging9(){
    	numFormulas = 2;
    	variables.add("Attenuation");
    	variables.add("I");
    	variables.add("I0");
 
    
        formulas.add("Attenuation = log(I/I0)^10");
        formulas.add("I = I0*10^Attenuation");
        formulas.add("I0 = I/10^Attenuation");


       
}
}

package Imaging;

import base.formulaBase;
public class Imaging5 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = M near point; variable2 = D; variable3 = f;
        if (count == 0) {
            answer1 = (getVariable2()/getVariable3())+1;
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()*(getVariable1() - 1);
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable2()/getVariable1() - 1;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging5(){
    	numFormulas = 3;
    	variables.add("M near point");
    	variables.add("D");
    	variables.add("f");
    
  
    	
    	
        formulas.add("M near point = (D/f)+1");
        formulas.add("D = f(M near point - 1)");
        formulas.add("f = D/M near point - 1");
       
}
	
}

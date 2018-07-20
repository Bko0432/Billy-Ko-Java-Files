package Imaging;

import base.formulaBase;

public class Imaging2 extends formulaBase{


	@Override
    public String solve() {
        // variable1 = m; variable2 = h(i); variable3 = h(o);
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
  public Imaging2(){
    	numFormulas = 3;
    	variables.add("m");
    	variables.add("h(i)");
    	variables.add("h(o)");
    
  
    	
    	
        formulas.add("m = h(i)/h(o)");
        formulas.add("h(i) = m*h(o)");
        formulas.add("h(o) = h(i)/m");
       
}
}

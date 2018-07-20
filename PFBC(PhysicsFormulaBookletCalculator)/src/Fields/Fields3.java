package Fields;

import base.formulaBase;

public class Fields3 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = V(esc); variable2 = M; variable3 = r; 
        if (count == 0) {
            answer1 = Math.sqrt(2*Math.pow(6.67*10,-11)*getVariable2()/getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.pow(getVariable1(), 2)*getVariable3()/2*Math.pow(6.67*10, -11);
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = 2*Math.pow(6.67*10, -11)*getVariable2()/Math.pow(getVariable1(), 2);
            setAnswer(answer1 + "");
        } 
        return getAnswer();
    }
  public Fields3(){
    	numFormulas = 3;
    	variables.add("V(esc)");
    	variables.add("M");
    	variables.add("r");
   
    	
    	
        formulas.add("V(esc) = sqrt(2*G*M/r)");
        formulas.add("M = V(esc)^2*r/2*G");
        formulas.add("r = 2*G*M/V(esc)^2");
}
}

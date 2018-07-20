package Fields;

import base.formulaBase;

public class Fields4 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = V(orbit); variable2 = M; variable3 = r; 
        if (count == 0) {
            answer1 = Math.sqrt(Math.pow(6.67*10,-11)*getVariable2()/getVariable3());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = Math.pow(getVariable1(), 2)*getVariable3()/Math.pow(6.67*10, -11);
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = Math.pow(6.67*10, -11)*getVariable2()/Math.pow(getVariable1(), 2);
            setAnswer(answer1 + "");
        } 
        return getAnswer();
    }
  public Fields4(){
    	numFormulas = 3;
    	variables.add("V(orbit)");
    	variables.add("M");
    	variables.add("r");
   
    	
    	
        formulas.add("V(orbit) = sqrt(G*M/r)");
        formulas.add("M = V(orbit)^2*r/G");
        formulas.add("r = G*M/V(orbit)^2");
}
}

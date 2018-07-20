package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction14 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = τ;  variable2 = t; variable3 = q; variable4 = qO
        if (count == 0) {
            answer1 = getVariable4()*Math.pow(2.718, -getVariable2()/getVariable1());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()/Math.pow(2.718, -getVariable2()/getVariable1());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public ElectroMagneticInduction14(){
    	numFormulas = 2;
    	variables.add("τ");
    	variables.add("t");
    	variables.add("qO");
    	variables.add("q");
    	
    	
    	
        formulas.add("q = qO*e^-t/τ");
        formulas.add("qO = q/e^-t/τ");
      
        

}
}

package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction13 extends formulaBase{
	
	@Override
    public String solve() {
        // variable1 = τ;  variable2 = R; variable3 = C;
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
  public ElectroMagneticInduction13(){
    	numFormulas = 3;
    	variables.add("τ");
    	variables.add("R");
    	variables.add("C");
    	
    	
    	
        formulas.add("τ = R*C");
        formulas.add("R = τ/C");
        formulas.add("C = τ/R");
        

}

}

package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction16 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = τ;  variable2 = t; variable3 = V; variable4 = Vo;
        if (count == 0) {
            answer1 = getVariable4()*Math.pow(2.718, -getVariable2()/getVariable1());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()/Math.pow(2.718, -getVariable2()/getVariable1());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public ElectroMagneticInduction16(){
    	numFormulas = 2;
    	variables.add("τ");
    	variables.add("t");
    	variables.add("Vo");
    	variables.add("V");
    	
    	
    	
        formulas.add("V = Vo*e^-t/τ");
        formulas.add("Vo = V/e^-t/τ");
      
        

}
}

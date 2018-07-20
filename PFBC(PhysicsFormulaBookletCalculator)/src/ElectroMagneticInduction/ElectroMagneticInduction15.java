package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction15 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = τ;  variable2 = t; variable3 = I; variable4 = Io;
        if (count == 0) {
            answer1 = getVariable4()*Math.pow(2.718, -getVariable2()/getVariable1());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()/Math.pow(2.718, -getVariable2()/getVariable1());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public ElectroMagneticInduction15(){
    	numFormulas = 2;
    	variables.add("τ");
    	variables.add("t");
    	variables.add("Io");
    	variables.add("I");
    	
    	
    	
        formulas.add("I = Io*e^-t/τ");
        formulas.add("Io = I/e^-t/τ");
      
        

}
}

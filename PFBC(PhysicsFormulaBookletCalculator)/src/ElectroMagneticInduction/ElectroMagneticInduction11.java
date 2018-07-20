package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction11 extends formulaBase{
	
	@Override
    public String solve() {
        // variable1 = C;  variable2 = ε; variable3 = A; variable4 = d;
        if (count == 0) {
            answer1 = getVariable2()*(getVariable3()/getVariable4());
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1()*getVariable4()/getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable2()*getVariable3()/getVariable1();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1()*getVariable4()/getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public ElectroMagneticInduction11(){
    	numFormulas = 4;
    	variables.add("C");
    	variables.add("ε");
    	variables.add("A");
    	variables.add("d");
    	
    	
        formulas.add("C = ε*(A/d)");
        formulas.add("ε = C*d/A");
        formulas.add("d = ε*A/C");
        formulas.add("A = C*d/ε");

}

}

package EngineeringPhysics;

import base.formulaBase;
public class EngineeringPhysics12 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = U ; variable2 = n; variable3 = T; 
        if (count == 0) {
            answer1 = 1.5*getVariable2()*8.31*getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = 2*getVariable1()/3*8.31* getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = 2*getVariable1()/3*getVariable2()*8.31;
            setAnswer(answer1 + "");
        }
       
        return getAnswer();
    }
    public EngineeringPhysics12(){

    	numFormulas = 4;
    	variables.add("U");
    	variables.add("n");
    	variables.add("T");
    	
        formulas.add("U = 1.5*n*R*T");
        formulas.add("n = 2*U/3*R*T");
        formulas.add("T = 2*U/3*n*R");
    }
	
}

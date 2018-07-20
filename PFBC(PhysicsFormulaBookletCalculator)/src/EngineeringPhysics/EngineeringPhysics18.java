package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics18 extends formulaBase{
	
	
	@Override
    public String solve() {
        // variable1 = P; variable2 = Po; variable3 = ρf; variable4 = d; 
        if (count == 0) {
            answer1 = getVariable2() + getVariable3()*9.81*getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1() - getVariable3()/9.81*getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1() - getVariable2()/9.81*getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1() - getVariable2()/getVariable3()*9.81;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics18(){
    	numFormulas = 4;
    	variables.add("P");
    	variables.add("Po");
    	variables.add("ρf");
    	variables.add("d");
    	
    	
        formulas.add("P = Po + ρf*9.81*d");
        formulas.add("Po = P - ρf/9.81*d");
        formulas.add("ρf = P - Po/9.81*d");
        formulas.add("d = P - Po/ρf*g");
}
}

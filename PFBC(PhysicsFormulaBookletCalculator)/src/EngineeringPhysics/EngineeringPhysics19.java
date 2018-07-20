package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics19 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = FD; variable2 = η; variable3 = v; variable4 = r; 
        if (count == 0) {
            answer1 = 6*Math.PI*getVariable2()*getVariable4()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/6*Math.PI*getVariable2()*getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/6*Math.PI*getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1()/6*Math.PI*getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics19(){
    	numFormulas = 4;
    	variables.add("FD");
    	variables.add("η");
    	variables.add("v");
    	variables.add("r");
    	
    	
        formulas.add("FD = 6*π*η*r*v");
        formulas.add("v = FD/6*π*η*r");
        formulas.add("r = FD/6*π*η*v");
        formulas.add("η = FD/6*π*η*v");
}
}

package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics22 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Q; variable2 = Resonant Frequency; variable3 = Energy Stored; variable4 = Power Loss;
        if (count == 0) {
            answer1 = 2*Math.PI*getVariable2()*(getVariable3()/getVariable4());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()*getVariable4()/2*Math.PI*getVariable3();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()*getVariable4()/2*Math.PI*getVariable2();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = 2*Math.PI*getVariable2()*getVariable3()/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics22(){
    	numFormulas = 3;
    	variables.add("Q");
    	variables.add("Resonant Frequency");
    	variables.add("Energy Stored");
    	variables.add("Power Loss");
    
    	
        formulas.add("Q = 2*π*Resonant Frequency(Energy Stored/Power Loss)");
        formulas.add("Resonant Frequency = Q*Power Loss/2*π*Energy Stored");
        formulas.add("Energy Stored = Q*Power Loss/2*π*Resonant Frequency");
        formulas.add("Power Loss = 2*π*Resonant Frequency*Energy Stored/Q");
      
}
}

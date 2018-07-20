package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics21 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = Q; variable2 = Energy Stored; variable3 = Energy dissipated per cycle; 
        if (count == 0) {
            answer1 = 2*Math.PI*(getVariable2()/getVariable3());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()*getVariable3()/2*Math.PI;
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/2*Math.PI*getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics21(){
    	numFormulas = 3;
    	variables.add("Q");
    	variables.add("Energy Stored");
    	variables.add("Energy dissipated per cycle");
    
    	
        formulas.add("Q = 2*π*(Energy Stored/Energy dissipated per cycle)");
        formulas.add("Energy Stored = Q*Energy dissipated per cycle/2*π");
        formulas.add("Energy dissipated per cycle = Q/2*π*Energy Stored");
 
}
}

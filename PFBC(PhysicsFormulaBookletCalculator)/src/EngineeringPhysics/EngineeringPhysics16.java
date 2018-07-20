package EngineeringPhysics;

import base.formulaBase;

public class EngineeringPhysics16 extends formulaBase {

	@Override
    public String solve() {
        // variable1 = η(carnot); variable2 = T(hot); variable3 = T(cold);  
        if (count == 0) {
            answer1 = 1-(getVariable3()/getVariable2());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = -(getVariable3()/getVariable1()-1);
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable2()-getVariable1()+1;
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public EngineeringPhysics16(){
    	numFormulas = 3;
    	variables.add("η(carnot)");
    	variables.add("T(hot)");
    	variables.add("T(cold)");
   
  
    	
    	
        formulas.add("η(carnot) = 1 -(T(cold)/T(hot))");
        formulas.add("T(hot) = -(T(cold)/η(carnot) - 1)");
        formulas.add("T(cold) = T(hot)-η(carnot)+1");
       
}
}

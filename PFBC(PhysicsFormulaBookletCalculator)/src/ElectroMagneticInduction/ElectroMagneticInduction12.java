package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction12 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = E;  variable2 = C; variable3 = V; 
        if (count == 0) {
            answer1 = getVariable2()*Math.pow(getVariable3(), 2)/2;
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = 2*getVariable1()/Math.pow(getVariable3(), 2);
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = Math.sqrt(2*getVariable1())/getVariable2();
            setAnswer(answer1 + "");
        }
         
        return getAnswer();
    }
  public ElectroMagneticInduction12(){
    	numFormulas = 4;
    	variables.add("E");
    	variables.add("C");
    	variables.add("V");
    	
    	
        formulas.add("E = C*V^2/2");
        formulas.add("C = 2*E/V^2");
        formulas.add("V = sqrt(2*E)/C");
       

}
}

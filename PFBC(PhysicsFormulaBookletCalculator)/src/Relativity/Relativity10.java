package Relativity;

import base.formulaBase;

public class Relativity10 extends formulaBase{

	@Override
    public String solve() {
        // variable1 = ρ; variable2 = γ; variable3 = m(o); variable4 = v; 
        if (count == 0) {
            answer1 = getVariable2()*getVariable3()*getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable1()/getVariable3()*getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable1()/getVariable2()*getVariable4();
            setAnswer(answer1 + "");
        }else if (count == 3) {
            answer1 = getVariable1()/getVariable2()*getVariable3();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Relativity10(){
    	numFormulas = 4;
    	variables.add("ρ");
    	variables.add("γ");
    	variables.add("m(o)");
    	variables.add("v");
    	
    	
    	
        formulas.add("ρ = γ*m(o)*v");
        formulas.add("γ = ρ/m(o)*v");
        formulas.add("m(o) = ρ/γ*v");
        formulas.add("v = ρ/γ*m(o)");
      
}
}

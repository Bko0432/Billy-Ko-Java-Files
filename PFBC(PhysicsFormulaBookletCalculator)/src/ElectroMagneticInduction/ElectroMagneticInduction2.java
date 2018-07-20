package ElectroMagneticInduction;

import base.formulaBase;

public class ElectroMagneticInduction2 extends formulaBase{
	
	 @Override
	    public String solve() {
	        // variable1 = ∆Φ; variable2 = -N; variable3 = ∆t; variable4 = ε;
	        if (count == 0) {
	            answer1 = -getVariable2()*getVariable1()/getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable4()*getVariable3()/-getVariable2();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable4()*getVariable3()/-getVariable1();
	            setAnswer(answer1 + "");
	        } else if (count == 3) {
	            answer1 = getVariable4()/getVariable3()*getVariable1();
	            setAnswer(answer1 + "");
	        } 
	        return getAnswer();
	    }
	  public ElectroMagneticInduction2(){
	    	numFormulas = 4;
	    	variables.add("ε");
	    	variables.add("∆Φ");
	    	variables.add("N");
	    	variables.add("∆t");
	    	
	    	
	        formulas.add("ε = -N*∆Φ/∆t");
	        formulas.add("∆Φ = ε*∆t/-N");
	        formulas.add("(-)N = ε*∆t/∆Φ");
	        formulas.add("∆t = ε/-N*∆Φ");
}

}

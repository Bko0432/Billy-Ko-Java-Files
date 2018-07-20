package SHM;
import base.formulaBase;
public class SHM9 extends formulaBase {
	
	
	 @Override
	    public String solve() {
	        // variable1 = n; variable2 = λ; variable3 = d; variable4 = θ;
	        if (count == 0) {
	            answer1 = getVariable3()*Math.sin(getVariable4())/getVariable2();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable3()*Math.sin(getVariable4())/getVariable1();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable1()*getVariable2()/Math.sin(getVariable4());
	            setAnswer(answer1 + "");
	        } else if (count == 3) {
	            answer1 = getVariable1() * getVariable2()/getVariable3();
	            setAnswer(answer1 + "");
	        }
	    
	        return getAnswer();
	    }
	  public SHM9(){
	    	numFormulas = 4;
	    	variables.add("n");
	    	variables.add("λ");
	    	variables.add("d");
	    	variables.add("θ");
	    	
	    	
	        formulas.add("n = d*sinθ/λ");
	        formulas.add("λ = d*sinθ/n");
	        formulas.add("d = n*λ/sinθ");
	        formulas.add("sinθ = n*λ/d");
	    }



}

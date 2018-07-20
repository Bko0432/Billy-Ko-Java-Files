package Fields;

import base.formulaBase;
public class Fields2 extends formulaBase{
	
	 @Override
	    public String solve() {
	        // variable1 = W; variable2 = ∆Vg; variable3 = m; 
	        if (count == 0) {
	            answer1 = getVariable3()*getVariable2();
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = getVariable1()/getVariable3();
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = getVariable1()/getVariable2();
	            setAnswer(answer1 + "");
	        } 
	        return getAnswer();
	    }
	  public Fields2(){
	    	numFormulas = 3;
	    	variables.add("W");
	    	variables.add("∆Ve");
	    	variables.add("q");
	   
	    	
	    	
	        formulas.add("W = m*∆Vg");
	        formulas.add("∆Vg = W/m");
	        formulas.add("m = W/∆Vg");
}

}

package SHM;

 import base.formulaBase;
 
public class SHM7 extends formulaBase{

	 @Override
	    public String solve() {
	        // variable1 = T; variable2 = m; variable3 = k;
	        if (count == 0) {
	            answer1 = 2*Math.PI*Math.sqrt(getVariable2()/getVariable3());
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = Math.pow((getVariable1()/2*Math.PI), 2)*getVariable3();
	            setAnswer(answer1 + "");
	        }
	    
	        return getAnswer();
	    }
	  public SHM7(){
	    	numFormulas = 4;
	    	variables.add("T");
	    	variables.add("m");
	    	variables.add("k");
	    	
	    	
	        formulas.add("T= 2*π*sqrt(m/k)");
	        formulas.add("m = (T/(2*π))^2*k");
	    
	    }


	
	}



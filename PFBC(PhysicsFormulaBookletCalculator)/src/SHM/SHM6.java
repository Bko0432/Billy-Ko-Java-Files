package SHM;

import base.formulaBase;

public class SHM6 extends formulaBase{
	
	  @Override
	    public String solve() {
	        // variable1 = T; variable2 = L; 
	        if (count == 0) {
	            answer1 = 2*Math.PI*Math.sqrt(getVariable2()/9.81);
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = Math.pow((getVariable1()/2*Math.PI), 2)*9.81;
	            setAnswer(answer1 + "");
	        }
	    
	        return getAnswer();
	    }
	  public SHM6(){
	    	numFormulas = 4;
	    	variables.add("T");
	    	variables.add("L");
	    	
	    	
	        formulas.add("T= 2*π*sqrt(L/g)");
	        formulas.add("L = (T/(2*π))^2*g");
	    
	    }


	}



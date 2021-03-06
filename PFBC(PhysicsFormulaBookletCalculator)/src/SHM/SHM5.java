package SHM;

import base.formulaBase;

public class SHM5 extends formulaBase {
	
	  @Override
	    public String solve() {
	        // variable1 = Ek; variable2 = m; variable3 = ω; variable4 = Xo;
	        if (count == 0) {
	            answer1 = getVariable2()*Math.pow(getVariable3(), 2)*Math.pow(getVariable4(), 2);
	            setAnswer(answer1 + "");
	        } else if (count == 1) {
	            answer1 = Math.sqrt(2*getVariable1()/getVariable2()*Math.pow(getVariable4(), 2));
	            setAnswer(answer1 + "");
	        } else if (count == 2) {
	            answer1 = Math.sqrt(2*getVariable1()/Math.pow(getVariable3(), 2)*Math.pow(getVariable4(), 2));
	            setAnswer(answer1 + "");
	        } else if (count == 3) {
	            answer1 = Math.sqrt(2*getVariable1()/getVariable2()*Math.pow(getVariable3(), 2));
	            setAnswer(answer1 + "");
	        }
	    
	        return getAnswer();
	    }
	  public SHM5(){
	    	numFormulas = 4;
	    	variables.add("Ek");
	    	variables.add("m");
	    	variables.add("ω");
	    	variables.add("Xo");
	    	
	    	
	        formulas.add("Ek = m*ω^2*Xo^2/2");
	        formulas.add("ω = sqrt(2*Ek/m*Xo^2");
	        formulas.add("m = sqrt(2*Ek/ω^2*Xo^2");
	        formulas.add("Xo = sqrt(2*Ek/m*ω^2");
	
	    }


	}



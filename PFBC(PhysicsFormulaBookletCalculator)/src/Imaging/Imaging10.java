package Imaging;
import base.formulaBase;
public class Imaging10 extends formulaBase{
	
	@Override
    public String solve() {
        // variable1 = LI; variable2 = I1; variable3 = I0;
        if (count == 0) {
            answer1 = Math.log10(getVariable2()/getVariable3());
            setAnswer(answer1 + "");
        }else if (count == 1) {
            answer1 = getVariable3()*Math.pow(10, getVariable1());
            setAnswer(answer1 + "");
        }else if (count == 2) {
            answer1 = getVariable2()/Math.pow(10, getVariable1());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
  public Imaging10(){
    	numFormulas = 2;
    	variables.add("LI");
    	variables.add("I1");
    	variables.add("I0");
 
    
        formulas.add("LI= log(I1/I0)^10");
        formulas.add("I1 = I0*10^LI");
        formulas.add("I0 = I1/10^LI");


       
}

}

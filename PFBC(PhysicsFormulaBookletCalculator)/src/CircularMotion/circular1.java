package CircularMotion;
import base.formulaBase;
/**
 * Created by Billy on 11/12/2017.
 */

public class circular1 extends formulaBase {
    
    @Override
    public String solve() {
        // variable1 = v ; variable2 = ω; variable3 = r ;
        if (count == 0) {
            answer1 = getVariable2() * getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable1() / getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1() / getVariable2();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }
    public circular1(){
    	numFormulas = 3;
    	variables.add("v");
    	variables.add("ω");
    	variables.add("r");
        formulas.add("v = ω*r");
        formulas.add("ω = v/r");
        formulas.add("r = v/ω");


    }
}

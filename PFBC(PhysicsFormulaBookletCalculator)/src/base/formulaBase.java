package base;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Billy on 8/26/2017.
 */

public class formulaBase {
    protected int count = 0;
    private double variable1 = 0;
    private double variable2 = 0;
    private double variable3 = 0;
    private double variable4 = 0;
    private double variable5 = 0;
    private double variable6 = 0;
    private double variable7 = 0;
    private double variable8 = 0;
    protected double answer1 = 0;
    protected double answer2 = 0;
    private String answer = "";
    protected ArrayList<String> formulas = new ArrayList();
    protected int numFormulas = 0;
    protected ArrayList<String> variables = new ArrayList<String>();
    public formulaBase()
    {

    }

    public ArrayList<String> getAllVariables()
    		{
    	return variables;
    		}
    
    public ArrayList<String> getFormula()
    {
        return formulas;
    }

    public String returnFormula()
    {
        return formulas.get(count);
    }
    
    public int returnCount()
    {
    	return count;
    }
    
    public void setCount()
    {
    	count++;
        if(count == formulas.size())
            count = 0;
    }

    public String solve(){
        return "";
    }
    
    public double getVariable1() {
        return variable1;
    }

    public void setVariable1(double variable1) {
        this.variable1 = variable1;
    }

    public double getVariable2() {
        return variable2;
    }

    public void setVariable2(double variable2) {
        this.variable2 = variable2;
    }

    public double getVariable3() {
        return variable3;
    }

    public void setVariable3(double variable3) {
        this.variable3 = variable3;
    }

    public double getVariable4() {
        return variable4;
    }

    public void setVariable4(double variable4) {
        this.variable4 = variable4;
    }

    public double getVariable5() {
        return variable5;
    }

    public void setVariable5(double variable5) {
        this.variable5 = variable5;
    }

    public double getVariable6() {
        return variable6;
    }

    public void setVariable6(double variable6) {
        this.variable6 = variable6;
    }

    public double getVariable7() {
        return variable7;
    }

    public void setVariable7(double variable7) {
        this.variable7 = variable7;
    }

    public double getVariable8() {
        return variable8;
    }

    public void setVariable8(double variable8) {
        this.variable8 = variable8;
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

package EnergyProduction;

import base.formulaBase;

/**
 * Created by Billy on 12/17/2017.
 */

public class EnergyProduction5 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = albedo; variable2 = Total Scattered Power; variable3 = Total Incident Power;
        if (count == 0) {
            answer1 = getVariable2()/getVariable3();
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable2()/getVariable1();
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable3()/getVariable1();
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public EnergyProduction5() {
    	numFormulas = 3;
    	variables.add("albedo");
    	variables.add("Total Incident Power");
    	variables.add("Total Scattered Power");
        formulas.add("albedo = Total Scatter Power/Total Incident Power");
        formulas.add("Total Incident Power = Total Scattered Power/albedo");
        formulas.add("Total Scattered Power = Total Incident Power/albedo");
    }
}

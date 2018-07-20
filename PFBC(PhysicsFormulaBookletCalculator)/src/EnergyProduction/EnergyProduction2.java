package EnergyProduction;

import base.formulaBase;

/**
 * Created by Billy on 11/25/2017.
 */

public class EnergyProduction2 extends formulaBase {

    @Override
    public String solve() {
        // variable1 = P; variable2 = A; variable3 = Ï�; variable4 = v
        if (count == 0) {
            answer1 = getVariable2()*getVariable3()*Math.pow(getVariable4(),3);
            setAnswer(answer1 + "");
        } else if (count == 1) {
            answer1 = getVariable3()*Math.pow(getVariable4(),3)/getVariable1()*2;
            setAnswer(answer1 + "");
        } else if (count == 2) {
            answer1 = getVariable1()*2/getVariable2()*Math.pow(getVariable4(),3);
            setAnswer(answer1 + "");
        } else if (count == 3) {
            answer1 = Math.cbrt(getVariable1()*2/getVariable2()*getVariable3());
            setAnswer(answer1 + "");
        }
        return getAnswer();
    }

    public EnergyProduction2() {

        formulas.add("P = A*ρ*v^3");
        formulas.add("A = ρ*v^3/P*2");
        formulas.add("ρ = P*2/A*v^3");
        formulas.add("v^3 = P*2/A*ρ");
    }
}

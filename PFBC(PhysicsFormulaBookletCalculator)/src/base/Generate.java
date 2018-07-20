package base;
import java.util.ArrayList;

/**
 * Created by Billy on 11/17/2017.
 */

public class Generate  {

    private ArrayList<formulaBase> Formulas = new ArrayList();

    public void addFormulas(formulaBase Formula){
        Formulas.add(Formula);

    }
    public ArrayList<formulaBase> getFormulas(){
        return Formulas;
    }
}

import MyIndividual_Exceptions.ContainsALiteralExp;
import MyIndividual_Exceptions.ContainsTwoElemExp;
import MyIndividual_Exceptions.MoreThanFiveElmsExp;
import MyIndividual_Interfaces.*;

import java.util.ArrayList;
import java.util.Collections;

public class MyIndividual implements IExceptionChecker,ISortedNums {
    public ArrayList<String> unsortedArray;
    public ArrayList<Integer> numArray;
    public ArrayList<Integer> sortedNumArray;

    @Override
    public void checkLiteral() throws ContainsALiteralExp {
        if (unsortedArray.contains("a")){
            throw new ContainsALiteralExp();
        }
    }

    @Override
    public void checkMoreThanFiveElems() throws MoreThanFiveElmsExp {
        if (unsortedArray.size() > 5) {
            throw new MoreThanFiveElmsExp();
        }
    }

    @Override
    public void checkTwoElems() throws ContainsTwoElemExp {
        if (unsortedArray.size() == 2){
            throw new ContainsTwoElemExp();
        }
    }


    public MyIndividual(String[] args) throws Exception {
        unsortedArray = new ArrayList<String>();
        numArray = new ArrayList<Integer>();
        sortedNumArray = new ArrayList<Integer>();
        Collections.addAll(unsortedArray, args);
        try {
            checkLiteral();
            checkTwoElems();
            checkMoreThanFiveElems();
        }
        catch (Exception exp) {
            System.out.println(exp.toString());
            throw new Exception("MyIndividual Constructor failed");
        }

        for (String x: unsortedArray) {
            numArray.add(Integer.parseInt(x));
        }

        sortedNumArray.addAll(numArray);
        Collections.sort(sortedNumArray);
    }

    public ArrayList<Integer> get_sorted(){
        return sortedNumArray;
    }
}

package sum;

import java.util.ArrayList;

public class Sum {
    public ArrayList<Integer> listOfIntegers;

    public Sum(ArrayList<Integer> listOfIntegers) {
        this.listOfIntegers = listOfIntegers;
    }

    public Integer sum() {

            Integer sum = 0;
            for (int i = 0; i < listOfIntegers.size(); i++) {
            sum += listOfIntegers.get(i);

        }   return sum;
    }
}

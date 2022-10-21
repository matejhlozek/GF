package countpairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    List<Integer> arr = Arrays.asList(0, 7, 5, 4, 4, 6);
    List<Integer> arr2 = Arrays.asList(8, 10, 4, 3, 5, 5, 6);
    List<String> allPairs = new ArrayList<>();

    public int count() {

        List<String> pairsWithoutDuplication = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr.get(i) + arr2.get(j) == 10) {
                    if (arr.get(i) > arr2.get(j)) {
                        allPairs.add(arr.get(i) + "+" + arr2.get(j));
                    } else allPairs.add(arr2.get(j) + "+" + arr.get(i));
                }
            }
        }
        for (String pair : allPairs) {
            if (!pairsWithoutDuplication.contains(pair)) {
                pairsWithoutDuplication.add(pair);
            }
        }
        return pairsWithoutDuplication.size();
    }


    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.count());

    }
}


package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        Collections.addAll(listA, 500, 1000, 1250, 175, 800, 120);

        int sum = 0;
        for(int i = 0; i < listA.size(); i++)
            sum += listA.get(i);{
            System.out.println(sum);
        }
        System.out.println(Collections.max(listA));

        System.out.println(Collections.min(listA));

        float average = 0;
        for(int i = 0; i < listA.size(); i++)
            average += listA.get(i);{
            System.out.println(average/ listA.size());
        }

    }
}

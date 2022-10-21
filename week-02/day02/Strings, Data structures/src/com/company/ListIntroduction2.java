package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add(0,"Apple");
        listA.add(1,"Avocado");
        listA.add(2,"Blueberries");
        listA.add(3,"Durian");
        listA.add(4,"Lychee");

        ArrayList<String> listB = new ArrayList<>(listA);

        if (listA.contains("Durian")){
            System.out.println(true);
        } else System.out.println(false);

        listB.remove(3);

        listA.add(4,"Kiwifruit");

        if (listA == listB){
            System.out.println(true);
        } else System.out.println(false);

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        Collections.addAll(listB, "Passion fruit", "Pomelo");

        System.out.println(listA.get(2));

        System.out.println(listA);

        System.out.println(listB);


    }
}

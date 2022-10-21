package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add(0, "William");
        if (names.size() != 0){
            System.out.println(false);
        }
        names.add(1,"John");
        names.add(2,"Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String list: names) {
            System.out.println(list);
        }
        int index = 1;
        for (String indexesAndList : names){
            System.out.println((index++)+ ". " +indexesAndList);
        }
        names.remove(1);

        for (int i = names.size()-1; i >=0 ; i--) {
            System.out.println(names.get(i));
        }
        names.clear();

        System.out.println(names.size());
    }
}

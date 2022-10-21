package com.company;

import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        if (map.size() == 0){
            System.out.println(true);
        }
        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");

        System.out.println(map.keySet());
        System.out.println(map.values());

        map.put(68, "D");

        System.out.println(map.size());

        System.out.println(map.get(99));

        map.remove(97);

        if (map.containsKey(100)){
            System.out.println(true);
        } else System.out.println(false);

        map.clear();

        System.out.println(map.size());

    }
}

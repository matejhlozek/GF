package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        int chicken, pigs, legs;
        System.out.println("Enter the number of chickens: ");
        Scanner input = new Scanner(System.in);
        chicken = input.nextInt();

        System.out.println("Enter the number of pigs: ");
        Scanner input2 = new Scanner(System.in);
        pigs = input2.nextInt();
        legs = (chicken*2) + (pigs*4);

        System.out.println("Number of legs is: " + legs);

    }
}

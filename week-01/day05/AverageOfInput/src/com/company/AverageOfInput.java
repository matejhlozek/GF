package com.company;

import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        int i, n=0, s=0;
        double average;


        System.out.println("Input 5 numbers : ");

        for (i=0; i<5 ;i++){

            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            s += n;
        }
        average = s / 5;
        System.out.print("Sum : " + s);
        System.out.print(", Average: " + average);
}
}

package com.company;

import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {

        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4


        int a, b;

        System.out.println("Put a number of integers: ");

        Scanner numberOfIntegers = new Scanner(System.in);
        a = numberOfIntegers.nextInt();

        System.out.println("Put a number: ");

        Scanner number = new Scanner(System.in);
        b = number.nextInt();

        for (b = 1;  b<a ; b++) {
            System.out.println("Put another number: ");

        }
        System.out.println("Sum: " + (a+b)/a);
        }
    }


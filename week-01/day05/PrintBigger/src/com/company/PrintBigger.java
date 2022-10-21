package com.company;

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {
        int a, b;
        System.out.println("Insert 2 numbers: ");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        if (a > b) {
            System.out.println("Bigger number is: " + a);
        } else {
            System.out.println("Bigger number is: " + b);
        }
    }
}

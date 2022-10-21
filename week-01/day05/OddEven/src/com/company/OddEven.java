package com.company;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even

        int a, b;
        System.out.println("Insert number: ");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = a%2;

        if (b == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
            }
    }


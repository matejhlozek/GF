package com.company;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
	int a;
    int b = 119;
        System.out.println("Guess the number: ");

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if (a == b) {
            System.out.println("You guess it!");
        }
        else if (a < b){
            System.out.println("The stored number is higher");
        }
        else if (a > b){
            System.out.println("The stored number is lower");
        }
    }
}

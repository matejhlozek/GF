package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second represents the number of boys
        //
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        // it should print: Quite a cool party!
        //
        // If there are less people coming than 20
        // it should print: Average party...
        //
        // If no girls are coming, regardless the count of the people
        // it should print: Sausage party

        int girls, boys;

        System.out.println("Insert number of girls: ");

        Scanner input = new Scanner(System.in);
        girls = input.nextInt();

        System.out.println("Insert number of boys: ");
        boys = input.nextInt();

        if (girls == boys && girls + boys >= 20) {
            System.out.println("The party is excellent!");

        } else if (girls != boys && girls + boys >= 20){
            System.out.println("Quite a cool party!");

        }else if (girls + boys < 20){
            System.out.println("Average party!");

        }else if (girls == 0){
            System.out.println("Sausage party!");
        }
}
}

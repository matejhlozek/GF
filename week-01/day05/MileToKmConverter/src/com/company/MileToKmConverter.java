package com.company;

import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
	double km, miles;
    double conversion = 1.609344;

        System.out.println("Enter distance in miles: ");
        Scanner input = new Scanner(System.in);
        miles = input.nextDouble();
        km = miles * conversion;

        System.out.println("Distance in km: " + km);
    }
}

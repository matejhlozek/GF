package com.company;

import java.util.concurrent.LinkedTransferQueue;

public class MultiplicationTable {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}

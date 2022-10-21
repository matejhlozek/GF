package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DiagonalMatrix {

    public static void main(String[] args) {
        int number = 7;
	int [][] matrix = new int[number][number];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j]);
                } else System.out.print(matrix[i][j]);

            }System.out.println();
        }
    }
}


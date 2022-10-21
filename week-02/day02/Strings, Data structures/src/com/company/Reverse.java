package com.company;

public class Reverse {
    public static void main(String[] args) {

        // Create a method that can reverse a string which is passed as parameter
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done

        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String reversed = "";
        for (int i = toBeReversed.length()-1; i >= 0 ; i--) {
            reversed = reversed + toBeReversed.charAt(i);
        }
        System.out.println(reversed);
    }
}

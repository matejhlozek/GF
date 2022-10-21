package com.company;

public class AppendAFunc {

    //  Create the usual class wrapper and main method on your own
    // - Create a string variable named `typo` and assign the value `Chinchill` to it
    // - Write a function called `appendA()` that gets a string as an input,
    //   appends an 'a' character to its end and returns the modified string
    // - Print the result of `appendA(typo)`

    public static void main(String[] args) {
        String typo = "Chinchill";
       // String correctWord = typo + "a";
        appendA(typo);
        System.out.println(typo);
        String result = appendA(typo);
        System.out.println(result);
    }
    public static String appendA (String word) {
        return word + "a";
    }
}



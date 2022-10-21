package com.company;

public class TakesLonger {
    public static void main(String[] args) {

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        // Use pieces of the `quote` variable, e.g. quote.substring(...), instead of just redefining the string!

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder wordsToAdd = new StringBuilder(quote);
        wordsToAdd.insert(20, " always takes longer than");
        System.out.println(wordsToAdd.toString());
    }
}

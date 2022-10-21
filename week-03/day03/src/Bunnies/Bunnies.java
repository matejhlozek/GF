package Bunnies;

public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears. Write
    // a recursive method (no loops or multiplication) which takes the number of
    // bunnies as its sole parameter and returns the total number of ears
    // the bunnies have. The method should be able to handle invalid input
    // (e.g. negative numbers)

    public static void main(String[] args) {

        int result = bunnies(10);
        System.out.println(result);
    }

    public static int bunnies(int n) {
        if (n <= 0) {
            return 0;
        } else {
            int result = 2 + bunnies(n-1);
            return result;
        }
    }
}

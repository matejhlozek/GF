package BunniesAgain;

public class BunniesAgain {
    // We have bunnies standing in a line numbered as 1, 2, ... The "odd" bunnies
    // (1, 3, ...) have the usual number of ears = 2. However, the even bunnies
    // (2, 4, ...) have 3 ears each (because they have a raised foot). Write
    // a recursive method which accepts the number of bunnies as a parameter
    // and returns the total number of "ears" in the bunny line. The method should be
    // able to handle invalid input (e.g. negative numbers).

    public static void main(String[] args) {

        int result = bunnies(10);
        System.out.println(result);
    }

    public static int bunnies(int n) {
        if (n <= 0) {
            return 0;
        } else if (n%2 == 1){
            int result = 2 + bunnies(n-1);
            return result;
        } else {
            int result = 3 + bunnies(n-1);
            return result;
        }
    }
}

package Power;

public class Power {

    public static void main(String[] args) {

        powerN(3,2);
    }

    public static double powerN(double n, double a) {
        if (n >= 1 && a >= 1) {
            double result = Math.pow(n,a);
            System.out.println("The result of (" + n + ", " + a + ") squared is: " + result);
        }else System.out.println("invalid input");
        return 0;
    }
}

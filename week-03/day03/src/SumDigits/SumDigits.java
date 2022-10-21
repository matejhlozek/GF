package SumDigits;

public class SumDigits {

    public static void main(String[] args) {

        int result = addNumbers(10);
        System.out.println(result);
    }

    public static int addNumbers(int n){
        if( n == 0  ){
            return 0;
        }
        else{
            System.out.print(n + " ");
            int result = n + addNumbers(n - 1);
            return result;
        }
    }
}

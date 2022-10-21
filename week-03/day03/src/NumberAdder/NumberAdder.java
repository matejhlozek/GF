package NumberAdder;

public class NumberAdder {

    public static void main(String[] args) {

        int result = addNumbers(5);
        System.out.println(result);
    }

    public static int addNumbers(int n){
        if( n == 0  ){
            return 0;
        }
        else{
            int result = n + addNumbers(n - 1);
            return result;
        }
    }
}

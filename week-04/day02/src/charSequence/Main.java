package charSequence;

public class Main {

    public static void main(String[] args) throws StringIndexOutOfBoundsException{

        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts);
        System.out.println(gnirts.charAt(1));


        System.out.println("_________________");

        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter);
        System.out.println(shifter.charAt(0));

    }
}

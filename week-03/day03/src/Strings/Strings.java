package Strings;

public class Strings {
    // Given a string, write a recursive (no loops) method which returns
    // a new string with the lowercase 'x' chars changed to 'y' chars.

    public static void main(String[] args) {
        String wrong = "xxxasdf";
        char char1 = 'x';
        char char2 = 'y';
        System.out.println(corrected(wrong, char1, char2));
    }

    public static String corrected(String wrong, char char1, char char2) {
        if (wrong.length() == 0){
            return wrong;
        }
        char x = wrong.charAt(0);
        if (wrong.charAt(0) == char1) {
            x=char2;
            wrong = char2+wrong.substring(1);
        } return x+corrected(wrong.substring(1), char1, char2);

    }
}

package StringsAgain;

public class StringsAgain {
    // Given a string, write a recursive (no loops) method which returns
    // a new string with the lowercase 'x' chars changed to 'y' chars.

    public static void main(String[] args) {
        String wrong = "xxxasdf";
        char char1 = 'x';
        System.out.println(corrected(wrong, char1));
    }

    public static String corrected(String wrong, char char1) {
        if (wrong.length() == 0){
            return wrong;
        } else{
        if (wrong.charAt(0) == char1) {
            return corrected(wrong.substring(1), char1);
        } else
            return wrong.charAt(0) + corrected(wrong.substring(1), char1);
        }
    }
}

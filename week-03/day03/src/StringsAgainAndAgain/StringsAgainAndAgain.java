package StringsAgainAndAgain;

public class StringsAgainAndAgain {
// Given a string, write a recursive (no loops) method which returns a new
// string with all adjacent chars separated by an `*`. Please note that there
// should be no trailing `*` at the end of the returned string. For example,
// the string `word` should be changed to `w*o*r*d`.

    public static void main(String[] args) {
        String word = "word";
        String star = "*";
        System.out.println(corrected(word, star));
    }

    public static String corrected(String word, String star) {
        for (int i = 0; i < word.length(); i++) {
            word.charAt(i) = word.charAt(i)+star;
        }

    }
}

package anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public ArrayList<String> listOfStrings;

    public Anagram(ArrayList<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }

    String string1;
    String string2;

    public boolean ifAnagram(){
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            return true;
        } return false;
    }
}

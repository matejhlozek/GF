package countLetters;

import java.util.HashMap;

public class CountLetters {

    public HashMap<Character, Integer> hashMap;

    public CountLetters(HashMap<Character, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    public HashMap countLetters(String string){
        char[] charArray1 = string.toCharArray();
        for (int i = 0; i < charArray1.length; i++) {
            if (hashMap.containsKey(string.charAt(i))){
                hashMap.put(string.charAt(i), hashMap.get(string.charAt(i))+1);
                } else {
                    hashMap.put(string.charAt(i), 1);
                }
        }return hashMap;
    }
}

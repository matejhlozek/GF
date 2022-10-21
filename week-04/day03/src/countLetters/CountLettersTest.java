package countLetters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    CountLetters countLetters = new CountLetters(new HashMap<>());

    @Test
    void countLetters() {
        countLetters.countLetters("aaaaabbbbcccdde");
        assertEquals(5, countLetters.hashMap.get('a'));
        System.out.println(countLetters.hashMap);
    }
}
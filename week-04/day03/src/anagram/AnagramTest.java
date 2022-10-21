package anagram;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram = new Anagram(new ArrayList<>());

    @Test
    void ifAnagram() {
        anagram.string1 = "string";
        anagram.string2 = "gnirts";
        assertEquals(true, anagram.ifAnagram());
    }
}
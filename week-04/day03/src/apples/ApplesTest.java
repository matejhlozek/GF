package apples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    Apples apple = new Apples("apple");

    @Test
    @DisplayName("testing if specific string equals to the input ")
    public void getApple() {
        assertEquals("apple", apple.getApple());
    }
}
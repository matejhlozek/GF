package countpairs;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    void testingCountMethod() {
        assertEquals(4, main.count() );
    }

    @Test
    void testingIfPairsAreDuplicate() {
        assertTrue(main.count() != main.allPairs.size());
    }
}
package sum;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    Sum sum = new Sum(new ArrayList<>());

    @Test
    @Description("Testing the sum of values inside Array List.")
    public void testingSum() {
        sum.listOfIntegers.add(0,10);
        sum.listOfIntegers.add(0,20);
        sum.listOfIntegers.add(0,30);
        assertEquals(60, sum.sum());
    }

    @Test
    @Description("Testing if the Array List contains anything.")
    public void testingIfEmpty() {
        assertEquals(0, sum.listOfIntegers.size());
    }

    @Test
    @Description("Testing if the Array List contains Null.")
    public void testingIfNull() {
        sum.listOfIntegers.add(null);
        assertEquals(null, sum.listOfIntegers.get(0));
    }

    @Test
    @Description("Testing if the Array List contains one element")
    public void testingIfContainsOneElement() {
        sum.listOfIntegers.add(0,10);
        assertEquals(1, sum.listOfIntegers.size());
    }
    @Test
    @Description("Testing if the Array List contains more elements")
    public void testingIfContainsMoreElements() {
        sum.listOfIntegers.add(0,10);
        sum.listOfIntegers.add(0,20);
        assertEquals(2, sum.listOfIntegers.size());
    }
}
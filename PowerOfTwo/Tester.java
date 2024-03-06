package PowerOfTwo;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests Missing Number
     */
    @Test
    void testNegativeNumber() {
        int n = -2048;
        assertFalse(Solution.isPowerOfTwo(n));
    }
    
    @Test
    void testZero() {
        int n = 0;
        assertFalse(Solution.isPowerOfTwo(n));
    }

    @Test
    void testOne() {
        int n = 1;
        assertTrue(Solution.isPowerOfTwo(n));
    }
    
    @Test
    void testTwo() {
        int n = 2;
        assertTrue(Solution.isPowerOfTwo(n));
    }

    @Test
    void testSixteen() {
        int n = 16;
        assertTrue(Solution.isPowerOfTwo(n));
    }

    @Test
    void testThirtyOne() {
        int n = 31;
        assertFalse(Solution.isPowerOfTwo(n));
    }

    @Test
    void testMaxValue() {
        int n = 1073741824;
        assertTrue(Solution.isPowerOfTwo(n));
    }

    @Test
    void testIntegerMinValue() {
        int n = -2147483648;
        assertFalse(Solution.isPowerOfTwo(n));
    }

    @Test
    void testIntegerMaxValue() {
        int n = 2147483647;
        assertFalse(Solution.isPowerOfTwo(n));
    }
}

package PowerOfFour;

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
        assertFalse(Solution.isPowerOfFour(n));
    }
    
    @Test
    void testZero() {
        int n = 0;
        assertFalse(Solution.isPowerOfFour(n));
    }

    @Test
    void testOne() {
        int n = 1;
        assertTrue(Solution.isPowerOfFour(n));
    }
    
    @Test
    void testTwo() {
        int n = 2;
        assertFalse(Solution.isPowerOfFour(n));
    }

    @Test
    void testFour() {
        int n = 4;
        assertTrue(Solution.isPowerOfFour(n));
    }

    @Test
    void testSixteen() {
        int n = 16;
        assertTrue(Solution.isPowerOfFour(n));
    }

    @Test
    void testSixtyThree() {
        int n = 63;
        assertFalse(Solution.isPowerOfFour(n));
    }

    @Test
    void testMaxValue() {
        int n = 1073741824;
        assertTrue(Solution.isPowerOfFour(n));
    }

    @Test
    void testIntegerMinValue() {
        int n = -2147483648;
        assertFalse(Solution.isPowerOfFour(n));
    }

    @Test
    void testIntegerMaxValue() {
        int n = 2147483647;
        assertFalse(Solution.isPowerOfFour(n));
    }
}

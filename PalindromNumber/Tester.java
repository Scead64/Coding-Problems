package PalindromNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Is Palindrome (Number)
     */
    @Test
    void testZero() {
        int x = 0;
        assertTrue(Solution.isPalindrome(x));
        assertTrue(Solution.isPalindrome2(x));
    }

    @Test
    void testSingleDigit() {
        int x = 1;
        assertTrue(Solution.isPalindrome(x));
        assertTrue(Solution.isPalindrome2(x));
    }

    @Test
    void testDoubleDigit() {
        int x = 12;
        assertFalse(Solution.isPalindrome(x));
        assertFalse(Solution.isPalindrome2(x));
    }

    @Test
    void testTripleDigitTrue() {
        int x = 121;
        assertTrue(Solution.isPalindrome(x));
        assertTrue(Solution.isPalindrome2(x));
    }

    @Test
    void testTripleDigitFalse() {
        int x = 123;
        assertFalse(Solution.isPalindrome(x));
        assertFalse(Solution.isPalindrome2(x));
    }

    @Test
    void testLargeNumberTrue() {
        int x = 567232765;
        assertTrue(Solution.isPalindrome(x));
        assertTrue(Solution.isPalindrome2(x));
    }

    @Test
    void testLargeNumberFalse() {
        int x = 567231765;
        assertFalse(Solution.isPalindrome(x));
        assertFalse(Solution.isPalindrome2(x));
    }

    @Test
    void testNegativeNumber() {
        int x = -1235321;
        assertFalse(Solution.isPalindrome(x));
        assertFalse(Solution.isPalindrome2(x));
    }

    
}

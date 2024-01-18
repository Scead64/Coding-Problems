package LongestPalindromicSubstring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Longest Substring Palindrome
     */
    @Test
    void testSingleCharacter() {
        String s = "a";
        String expectedSolution = "a";
        assertEquals(expectedSolution, Solution.longestPalindrome(s));
    }

    @Test
    void testTwoCharacters() {
        String s = "aa";
        String expectedSolution = "aa";
        assertEquals(expectedSolution, Solution.longestPalindrome(s));
    }

    @Test
    void testStringOfRepeatCharacters() {
        String s = "aaaaaaaaaaaaaaaaaaaa";
        String expectedSolution = "aaaaaaaaaaaaaaaaaaaa";
        assertEquals(expectedSolution, Solution.longestPalindrome(s));
    }

    @Test
    void testStringOfLongPalindrome() {
        String s = "aaaaabaaaaa";
        String expectedSolution = "aaaaabaaaaa";
        assertEquals(expectedSolution, Solution.longestPalindrome(s));
    }

    @Test
    void testStringOfNonRepeatCharacters() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String expectedSolution = "a";
        assertEquals(expectedSolution, Solution.longestPalindrome(s));
    }

    @Test
    void testStringOfRepeatPalindromeLength() {
        String s = "aabcdefghh";
        String expectedSolution = "aa";
        assertEquals(expectedSolution, Solution.longestPalindrome(s));
    }

    @Test
    void testStringOfMultiplePalindromes() {
        String s = "abccbaabccbaaaaabcdefghijihgfedcba";
        String expectedSolution = "abcdefghijihgfedcba";
        assertEquals(expectedSolution, Solution.longestPalindrome(s));
    }
}

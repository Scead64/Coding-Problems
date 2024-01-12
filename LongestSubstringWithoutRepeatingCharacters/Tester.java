package LongestSubstringWithoutRepeatingCharacters;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Longest Substring Without Repeating Characters
     */
    @Test
    void testSingleCharacter() {
        String s = "a";
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testStringOfRepeatCharacters() {
        String s = "aaaaaaaaaaaaaaaaaaaa";
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testStringOfNonRepeatCharacters() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int expectedSolution = 26;
        assertEquals(expectedSolution, Solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testStringOfInterwovenRepeatCharacters() {
        String s = "abcaabcdefabcdefghiabc";
        int expectedSolution = 9;
        assertEquals(expectedSolution, Solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testStringOfLongestSubstringAtEnd() {
        String s = "abcaabcdefabcdabcdefghi";
        int expectedSolution = 9;
        assertEquals(expectedSolution, Solution.lengthOfLongestSubstring(s));
    }
}

package MinimumWindowSubstring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Minimum Window Substring
     */
    @Test
    void testSingleCharacter() {
        String s = "a";
        String t = "a";
        String expectedSolution = "a";
        assertEquals(expectedSolution, Solution.minWindow(s,t));
    }

    @Test
    void testNoSolution() {
        String s = "a";
        String t = "as";
        String expectedSolution = "";
        assertEquals(expectedSolution, Solution.minWindow(s,t));
    }

    @Test
    void testSingleWindow() {
        String s = "abcdefghij";
        String t = "hfg";
        String expectedSolution = "fgh";
        assertEquals(expectedSolution, Solution.minWindow(s,t));
    }

    @Test
    void testTwoWindows() {
        String s = "abbcdefghinkslabcngwrioosh";
        String t = "cba";
        String expectedSolution = "abc";
        assertEquals(expectedSolution, Solution.minWindow(s,t));
    }

    @Test
    void testWindowsWithRepeats() {
        String s = "aacbbcacb";
        String t = "ccba";
        String expectedSolution = "bcac";
        assertEquals(expectedSolution, Solution.minWindow(s,t));
    }
    
}

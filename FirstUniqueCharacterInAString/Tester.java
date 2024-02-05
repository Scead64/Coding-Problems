package FirstUniqueCharacterInAString;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Longest Substring Palindrome
     */
    @Test
    void testSingleCharacter() {
        String s = "a";
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.firstUniqChar(s));
    }

    @Test
    void testTwoSameCharacters() {
        String s = "aa";
        int expectedSolution = -1;
        assertEquals(expectedSolution, Solution.firstUniqChar(s));
    }

    @Test
    void testTwoDifferentCharacters() {
        String s = "ab";
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.firstUniqChar(s));
    }

    @Test
    void testManyDifferentCharacters() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.firstUniqChar(s));
    }

    @Test
    void testManySameCharacters() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int expectedSolution = -1;
        assertEquals(expectedSolution, Solution.firstUniqChar(s));
    }

    @Test
    void testRegularString() {
        String s = "todayiamfeelingverygoodandiamhappytoo";
        int expectedSolution = 8;
        assertEquals(expectedSolution, Solution.firstUniqChar(s));
    }

    @Test
    void testStringOfRepeatsEndingWithUnique() {
        String s = "absdbfkjsdabgsdkjgabfdbgajsfdbahsbabsdhljalkdbfsaljkhp";
        int expectedSolution = s.length()-1;
        assertEquals(expectedSolution, Solution.firstUniqChar(s));
    }
}

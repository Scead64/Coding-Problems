package MinimumLengthOfStringAfterDeletingSimilarEnds;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Minimum Length Of String After Deleting Similar Ends
     */
    @Test
    void testSingleCharacter() {
        String s = "a";
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.minimumLength(s));
    }

    @Test
    void testTwoSameCharacters() {
        String s = "aa";
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.minimumLength(s));
    }

    @Test
    void testTwoDifferentCharacters() {
        String s = "ab";
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.minimumLength(s));
    }

    @Test
    void testManySameCharacters() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.minimumLength(s));
    }

    @Test
    void testManyCharactersManyMiddleSame() {
        String s = "aaaaaaaaaaaabbbbbbaaaaaaaaaaaa";
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.minimumLength(s));
    }

    @Test
    void testManyCharactersOneMiddleSame() {
        String s = "aaaaaaaaaaaabaaaaaaaaaaaa";
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.minimumLength(s));
    }

    @Test
    void testManyCharactersEndsDifferent() {
        String s = "aaaaaaaaaaaabbbbbbaaaaaaaaaaab";
        int expectedSolution = s.length();
        assertEquals(expectedSolution, Solution.minimumLength(s));
    }

    @Test
    void testManySameEndsThenDifferent() {
        String s = "aaabbbbbccbbbccabbaa";
        int expectedSolution = 8;
        assertEquals(expectedSolution, Solution.minimumLength(s));
    }
}

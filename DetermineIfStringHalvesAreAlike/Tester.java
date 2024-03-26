package DetermineIfStringHalvesAreAlike;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Determine If String Halves are Alike
     */
    @Test
    void testLengthTwoNoVowelSameLetter() {
        String s = "cc";
        assertTrue(Solution.halvesAreAlike(s));
    }

    @Test
    void testLengthTwoNoVowelDifferentLetter() {
        String s = "cd";
        assertTrue(Solution.halvesAreAlike(s));
    }

    @Test
    void testLengthTwoVowelSameLetter() {
        String s = "aa";
        assertTrue(Solution.halvesAreAlike(s));
    }

    @Test
    void testLengthTwoVowelDifferentLetter() {
        String s = "ae";
        assertTrue(Solution.halvesAreAlike(s));
    }

    @Test
    void testLengthTwoVowelDifferentLetterCapital() {
        String s = "OE";
        assertTrue(Solution.halvesAreAlike(s));
    }

    @Test
    void testLengthTwoOneVowelDifferentLetter() {
        String s = "ap";
        assertFalse(Solution.halvesAreAlike(s));
    }

    @Test
    void testLengthTenFalse() {
        String s = "apfgheipyt";
        assertFalse(Solution.halvesAreAlike(s));
    }

    @Test
    void testLengthTenTrue() {
        String s = "apOUgeipyA";
        assertTrue(Solution.halvesAreAlike(s));
    }
}

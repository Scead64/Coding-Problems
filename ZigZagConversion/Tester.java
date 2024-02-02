package ZigZagConversion;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Zig Zag Conversion
     */
    @Test
    void testSingleline() {
        String s = "ABCDEF";
        String expectedSolution = "ABCDEF";
        assertEquals(expectedSolution, Solution.convert(s, 1));
    }

    @Test
    void testSingleCharacter() {
        String s = "A";
        String expectedSolution = "A";
        assertEquals(expectedSolution, Solution.convert(s, 100));
    }

    @Test
    void testTwolinesShort() {
        String s = "ABC";
        String expectedSolution = "ACB";
        assertEquals(expectedSolution, Solution.convert(s, 2));
    }

    @Test
    void testTwolinesLong() {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expectedSolution = "ACEGIKMOQSUWYBDFHJLNPRTVXZ";
        assertEquals(expectedSolution, Solution.convert(s, 2));
    }

    @Test
    void testThreelinesShort() {
        String s = "ABCDE";
        String expectedSolution = "AEBDC";
        assertEquals(expectedSolution, Solution.convert(s, 3));
    }

    @Test
    void testThreelinesLong() {
        /*
         * A   E   I   M   Q   U   Y
         * B D F H J L N P R T V X Z
         * C   G   K   O   S   W
         */
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expectedSolution = "AEIMQUYBDFHJLNPRTVXZCGKOSW";
        assertEquals(expectedSolution, Solution.convert(s, 3));
    }

    @Test
    void testfOURlinesShort() {
        String s = "ABCDEFG";
        String expectedSolution = "AGBFCED";
        assertEquals(expectedSolution, Solution.convert(s, 4));
    }

    @Test
    void testFourlinesLong() {
        /*
         * A    G    M    S    Y
         * B  F H  L N  R T  X Z
         * C E  I K  O Q  U W
         * D    J    P    V
         */ 
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expectedSolution = "AGMSYBFHLNRTXZCEIKOQUWDJPV";
        assertEquals(expectedSolution, Solution.convert(s, 4));
    }
}

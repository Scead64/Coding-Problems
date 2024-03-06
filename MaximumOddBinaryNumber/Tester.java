package MaximumOddBinaryNumber;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Maximum Odd Binary Number
     */
    @Test
    void testSingleOne() {
        String binary = "1";
        String expectedSolution = "1";
        assertEquals(expectedSolution, Solution.maximumOddBinaryNumber(binary));
    }

    @Test
    void testDoubleDigitOdd() {
        String binary = "01";
        String expectedSolution = "01";
        assertEquals(expectedSolution, Solution.maximumOddBinaryNumber(binary));
    }

    @Test
    void testDoubleDigitEven() {
        String binary = "10";
        String expectedSolution = "01";
        assertEquals(expectedSolution, Solution.maximumOddBinaryNumber(binary));
    }

    @Test
    void multiDigitOne() {
        String binary = "00000001";
        String expectedSolution = "00000001";
        assertEquals(expectedSolution, Solution.maximumOddBinaryNumber(binary));
    }

    @Test
    void multiDigitMinimum() {
        String binary = "00001111";
        String expectedSolution = "11100001";
        assertEquals(expectedSolution, Solution.maximumOddBinaryNumber(binary));
    }

    @Test
    void multiDigitMaximum() {
        String binary = "11100001";
        String expectedSolution = "11100001";
        assertEquals(expectedSolution, Solution.maximumOddBinaryNumber(binary));
    }

    @Test
    void multiDigitInterleaved() {
        String binary = "01010101";
        String expectedSolution = "11100001";
        assertEquals(expectedSolution, Solution.maximumOddBinaryNumber(binary));
    }

    @Test
    void multiDigitAllOnes() {
        String binary = "11111111";
        String expectedSolution = "11111111";
        assertEquals(expectedSolution, Solution.maximumOddBinaryNumber(binary));
    }
}

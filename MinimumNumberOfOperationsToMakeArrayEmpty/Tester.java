package MinimumNumberOfOperationsToMakeArrayEmpty;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Minimum Number of Operations to Make Array Empty
     */
    @Test
    void testTwoNumbersNoSolution() {
        int nums[] = {1,2};
        int expectedSolution = -1;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testTwoNumbersOneSolution() {
        int nums[] = {1,1};
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testThreeNumbersNoSolution() {
        int nums[] = {3,1,2};
        int expectedSolution = -1;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testThreeNumbersNoSolutionOneTwoPair() {
        int nums[] = {1,1,2};
        int expectedSolution = -1;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testThreeNumbersOneSolution() {
        int nums[] = {1,1,1};
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testFourNumbersOneSolution() {
        int nums[] = {1,1,1,1};
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testFiveNumbersOneSolution() {
        int nums[] = {1,1,1,1,1};
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testSixNumbersOneSolution() {
        int nums[] = {1,1,1,1,1,1};
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testSevenNumbersOneSolution() {
        int nums[] = {1,1,1,1,2,2,2};
        int expectedSolution = 3;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }

    @Test
    void testMixedNumbersmanySolutions() {
        int nums[] = {1,2,1,1,2,9,4,4,4,4,5,5,9,4,2,9,9,9,9,9,9,9,9,9,9};
        int expectedSolution = 9;
        assertEquals(expectedSolution, Solution.minOperations(nums));
    }    
}

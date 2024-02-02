package NumberOfSubsequencesThatSatisfyTheGivenSumCondition;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Number of Subsequences that satisfy the given sum condition
     */
    @Test
    void testNoSequences() {
        int[] nums = {2,2,3};
        int target = 1;
        int expectedAnswer = 0;
        assertEquals(expectedAnswer, Solution.numSubseq(nums, target));
    }

    @Test
    void testOneSequences() {
        int[] nums = {2,3,4};
        int target = 4;
        int expectedAnswer = 1;
        assertEquals(expectedAnswer, Solution.numSubseq(nums, target));
    }
    
    @Test
    void testTwoSequences() {
        int[] nums = {2,3,4};
        int target = 5;
        int expectedAnswer = 2;
        assertEquals(expectedAnswer, Solution.numSubseq(nums, target));
    }

    @Test
    void testThreeSequences() {
        int[] nums = {2,3,7};
        int target = 6;
        int expectedAnswer = 3;
        assertEquals(expectedAnswer, Solution.numSubseq(nums, target));
    }

    @Test
    void testMultipleSequences() {
        int[] nums = {9,5,4,3,10,7,8,2,6};
        int target = 10;
        int expectedAnswer = 85;
        assertEquals(expectedAnswer, Solution.numSubseq(nums, target));
    }

    @Test
    void testMultipleSequencesDuplicateNumbers() {
        int[] nums = {4,5,7,11,2,3,17,11,2,3,4};
        int target = 10;
        int expectedAnswer = 247;
        assertEquals(expectedAnswer, Solution.numSubseq(nums, target));
    }
}

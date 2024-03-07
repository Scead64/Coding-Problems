package LeastNumberOfUniqueIntegersAfterKRemovals;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Least Number of Unique Integers Afer K Removals
     */
    @Test
    void testSingleNumberNoneToRemove() {
        int[] arr = {3};
        int k = 0;
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.findLeastNumOfUniqueInts(arr, k));
    }

    @Test
    void testSingleNumberOneToRemove() {
        int[] arr = {3};
        int k = 1;
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.findLeastNumOfUniqueInts(arr, k));
    }

    @Test
    void testManyNumbersAllUniqueNoneToRemove() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 0;
        int expectedSolution = 9;
        assertEquals(expectedSolution, Solution.findLeastNumOfUniqueInts(arr, k));
    }

    @Test
    void testManyNumbersAllUniqueSomeToRemove() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 4;
        int expectedSolution = 5;
        assertEquals(expectedSolution, Solution.findLeastNumOfUniqueInts(arr, k));
    }

    @Test
    void testManyNumbersAllUniqueAllToRemove() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 9;
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.findLeastNumOfUniqueInts(arr, k));
    }

    @Test
    void testManyNumbersVaryingUniqueNoneToRemove() {
        int[] arr = {1,2,1,4,5,1,5,9,9};
        int k = 0;
        int expectedSolution = 5;
        assertEquals(expectedSolution, Solution.findLeastNumOfUniqueInts(arr, k));
    }

    @Test
    void testManyNumbersVaryingUniqueUniqueToRemove() {
        int[] arr = {1,2,1,4,5,1,5,9,9};
        int k = 2;
        int expectedSolution = 3;
        assertEquals(expectedSolution, Solution.findLeastNumOfUniqueInts(arr, k));
    }

    @Test
    void testManyNumbersVaryingUniqueManyToRemove() {
        int[] arr = {1,2,1,4,5,1,5,9,9};
        int k = 5;
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.findLeastNumOfUniqueInts(arr, k));
    }
}

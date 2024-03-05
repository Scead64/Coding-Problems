package SearchInsertPosition;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Search Insert Position
     */
    @Test
    void testOneNumberEqual() {
        int nums[] = {1};
        int target = 1;
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testOneNumberLess() {
        int nums[] = {1};
        int target = 0;
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testOneNumberGreater() {
        int nums[] = {1};
        int target = 2;
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersMiddleEqual() {
        int nums[] = {2,4,6,8,10};
        int target = 6;
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersMiddleLess() {
        int nums[] = {2,4,6,8,10};
        int target = 5;
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersMiddleGreater() {
        int nums[] = {2,4,6,8,10};
        int target = 7;
        int expectedSolution = 3;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersEndEqual() {
        int nums[] = {2,4,6,8,10};
        int target = 10;
        int expectedSolution = 4;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersEndLess() {
        int nums[] = {2,4,6,8,10};
        int target = 9;
        int expectedSolution = 4;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersEndGreater() {
        int nums[] = {2,4,6,8,10};
        int target = 11;
        int expectedSolution = 5;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersStartEqual() {
        int nums[] = {2,4,6,8,10};
        int target = 2;
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersStartLess() {
        int nums[] = {2,4,6,8,10};
        int target = 1;
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }

    @Test
    void testSomeNumbersStartGreater() {
        int nums[] = {2,4,6,8,10};
        int target = 3;
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.searchInsert(nums, target));
    }
}

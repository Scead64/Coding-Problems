package TwoSum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Two Sum Solution 1
     */
    @Test
    void twoSumTestSorted() {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        int[] expectedSolution = {0, 1};
        assertArrayEquals(Solution.twoSum(nums, target), expectedSolution);
    }

    @Test
    void twoSumTestSorted2() {
        int[] nums = {1,3,4,5,7,8};
        int target = 10;
        int[] expectedSolution = {1, 4};
        assertArrayEquals(Solution.twoSum(nums, target), expectedSolution);
    }

    @Test
    void twoSumTestReverseSorted() {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        int target = 3;
        int[] expectedSolution = {7, 8};
        assertArrayEquals(Solution.twoSum(nums, target), expectedSolution);
    }

    @Test
    void twoSumTestReverseSorted2() {
        int[] nums = {8,7,5,4,3,1};
        int target = 10;
        int[] expectedSolution = {1, 4};
        assertArrayEquals(Solution.twoSum(nums, target), expectedSolution);
    }

    @Test
    void twoSumTestIntertwined() {
        int[] nums = {1,6,2,7,3,8,4,9};
        int target = 4;
        int[] expectedSolution = {0, 4};
        assertArrayEquals(Solution.twoSum(nums, target), expectedSolution);
    }

    @Test
    void twoSumTestIntertwined2() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedSolution = {1, 2};
        assertArrayEquals(Solution.twoSum(nums, target), expectedSolution);
    }

    /*
     * Tests for Two Sum Solution 2
     */
    @Test
    void twoSum2TestSorted() {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        int[] expectedSolution = {0, 1};
        assertArrayEquals(Solution.twoSum2(nums, target), expectedSolution);
    }

    @Test
    void twoSum2TestSorted2() {
        int[] nums = {1,3,4,5,7,8};
        int target = 10;
        int[] expectedSolution = {1, 4};
        assertArrayEquals(Solution.twoSum2(nums, target), expectedSolution);
    }

    @Test
    void twoSum2TestReverseSorted() {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        int target = 3;
        int[] expectedSolution = {7, 8};
        assertArrayEquals(Solution.twoSum2(nums, target), expectedSolution);
    }

    @Test
    void twoSum2TestReverseSorted2() {
        int[] nums = {8,7,5,4,3,1};
        int target = 10;
        int[] expectedSolution = {1, 4};
        assertArrayEquals(Solution.twoSum2(nums, target), expectedSolution);
    }

    @Test
    void twoSum2TestIntertwined() {
        int[] nums = {1,6,2,7,3,8,4,9};
        int target = 4;
        int[] expectedSolution = {0, 4};
        assertArrayEquals(Solution.twoSum2(nums, target), expectedSolution);
    }

    @Test
    void twoSum2TestIntertwined2() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedSolution = {1, 2};
        assertArrayEquals(Solution.twoSum2(nums, target), expectedSolution);
    }
}

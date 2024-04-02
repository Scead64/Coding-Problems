package CountElementsWithMaximumFrequency;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests Count Elements With Maximum Frequency
     */
    @Test
    void testSingleNumber() {
        int[] nums = {1};
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.maxFrequencyElements(nums));
    }

    @Test
    void testTwoSameNumbers() {
        int[] nums = {1,1};
        int expectedsolution = 2;
        assertEquals(expectedsolution, Solution.maxFrequencyElements(nums));
    }

    @Test
    void testTwoDifferentNumbers() {
        int[] nums = {1,2};
        int expectedsolution = 2;
        assertEquals(expectedsolution, Solution.maxFrequencyElements(nums));
    }

    @Test
    void testThreeSameNumbers() {
        int[] nums = {1,1,1};
        int expectedsolution = 3;
        assertEquals(expectedsolution, Solution.maxFrequencyElements(nums));
    }

    @Test
    void testThreeDifferentNumbers() {
        int[] nums = {1,2,3};
        int expectedsolution = 3;
        assertEquals(expectedsolution, Solution.maxFrequencyElements(nums));
    }

    @Test
    void testThreeNumbersTwoSame() {
        int[] nums = {2,1,1};
        int expectedsolution = 2;
        assertEquals(expectedsolution, Solution.maxFrequencyElements(nums));
    }

    @Test
    void testMultipleNumbersProgressiveIncreaseInFrequency() {
        int[] nums = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8};
        int expectedsolution = 8;
        assertEquals(expectedsolution, Solution.maxFrequencyElements(nums));
    }
}

package MinimumCommonValue;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests Minimum Common Value
     */
    @Test
    void testSingleNumber() {
        int[] nums1 = {1};
        int[] nums2 = {1};
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.getCommon(nums1, nums2));
    }

    @Test
    void testNumberInCommonNums1Longer() {
        int[] nums1 = {2,4,6,6,6,6,6,7,8,8,8,8,11,11,11,16,16,16,17};
        int[] nums2 = {1,5,9,16};
        int expectedsolution = 16;
        assertEquals(expectedsolution, Solution.getCommon(nums1, nums2));
    }

    @Test
    void testNumberInCommonNums2Longer() {
        int[] nums1 = {1,5,9,16};
        int[] nums2 = {2,4,6,6,6,6,6,7,8,8,8,8,11,11,11,16,16,16,17};
        int expectedsolution = 16;
        assertEquals(expectedsolution, Solution.getCommon(nums1, nums2));
    }

    @Test
    void testNoNumberInCommonShort() {
        int[] nums1 = {1,5,9,16};
        int[] nums2 = {2,4,6,6};
        int expectedsolution = -1;
        assertEquals(expectedsolution, Solution.getCommon(nums1, nums2));
    }

    @Test
    void testNoNumberInCommonLong() {
        int[] nums1 = {1,4,9,16,25,36,49,64,81};
        int[] nums2 = {2,5,10,17,26,37,50,65,82};
        int expectedsolution = -1;
        assertEquals(expectedsolution, Solution.getCommon(nums1, nums2));
    }
}

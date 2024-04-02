package IntersectionOfTwoArrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests Intersection of Two Arrays
     */
    @Test
    void testSingleCommonNumber() {
        int[] nums1 = {1};
        int[] nums2 = {1};
        int[] expectedsolution = {1};
        assertArrayEquals(expectedsolution, Solution.intersection(nums1, nums2));
    }

    @Test
    void testSingleUncommonNumber() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        int[] expectedsolution = {};
        assertArrayEquals(expectedsolution, Solution.intersection(nums1, nums2));
    }

    @Test
    void testSingleCommonNumberNums1Longer() {
        int[] nums1 = {2,4,7,8,12,24,35,46,55,68,90};
        int[] nums2 = {55};
        int[] expectedsolution = {55};
        assertArrayEquals(expectedsolution, Solution.intersection(nums1, nums2));
    }

    @Test
    void testSingleCommonNumberNums2Longer() {
        int[] nums1 = {55};
        int[] nums2 = {2,4,7,8,12,24,35,46,55,68,90};
        int[] expectedsolution = {55};
        assertArrayEquals(expectedsolution, Solution.intersection(nums1, nums2));
    }

    void testManyCommonNumbersSameLength() {
        int[] nums1 = {1,3,7,9,12,24,33,45,55,68,90};
        int[] nums2 = {2,4,7,8,12,24,35,46,55,68,90};
        int[] expectedsolution = {7,12,24,55,68,90};
        assertArrayEquals(expectedsolution, Solution.intersection(nums1, nums2));
    }
}


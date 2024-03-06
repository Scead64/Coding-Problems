package MajorityElement;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests Missing Number
     */
    @Test
    void testSingleNumber() {
        int[] nums = {1};
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.majorityElement(nums));
    }

    @Test
    void testTwoNumbers() {
        int[] nums = {1,1};
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.majorityElement(nums));
    }

    @Test
    void testMultipleNumbers() {
        int[] nums = {1,1,2,4,1,6,1,7,34,1,222,1,1};
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.majorityElement(nums));
    }

    @Test
    void testMultipleNumbersTwoCandidates() {
        int[] nums = {1,1,2,2,2,1,2,2,1,2,1,1,2};
        int expectedsolution = 2;
        assertEquals(expectedsolution, Solution.majorityElement(nums));
    }

}

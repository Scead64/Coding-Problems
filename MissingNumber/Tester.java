package MissingNumber;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests Missing Number
     */
    @Test
    void testSingleNumber() {
        int[] nums = {1};
        int expectedsolution = 0;
        assertEquals(expectedsolution, Solution.missingNumber(nums));
    }

    @Test
    void testmultipleNumbersMiddle() {
        int[] nums = {0,1,2,3,4,6,7,8,9};
        int expectedsolution = 5;
        assertEquals(expectedsolution, Solution.missingNumber(nums));
    }

    @Test
    void testmultipleNumbersStart() {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int expectedsolution = 0;
        assertEquals(expectedsolution, Solution.missingNumber(nums));
    }

    @Test
    void testmultipleNumbersEnd() {
        int[] nums = {0,1,2,3,4,5,6,7,8};
        int expectedsolution = 9;
        assertEquals(expectedsolution, Solution.missingNumber(nums));
    }
}

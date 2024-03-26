package UniqueNumberOfOccurences;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Unique Number of Occurences
     */
    @Test
    void testLengthOne() {
        int[] arr = {1};
        assertTrue(Solution.uniqueOccurrences(arr));
    }

    @Test
    void testLengthTwoSameNumber() {
        int[] arr = {1,1};
        assertTrue(Solution.uniqueOccurrences(arr));
    }

    @Test
    void testLengthTwoDifferentNumber() {
        int[] arr = {1,2};
        assertFalse(Solution.uniqueOccurrences(arr));
    }

    @Test
    void testMultiLengthFalse() {
        int[] arr = {1,2,2,1,3,2,1,3};
        assertFalse(Solution.uniqueOccurrences(arr));
    }

    @Test
    void testMultiLengthTrue() {
        int[] arr = {1,2,2,1,3,2,1,3,1};
        assertTrue(Solution.uniqueOccurrences(arr));
    }
}

package DivideArrayIntoArraysWithMaxDifference;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Tester {

    
    /*
     * Tests for Divide Array into arrays with max difference solution
     */
    @Test
    void duplicateTriplet() {
        int[] nums = {1,1,1};
        int k = 1;
        int[][] expectedsolution = {{1,1,1}};
        assertTrue(Arrays.deepEquals(expectedsolution, Solution.divideArray(nums, k)));
    }

    @Test
    void unsortedTriplets() {
        int[] nums = {1,7,4,2,7,1,3,4,5,6,7,1,8,9,1};
        int k = 2;
        int[][] expectedsolution = {{1,1,1},{1,2,3},{4,4,5},{6,7,7},{7,8,9}};
        assertTrue(Arrays.deepEquals(expectedsolution, Solution.divideArray(nums, k)));
    }

    @Test
    void unsortedTripletsNoSolution() {
        int[] nums = {1,7,4,2,7,1,3,4,5,6,7,1,8,9,1};
        int k = 1;
        int[][] expectedsolution = {};
        assertTrue(Arrays.deepEquals(expectedsolution, Solution.divideArray(nums, k)));
    }
}

package SquaresOfASortedArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Squares of a Sorted Array
     */
    @Test
    void singleValueArrayZero(){
        int[] nums = {0};
        int[] expectedSolution = {0};
        assertArrayEquals(expectedSolution, Solution.sortedSquares(nums));
    }

    @Test
    void singleValueArrayPositive(){
        int[] nums = {2};
        int[] expectedSolution = {4};
        assertArrayEquals(expectedSolution, Solution.sortedSquares(nums));
    }

    @Test
    void singleValueArrayNegative(){
        int[] nums = {-2};
        int[] expectedSolution = {4};
        assertArrayEquals(expectedSolution, Solution.sortedSquares(nums));
    }

    @Test
    void threeValueArrayPositive(){
        int[] nums = {3,6,9};
        int[] expectedSolution = {9,36,81};
        assertArrayEquals(expectedSolution, Solution.sortedSquares(nums));
    }

    @Test
    void threeValueArrayNegative(){
        int[] nums = {-9,-6,-3};
        int[] expectedSolution = {9,36,81};
        assertArrayEquals(expectedSolution, Solution.sortedSquares(nums));
    }

    @Test
    void threeValueArrayMix(){
        int[] nums = {-3,0,3};
        int[] expectedSolution = {0,9,9};
        assertArrayEquals(expectedSolution, Solution.sortedSquares(nums));
    }

    @Test
    void threeValueArrayOverlapMix(){
        int[] nums = {-4,0,3};
        int[] expectedSolution = {0,9,16};
        assertArrayEquals(expectedSolution, Solution.sortedSquares(nums));
    }

    @Test
    void multiValueArrayOverlapMix(){
        int[] nums = {-100,-67,-34,-22,-21,-14,-5,-2,0,0,5,7,11,14,23,33,45,56,66,68,92,99,101,103};
        int[] expectedSolution = {0,0,4,25,25,49,121,196,196,441,484,529,1089,1156,2025,3136,4356,4489,4624,8464,9801,10000,10201,10609};
        assertArrayEquals(expectedSolution, Solution.sortedSquares(nums));
    }
}

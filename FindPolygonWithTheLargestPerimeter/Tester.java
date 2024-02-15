package FindPolygonWithTheLargestPerimeter;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class Tester {

    
    /*
     * Tests for Find polygon with largest perimeter
     */
    @Test
    void notEnoughValues() {
        int[] nums = {1,1};
        long expectedsolution = -1;
        assertEquals(expectedsolution, Solution.largestPerimeter(nums));
    }

    @Test
    void noSolutionShort() {
        int[] nums = {1,1,3};
        long expectedsolution = -1;
        assertEquals(expectedsolution, Solution.largestPerimeter(nums));
    }

    @Test
    void noSolutionShortUnsorted() {
        int[] nums = {1,3,1};
        long expectedsolution = -1;
        assertEquals(expectedsolution, Solution.largestPerimeter(nums));
    }

    @Test
    void noSolutionLong() {
        int[] nums = {1, 32, 2, 8, 256, 128, 16, 64, 4};
        long expectedsolution = -1;
        assertEquals(expectedsolution, Solution.largestPerimeter(nums));
    }

    @Test
    void oneSolutionLong() {
        int[] nums = {1, 32, 3, 8, 256, 128, 16, 64, 3};
        long expectedsolution = 7;
        assertEquals(expectedsolution, Solution.largestPerimeter(nums));
    }

    @Test
    void maximalSolution() {
        int[] nums = {1, 32, 3, 8, 256, 130, 16, 64, 3};
        long expectedsolution = 513;
        assertEquals(expectedsolution, Solution.largestPerimeter(nums));
    }
}

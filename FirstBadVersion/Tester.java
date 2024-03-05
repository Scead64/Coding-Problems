package FirstBadVersion;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for First Bad Version
     */
    @Test
    void testOneVersion() {
        int nums[] = {-1};
        int expectedSolution = 1;
        Solution.setVersions(nums);
        assertEquals(expectedSolution, Solution.firstBadVersion(nums.length));
    }

    @Test
    void testManyVersionsAllBad() {
        int nums[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int expectedSolution = 1;
        Solution.setVersions(nums);
        assertEquals(expectedSolution, Solution.firstBadVersion(nums.length));
    }

    @Test
    void testManyVersionsOneGood() {
        int nums[] = {0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int expectedSolution = 2;
        Solution.setVersions(nums);
        assertEquals(expectedSolution, Solution.firstBadVersion(nums.length));
    }

    @Test
    void testManyVersionsMiddleGood() {
        int nums[] = {0,0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int expectedSolution = 11;
        Solution.setVersions(nums);
        assertEquals(expectedSolution, Solution.firstBadVersion(nums.length));
    }

    @Test
    void testManyVersionsMiddleLeftGood() {
        int nums[] = {0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int expectedSolution = 10;
        Solution.setVersions(nums);
        assertEquals(expectedSolution, Solution.firstBadVersion(nums.length));
    }

    @Test
    void testManyVersionsMiddleRightGood() {
        int nums[] = {0,0,0,0,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int expectedSolution = 12;
        Solution.setVersions(nums);
        assertEquals(expectedSolution, Solution.firstBadVersion(nums.length));
    }

    @Test
    void testManyVersionsLastBad() {
        int nums[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1};
        int expectedSolution = nums.length;
        Solution.setVersions(nums);
        assertEquals(expectedSolution, Solution.firstBadVersion(nums.length));
    }
}

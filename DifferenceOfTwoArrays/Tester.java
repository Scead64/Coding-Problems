package DifferenceOfTwoArrays;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Difference of Two Arrays
     */
    @Test
    void testNoDifference() {
        int[] n1 = {1,2,3};
        int[] n2 = {1,2,3};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList());
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList());
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }

    @Test
    void testDuplicateNoDifference() {
        int[] n1 = {1,1,2,3,3,3,3};
        int[] n2 = {1,1,1,2,2,2,3};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList());
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList());
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }

    @Test
    void testDuplicateVaryingLengthNoDifference() {
        int[] n1 = {1,1,2,3,3,3,3,4,4,6,7,7,8};
        int[] n2 = {1,1,1,2,2,2,3,4,4,4,4,6,6,7,7,8};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList());
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList());
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }

    @Test
    void testAllDifferent() {
        int[] n1 = {1,2,3};
        int[] n2 = {4,5,6};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }

    @Test
    void testDuplicateAllDifferent() {
        int[] n1 = {1,1,1,2,3,3,3,3};
        int[] n2 = {4,5,5,5,6,6,6,6};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }

    @Test
    void testDuplicateVaryingLengthAllDifferent() {
        int[] n1 = {1,1,1,2,3,3,3,3,2,3,2,1,2,3,2};
        int[] n2 = {4,5,5,5,6,6,6,6};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }

    @Test
    void testSomeifference() {
        int[] n1 = {1,2,3};
        int[] n2 = {3,4,5};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList(4,5));
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }

    @Test
    void testDuplicateSomeifference() {
        int[] n1 = {1,1,1,2,3,3,3,3};
        int[] n2 = {3,3,4,4,5,5,5,5};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList(4,5));
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }

    @Test
    void testDuplicateVaryingLengthSomeifference() {
        int[] n1 = {1,1,1,2,3,3};
        int[] n2 = {3,3,4,4,5,5,4,3,4,5,5,5};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans1 = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> ans2 = new ArrayList<Integer>(Arrays.asList(4,5));
        expectedAnswer.add(ans1);
        expectedAnswer.add(ans2);
        assertEquals(expectedAnswer, Solution.findDifference(n1, n2));
    }
    
}

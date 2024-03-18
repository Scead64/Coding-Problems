package ConvertAnArrayIntoA2DArray;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Convert an Array into a 2D Array
     */
    @Test
    void testSingleNumber() {
        int[] nums = {1};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        assertEquals(expectedAnswer, Solution.findMatrix(nums));
    }

    @Test
    void testTwoNumbersNoDuplicates() {
        int[] nums = {1,2};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        assertEquals(expectedAnswer, Solution.findMatrix(nums));
    }

    @Test
    void testTwoNumbersDuplicates() {
        int[] nums = {1,1};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        assertEquals(expectedAnswer, Solution.findMatrix(nums));
    }

    @Test
    void testManyNumbersNoDuplicates() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)));
        assertEquals(expectedAnswer, Solution.findMatrix(nums));
    }

    @Test
    void testManyNumbersAllDuplicates() {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        assertEquals(expectedAnswer, Solution.findMatrix(nums));
    }

    @Test
    void testManyNumbersSomeDuplicates() {
        int[] nums = {1,2,3,1,2,1,2,3,4,1,5,6,1,3,4};
        List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        expectedAnswer.add(new ArrayList<Integer>(Arrays.asList(1)));
        assertEquals(expectedAnswer, Solution.findMatrix(nums));
    }
}

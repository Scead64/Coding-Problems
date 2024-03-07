package SequentialDigits;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Sequential Digits
     */
    @Test
    void noSequentialInRangeLowHighEqual() {
        int low = 10, high = low;
        List<Integer> expectedSolution = new ArrayList<Integer>();
        assertEquals(expectedSolution, Solution.sequentialDigits(low, high));
    }

    @Test
    void noSequentialInRangeLowHighDifferent() {
        int low = 124, high = 232;
        List<Integer> expectedSolution = new ArrayList<Integer>();
        assertEquals(expectedSolution, Solution.sequentialDigits(low, high));
    }

    @Test
    void oneSequentialInRangeLowHighEqual() {
        int low = 123, high = low;
        List<Integer> expectedSolution = new ArrayList<Integer>(Arrays.asList(123));
        assertEquals(expectedSolution, Solution.sequentialDigits(low, high));
    }

    @Test
    void oneSequentialInRangeLowHighDifferent() {
        int low = 100, high = 200;
        List<Integer> expectedSolution = new ArrayList<Integer>(Arrays.asList(123));
        assertEquals(expectedSolution, Solution.sequentialDigits(low, high));
    }

    @Test
    void twoSequentialInRange() {
        int low = 100, high = 300;
        List<Integer> expectedSolution = new ArrayList<Integer>(Arrays.asList(123, 234));
        assertEquals(expectedSolution, Solution.sequentialDigits(low, high));
    }

    @Test
    void twoSequentialInRangeDifferentNumDigits() {
        int low = 700, high = 2000;
        List<Integer> expectedSolution = new ArrayList<Integer>(Arrays.asList(789, 1234));
        assertEquals(expectedSolution, Solution.sequentialDigits(low, high));
    }

    @Test
    void allSequentialInRange() {
        int low = 10, high = 1000000000;
        List<Integer> expectedSolution = new ArrayList<Integer>(Arrays.asList(12,23,34,45,56,67,78,89,123,234,345,456,567,678,789,1234,2345,3456,4567,5678,6789,12345,23456,34567,45678,56789,123456,234567,345678,456789,1234567,2345678,3456789,12345678,23456789,123456789));
        assertEquals(expectedSolution, Solution.sequentialDigits(low, high));
    }
}

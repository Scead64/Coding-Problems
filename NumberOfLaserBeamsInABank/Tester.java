package NumberOfLaserBeamsInABank;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Number of Laser beams in a Bank
     */
    @Test
    void singleEmptyRow() {
        String[] bank = {"00000000"};
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void singleFullRow() {
        String[] bank = {"11111111"};
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void singlePartlyFullRow() {
        String[] bank = {"01110110"};
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void twoEmptyRows() {
        String[] bank = {"000", "000"};
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void twoFullRows() {
        String[] bank = {"111", "111"};
        int expectedSolution = 9;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void twoPartlyFullRows() {
        String[] bank = {"101", "100"};
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void threeEmptyRows() {
        String[] bank = {"000", "000", "000"};
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void threeFullRows() {
        String[] bank = {"111", "111", "111"};
        int expectedSolution = 18;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void threePartlyFullRows() {
        String[] bank = {"101", "100", "011"};
        int expectedSolution = 4;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void TwoFullRowsOneEmpty() {
        String[] bank = {"111", "000", "111"};
        int expectedSolution = 9;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }

    @Test
    void manypartlyFullRowsSeparatedByEmpty() {
        String[] bank = {"101", "000", "110", "000", "111", "000", "000", "111"};
        int expectedSolution = 19;
        assertEquals(expectedSolution, Solution.numberOfBeams(bank));
    }
}

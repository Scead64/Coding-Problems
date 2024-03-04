package BagOfTokens;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Bag of Tokens
     */
    @Test
    void singleTooLargeToken() {
        int[] tokens = {200};
        int power = 100;
        int expectedSolution = 0;
        assertEquals(expectedSolution, Solution.bagOfTokensScore(tokens, power));
    }

    @Test
    void singleSmallToken() {
        int[] tokens = {50};
        int power = 100;
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.bagOfTokensScore(tokens, power));
    }

    @Test
    void TwoSmallAndLargeToken() {
        int[] tokens = {200, 100};
        int power = 100;
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.bagOfTokensScore(tokens, power));
    }

    @Test
    void TwoSmallTokensNoReplenish() {
        int[] tokens = {50, 100};
        int power = 200;
        int expectedSolution = 2;
        assertEquals(expectedSolution, Solution.bagOfTokensScore(tokens, power));
    }

    @Test
    void ThreeSmallTokensReplenish() {
        int[] tokens = {100, 200, 300};
        int power = 200;
        int expectedSolution = 1;
        assertEquals(expectedSolution, Solution.bagOfTokensScore(tokens, power));
    }

    @Test
    void LargeListOfTokens() {
        int[] tokens = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1500, 2000, 60000, 10000000};
        int power = 100;
        int expectedSolution = 12;
        assertEquals(expectedSolution, Solution.bagOfTokensScore(tokens, power));
    }
}

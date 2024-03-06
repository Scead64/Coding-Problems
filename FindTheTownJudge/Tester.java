package FindTheTownJudge;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests Find the Town Judge
     */
    @Test
    void testSinglePerson() {
        int numPeople = 1;
        int[][] trust = new int[0][2];
        int expectedsolution = 1;
        assertEquals(expectedsolution, Solution.findJudge(numPeople, trust));
    }

    @Test
    void twoPeopleHasJudge() {
        int numPeople = 2;
        int[][] trust = {
            {1,2}
        };
        int expectedsolution = 2;
        assertEquals(expectedsolution, Solution.findJudge(numPeople, trust));
    }

    @Test
    void twoPeopleNoJudge() {
        int numPeople = 2;
        int[][] trust = {
            {1,2},
            {2,1}
        };
        int expectedsolution = -1;
        assertEquals(expectedsolution, Solution.findJudge(numPeople, trust));
    }

    @Test
    void multiplePeopleAllTrustHasJudge() {
        int numPeople = 10;
        int[][] trust = {
            {1,2},
            {2,3},
            {3,4},
            {4,5},
            {5,6},
            {6,7},
            {7,8},
            {8,9},
            {9,10},
            {1,3},
            {2,4},
            {3,5},
            {4,6},
            {5,7},
            {6,8},
            {7,9},
            {8,10},
            {9,1},
            {1,4},
            {2,5},
            {3,6},
            {4,7},
            {5,8},
            {6,9},
            {7,10},
            {8,1},
            {9,2},
            {1,5},
            {2,6},
            {3,7},
            {4,8},
            {5,9},
            {6,10},
            {7,1},
            {8,2},
            {9,3},
            {1,6},
            {2,7},
            {3,8},
            {4,9},
            {5,10},
            {6,1},
            {7,2},
            {8,3},
            {9,4},
            {1,7},
            {2,8},
            {3,9},
            {4,10},
            {5,1},
            {6,2},
            {7,3},
            {8,4},
            {9,5},
            {1,8},
            {2,9},
            {3,10},
            {4,1},
            {5,2},
            {6,3},
            {7,4},
            {8,5},
            {9,6},
            {1,9},
            {2,10},
            {3,1},
            {4,2},
            {5,3},
            {6,4},
            {7,5},
            {8,6},
            {9,7},
            {1,10},
            {2,1},
            {3,2},
            {4,3},
            {5,4},
            {6,5},
            {7,6},
            {8,7},
            {9,8}
        };
        int expectedsolution = 10;
        assertEquals(expectedsolution, Solution.findJudge(numPeople, trust));
    }

    @Test
    void multiplePeopleAllTrustTwoJudgeCandidates() {
        int numPeople = 10;
        int[][] trust = {
            {1,2},
            {2,3},
            {3,4},
            {4,5},
            {5,6},
            {6,7},
            {7,8},
            {8,9},
            {1,3},
            {2,4},
            {3,5},
            {4,6},
            {5,7},
            {6,8},
            {7,9},
            {8,10},
            {1,4},
            {2,5},
            {3,6},
            {4,7},
            {5,8},
            {6,9},
            {7,10},
            {8,1},
            {1,5},
            {2,6},
            {3,7},
            {4,8},
            {5,9},
            {6,10},
            {7,1},
            {8,2},
            {1,6},
            {2,7},
            {3,8},
            {4,9},
            {5,10},
            {6,1},
            {7,2},
            {8,3},
            {1,7},
            {2,8},
            {3,9},
            {4,10},
            {5,1},
            {6,2},
            {7,3},
            {8,4},
            {1,8},
            {2,9},
            {3,10},
            {4,1},
            {5,2},
            {6,3},
            {7,4},
            {8,5},
            {1,9},
            {2,10},
            {3,1},
            {4,2},
            {5,3},
            {6,4},
            {7,5},
            {8,6},
            {1,10},
            {2,1},
            {3,2},
            {4,3},
            {5,4},
            {6,5},
            {7,6},
            {8,7},
            {9,10}
        };
        int expectedsolution = 10;
        assertEquals(expectedsolution, Solution.findJudge(numPeople, trust));
    }

    @Test
    void multiplePeopleAllTrustTwoJudgeCandidatesNoJudge() {
        int numPeople = 10;
        int[][] trust = {
            {1,2},
            {2,3},
            {3,4},
            {4,5},
            {5,6},
            {6,7},
            {7,8},
            {8,9},
            {1,3},
            {2,4},
            {3,5},
            {4,6},
            {5,7},
            {6,8},
            {7,9},
            {8,10},
            {1,4},
            {2,5},
            {3,6},
            {4,7},
            {5,8},
            {6,9},
            {7,10},
            {8,1},
            {1,5},
            {2,6},
            {3,7},
            {4,8},
            {5,9},
            {6,10},
            {7,1},
            {8,2},
            {1,6},
            {2,7},
            {3,8},
            {4,9},
            {5,10},
            {6,1},
            {7,2},
            {8,3},
            {1,7},
            {2,8},
            {3,9},
            {4,10},
            {5,1},
            {6,2},
            {7,3},
            {8,4},
            {1,8},
            {2,9},
            {3,10},
            {4,1},
            {5,2},
            {6,3},
            {7,4},
            {8,5},
            {1,9},
            {2,10},
            {3,1},
            {4,2},
            {5,3},
            {6,4},
            {7,5},
            {8,6},
            {1,10},
            {2,1},
            {3,2},
            {4,3},
            {5,4},
            {6,5},
            {7,6},
            {8,7},
            {9,10},
            {10,9}
        };
        int expectedsolution = -1;
        assertEquals(expectedsolution, Solution.findJudge(numPeople, trust));
    }
}

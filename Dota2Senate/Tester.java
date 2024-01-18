package Dota2Senate;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    public static final String R = "Radiant";
    public static final String D = "Dire";

    /*  
     * Tests for Dota 2 Senate
     */
    @Test
    void testSingleDire() {
        String s = "D";
        assertEquals(D, Solution.predictPartyVictory(s));
    }

    @Test
    void testSingleRadiant() {
        String s = "R";
        assertEquals(R, Solution.predictPartyVictory(s));
    }

    @Test
    void testSimpleDireVictory() {
        String s = "DR";
        assertEquals(D, Solution.predictPartyVictory(s));
    }
    

    @Test
    void testSimpleRadiantVictory() {
        String s = "RD";
        assertEquals(R, Solution.predictPartyVictory(s));
    }
    
    @Test
    void testMultiPassDireVictory() {
        String s = "RDD";
        assertEquals(D, Solution.predictPartyVictory(s));
    }

    @Test
    void testMultiPassRadiantVictory() {
        String s = "DRR";
        assertEquals(R, Solution.predictPartyVictory(s));
    }

    @Test
    void testIntertwineDireVictory() {
        String s = "DRDRDRDRDRDRDRDRDRDRDRDR";
        assertEquals(D, Solution.predictPartyVictory(s));
    }

    @Test
    void testIntertwineRadiantVictory() {
        String s = "RDRDRDRDRDRDRDRDRDRDRDRD";
        assertEquals(R, Solution.predictPartyVictory(s));
    }

    @Test
    void testClumpDireVictory() {
        String s = "DDDDRRRRRRDDDRRR";
        assertEquals(D, Solution.predictPartyVictory(s));
    }

    @Test
    void testClumpRadiantVictory() {
        String s = "RRRRDDDDDDRRRDDD";
        assertEquals(R, Solution.predictPartyVictory(s));
    }
}

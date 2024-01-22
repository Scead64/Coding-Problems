package SubstringWithConcatenationOfAllWords;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Substring with Concatenation of all words
     */
    @Test
    void testOnlyConcatenatedSubstring() {
        String s = "ABCDEF";
        String[] words = {"A","B","C","D","E","F"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList(0));
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }

    @Test
    void testOnlyConcatenatedSubstringDuplicate() {
        String s = "ABCDCEF";
        String[] words = {"A","B","C","C","D","E","F"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList(0));
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }

    @Test
    void testNoConcatenatedSubstring() {
        String s = "ABCDEF";
        String[] words = {"HELLO"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList());
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }
    
    @Test
    void testNoConcatenatedSubstring2() {
        String s = "ABCDEF";
        String[] words = {"A","B","C","D","H"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList());
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }

    @Test
    void testOneConcatenatedSubstring() {
        String s = "SHOEBACKRINGTOOBROOTBLUEBOATSHIPYORK";
        String[] words = {"TOOB","BLUE","RING","BOAT","ROOT"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList(8));
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }

    @Test
    void testOneConcatenatedSubstringDuplicate() {
        String s = "SHOEBACKRINGBLUETOOBBLUEBOATSHIPYORK";
        String[] words = {"TOOB","BLUE","BLUE"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList(12));
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }

    @Test
    void testMultipleConcatenatedSubstring() {
        String s = "SHOEBACKRINGTOOBBLUERINGTOOBBOATSHIPYORK";
        String[] words = {"TOOB","BLUE","RING"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList(8,12,16));
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }

    @Test
    void testMultipleConcatenatedSubstring2() {
        String s = "RINGTOOBSTOPRINGTOOBBLUERINGSHIPYORK";
        String[] words = {"TOOB","BLUE","RING"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList(12,16));
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }

    @Test
    void testMultipleConcatenatedSubstringDuplicate() {
        String s = "RINGTOOBSTOPRINGRINGRINGTOOBBLUERINGRINGRINGSHIPYORK";
        String[] words = {"TOOB","BLUE","RING", "RING"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList(16,20,24));
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }

    @Test
    void testInterwevedConcatenatedSubstring() {
        String s = "ABCBABCABCBABCAB";
        String[] words = {"ABC","BAB","CAB"};
        List<Integer> expectedAnswer = new ArrayList<Integer>(Arrays.asList(0,7));
        assertEquals(expectedAnswer, Solution.findSubstring(s, words));
    }
}

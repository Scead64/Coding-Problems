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

    
}

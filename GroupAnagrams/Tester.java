package GroupAnagrams;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Group Anagrams
     */
    @Test
    void testOneEmptyString() {
        String[] strs = {""};
        List<List<String>> expectedAnswer = new ArrayList<>();
        ArrayList<String> ans1 = new ArrayList<>(Arrays.asList(""));
        expectedAnswer.add(ans1);
        assertEquals(expectedAnswer, Solution.groupAnagrams(strs));
    }
    
    @Test
    void testManyEmptyString() {
        String[] strs = {"","","","","","","","","","","","","","","","","","","","","","","",""};
        List<List<String>> expectedAnswer = new ArrayList<>();
        ArrayList<String> ans1 = new ArrayList<>(Arrays.asList("","","","","","","","","","","","","","","","","","","","","","","",""));
        expectedAnswer.add(ans1);
        assertEquals(expectedAnswer, Solution.groupAnagrams(strs));
    }

    @Test
    void testOneString() {
        String[] strs = {"bat"};
        List<List<String>> expectedAnswer = new ArrayList<>();
        ArrayList<String> ans1 = new ArrayList<>(Arrays.asList("bat"));
        expectedAnswer.add(ans1);
        assertEquals(expectedAnswer, Solution.groupAnagrams(strs));
    }

    @Test
    void testTwoStringsNoAnagram() {
        String[] strs = {"bat","cat"};
        List<List<String>> expectedAnswer = new ArrayList<>();
        expectedAnswer.add(new ArrayList<>(Arrays.asList("bat")));
        expectedAnswer.add(new ArrayList<>(Arrays.asList("cat")));
        assertEquals(expectedAnswer, Solution.groupAnagrams(strs));
    }

    @Test
    void testTwoStringsAnagram() {
        String[] strs = {"bat","tab"};
        List<List<String>> expectedAnswer = new ArrayList<>();
        expectedAnswer.add(new ArrayList<>(Arrays.asList("bat", "tab")));
        assertEquals(expectedAnswer, Solution.groupAnagrams(strs));
    }
}

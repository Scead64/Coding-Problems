package FindFirstPalindromicStringInArray;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tester {

    /*
     * Tests for Find First Palindromic String in Array
     */
    @Test
    void testSingleWordPalindromic() {
        String[] words = {"racecar"};
        String expectedSolution = "racecar";
        assertEquals(expectedSolution, Solution.firstPalindrome(words));
    }

    @Test
    void testSingleWordNotPalindromic() {
        String[] words = {"raceca"};
        String expectedSolution = "";
        assertEquals(expectedSolution, Solution.firstPalindrome(words));
    }

    @Test
    void testManyWordsNotPalindromic() {
        String[] words = {"happy","sad","mad","excited","elated","depressed","nonchalant"};
        String expectedSolution = "";
        assertEquals(expectedSolution, Solution.firstPalindrome(words));
    }

    @Test
    void testManyWordsOnePalindromic() {
        String[] words = {"happy","sad","mad","excited","elated","eyeeye","depressed","nonchalant"};
        String expectedSolution = "eyeeye";
        assertEquals(expectedSolution, Solution.firstPalindrome(words));
    }

    @Test
    void testManyWordsManyPalindromic() {
        String[] words = {"happy","sad","retter","mad","excited","elated","racecar","depressed","nonchalant","eyeeye"};
        String expectedSolution = "retter";
        assertEquals(expectedSolution, Solution.firstPalindrome(words));
    }
}

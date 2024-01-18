package ValidPalindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Tester {

    /*  
     * Tests for Valid Palindrome
     */
    @Test
    void testSingleCharacter() {
        String s = "D";
        assertTrue(Solution.isPalindrome(s));
    }

    @Test
    void testNoCharacter() {
        String s = "";
        assertTrue(Solution.isPalindrome(s));
    }

    @Test
    void testSimpleFalse() {
        String s = "DR";
        assertFalse(Solution.isPalindrome(s));
    }
    

    @Test
    void testSimpleTrue() {
        String s = "RDR";
        assertTrue(Solution.isPalindrome(s));
    }
    
    @Test
    void testNonAlphanumericTrue() {
        String s = "A- B C $#D&^ C B %A";
        assertTrue(Solution.isPalindrome(s));
    }

    @Test
    void testNonAlphanumericFalse() {
        String s = "A--B*$&%CD=++=B**&A";
        assertFalse(Solution.isPalindrome(s));
    }

    @Test
    void testOnlyNonAlphaNumeric() {
        String s = ")$& )$&)$#& )(&@)(%&)#&_#(!@&%()_!#&%(_&@))";
        //Program should interpret this as ""
        assertTrue(Solution.isPalindrome(s));
    }
}

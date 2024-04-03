package CustomSortString;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class Tester {

    public static String stringStrip(String order, String s){
        int index = 0;
        HashSet<Character> letterSet = new HashSet<>();
        for(int i = 0; i < order.length(); i++){
            letterSet.add(order.charAt(i));
        }
        while(index < s.length()){
            if(!letterSet.contains(s.charAt(index))){
                if(index == 0){
                    s = s.substring(1);
                } else {
                    s = s.substring(0, index) + s.substring(index+1);
                }
            } else {
                index++;
            }
        }
        return s;
    }


    /*
     * Tests for Custom Sort String
     */
    @Test
    void testSingleSameCharacter() {
        String s = "a";
        String order = "a";
        String expectedSolution = "a";
        assertEquals(expectedSolution, stringStrip(order, Solution.customSortString(order, s)));
    }

    @Test
    void testSingleDifferentCharacter() {
        String s = "a";
        String order = "b";
        String expectedSolution = "";
        assertEquals(expectedSolution, stringStrip(order, Solution.customSortString(order, s)));
    }

    @Test
    void testTwoCharactersInOrder() {
        String s = "ab";
        String order = "a";
        String expectedSolution = "a";
        assertEquals(expectedSolution, stringStrip(order, Solution.customSortString(order, s)));
    }

    @Test
    void testTwoCharactersOutOfOrder() {
        String s = "ab";
        String order = "b";
        String expectedSolution = "b";
        assertEquals(expectedSolution, stringStrip(order, Solution.customSortString(order, s)));
    }

    @Test
    void testOrderLonger() {
        String s = "abcde";
        String order = "edcbafghijl";
        String expectedSolution = "edcba";
        assertEquals(expectedSolution, stringStrip(order, Solution.customSortString(order, s)));
    }
}

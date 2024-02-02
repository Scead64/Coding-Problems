package ZigZagConversion;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * In the ZigZag pattern, we can define the pattern as a column of size numRows and diagonal line to the next column of size numRows-2.
     * In this pattern, within the same row, letters appear by offsets of 2 when diagonals are present.
     * For Example, given numRows = 3, the letters in rows 1 and 2 appear by offsets of 4 as they have no diagonal letters to account for, and the pattern is of size 4.
     *      Row 2, however, repeats letters by offsets of 2 per each diagonal.
     * Given numRows = 4, the pattern is of size 6 and the top and bottom row offset accordingly.
     *      Row 2, however, has a letter at every 4th and 2nd position, oscillating through the pattern.
     *      Row 3 oscillates in the opposite direction containting a letter at every 2nd and 4th position.
     * Using th
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the length of the string, as the worst case is the string is a palindrome and each character is parsed through
     *      
     * - Space complexity:
     *      O(1)
    */
    public static String convert(String s, int numRows) {
        int numLettersPerPattern = numRows;
        if(numRows > 2){
            numLettersPerPattern += numRows-2;
        }
        int offset = 0;
        String ans = "";
        for(int i = 0; i < numRows; i++){
            offset = numLettersPerPattern - i*2;
            if(offset == 0){
                offset = numLettersPerPattern;
            }
            int j = i;
            while(j < s.length()){
                ans+=s.charAt(j);
                j += offset;
                if(offset != numLettersPerPattern){
                    offset = numLettersPerPattern - offset;
                }
            }
        }
        return ans;
    }


    public static void main(String args[]){
        String test = "abcdefghi";
        System.out.println(convert(test, 4));
    }
}

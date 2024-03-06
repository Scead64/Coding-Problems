package MaximumOddBinaryNumber;

public class Solution {

    /**
     * This problem is simplified when considering what makes a binary number odd.
     * The only case of an odd binary number is a 1 in the One's place, as a one in any other palce denotes a power of 2 beyond 0, which are all even.
     * 
     * Keeping that in mind, the maximum odd number constructable from rearranging a given binary is one that has a "1" in the ones place, and places the ohter ones in the biggest places possible.
     * i.e. a binary with greater than one '1's will look like 1....0....1
     * Or, in the case where there is a single 1, 0?....1
     * 
     * The solution then, counts the number of '1's, and constructs the answer given the previous statements.
     * 
     * Complexity
     * - Time complexity:
     *      O(n) 
     *      Where n is the number of characters in s, which we iterate over twice.
     * - Space complexity:
     *      O(n)
     *      As we construct a String of the same size as s
    */
    public static String maximumOddBinaryNumber(String s) {
        int numOnes = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                numOnes++;
            }
        }
        String ans = "";
        while(numOnes > 1){
            ans+="1";
            numOnes--;
        }
        while(ans.length() < s.length() - 1){
            ans+="0";
        }
        return ans + "1";
    }


    public static void main(String args[]){
        String binary = "010";
        System.out.println(maximumOddBinaryNumber(binary));
    }
}

package LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    
    /** 
     * My solution is a basic loop approach.
     * I first find longest substring starting at position 0 that has no repeating characters. Once I find that, I record the length, 
     * and subtract letters from the start of the sequence until I get rid of the repeating character.
     * This process is repeated until the end of the substring is reached, upon which I return the max of my current recorded length and the length of the current substring.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the length of the string s
     * - Space complexity:
     *      O(n)
     *      as I may potentially store the whole string
    */
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String sub = "";
        for(int i = 0; i < s.length(); i++){
            String c = s.substring(i, i+1);

            if(sub.contains(c)){
                maxLength = Math.max(maxLength, sub.length());
                sub = sub.substring(sub.indexOf(c) + 1);
            }

            sub+= c;
        }
        int max = Math.max(maxLength, sub.length());
        System.out.print(max);
        return max;
    }

    public static void main(String args[]){
        String test = "abcbababababababcd";
        lengthOfLongestSubstring(test);
    }
}

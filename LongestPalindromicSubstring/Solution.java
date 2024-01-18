package LongestPalindromicSubstring;

public class Solution {
    
    /** 
     * My solution is a basic loop approach.
     * I have two looping variables - i & k - which I treat as "left" and "right" markers respectively.
     * The character at position i is chosen as the left "starting" character, and the second loop using j searches for the same letter later in the string.
     *      If the letter is in the string at a later position, it gets assigned as the right position via k, and then the substring between those two positions is compared.
     *          If the substring is a palindrome, it gets compared against the current answer and the longest substring is set as ans.
     *          If the substring is not a palindrome, the third loop is exited and the second loop continues.
     *      If the letter is not in the substring at a later position, or if the loop finishes, i is incremented.
     * 
     * Complexity
     * - Time complexity:
     *      O(n^3)
     *      Where n is the length of the string s
     *      The high complexity is due to 3 loops,
     *      In the worst case, in a string of repeat characters, I loop through each character several times in each loop
     * - Space complexity:
     *      O(n)
     *      as I may potentially store the whole string
    */
    public static String longestPalindrome(String s) {
        
        String ans = "";
        char start;
        for(int i = 0; ans.length() < (s.length() - i); i++){
            start = s.charAt(i);
            for(int j = s.length() - 1; ans.length() <= (j - i); j--){
                if(s.charAt(j) == start){
                    boolean isPal = true;
                    for(int k = 0; k <= j-i; k++){
                        if(s.charAt(i+k) != s.charAt(j-k)){
                            isPal = false;
                            break;
                        }
                    }
                    if(isPal && j-i+1 > ans.length()){
                        ans = s.substring(i, j+1);
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String args[]){
        String test = "aaaaaba";
        System.out.println(longestPalindrome(test));
    }
}

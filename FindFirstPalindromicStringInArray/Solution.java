package FindFirstPalindromicStringInArray;

public class Solution {
    
    /** 
     * To determine if a word is a palindrome, the simplest method is to iterate over half the word with two pointers.
     * The first pointer is set at the start of the word and the second at the end.
     * You then compare if the letters are equal, and if they are, you advance each pointer one step towards the center of the word.
     *      If the pointers ever don't point to the same kind of letter, the word is not a palindrome and the loop can be broken our of early
     *      If you exit the loop without breaking due to the previous condition, the word is a palindrome
     *
     * To get the first palindrome, we iterate through the array checking each word based on the above method until we find a word that passes.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the number of words in the array
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */
    public static String firstPalindrome(String[] words) {
        for(String str : words){
            boolean isPalindrome = true;
            for(int i = 0; i < str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-(i+1))){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome){
                return str;
            }
        }
        return "";
    }


    public static void main(String args[]){
        String[] words = {"abc", "happy", "lpl", "racecar"};
        System.out.println(firstPalindrome(words));
    }
}

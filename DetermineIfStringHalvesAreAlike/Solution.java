package DetermineIfStringHalvesAreAlike;

import java.util.HashSet;

public class Solution {

    /***SOLUTION***
     *
     * To quickly count the number of vowels on each side of the string, we can covert the list of vowels to a set and check against the set.
     * After iterating through the string and counting the number of vowels on each side, 
     * we can return true if the numbers are equal, or false otherwise.
     * 
     * Complexity
     * - Time complexity:
     *      O(n) 
     *      Where n is the length of the string s
     * - Space complexity:
     *      O(1)
     *      As though we store the vowels as a set, the set size is constant
    */
    public static boolean halvesAreAlike(String s) {
        int numVowelsLeft = 0, numVowelsRight = 0;
        HashSet<Character> vowelSet = new HashSet<Character>();
        final String VOWELS = "aeiouAEIOU";
        for(int i = 0; i < VOWELS.length(); i++){
            vowelSet.add(VOWELS.charAt(i));
        }

        for(int j = 0; j < s.length()/2; j++){
            if(vowelSet.contains(s.charAt(j))){
                numVowelsLeft++;
            }

            if(vowelSet.contains(s.charAt(s.length() - j - 1))){
                numVowelsRight++;
            }
        }

        return (numVowelsLeft == numVowelsRight)? true:false;
    }

    public static void main(String args[]){
        String s = "abcdeedcba";
        System.out.println(halvesAreAlike(s));
    }
}

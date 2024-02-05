package FirstUniqueCharacterInAString;

import java.util.HashSet;

public class Solution {
    
    /** 
     * My solution is a basic loop approach.
     * I have a first pass loop that utilizes two HashSets - one to store unique characters in the string, and another to account for duplicates.
     * The first pass loop fills these sets.
     * 
     * The second pass loop searches for the first character in the string that isn't in duplicates. 
     * If it find one, it immediately returns the index. 
     * If it finds none, the method returns -1 upon exiting the loop.
     * 
     * NOTE: This is not the absolute optimal solution for this given problem. A better solution, given the constrained nature of s, would just be to iterate through letters.
     * That solution would take less time, but this solution is little better as a general purpose.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the length of the string s, which in the worst case, is only iterated through twice.
     *      Searching the hashsets takes constant time, which makes this rather fast.
     * - Space complexity:
     *      O(n)
     *      as I may potentially store the whole string
    */
    public static int firstUniqChar(String s) {
        HashSet<Character> chars = new HashSet<Character>();
        HashSet<Character> duplicates = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
            if(chars.contains(s.charAt(i))){
                duplicates.add(s.charAt(i));
            } else {
                chars.add(s.charAt(i));
            }
        }

        for(int j = 0; j < s.length(); j++){
            if(!duplicates.contains(s.charAt(j))){
                return j;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        String test = "aaaaaba";
        System.out.println(firstUniqChar(test));
    }
}

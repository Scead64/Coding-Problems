package MinimumLengthOfStringAfterDeletingSimilarEnds;


public class Solution {
    
    /***PROBLEM INTUITION***
     * The inuitive solution to this problem is the greedy one by necessity.
     * That is, if at both ends of the string, each end has the same character 'a' but a variable amount of it consecutively,
     * the proper solution would be to remove letters at each end until a new character is reached.
     * 
     * If the "maximal" amount of letters was not removed, and we reached a new letter at one end without getting rid of all of the previous letters on the other end, we would be stuck.
     * Take the example:
     *      aaaabbcbbbaa
     * If we remove two 'a's at each end, we would get:
     *      aabbcbbb
     * Which will make us stuck since we now have an 'a' on one end and a 'b' at the other.
     * Instead, we should remove the maximal amount:
     *      bbcbbb
     *      c
     * As we need to reach a new letter on each end to compare.
     * 
     * 
     ***SOLUTION*** 
     * 
     * My solution is a basic loop and window approach.
     * Before entering the loop, I intialize variables for my window - low and high - as well as a char to keep track of my current check.
     * Then, as long as the characters at the start and end of the window are the same, and the window is of length 2 or greater, I shrink the window maximally.
     * That is, I move the window at each end so that any characters that are equal to c at the ends are removed.
     * I then reset c to its new value, which is one of the new end characters, and loop.
     * 
     * After exiting the loop, I return the length of my window.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the length of the string s, which in the worst case, is iterated through completely
     * - Space complexity:
     *      O(1)
     *      As I store no variable amount of information.
    */
    public static int minimumLength(String s) {
        int low = 0, high = s.length()-1;
        char c = s.charAt(low);
        while(high > low && c == s.charAt(high)){
            while(high > low+1 && c == s.charAt(high-1)){
                high--;
            }
            while(low < high-1 && c == s.charAt(low+1)){
                low++;
            }

            high--;
            low++;
            c = s.charAt(low);
        }
        return high - low + 1;
    }


    public static void main(String args[]){
        String test = "aaaaaba";
        System.out.println(minimumLength(test));
    }
}

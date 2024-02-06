package MinimumWindowSubstring;

import java.util.HashMap;

public class Solution {
    
    /** 
     * This solution relies on storing the various characters in t in a hashmap. This helps in accounting for duplicate letters of t found in s.
     * The characters are stored alongside the number of times they appear inside t, and we incremenet/decrement this value based on finding it in s and adding/removing it from our window.
     * If we decrement past 0, that means there are more instances of a letter than necessary for a window.
     * 
     * To make things quicker, I also "reduce" my looping variable (index) so that it starts at the first index in s that has a character in t.
     * 
     * The main while loop works as so:
     *      First, we add the character to our current window (sub). Since index has been reduced, this will always add a viable character on the first iteration.
     *      Then, we check if the current character is in t.
     *          If true, we reduce its representation in the hashmap and check if that is an additional instance of that letter in our window. (check if the count for that letter is greater than or equal to 0).
     *              If true, then our variable keeping track of the number of letters we've used (numLeft) is reduced. We then check if we have a viable window (if numLeft is less than or equal to 0).
     *                  If true, we set the answer window to the minimum length window of our current solution or the one we just found.
     *                  We then add back the first letter in our window to our hashmap, which must mathematically be viable, and we increment numLeft.
     *                  We lastly reduce our window, removing any letters at the start that aren't viable or are extra viable letters (hashmap has negative instances of that letter).
     *          If false, we check if it is duplicate with our first character in the window.
     *              If true, we reset the count of that letter back +1 and reduce the window as similary described above.
     * 
     * Using this method, we find the shortest window. If we found no window, the empty string is returned.
     * 
     * Complexity
     * - Time complexity:
     *      O(n+m)
     *      Where n is the length of the string t, which we iterate through adding to our hashmap
     *      and m is the length of the string s, which we iterate through once to search for windows.
     *      Looking up values in the hashmap takes constant time, so most of the time is lost be moving the window back and forth.
     *      In the worst case, we at most iterate over m once again fully be reducing the window.
     * - Space complexity:
     *      O(n)
     *      as I store all the characters of t.
    */
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            counts.put(t.charAt(i), counts.containsKey(t.charAt(i))?counts.get(t.charAt(i)) + 1:1);
        }

        int numLeft = t.length();
        int index = 0;
        String window = s + " ";
        String sub = "";
        while (index < s.length() && !counts.containsKey(s.charAt(index))) {
            index++;
        }
        while (index < s.length()) {
            sub += s.substring(index, index + 1);
            char c = s.charAt(index);
            if (counts.containsKey(c)) {
                counts.replace(c, counts.get(c) - 1);
                if (counts.get(c) >= 0) {
                    numLeft--;
                    if (numLeft <= 0) {
                        if (sub.length() < window.length()) {
                            window = sub;
                        }
                        counts.replace(sub.charAt(0), counts.get(sub.charAt(0)) + 1);
                        numLeft++;
                        sub = reduceWindow(sub, counts);
                    }
                } else {
                    // duplicate letter case
                    if (c == sub.charAt(0)) {
                        counts.replace(c, counts.get(c) + 1);
                        sub = reduceWindow(sub, counts);
                    }
                }
            }
            index++;
        }
        return window.length() <= s.length() ? window : "";
    }

    /**
     * 
     * This is a helper method to aid in reducing in windows. It removes all characters at the start of sub that are not viable (not in counts), or extra viable characters.
     * @returns the reduced window.
     * @modifies counts to update counts of removed extra characters
     * 
     */
    public static String reduceWindow(String sub, HashMap<Character, Integer> counts) {
        sub = sub.substring(1);
        while (sub.length() > 0) {
            if (counts.containsKey(sub.charAt(0))) {
                if (counts.get(sub.charAt(0)) >= 0) {
                    break;
                } else {
                    counts.replace(sub.charAt(0), counts.get(sub.charAt(0)) + 1);
                }
            }
            sub = sub.substring(1);
        }
        return sub;
    }


    public static void main(String args[]){
        String test = "aaaaabac", test2 = "bac";
        System.out.println(minWindow(test, test2));
    }
}

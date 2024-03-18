package AssignCookies;

import java.util.Arrays;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * This solution approaches this problem in the greedy way (pun intended)
     * We essentially go through the kids needs and cookies available from greatest to smallest.
     * This way, the kid with the greatest greed gets the biggest available cookie satisfying their need, and the kid and cookie are "removed" from the queue.
     * If we run into a kid with a greed that isn't satisfiable given the remaining cookies, we move to the next kid in the queue.
     * 
     * Complexity
     * - Time complexity:
     *      O(max(nlog(n), mlog(m))
     *      Where n is the size of the array g and m is the size of the array s.
     *      The runtime comes from sorting the two arrays, which is necessary with the greedy approach. 
     *      Hence, the run time is congruent to the time it takes to sort the longer array.
     *       
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex = s.length - 1, kidIndex = g.length-1, numSatisfied = 0;
        while(cookieIndex >= 0 && kidIndex >= 0){
            if(s[cookieIndex] >= g[kidIndex]){
                cookieIndex--;
                numSatisfied++;
            }
            kidIndex--;
        }
        return numSatisfied;
    }


    public static void main(String args[]){
        int[] kids = {1,2,1,4,1,7,1,1};
        int[] cookies = {2,6,7,9,1,1,1,1};
        System.out.println(findContentChildren(kids, cookies));
    }
}

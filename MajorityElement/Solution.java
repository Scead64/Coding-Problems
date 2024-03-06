package MajorityElement;

import java.util.HashMap;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * To keep track of the number of times a number appears in the array, we use a hashmap that is:
     *      indexed by a number, 
     *      and has a value corresponding to the number of times a number has appeared.
     * We then iterate through the array updating our map accordingly.
     * When initializing values in the map, they get set to the length of nums instead of 1, so that, as soon as we find a value that appears more than n/2 times, we return it.
     * This also means that we decrement the value of a num in a map if we find it.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      where n is the number of integers in nums
     *      
     * - Space complexity:
     *      O(n/2)
     *      As we may store at most n/2 unique keys in our map
    */
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int limit = nums.length/2;
        for(int n : nums){
            if(counts.containsKey(n)){
                counts.replace(n, counts.get(n)-1);
            } else {
                counts.put(n, limit);
            }
            if(counts.get(n) == 0){
                return n;
            }
        }
        return 0;
    }


    public static void main(String args[]){
        int[] nums = {1,2,1,4,1,7,1,1};
        System.out.println(majorityElement(nums));
    }
}

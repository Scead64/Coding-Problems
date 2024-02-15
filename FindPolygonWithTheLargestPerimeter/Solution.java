package FindPolygonWithTheLargestPerimeter;

import java.util.Arrays;
public class Solution {
    /*** SOLUTION ***
     * 
     * The simplest answer to this problem is the greedy approach. That involves: 
     *      1. sort the array
     *      2. iterate from back-to-front searching for the first index that follows the property described in the problem description.
     * 
     * While iterating, each time we find a value that is greater-than-or-equal-to our current sum minus the index, we subtract it from our sum and continue iterating.
     * If we ever find an index that is less-than our current sum minus the index, we can immediately return the sum.
     * When (if) we exit the loop, it means there was no viable index and we can return -1.
     * 
     * Complexity
     * - Time complexity:
     *      O(nlog(n))
     *      The time complexity comes from the sort time. Iterating through is comparatively trivial.
     *      
     * - Space complexity:
     *      O(1)
     *      We only store variable for our sum and iteration, which is constant.
     *      We do reconstruct a variable (n) each iteration, but it is recreated each iteration.
    */
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for(int n: nums){
            sum += n;
        }
        for(int i = nums.length-1; i >= 2; i--){
            int n = nums[i];
            if(sum - n > n){
                return sum;
            } else {
                sum-=n;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] n = {1,2,3,4,5,6};
        System.out.println(largestPerimeter(n));
    }
}

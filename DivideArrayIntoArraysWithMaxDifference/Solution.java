package DivideArrayIntoArraysWithMaxDifference;

import java.util.Arrays;
public class Solution {
    /*** SOLUTION ***
     * 
     * The simplest answer to this problem is the greedy approach. That involves: 
     *      1. sort the array
     *      2. iterate through in steps of 3
     * 
     * While iterating, if the largest and smallest indexed numbers have a difference greater than k, there is no solution.
     * Otherwise, we add each triplet into our ans and return it.
     * 
     * Complexity
     * - Time complexity:
     *      O(nlog(n))
     *      The time complexity comes from the sort time. Iterating through is comparatively trivial.
     *      
     * - Space complexity:
     *      O(n)
     *      In a sense, we are just storing the array nums in a different way.
    */
    public static int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length/3][3];
        int index = 0;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i+=3){
            if(nums[i+2] - nums[i] > k){
                return new int[0][0];
            } else {
                ans[index][0] = nums[i];
                ans[index][1] = nums[i+1];
                ans[index][2] = nums[i+2];
            }
            index++;
        }
        return ans;
    }

    public static void main(String args[]){
        int[] n = {1,2,3};
        int k = 2;
        System.out.println(divideArray(n, k));
    }
}

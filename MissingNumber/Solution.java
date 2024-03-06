package MissingNumber;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * Since we know all the numbers in nums are distince and exist in a range, we can simply:
     *      1. Calculate the sum of all numbers by iterating over them
     *      2. Subtracting all numbers that exist in that exist range given
     * Using this process, we will be left with the only number not in nums that exists in sum.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      where n is the number of integers in nums
     *      
     * - Space complexity:
     *      O(1)
     *      As we store no variable amount of information
    */
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for(int n: nums){
            sum+=n;
        }
        for(int i = 0; i <= nums.length; i++){
            sum-=i;
        }
        return sum*-1;
    }


    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,7,8,9};
        System.out.println(missingNumber(nums));
    }
}

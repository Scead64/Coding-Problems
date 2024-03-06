package SquaresOfASortedArray;

import java.util.Arrays;

public class Solution {
    
    /** 
     * Given our initial array is sorted, the trouble in the problem comes from the fact that negative numbers squared are positive.
     * i.e. -6^2 > 5^2
     * 
     * My solution involves a shrinking window where I work backwords from the highest square to the lowest.
     * I begin by setting pointers to keep track of the highest and lowest values in the initial array, as well as my answer array that is of the same size.
     * Then, I compare the squared values at the lowest and highest index and set the highest value in my answer array to the greater square.
     * I then shirnk the window according to the corresponding index.
     * This process continues until I have traversed the whole array.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      As I will always traverse the whole array
     * - Space complexity:
     *      O(n)
     *      As I construct an array of the same size as the given array
    */
    public static int[] sortedSquares(int[] nums) {
        int[] sqrs = new int[nums.length];
        int high = nums.length - 1, low = 0, sqrsIndex = nums.length-1;
        while(sqrsIndex >= 0){
            int highSquare = nums[high]*nums[high], lowSquare = nums[low]*nums[low];
            if(lowSquare > highSquare){
                sqrs[sqrsIndex] = lowSquare;
                low++;
            } else {
                sqrs[sqrsIndex] = highSquare;
                high--;
            }
            sqrsIndex--;
        }
        return sqrs;
    }

    public static void main(String args[]){
        int[] nums = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}

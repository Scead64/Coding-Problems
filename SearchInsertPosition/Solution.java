package SearchInsertPosition;

public class Solution {

    /*** SOLUTION ***
     * 
     * This problem involves binary search, which seeks to search for a value in a sorted array in an efficient manner.
     * It works by invoking a "window" on the array, where is start is at the first value (index 0), and end is at the last value (index length - 1).
     * It then takes the middle value of the window, and compares it to the target. 
     *      If, given the array is sorted, we would expect our target to place before this middle value, we set the end of our window to our middle.
     *      If we would expect the opposite, that is our target would appear afterwords, we set the start of our window to our middle.
     * We then repeat this until our middle is our target, or the window converges on a single value.
     * 
     * For the sake of this problem, we are also interested in figuring out where our target would appear give then array.
     * To figure this out, after performing binary search, we look at our resulting value. If our target is greater, we return the index we found + 1.
     * Otherwise, we return the index we found. This will work in the case our target is equal or less than the value at our index, since if it's less it will push that index "forward".
     * 
     * Complexity
     * - Time complexity:
     *      O(log(n))
     *      Since we divide the problem size by 2 each iteration.
     *      
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */
    public static int searchInsert(int[] nums, int target) {
        int high = nums.length-1, low = 0;
        while(high > low){
            int index = low + (high-low) / 2;
            System.out.println("index: " + index + ", high: " + high + ", low: " + low);
            if(nums[index] > target){
                high = index;
            } else if(nums[index] < target){
                low = index + 1;
            } else {
                return index;
            }
        }
        if(target > nums[high]){
            return high+1;
        } else {
            return high;
        }
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6};
        int target = 3;
        System.out.println(searchInsert(nums, target));
    }
}

package CountElementsWithMaximumFrequency;

import java.util.Arrays;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * We can loop over the array while keeping track of all the information we need by sorting it and iterating with 4 variables:
     *      maxFreq: keeps track of the highest frequenct we have encountered
     *      currFreq: keeps track of the frequency of the current number we are tracking
     *      count: keeps track of the number of occurences of the max frequency
     *      num: keeps track of the current number we are considering
     * 
     * While iterating, we get the number of occurences for each number x we look at.
     *      If x occurs more than the max frequency, we set the max to our current frequency and count to that number.
     *      If x occurs the same amount as the max frequency, we update count.
     *      Otherwise, or after either of the above two, we reset current and advance num.
     * 
     * We repeat the consideration after exiting the loop, as we may enocunter a number that occurs more or the same at the end, and then return our updated info accordingly.
     * 
     * Complexity
     * - Time complexity:
     *      O(nlog(n))
     *      Where n is the number of integers in nums.
     *      The time comes from sorting the array initially
     *      
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */
    public static int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int maxFreq = 1, currFreq = 1, count = 1, num = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == num){
                currFreq++;
            } else {
                if(currFreq > maxFreq){
                    maxFreq = currFreq;
                    count = maxFreq;
                } else if (currFreq == maxFreq){
                    count+= currFreq;
                }
                currFreq = 1;
                num = nums[i];
            }
        }
        if(currFreq > maxFreq){
            return currFreq;
        } else if (currFreq == maxFreq && maxFreq > 1){
            return count + currFreq;
        } else {
            return count;
        }
    }


    public static void main(String args[]){
        int[] nums = {1,2,1,4,3,1,7,3,3};
        System.out.println(maxFrequencyElements(nums));
    }
}

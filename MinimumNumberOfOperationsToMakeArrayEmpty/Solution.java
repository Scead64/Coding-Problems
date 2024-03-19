package MinimumNumberOfOperationsToMakeArrayEmpty;

import java.util.Arrays;

public class Solution {

    public static int[] versions;

    /*** SOLUTION ***
     * 
     * To simplify this problem, suppose for a number n we have m copies.
     * To minimize the number of operations to remove n, we want to maximize our number of remove three operations and minimize our remove twos.
     * Given that, there are a number of cases we can handle:
     *      If n is divisible by 3, we simply only perform remove three operations
     *      If n is not divisible by 3, we check the remainder:
     *          If only 2 copies remain, we perform one removeTwo in addition to any removeThrees
     *          If one copy remains, we retract one removeThree, if possible, and perform two removeTwo operation (1 + 3 = 4; 4-2-2 = 0)
     *              If there was no removeThree operation to retract, then we cannot remove n and we return -1.
     * 
     * To simplify finding the number of copies of n, we can sort the array and make them continguos.
     * Then, we perform the checks detailed above for each n, and return our resulting number of operations.
     * 
     * Complexity
     * - Time complexity:
     *      O(nlog(n))
     *      Since the time to sort dominates the run time.
     *      
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public static int minOperations(int[] nums) {
        Arrays.sort(nums);
        int start = 0, end = 0, operations = 0;
        while(start < nums.length){
            int num = nums[start];
            while(end < nums.length && nums[end] == num){
                end++;
            }
            int copies = end - start;
            int divideThree = copies/3;
            int modThree = copies % 3;
            if(modThree == 0){
                operations+=divideThree;
            } else if(modThree == 2){
                operations+=divideThree + 1;
            } else {
                divideThree--;
                if(divideThree <= 0){
                    if(copies % 2 == 0){
                        operations+=copies/2;
                    } else {
                        return -1;
                    }
                } else {
                    operations+=divideThree + 2;
                }
            }
            start = end;
        }
        return operations;
    }

    public static void main(String args[]){
        int nums[] = {1,1,2,2,2};
        System.out.println(minOperations(nums));
    }
}

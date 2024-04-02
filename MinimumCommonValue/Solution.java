package MinimumCommonValue;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * As we know both arrays are already sorted, we can take an iterative approach to this problem.
     * Starting from the lowest index, and using two looping variables - one for each array respectively -
     * we can compare the values:
     *      If the number at the given index in nums1 is less than the number at nums2's index, we increment nums1's index.
     *      Otherwise, we increment nums2's index.
     * If the two numbers are ever equal, or we iterate through a whole array, we exit the loop.
     * 
     * If the latter case occurred, we return -1.
     * Otherwise, we return the number we found.
     * 
     * Complexity
     * - Time complexity:
     *      O(n + m)
     *      Where n is the number of integers in nums1, and m is the number of integers in nums2
     *      
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */
    public static int getCommon(int[] nums1, int[] nums2) {
        int nums1Index = 0, nums2Index = 0;
        while((nums1Index < nums1.length) && (nums2Index < nums2.length) && (nums1[nums1Index] != nums2[nums2Index])){
            if(nums1[nums1Index] < nums2[nums2Index]){
                nums1Index++;
            } else {
                nums2Index++;
            }
        }

        if(nums1Index == nums1.length || nums2Index == nums2.length){
            return -1;
        } else {
            return nums1[nums1Index];
        }
    }


    public static void main(String args[]){
        int[] nums1 = {1,2,3};
        int[] nums2 = {3,4,5};
        System.out.println(getCommon(nums1, nums2));
    }
}

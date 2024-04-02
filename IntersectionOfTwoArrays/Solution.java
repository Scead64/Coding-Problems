package IntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * To find the common elements of the arrays, we can take a sorted iteration approach and add values to a hashset.
     * By sorting the arrays, we eliminate the need to constantly search them for values.
     *
     * In iterating, we keep track of our index in either array using respective looping variables, and then compare the values at those indexes each iteration.
     * If the values are not equal, we increment the index corresponding to the lower value.
     * If they are equal, we add that value to our set and increment both indexes.
     * Whenever either index reaches the end of its array, we know there are no more values to add, and we exit.
     * 
     * We then return our hashset converted into an array.
     * 
     * Complexity
     * - Time complexity:
     *      O(n + m)
     *      Where n is the number of integers in nums1, and m is the number of integers in nums2.
     *      
     * - Space complexity:
     *      O(min(n, m))
     *      We are guaranteed to store at most the number of integers in the smaller array
    */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> intersections = new HashSet<Integer>();
        int index1 = 0, index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            int num1 = nums1[index1], num2 = nums2[index2];
            if(num1 < num2){
                index1++;
            } else if(nums1[index1] == nums2[index2]){
                intersections.add(num1);
                index1++;
                index2++;
            } else {
                index2++;
            }
        }
        int[] ans = new int[intersections.size()];
        int counter = 0;
        for(int n : intersections){
            ans[counter] = n;
            counter++;
        }
        return ans;
    }


    public static void main(String args[]){
        int[] nums1 = {1,2,3};
        int[] nums2 = {3,4,5};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}

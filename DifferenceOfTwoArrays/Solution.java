package DifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

    /*** SOLUTION ***
     * 
     * To filter out duplicates and speed up search time, I construct two hashsets for each array and add values to their respective sets.
     * Once the values are added, no duplicates exists due to the nature of sets.
     * Then, I iterate through each set and add values into their corresponding "answer" lists that don't exist in the other set.
     * 
     * Complexity
     * - Time complexity:
     *      O(n + m)
     *      Due to the constant time it takes to search each set, the run time is equivalent to the length of nums1 (n) and nums2 (m) which I iterate though about two times each.
     *      
     * - Space complexity:
     *      O(n + m)
     *      Storing sets and differentials for each array amounts to no greater than two times the size of each, as it's possible they are entirely unique
    */
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> diff1 = new ArrayList<Integer>();
        ArrayList<Integer> diff2 = new ArrayList<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        

        for(int n : nums1){
            set1.add(n);
        }

        for(int n : nums2){
            set2.add(n);
        }

        for(int n : set1){
            if(!set2.contains(n)){
                diff1.add(n);
            }
        }

        for(int n : set2){
            if(!set1.contains(n)){
                diff2.add(n);
            }
        }

        answer.add(diff1);
        answer.add(diff2);
        return answer;
    }

    public static void main(String args[]){
        int[] n1 = {1,2,3};
        int[] n2 = {2,3,4};
        System.out.println(findDifference(n1, n2));
    }
}

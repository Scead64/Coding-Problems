package ConvertAnArrayIntoA2DArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

    /*** SOLUTION ***
     * 
     * The simplest approach to this problem is a sort greedy approach indexing through the array.
     * We essentially add each number n to the first row where n doesn't appear, or construct a new one if necessary.
     * This happens to construct the minimal amount of rows, which is also equal to m where m is the number of times the most frequent element in the array appears.
     * 
     * In constructing the arrays, there are two approachs. In this solution, I use the hashset approach:
     *      I construct an arraylist of sets which have the advantage of constant lookup time, which is good for long rows.
     *      When indexing through the array, I follow the methodology described above and search for the first row that doesn't contain n.
     *      The tradeoff with this approach is the additional time it takes to convert the list of sets to a list of lists at the end.
     * 
     * The second approach not covered below is an arraylist of arraylists from the start.
     *      This has the disadvantage of non-constant lookup time for each row, and is preferable when you have a high number of rows.
     *      With this approach, you do not have to convert to the desired format at the end.
     * 
     * The best approach would be based on the nature of data you are working with.
     * 
     * Complexity
     * - Time complexity:
     *      O(n^2)
     *      In the worst case where n is the number of elements in nums.
     *      The worst case occurs with the maximal number of rows - i.e. eery element of nums is the same.
     *      In this case, we construct n rows, and iterating through and checking each row takes n^2/2 iterations, plus n time to convert the answer at the end.
     *      
     *      If the rows were more manageable - i.e. we had few duplicates, the index time would be closer to constant and the runtime would be O(n).
     *      
     * - Space complexity:
     *      O(n)
     *      As we store all the integers of nums in a different format
    */
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<HashSet<Integer>> twoDArray = new ArrayList<HashSet<Integer>>();
        for(int n: nums){
            int index = 0;
            while(index < twoDArray.size() && twoDArray.get(index).contains(n)){
                index++;
            }
            if(index >= twoDArray.size()){
                twoDArray.add(new HashSet<Integer>());
            }
            twoDArray.get(index).add(n);
            // System.out.println(index);
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(HashSet<Integer> row : twoDArray){
            ans.add(new ArrayList<Integer>(row));
        }
        return ans;
    }

    public static void main(String args[]){
        int[] nums = {1,1,1,3,6,8,2,3,6,1};
        System.out.println(findMatrix(nums));
    }
}

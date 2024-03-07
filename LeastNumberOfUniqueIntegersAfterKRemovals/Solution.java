package LeastNumberOfUniqueIntegersAfterKRemovals;

import java.util.HashMap;

public class Solution {
    
    /** 
     * First, we find the number of times each unique value appears in the array and store it in a hashmap.
     * Then, we iterate through "levels", which represent the least frequency numbers that appear.
     *      We want to remove these first to minimize the number of unique values we are left with.
     * Each time we "remove" a unique number from consideration, we decrement our answer, which is initiazed to the total number of unique numbers, and decrease k accordingly.
     * Once k is sufficiently low that removing any more numbers doesn't change our answer, we return it.
     * 
     * NOTE: We aren't actually removing values from our hashmap as we remove them. A better solution may find a way to efficiently remove values we no longer wish to consider
     * 
     * 
     * Complexity
     * - Time complexity:
     *      O(M*F)
     *      Where M is the number of unique integers in arr, and F is the highest frequenct occuring in the arr
     *      The time complexity for this solution is bit difficult to calculate as it depends widely on the frequency distributions of integers.
     *      If, for example, there is one number that is orders of magnitude more frequent than others, we would iterate the entire map multiple times until level reaches that frequency.
     *      So, in the worst case, the run time relies on M and F given a sufficiently large k.
     *      
     * - Space complexity:
     *      O(n)
     *      As I may potentially store the whole arr
    */
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for(int n : arr){
            if(!counts.containsKey(n)){
                counts.put(n, 1);
            } else {
                counts.replace(n, counts.get(n)+1);
            }
        }

        int level = 1;
        int numUnique = counts.size();
        while(k > 0){
            for(int key : counts.keySet()){
                if(counts.get(key) == level){
                    k-= level;
                    if(k >= 0){
                        numUnique--;
                    }
                    if(k <= 0){
                        break;
                    }
                }
            }
            level++;
        }

        return numUnique;
    }

    public static void main(String args[]){
        int[] arr = {1,1,5,6,7,5};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
    }
}

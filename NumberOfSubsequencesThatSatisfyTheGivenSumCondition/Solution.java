package NumberOfSubsequencesThatSatisfyTheGivenSumCondition;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {

    /*** INTUITION ***
     * 
     * One important property of the problem is the nature of the number of subsequences between two numbers in the array.
     * If we have an array [1,2,3,4,5] and target 5, the viable subsequences would be between 1-4, 1-3, 1-2, 1-1, 2-3, 2-2.
     * In the case of 1-1 and 2-2, there is only one subsequence: {1} and {2}.
     * In the case of 1-2 and 2-3, there is also only one subsequence: {1,2} and {2,3}
     * In the case of 1-3, there are two subsequences: {1,2,3} and {1,3}
     * And lastly, in the case of 1-4, there are four: {1,2,3,4}, {1,2,4}, {1,3,4}, {1,4}
     * 
     * Mathematically, with the exception of the 0 case, the number of subsequences can be identified as powers of 2 based on the distance of the numbers - 1.
     * i.e. 2 - 1 = 1, 2^(1-1) = 1; 3 - 1 = 2, 2^(2-1) = 2; 4 - 1 = 3, 2^(3-1) = 4. 
     * 
     * Furthermore, suppose we have array [1,2,3,4,5] and target = 10. Then, all subsequences are viable.
     * Another property then, is that each number of subsequences can be identified by array index.
     * i.e. 1 is at index 0, and including itself and everything lower, contributes 1 subsequence. This is also 2^0=1.
     * 2 is at index 1, and including itself and everthing lower, contributes 2 subsequences: 2^1=2.
     * 3, 4, and 5 are at indices 2, 3, and 4 respectively, and they each contribute 4, 8, and 16 subsequences respectively, which are 2 to the power of 2, 3, and 4 respectively.
     * This is very similar to binary numbers, which have the interesting property that, for a given index, a 1 corresponds to the value of everything below it + 1.
     * So, we can more easily calculate the number of subsequences in this case, by calculating 2 to the power of the size of the array (max index + 1), subtracted by 1, which is in the case 31.
     * 
     * NOTE: This requires sorting the array fir st so that values can be accurately parsed.
     * 
     *** SOLUTION *** 

     * This solution utilizes this property by using two "pointers" (upper and lower) that go through the array starting from the highest and lowest values.
     * Upper is set to the maximal value such that the lowest value in the array is viable for the target, and lower is set to 0.
     * 
     * In each main loop iteration, lower is incremented to the maximal viable value that satisfies target = nums[lower] + nums[upper] where lower <= upper.
     * Then the number of subsequences are calculated by first adding the maximal value (2^upper), then subtracting non-viable subsequences: 2^(upper-lower).
     * The main loop exits once upper=lower, or all values have been parsed.
     * 
     * In the former case, we have reached the second scenario in the intuition where we can calculate the remaining subsequences by adding 2^upper - 1 to the solution.
     * In the latter case, it's likely there were no viable solutions in the array.
     * 
     * Complexity
     * - Time complexity:
     *      The time complexity is equivalent to the time it takes to sort the array, which is nlog(n), and the time of the main and initial loop, which is in the worst case, n:
     *      O(n + n*log(n))
     *      In the average case, the loops runs less then n times, in which case the sorting dominates:
     *      O(n*log(n))
     * - Space complexity:
     *      O(1)
     *      No variable amount of data is being stored, so the storage complexity is constant.
    */
    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        BigInteger ans = new BigInteger("0");
        BigInteger base = new BigInteger("2");
        BigInteger mod = new BigInteger("1000000007");

        int upper = nums.length - 1;
        int lower = 0;

        // Set upper to maximum viable value
        while((upper >= 0) && ((nums[upper] + nums[lower]) > target)){
            upper--;
        }

        while((upper - lower) >= 0){
            while((lower <= upper) && ((nums[lower] + nums[upper]) <= target)){
                lower++;
            }
            ans = ans.add(base.pow(upper));
            if((upper - lower) >= 0){
                ans = ans.subtract(base.pow(upper-lower));
            }
            upper--;
        }

        if ((upper >= 0) && ((nums[upper] * 2) <= target)){
            ans = ans.add((base.pow(upper+1)).subtract(new BigInteger("1")));
        }

        return ans.mod(mod).intValueExact();
    }

    public static void main(String args[]){
        int[] nums = {1,2,3};
        int target = 3;
        System.out.println(numSubseq(nums, target));
    }
}

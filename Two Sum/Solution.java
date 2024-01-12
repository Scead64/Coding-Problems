import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    
    /** 
     * My first solution is a basic nested for loop approach.
     * I first create an array for my solution, and since every input has exactly one solution, I don't need to check for no answer.
     * I then loop through each element in the array and compare it to every other element.
     * I save time by initialzing j to i + 1, as order doesn't matter, this reduces redundant computation and cuts run-time by half in the worst case.
     * 
     * Complexity
     * - Time complexity:
     *      O(n^2)
     *      Nested for loop iterating over each element makes for a high time complexity
     * - Space complexity:
     *      O(1)
     *      The only space being taken up is the array of size 2 (solution) and two looping variables
    */
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("Solution: " + i + ", " + j);
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }


    /** 
     * My second solution is a dynamic approach via a HashMap.
     * The idea is that for any number X we find in the array, there is some value Y such that X + Y = target.
     * But, since we know there is exactly one solution, we can also conclude there exists only one X that has a corresponding Y in the array.
     * 
     * So, we can loop through the array and store each X's Y-value as a hash (target - X), which leads to X's position in the array.
     * Every time we look at a new number, we check if it is a Y value by seeing if the HashMap contains it as a key.
     * If it does, we have found the solution and can return it. If it doesn't, we store the corresponding values for that X and move on.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      The time comes from looping through the array. There are a fixed number of operations we do per iteration, but the total looping dominates this.
     * - Space complexity:
     *      O(n)
     *      In the worst case, the Y-value is the last value in the array, in which case we store n values in the HashMap.
    */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> yValues = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(yValues.containsKey(nums[i])){
                System.out.println("Solution: " + yValues.get(nums[i]) + ", " + i);
                return new int[] {yValues.get(nums[i]), i};
            }
            yValues.put(target - nums[i], i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String args[]){
        int[] nums = {9,8,7,6,5,4,3,2,1};
        int target = 3;
        twoSum(nums, target);
        twoSum2(nums, target);
    }
}

package UniqueNumberOfOccurences;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    /***SOLUTION***
     *
     * To count the number of occurences of a number, we can sort the array to group together same numbers.
     * Then, while iterating through, we can count the number of times a number appears.
     *      we can use a HashSet to store the "unique" number, and if we ever encounter that unique number of appearances again, we return false.
     *      If we iterate through the whole array while never encounter a value that already exists in the set, we can return true.
     * 
     * Complexity
     * - Time complexity:
     *      O(nlog(n)) 
     *      Where n is the length of arr, as it takes nlog(n) time to sort the array, and that is the dominant time computation.
     * - Space complexity:
     *      O(log(n))
     *      The worst case in terms of space complexity is an array with totally unique occurences that has a minimal number of occurences.
     *      We can picture this with a pyramid like structure:
     *      1
     *      22
     *      333
     *      4444
     *      55555
     *      The space complexity is equivalent to the height of this pyramid as we store the occurrences 1,2,3,4, and 5.
    */
    public static boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> occurrences = new HashSet<Integer>();
        Arrays.sort(arr);
        int copies = 1, curr = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(curr == arr[i]){
                copies++;
            } else {
                curr = arr[i];
                if(occurrences.contains(copies)){
                    return false;
                } else {
                    occurrences.add(copies);
                }
                copies = 1;
            }
        }
        if(occurrences.contains(copies)){
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        System.out.println(uniqueOccurrences(arr));
    }
}

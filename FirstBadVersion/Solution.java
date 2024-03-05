package FirstBadVersion;

public class Solution {

    public static int[] versions;

    /*** SOLUTION ***
     * 
     * This problem involves binary search, which seeks to search for a value in a sorted array in an efficient manner.
     * It works by invoking a "window" on the array, where is start is at the first value (index 0), and end is at the last value (index length - 1).
     * It then takes the middle value of the window, and compares it to the target. 
     *      If, given the array is sorted, we would expect our target to place before this middle value, we set the end of our window to our middle.
     *      If we would expect the opposite, that is our target would appear afterwords, we set the start of our window to our middle.
     * We then repeat this until our middle is our target, or the window converges on a single value.
     * 
     * For the sake of this problem, we use a modified binary search where our goal is to set our low index to the last good version, and high to the first bad.
     * So, instead of comparing the value at an index to a target, we check if it's a bad version. 
     *      If it is, we set it to high,
     *      Otherwise, we set it to low.
     * Repeating this, we find the point where the versions turn bad and return that index.
     * To handle the case where there are no good indexes, we simply return our intial low at index 1.
     * 
     * Complexity
     * - Time complexity:
     *      O(log(n))
     *      Since we divide the problem size by 2 each iteration.
     *      
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of information
    */

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public static int firstBadVersion(int n) {
        int high = n, low = 1;
        if(isBadVersion(low)){
            return low;
        }
        while(high > low + 1){
            int index = low + (high-low)/2;
            
            if(isBadVersion(index)){
                high = index;
            } else {
                low = index;
            }
        }
        return high;
    }

    /**
     * Helper method that acts as "API" for problem.
     * @param version
     *      Index of array of which to check
     * @return
     *      True if versions[version] < 0,
     *      False Otherwise
     */
    public static boolean isBadVersion(int version){
        return (versions[version-1] < 0)? true : false;
    }
    
    /**
     * Sets the "versions" in the array.
     * A 0 denotes a good version, and a -1 denotes a bad version.
     * The array must be constructed according to the constraints in the problem,
     * that is, there must not be a 0 after a 1.
     * @param nums
     *      The array to set versions
     */
    public static void setVersions(int[] nums){
        versions = nums;
    }

    public static void main(String args[]){
        int nums[] = {0,0,0,-1,-1,-1};
        setVersions(nums);
        System.out.println(firstBadVersion(nums.length));
    }
}

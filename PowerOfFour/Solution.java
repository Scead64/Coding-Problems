package PowerOfFour;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * To calculate if a number is a power of 4, we just continuously divide it by 4.
     * If it's a power of 4, each division should have no remainders, and we should eventually reach 4.
     * This is with the exception of 1, which we get when raising 4 to the 0th power.
     * 
     * Complexity
     * - Time complexity:
     *      O(log4(n))
     *      
     * - Space complexity:
     *      O(1)
    */
    public static boolean isPowerOfFour(int n) {
        while(n > 4){
            if (n % 4 != 0){
                return false;
            }
            n = n / 4;
        }
        if(n == 4 || n == 1){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String args[]){
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
}

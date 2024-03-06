package PowerOfTwo;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * To calculate if a number is a power of 2, we first check if it's greater than 0.
     *      If not we return false.
     * We then take the log, which if not a power of 2, may have some decimal figures, in which case we cast it to an int.
     * We then raise 2 to the power of that resulting exponent and compare it to n.
     *      If they are equal, it means our exponent was a clean number and n is a power of 2, so we return true.
     *      If they aren't equal, then the exponent was rounded and we return false.
     * 
     * Complexity
     * - Time complexity:
     *      O(1)
     *      
     * - Space complexity:
     *      O(1)
    */
    public static boolean isPowerOfTwo(int n) {
        if (n > 0){
            int log = (int) (Math.log(n)/Math.log(2));
            if(n == (int) Math.pow(2, log)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    public static void main(String args[]){
        int n = 8;
        System.out.println(isPowerOfTwo(n));
    }
}

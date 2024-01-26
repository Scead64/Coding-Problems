package PalindromNumber;

import java.math.BigInteger;
import java.util.Arrays;

public class Solution {

    /*
     *
     * This solution takes a basic loop approach by first turning the number into a String.
     * In String form, the front and end digits can be compared against each other until we reach the middle of the number (middle digit).
     * If we find that at each index, the digits were equal, then it is a palindrome. If that was ever not the case, we return false.
     * 
     * Complexity
     * - Time complexity:
     *      O(n) 
     *      Where n is the number of digits in x
     * - Space complexity:
     *      O(1)
     *      No variable amount of data is being stored, so the storage complexity is constant.
    */
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        for(int i = 0; i < num.length()/2; i++){
            if(num.charAt(i) != num.charAt(num.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    /* 
     * This solution takes a similar approach as before, but instead of turning the integer into a string we parse it as is.
     * We do this by constructing the reverse number (number you get when you read x right to left), then comparing if the two are equal.
     * 
     * Complexity
     * - Time complexity:
     *      O(n) 
     *      Where n is the number of digits in x
     * - Space complexity:
     *      O(1)
     *      No variable amount of data is being stored, so the storage complexity is constant.
    */
    public static boolean isPalindrome2(int x) {
        int reverse = 0;
        int x_copy = x;
        while(x_copy > 0){
            int digit = x_copy % 10;
            reverse= reverse*10 + digit;
            x_copy/= 10;
        }

        if(x == reverse){
            return true;
        } 
        return false;
    }

    public static void main(String args[]){
        int num = 121;
        System.out.println(isPalindrome(num));
        System.out.println(isPalindrome2(num));
    }
}

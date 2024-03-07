package SequentialDigits;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    /***SOLUTION*** 
     * 
     * To ensure the numbers appear in order, we can find them in order.
     * To do this, we first find the number of digits in low, and the digit in the highest place.
     * We then construct each "sequential" number left to right starting from our starting digit, and add it to our list answer.
     * Each time we reach the last possible sequential number given a number of digits, we increment our number of digits and restart the loop.
     * Whenever we run into a number greater than high, we return our current list.
     * 
     * Complexity
     * - Time complexity:
     *      The time complexity depends on the number of sequential numbers between low and high,
     *      as well as the size of the numbers we construct at each given number of digits.
     *      We should note that, there are a finite number of "sequential" numbers ranging from 1 to 123456789 - there are in fact 156 iterations possible between constructing numbers and digits.
     *      Hence, given the nature of the problem, we can actually say the running time is constant: O(1)
     *      
     * - Space complexity:
     *      O(n)
     *      Where n is the number of sequential numbers between low and high, which is in the range of 0 to 36.
    */
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<Integer>();
        int numDigits = 0, temp = low, startingDigit = 0;
        while(temp > 10){
            temp = temp/10;
            numDigits++;
        }
        startingDigit = temp % 10;
        numDigits++;
        if(startingDigit + numDigits - 1 > 9){
            startingDigit = 1;
            numDigits++;
        }
        while(numDigits < 10){
            int num = 0;
            for(int i = 0; i < numDigits; i++){
                num += (startingDigit+i)*Math.pow(10, numDigits-1-i);
            }

            System.out.println(num);

            if(num >= low){
                if(num <= high){
                    ans.add(num);
                } else {
                    return ans;
                }
            }

            if(startingDigit + numDigits - 1 == 9){
                startingDigit = 1;
                numDigits++;
            } else {
                startingDigit++;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int low = 100, high = 1000;
        System.out.println(sequentialDigits(low, high));
    }
}

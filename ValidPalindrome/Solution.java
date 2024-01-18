package ValidPalindrome;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * Given that the input may contain non-alphanumeric characters, it's necessary to sift through those to check the string.
     * To accomplish this, two counter variables are constructed to go through the left and right of the string looking for the next alphanumeric character.
     * Since they find one character at a time, each time they are compared they represent alphanumeric characters equidistant away if the string was transformed per the problem description.
     * If the characters ever do not match, then the string is not a palindrome.
     * If the characters all do match, then the string is a valid palindrome and the loop breaks once the variables "pass" each other.
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the length of the string, as the worst case is the string is a palindrome and each character is parsed through
     *      
     * - Space complexity:
     *      O(1)
    */
    public static boolean isPalindrome(String s) {
        boolean isPal = true;
        int upper = s.length() - 1; 
        int lower = 0;
        while(upper-lower >= 0){

            while((lower <= upper) && !Character.isLetterOrDigit(s.charAt(lower))){
                lower++;
            }

            while((upper >= lower) && !Character.isLetterOrDigit(s.charAt(upper))){
                upper--;
            }
            if((upper-lower >=0) && (Character.toLowerCase(s.charAt(lower)) != Character.toLowerCase(s.charAt(upper)))){
                isPal = false;
                break;
            }
            lower++;
            upper--;
        }

        return isPal;
    }


    public static void main(String args[]){
        String test = "a b !c! b a";
        System.out.println(isPalindrome(test));
    }
}

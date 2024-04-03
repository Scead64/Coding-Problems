package CustomSortString;

public class Solution {
    
    /***SOLUTION*** 
     * 
     * The approach here is to iterate through order and consider one character at a time.
     * We then search for that character in the string s, add it to our answer, and then remove the instance of that character from s.
     * We do this for all instances of that character in the string s, and then repeat the process for all other characters in order, in order. (pun intended)
     * After iterating though order, the string s should only consist of characters not in order, which we can append to our answer and return.
     * 
     * Complexity
     * - Time complexity:
     *      O(n^2)
     *      where n is the length of the initial String s.
     *      The time complexity is dominated from searching s for characters.
     *      The method indexOf iterates through each character and takes n time.
     *      Since we remove a character each iteration, the running time is slightly less then n^2,
     *      but in the worst case where each character in s is in order, we have approximately n^2/2.
     *      It is also useful to note that, based on the description, the string order is at most of length 26.
     * - Space complexity:
     *      O(n)
     *      As we reorder the String s in ans.
    */
    public static String customSortString(String order, String s) {
        String ans = "";
        for(int i = 0; i < order.length(); i++){
            String c = order.substring(i, i+1);
            int index = 0;
            while(index >= 0 && index < s.length()){
                index = s.indexOf(c, index);
                if(index >= 0){
                    ans += s.substring(index, index+1);
                    if(index == 0){
                        s = s.substring(1);
                    } else {
                        s = s.substring(0, index) + s.substring(index+1);
                    }
                }
            }
        }
        return ans+s;
    }


    public static void main(String args[]){
        String order = "zyxwvutsrqponmlkjihgfedcba";
        String s = "abcedfghijklmnopqrstuvwxyz";
        System.out.println(customSortString(order, s));
    }
}

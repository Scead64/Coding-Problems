package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    /*** SOLUTION ***
     * 
     * To quickly determine which set a string belongs in, we can store lists in a hashmap that is indexable by an anagram string.
     * When searching for and creating lists, we create a sorted string to compare against and search the hashmap for it
     * If we dont find a set in the map for a string, we create a new list indexable by the sorted string we created from that word
     * After iterating through the given array, we can return a list of the values in the map.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the number of strings in the array strs
     *      
     * - Space complexity:
     *      O(n)
     *      In the worst case where there are no common palindromes
    */
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        List<List<String>> ans;
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String anagram = new String(chars);
            if(!anagrams.containsKey(anagram)){
                anagrams.put(anagram, new ArrayList<String>());
            }
            anagrams.get(anagram).add(str);
        }
        ans = new ArrayList<>(anagrams.values());
        return ans;
    }
    public static void main(String args[]){
        String[] strs = {"bat", "mat", "tab"};
        System.out.println(groupAnagrams(strs));
    }
}

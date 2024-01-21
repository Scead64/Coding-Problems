package SubstringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    /***PROBLEM CONSIDERATIONS***
     * Becuase all words are the same length, the string can be parsed in sets as the words space evenly.
     * Where substrings start in the string, however, does not need to fit in that set. i.e. if words are of length 3, a substring could start at position 0, 1, or 2.
     * Furthermore, when looking for substrings, there must be some way to keep track of what words are in the substring either implicitly or explicitly.
     * And lastly, The array of words may contain duplicate or interwined values (for example, "abc" and "bca")
     * 
     * 
     *** SOLUTION ***
     * 
     * There are two data structures for keeping track of words in the array-
     *      wordsList: A hashset that is used to determing if words are valid (doesn't need to care about dupliates)
     *      wordsLeft: Keeps track of words currently being considered for a substring. This creates an "implicit" string by keeping track of what words in the array can still appear in the currently considered concatened string.
     * As well as constants to simplify later math, and currentLength to keep track of the size of the current potential concatenated string.
     * 
     * The solution revolves around two loops:
     *      The inner loop containing i is present to offset the inner loop by a letter. Since all words in the array are of same length, this simplifies the problem of substrings starting at any position.
     *      The outer loop, or main loop, iterates through the string s in batches of "words"- which are substrings of size WORD_LENGTH.
     *          This loop increments j by WORD_LENGTH to make it easier to find subsequent words in sequences. It exits when it is no longer possible to find a concatenated substring with the length left in s.
     * 
     * For each iteration in the inner loop, a word is checked for validness against wordsList.
     *      If the word is valid, it is checked again against wordsLeft.
     *          If it is in wordsLeft, the number of words left is checked.
     *              If there is only 1 left, i.e. the current word is the last one in the substring, a concatened string has been found and the index of it is added to the answer.
     *                  The last added word is also calculated and returned to words left using currentLength- which stays the same since the number of words went up and down by 1.
     *              If a concatenated string has not been found yet, currentLength is increased.
     *          If it is not in wordsLeft, words at the "back" of the substring must be removed until the duplicate word is removed.
     *              i.e., if words = {"a","b","c"}, wordsLeft = {"a"}, and word = "b", then that means we found the word "b" previously, and since we know it can't be in a future concatenated string, we remove words until we remove "b".
     *              So, if the string s = "cbbac", after removing letters, we would have wordsLeft = {"a","c"} where the second letter b is in our implicit substring.
     *          Either way, since the word is valid, it gets added to our implicit substring by removing it from wordsLeft.
     *      If the word was invalid, we know no future concatenated strings can be constructed with any data we have currently, and so we reset wordsLeft and currentLength.
     * 
     * Complexity
     * - Time complexity:
     *      Where n is the length of the string s, the inner loop iterates around n/WORD_LENGTH times, and the outer loop WORD_LENGTH times.
     *      Their combind time then is WORD_LENGTH * n/WORD_LENGTH, which is n.
     * 
     *      Constructing the data structures to keep words is proportional to the length of the array words (m).
     *      This array is constructed, in the worst case, each iteration.
     * 
     *      Lastly, searching through the data structures varies in time. The HashSet wordsList takes constant time to search and is therefore negligible.
     *      The ArrayList wordsList can take up to m-1 time to search as that is the max number of words it contains in a given iteration.
     * 
     *      The runtime then is the total number of iterations * array construction time * array search time,
     *      which is in th worst case: O(n*(m^2))
     *      
     * - Space complexity:
     *      O(m)
     *      For the Hashset and wordsList which take up around m space respectively
    */
    public static List<Integer> findSubstring(String s, String[] words) {
        //Constants for word length and concatened string length
        final int WORD_LENGTH = words[0].length();
        final int CS_LENGTH = WORD_LENGTH * words.length;

        //Structures for answer and list of words
        List<Integer> substrings = new ArrayList<Integer>();
        HashSet<String> wordsList = new HashSet<String>(Arrays.asList(words));

        //Outer loop for offsetting letters so that the inner loop may be parsed by word length
        for (int i = 0; i < WORD_LENGTH; i++) {

            //Structure for keeping track of words used and length of current concatened string
            ArrayList<String> wordsLeft = new ArrayList<String>(Arrays.asList(words));
            int currentLength = 0;
            for (int j = i; (j - currentLength) <= (s.length() - CS_LENGTH); j += WORD_LENGTH) {
                String word = s.substring(j, j + WORD_LENGTH);

                // Check if word is valid
                if (wordsList.contains(word)) {
                    // Check if word is in string already
                    if (wordsLeft.contains(word)) {
                        // Check if cs is found
                        if (wordsLeft.size() == 1) {
                            // Add the cs to the solution
                            substrings.add(j - currentLength);
                            // Add back the first word to list
                            wordsLeft.add(s.substring(j - currentLength, j - (currentLength - WORD_LENGTH)));
                        } else {
                            currentLength += WORD_LENGTH;
                        }
                    // Remove words until duplicate is gone
                    } else {
                        // Remove words from cs back into pool until duplicate is removed
                        String outWord = "";
                        int k = 0;
                        while (!outWord.equals(word)) {
                            outWord = s.substring(j - (currentLength-k), j - (currentLength - k - WORD_LENGTH));
                            wordsLeft.add(outWord);
                            // System.out.println(wordsLeft);
                            k+=WORD_LENGTH;
                        }
                        currentLength -= (k - WORD_LENGTH);
                    }
                // Remove the new word from wordsLeft
                 wordsLeft.remove(word);

                // If not a valid word, reset wordsLeft
                } else {
                    wordsLeft = new ArrayList<String>(Arrays.asList(words));
                    currentLength = 0;
                }
            }
        }
        return substrings;
    }


    public static void main(String args[]){
        String s = "hiasmygonohino";
        String[] words = {"hi", "no"};
        System.out.println(findSubstring(s, words));
    }
}

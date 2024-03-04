package BagOfTokens;

import java.util.Arrays;

public class Solution {
    
    /*** PROBLEM INTUITION ***
     * The "Optimal Strategy" seems to be the greedy approach, which is a sort of two phase algorithm.
     * 
     * The first phase is the score phase, where we increase the score as much as we possibly can with our given power.
     * Since every token gives 1 score, the best way to do this is to play the lowest-power tokens face up.
     * If, after we are no longer able to gain score, there are at least two cards left, we enter phase 2.
     * 
     * The second phase is the power phase, where we replenish our power by as much as we can.
     * Since every token cost 1 score to play face-down, we play the highest-power token face down.
     * We then repeat phase 1.
     * 
     * 
     *** SOLUTION ***
     * To utilize the greedy approach, it is necessary to first sort the array of tokens by increasing power.
     * Then, the variables low and high keep track of the current lowest and highest power tokens. To "remove" a token, we increment/decrement our respective variables.
     * Low is utilized for phase 1 where we maximize our score, incrementing low and score each time we iterate and decreasing the power. 
     * high is our phase 2 variable used to replenish power by decrementing score and high.
     * 
     * We exit our loop when there are a lack of cards (low <= high), or we never enter if we cannot initially flip a card for score.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      Where n is the number of "cards" in the tokens array.
     *      
     * - Space complexity:
     *      O(1)
     *      As we store no variable amount of data
    */
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0, low = 0, high = tokens.length - 1;
        while(low <= high && power >= tokens[low]){
            while(low <= high && power >= tokens[low]){
                power -= tokens[low];
                score++;
                low++;
            }

            if(high > low){
                score--;
                power+= tokens[high];
                high--;
            }
        }
        return score;
    }


    public static void main(String args[]){
        int tokens[] = {100, 200, 300, 400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens, power));
    }
}

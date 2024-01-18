package Dota2Senate;

public class Solution {
    
    /*** PROBLEM INTUITION ***
     * The "Optimal Strategy" matters when the order of senators varies.
     * For example, given the string "DDDRRRR",
     * The Dire will win even though there are more Radiant, as they can ban 3/4 Radiant senators before they ever get to vote.
     * 
     * Given another string "DRDRDRDRDRDRDRDR", where the senators intertwine and are equal in number, lets consider the course of action of the first Dire senator. 
     * If they choose to ban the last Radiant senator, then the first Radiant senator can ban the second Dire senator.
     * This pattern could continue down the list, removing each Dire senators vote until there is only the first Dire senator left in the first pass.
     * The Dire senators best move then, is to ban the first Radiant senator, the second Dire ban the second Radiant, and so on.
     * 
     * These strategies are based on each senator banning the earliest senator of the opposite party, so that they can give their party more votes.
     * The optimal strategy then is a greedy approach of sorts, where each senator bans the soonest to vote senator of the opposite party.
     * 
     * 
     *** SOLUTION ***
     * The variable "skips" represents the power dynamic of the senate.
     *      If skips < 0, It means the Dire have more power, and that any Radiant encountered will be skipped so long as that continues.
     *      If skips > 0, Then the opposite is true: the radiant are in power, and Dire will be skipped.
     *      If skips is equal to 0, the power balance is equal.
     * Each time a senator is checked, they shift power in their direction by incrementing/decrementing skips regardless of whether or not they were skipped.
     * If a senator is skipped, however, then they will be removed from the voting string.
     * This process represents the addition and usage of bans.
     * Once the end of the string is reached, a round is over and the index is set back to the start. 
     * If a power dynamic reaches the number of remaining senators, it means a winner is clear and can be declared depending on the direction of power.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      The time the program takes is equivalent to the length of voting, plus n for the last pass of finding the winner.
     *      The length of voting is dependent on the length of the string senate (n), and the number of rounds it takes to find a winner.
     *      The number of rounds it takes to find the winner is an average of 2.
     *          In the worst case, we can say that the number of senators decreases by around half each iteration with the exception of the bottom few iterations.
     *          Each iteration, we go through each senator still in the running, so n + n/2 + n/4 ~= 2n == O(n)
     *      
     * - Space complexity:
     *      O(n)
     *      where n is the length of the string senate
    */
    public static String predictPartyVictory(String senate) {

        String ans = "";
        int skips = 0;
        int index = 0;
        StringBuilder votes = new StringBuilder(senate);

        while(Math.abs(skips) < votes.length()){
            char senator = votes.charAt(index);

            if(senator == 'R'){
                if(skips < 0){
                    votes.deleteCharAt(index);
                    index--;
                }
                
                skips++;
            } else {
                if(skips > 0){
                    votes.deleteCharAt(index);
                    index--;
                }
                
                skips--;
            }

            index++;
            if(index == votes.length()){
                index = 0;
            }
        }

        if(skips > 0){
            ans = "Radiant";
        } else {
            ans = "Dire";
        }
        return ans; 
    }


    public static void main(String args[]){
        String test = "RDDRD";
        System.out.println(predictPartyVictory(test));
    }
}

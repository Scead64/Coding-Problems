package FindAllPeopleWithSecret;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

    /*** SOLUTION ***
     * 
     * Since our pool of people are unique, we can use a hashset to store people who we know hold secrets.
     * We can also start off by adding person 0 and firstPerson to our list of secret holders.
     * To consider who else holds the secret, we need to consider meetings in the order they occurred in time.
     * To do this, we need to sort the meetings array based on their time parameter.
     * Then, we can begin looping over them.
     * 
     * Our main loop consists of 3 looping variables:
     *      index, which keeps track of our place in the array
     *      time, to keep track of the current time we are considering
     *      starting_index, to keep track of the start of a window if multiple meetings occur at the same time
     * 
     * When looping, we set our window to keep track of any meetings that occur simultaneously.
     *      Then, we loop over that window until we no longer add new secret holders to our set.
     * 
     * We repeat this process until we have iterated over all meetings, and then return our set converted into a list
     * 
     * NOTE: This solution could be improved greatly in the way it handles checking over meetings that occur at the same time.
     * 
     * Complexity
     * - Time complexity:
     *      O(m^2)
     *      Where m is the number of meetings in the 2D array meetings.
     *      Sorting the array initially takes mlog(m) time,
     *      and iterating through in the worst case where all meetings occur at the same time, and the secret is progressively passed on, we iterate over the array m times.
     *      
     * - Space complexity:
     *      O(n)
     *      As we potentially store all people in our HashSet.
    */
    public static List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        HashSet<Integer> secretHolders = new HashSet<Integer>();
        secretHolders.add(0);
        secretHolders.add(firstPerson);
        Arrays.sort(meetings, (a,b) -> Integer.compare(a[2],b[2]));
        int  index = 0;
        while(index < meetings.length){
            boolean newAdded = true;
            int time = meetings[index][2], start_index = index;
            while(index < meetings.length && time == meetings[index][2]){
                index++;
            }
            while(newAdded){
                newAdded = false;
                for(int i = start_index; i < index; i++){
                    if(secretHolders.contains(meetings[i][0]) ^ secretHolders.contains(meetings[i][1])){
                        secretHolders.add(meetings[i][0]);
                        secretHolders.add(meetings[i][1]);
                        newAdded = true;
                    }
                }
            }
        }
        return new ArrayList<Integer>(secretHolders);
    }

    public static void main(String args[]){
        int n = 9;
        int[][] meetings = {
            {1, 2, 1},
            {2, 3, 2},
            {3, 4, 3},
            {4, 5, 3},
            {7, 8, 3}
        };
        int firstPerson = 1;
        System.out.println(findAllPeople(n, meetings, firstPerson));
    }
}

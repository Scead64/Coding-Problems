package FindTheTownJudge;

public class Solution {
    
    /*** SOLUTION ***
     * 
     * To figure out if the judge exists and is identifiable, we need to keep in line with the constraints while iterating over each trust relationship.
     * To keep track of the people in town we think might be judge, we keep an array townTrust that keeps track of the amount of people that trust a given person.
     * It is indexable be person (i.e. person n is equal to townTrust[n]), and a -1 value represents an impossibility that the given person is judge.
     * 
     * The first clause is simple; while iterating through trust where trust[i] = ai, bi, we set ai to -1 in our array as the judge cannot trust anybody.
     * To keep track of the second clause, we increment person bi in our array.
     * 
     * After iterating through trust, we then iterate through our array searching for someone whose trust value is equal to n-1.
     *      That is - everybody in town trusts them except themselves.
     * Since we know there can only be up to 1 person who fulfills this property, we simply return that person if they exist, or false otherwise.
     * 
     * Complexity
     * - Time complexity:
     *      O(max(n, m))
     *      where n is the number of people in town and m is the size of the trust array.
     *      
     * - Space complexity:
     *      O(n)
    */
    public static int findJudge(int n, int[][] trust) {
        int[] townTrust = new int[n + 1];
        for(int[] relationship: trust){
            townTrust[relationship[0]] = -1;
 
            if(townTrust[relationship[1]] != -1){
                townTrust[relationship[1]]++;
            }
        }
 
        for(int i = 1; i < townTrust.length; i++){
            if(townTrust[i] == n-1){
                return i;
            }
        }
        return -1;
     }


    public static void main(String args[]){
        int numPeople = 5;
        int[][] trust = {
            {2,1},
            {3,1},
            {4,1},
            {5,1}
        };
        System.out.println(findJudge(numPeople, trust));
    }
}

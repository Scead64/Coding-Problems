package NumberOfLaserBeamsInABank;


public class Solution {
    
    /*** SOLUTION ***
     * 
     * To count the number of lasers between two sets of devices, we simply multiply the number in each of the two rows.
     *      i.e. each device i in row[i] has a laser going to each device j in row[j] so long as there are not devices between them.
     * 
     * Hence, the solution involves finding the first row with devices, and then counting the number.
     * We then find the next row containing devices, count the numbers, and add the resulting number of lasers between the two rows of devices to our running total.
     * We keep track of that latest number of devices as the new "old" row, and find the next row and perform the same calculation until we reach the end and return our result.
     * 
     * Complexity
     * - Time complexity:
     *      O(n*m)
     *      Where m is the number of rows in bank and n is the number of potential devices in each row
     *      
     * - Space complexity:
     *      O(1)
     *      As we store no variable amount of data
    */
    public static int numberOfBeams(String[] bank) {
        int index = 0, oldDevices = 0, newDevices = 0;
        while(index < bank.length && oldDevices == 0){
            for(int i = 0; i < bank[index].length(); i++){
                if(bank[index].charAt(i) == '1'){
                    oldDevices++;
                }
            }
            index++;
        }

        int numLasers = 0;
        while(index < bank.length){
            for(int i = 0; i < bank[index].length(); i++){
                if(bank[index].charAt(i) == '1'){
                    newDevices++;
                }
            }

            if(newDevices > 0){
                numLasers+= oldDevices*newDevices;
                oldDevices = newDevices;
                newDevices = 0;
            }
            index++;
        }

        return numLasers;
    }


    public static void main(String args[]){
        String bank[] = {"10001000", "00000000", "11110000"};
        System.out.println(numberOfBeams(bank));
    }
}

package AddTwoNumbers;

import HELPER_CLASSES.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    /*** PROBLEM INTUITION ***
     * Addition can be simplified to adding digits in the lowest place (ones place in base 10), identifying if a carry is present, and then working your way up.
     * Since the numbers are stored in reverse order, this process is rather simple. We can add the digits for the nodes, Identify a carry, and then move to the next nodes,
     * Some complexity arises when you consider the lists do not have to be the same length. One could be 0 for example, or orders of powers larger than the other.
     * 
     * 
     * 
     *** SOLUTION ***
     * My solution mainly revolves around looping through each "place" and summing digits.
     * To keep track of progress, 3 list nodes are created: start, current, and end:
     *      Start keeps track of the first indice of the list and is the node that gets returned.
     *      Current is to keep track of the current node and add data while looping
     *      End keeps track of the last node of the list, and is necessary to reset the last node's next value to null at the end of the loop.
     * The main loop aggregates values of the current place of the added nodes if they exist, as well as the carry.
     * To identify a carry, the aggregated value just needs to be checked against 9. If it is greater, a carry was created and we subtract is from the aggregate.
     * The loop keeps going as long as either list has more digits, or there is a carry present.
     * 
     * Complexity
     * - Time complexity:
     *      O(MAX(n, m))
     *      where n is the length of l1 and m is the length of l2.
     *      The loop keeps going for the maximum length of them.
     * - Space complexity:
     *      O(Max(n, m))
     *      The space complexity comes from constructing the new number, whose length is within {MAX(n,m), MAX(n,m) + 1}
    */

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode start = new ListNode();
        ListNode current = start;
        ListNode end = start;

        while((l1 != null) || (l2 != null) || (carry > 0)){
            int val = 0;
            ListNode temp = new ListNode();

            if(l1 != null){
                val+= l1.val;
                l1 = l1.next;
            } 
            
            if(l2 != null){
                val+= l2.val;
                l2 = l2.next;
            } 
            
            val+= carry;

            if(val > 9){
                val -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            
            current.val = val;
            current.next = temp;
            end = current;
            current = temp;
            
        }

        end.next = null;
        return start;
    }

    public static void main(String args[]){
        ListNode node534 = ListNode.constructNum("354");
        ListNode node870 = ListNode.constructNum("870");
        ListNode solution = addTwoNumbers(node534, node870);
        while((solution != null)){
            System.out.println(solution.val + " ");
            solution=solution.next;
        }
    }
}

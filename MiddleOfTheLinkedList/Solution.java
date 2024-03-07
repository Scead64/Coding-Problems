package MiddleOfTheLinkedList;

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
    /*** SOLUTION ***
     *
     * To find the middle value, we keep track of the middle node dynamically as we iterate through the list.
     * We initialize our answer to the node at head, then after every 2 iterations of our loop, we advance middle.
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      where n is the number of nodes in the list
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of data
    */
    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int counter = 0;
        while(head != null){
            head = head.next;
            counter++;
            if(counter > 1){
                middle = middle.next;
                counter = 0;
            }
        }
        return middle;
    }
    

    public static void main(String args[]){
        ListNode node = ListNode.constructNum("354");
        System.out.print(middleNode(node).val);
    }
}

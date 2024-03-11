package RemoveNthNodeFromEndOfList;

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
     * To get the Nth-last node, we first need to get the size of the list by iterating through.
     * Upon going through the list and getting the size, we compare it to n.
     *      If size and n are equal, then we simply return head's next element.
     *          *If the list is of size one, then null is returned
     * Otherwise, we calculate the difference of size and n (the nth last node)
     * We then get the node before the node we wish to remove, and replace it with the next node's next value.
     * 
     * Complexity
     * - Time complexity:
     *      O(sz)
     *      where sz is the size/length of the list given, as we iterate through twice
     * - Space complexity:
     *      O(1)
     *      As we do not store a variable amount of data
    */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 1;
        ListNode ln = head;
        while(ln.next != null){
            ln = ln.next;
            sz++;
        }

        if(n == sz){
            head = head.next;
            return head;
        }
            
        sz -= n;
        ln = head;

        while(sz > 1){
            ln = ln.next;
            sz--;
        }
        
        ListNode temp = ln.next;
        ln.next = temp.next;
        return head;
    }
    

    public static void main(String args[]){
        ListNode node = ListNode.constructListByNum("354");
        int remove = 2;
        node = removeNthFromEnd(node, remove);
        while(node != null){
            System.out.print(node.val);
            node = node.next;
        }
    }
}
